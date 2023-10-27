/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;
import java.util.Random;
/**
 * grille Celulles lumineuses
 * @author leafr
 */
public class GrilleDeJeu {
     CelluleLumineuse[][] matriceCellules;
     int nbLignes;
     int nbColonnes;

    /**
     *grille cellules lumineuses de p lignes et p colonnes
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;  
        genererNouvelleMatriceCellulesLumineuses();
    }
        
    /**
     *
     */
    public void  genererNouvelleMatriceCellulesLumineuses() {
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
               matriceCellules[i][j] = new CelluleLumineuse();
            }
        }  
    }

    /**
     *éteint toutes les cellules etat=eteint
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    /**
     * active de manière aléatoire une ligne, une colonne ou une diagonale
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int rand = random.nextInt(3);               
        if (rand == 1) {
            int colonneAleatoire = random.nextInt(nbColonnes);      
            activerColonneDeCellules(colonneAleatoire);         
        } else if (rand == 2) {
            int ligneAleatoire = random.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);
        } else {
            int rand2 = random.nextInt(2);
            if (rand2 == 0) {
                activerDiagonaleDescendante();
            } else {
                activerDiagonaleDescendante();
            }
        }
    }

    /**
     * A partir d'un nbTours génère cellules lumineuses aléatoirement
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int i = random.nextInt(nbLignes);
            int j = random.nextInt(nbColonnes);
            matriceCellules[i][j].activerCellule();
        }
    }

    /**
     *active toutes les cellules d'une ligne spécifique de la grille
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    
    /**
     *active toutes les cellules d'une colonne spécifique de la grille
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }   
    }

    /**
     *active la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante() {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
    }

    /**
     *active la diagonale montante de la grille
     */
    public void activerDiagonaleMontante() {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[nbLignes - 1 - i][i].activerCellule();
            } 
    }

    /**
     *vérifie si toutes les cellules de la grille sont éteintes, renvoit true=toutes éteintes  false= pas toutes éteintes
     * @return
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    return false; 
                }
            }
        }
        return true; 
    }

    /**
     * affiche état de la grille
     * @return
     */
    @Override
    public String toString() {
        String gridString = "";
        gridString += "   |";
        for (int j = 0; j < nbColonnes; j++) {
            gridString += " " + (j + 1) + " |";
        }
        gridString += "\n";
        gridString += "-".repeat(4 * (nbColonnes + 1)) + "\n";
        for (int i = 0; i < nbLignes; i++) {
            gridString += " " + (i + 1) + " |";
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].getetat()) {
                gridString += " X |";
            } else {
                gridString += " O |";
            }
        }
        gridString += "\n";
        gridString += "-".repeat(4 * (nbColonnes + 1)) + "\n";
    }
    return gridString;
    }
}