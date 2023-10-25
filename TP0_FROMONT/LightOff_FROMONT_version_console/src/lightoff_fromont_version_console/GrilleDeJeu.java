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

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
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
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        boolean activerLigne = random.nextBoolean();
        boolean activerColonne = random.nextBoolean();
        if (activerLigne) {
            int ligneAleatoire = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligneAleatoire][j].activerCellule();
            }
        } else if (activerColonne) {
            int ColonneAleatoire = random.nextInt(nbColonnes);
            for (int i=0; i< nbLignes; i++) {
                 matriceCellules[ColonneAleatoire][i].activerCellule();
            }
        } else {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }
    
    public void melangerMatriceAleatoirement(int nbTours) {   
        Random random = new Random();
        nbTours =0;
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
        for (int tour = 0; tour<nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire(); 
        }
    }
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 &&  idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }
    public void activerDiagonaleDescendante() {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
    }
    public void activerDiagonaleMontante() {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[nbLignes - 1 - i][i].activerCellule();
            }
        
    }
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getetat(true)) {
                    return true; 
                }
            }
        }
        return false; 
    }
}
