/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;
import java.util.Random;
/**
 *
 * @author leafr
 */
public class GrilleDeJeu {
     CelluleLumineuse[][] matriceCellules;
     int nbLignes;
     int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;  
        genererNouvelleMatriceCellulesLumineuses();
    }
        
    public void  genererNouvelleMatriceCellulesLumineuses() {
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
               matriceCellules[i][j] = new CelluleLumineuse();
            }
        }  
    }
    public void eteindreToutesLesCellules() {
       this.etat= false;
    }
    public void activerLigneOuCelluleAleatoire() {
        Random random = new Random();
        boolean activerLigne = random.nextBoolean();
        if (activerLigne) {
            int ligneAleatoire = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligneAleatoire][j].activerCellule();
            }
        } else {
            int ColonneAleatoire = random.nextInt(nbColonnes);
            for (int i=0; i< nbLignes; i++) {
                 matriceCellules[ColonneAleatoire][i].activerCellule();
            }
        }
    }
    public void genererMatriceAleatoire(int nbTours) {   
        Random random = new Random();
        nbTours =0;
        int tour = 0;
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
        for (tour < nbTours; tour++) {
            int choixAleatoire = random.nextInt(3); 
            if (choixAleatoire == 0) {
            int ligneAleatoire = random.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligneAleatoire][j].activerCellule();
                }
            } else if (choixAleatoire == 1){
                int ColonneAleatoire = random.nextInt(nbColonnes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ColonneAleatoire][j].activerCellule();
                }
            }
                
         
    }
    
}
