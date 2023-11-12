package lightoff_fromont_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author leafr
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    private final GrilleDeJeu grille;
    int i;
    int j;
    private int nbCoups;
    private int limiteCoups;
    private int niveau;
    private int coupsSpeciauxJoues;
    

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int nbLignes, int nbColonnes, int niveau) {
        initComponents();
        this.niveau = niveau;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60,
                nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        getContentPane().add(DiagonaleM, new org.netbeans.lib.awtextra.AbsoluteConstraints( 110 + nbColonnes*40, 10 + nbLignes*40, 110, 50));
        getContentPane().add(Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110 + nbColonnes*40, 60 + nbLignes*40, -1, -1));
        getContentPane().add(coupsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10 + nbColonnes*40, 70 + nbLignes*40, -1, -1));
        this.pack();
        this.revalidate(); 

        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); 
            }
        }

        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate(); 
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    nbCoups++;  
                    coupsLabel.setText("Coups joués : " + nbCoups);
                    gagne();
                    perdu();
                    ajoutNiveau2();
                    ajoutNiveau3();

                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);            

        }
        PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        for (j = 0; j < nbColonnes; j++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int i = j;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(i);
                    repaint();
                    nbCoups++;  
                    coupsLabel.setText("Coups joués : " + nbCoups);
                    gagne();
                    perdu();
                    ajoutNiveau2();
                    ajoutNiveau3();

                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonHorizontaux.add(bouton_colonne);
            
        }
        
        switch (niveau) {
            case 2 ->
                limiteCoups = 15;
            case 3 -> {
                limiteCoups = 10;
                grille.eteindreToutesLesCellules();
            }
            default ->
                limiteCoups = Integer.MAX_VALUE;
        }

        this.initialiserPartie();
        setVisible(true);
        lancerPartie();
    }

    /**
     * initialise la partie
     */
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(100);
    }

    private void lancerPartie() {
        if (niveau == 1) {
            coupsLabel.setVisible(false);   
        }
        if (niveau == 2) {
            limiteCoups = 10;
            nbCoups = 0;
            coupsSpeciauxJoues = 0;    
        }
        if (niveau == 3) {
            limiteCoups = 10;
            nbCoups = 0;
            coupsSpeciauxJoues = 0; 
        }
    }

    /**
     *active la ligne de la grille
     * @param ligne
     */
    public void activerLigneDeCellules(int ligne) {
        grille.activerLigneDeCellules(ligne);
        repaint();
        gagne();  
        lancerPartie();
    }

    /**
     * active la colonne de la grille
     * @param colonne
     */
    public void activerColonneDeCellules(int colonne) {
        grille.activerColonneDeCellules(colonne);
        repaint();
        gagne();  
        lancerPartie();
    }

    /**
     *active la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante() {
        grille.activerDiagonaleDescendante();
        repaint();
        gagne();
        lancerPartie();
    }

    /**
     * active la diagonale montante de la grille
     */
    public void activerDiagonaleMontante() {
        grille.activerDiagonaleMontante();
        repaint();
        gagne();
        lancerPartie();
    }

    /**
     * affiche la fenetreVictoire
     */
    public void gagne() {
        if (grille.cellulesToutesEteintes()) {
            FenetreVictoire fenetreVictoire = new FenetreVictoire();
            fenetreVictoire.setVisible(true);
        }
    }

    /**
     * Renvoie la fenetre perdu! Si le joueur dépasse la limite de coups
     */
    public void perdu() {
        if (!grille.cellulesToutesEteintes()) {
            if (nbCoups >= limiteCoups) {
                FenetrePerdu fenetrePerdu = new FenetrePerdu();
                fenetrePerdu.setVisible(true);
            }
        }
    }


    /**
     * Niveau 2: Tous les 5 coups, une cellule change d'état
     */
    public void ajoutNiveau2() {
        if (niveau ==2 ) {
            if (nbCoups > 0 && nbCoups % 5 == 0 && coupsSpeciauxJoues < 3) {
                grille.reinitialiserCellulesAleatoires(5);
                coupsSpeciauxJoues++;
            }
        }
    }

    /**
     * Niveau 3: Au 5ieme coups, une ligne change d'état
     */
    public void ajoutNiveau3() {
        if (niveau ==3 ) {
            if (nbCoups == 5) {
                grille.activerLigneAleatoire();
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        PanneauGrille = new javax.swing.JPanel();
        DiagonaleM = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        DiagonaleD = new javax.swing.JButton();
        coupsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 360));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 360, 80));

        PanneauGrille.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 360, 360));

        DiagonaleM.setBackground(new java.awt.Color(0, 204, 0));
        DiagonaleM.setText("DiagonaleM");
        DiagonaleM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonaleMActionPerformed(evt);
            }
        });
        getContentPane().add(DiagonaleM, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 110, 50));

        Quitter.setText("Quitter");
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });
        getContentPane().add(Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        DiagonaleD.setBackground(new java.awt.Color(0, 153, 0));
        DiagonaleD.setText("DiagonaleD");
        DiagonaleD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagonaleDActionPerformed(evt);
            }
        });
        getContentPane().add(DiagonaleD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        coupsLabel.setText("CoupsLabel");
        getContentPane().add(coupsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagonaleMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonaleMActionPerformed
        this.grille.activerDiagonaleMontante();
        nbCoups++;  
        coupsLabel.setText("Coups joués : " + nbCoups);
        gagne();
        perdu();
        ajoutNiveau2();
        ajoutNiveau3();
        repaint();


    }//GEN-LAST:event_DiagonaleMActionPerformed

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
        System.exit(0);        
        this.dispose();
    }//GEN-LAST:event_QuitterActionPerformed

    private void DiagonaleDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagonaleDActionPerformed
        this.grille.activerDiagonaleDescendante();
        nbCoups++;  
        coupsLabel.setText("Coups joués : " + nbCoups);
        gagne();
        perdu();
        ajoutNiveau2();
        ajoutNiveau3();
        repaint();
    }//GEN-LAST:event_DiagonaleDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TailleGrille tailleGrille = new TailleGrille();
                tailleGrille.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagonaleD;
    private javax.swing.JButton DiagonaleM;
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton Quitter;
    private javax.swing.JLabel coupsLabel;
    // End of variables declaration//GEN-END:variables

}
