/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;

import java.util.Scanner;

/**
 * Partie du jeu Lightoff
 * @author leafr
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    
    /**
     *nouvelle instance grille cellules lumineuses
     */
    public Partie() {
        grille = new GrilleDeJeu(7, 7);
        nbCoups =0;
    }

    /**
     *initialise partie + s'assure que le jeu est bien mélangé
     */
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(100); 
         
    }
   
    /**
     * permet de jouer + affiche etat initiale de la grille
     */
    public void lancerPartie() {
        Scanner choix = new Scanner(System.in);
        System.out.println(grille.toString());
        int coupsRestants = 10; 
        nbCoups = 0;
        while (!grille.cellulesToutesEteintes() && coupsRestants > 0) {
            System.out.println("\nIl vous reste " + coupsRestants + " coups. Entrez le coup que vous voulez jouer (par exemple,\n1 pour activer la première ligne,\n2 pour activer la deuxième ligne,\n-1 pour activer la première colonne,\n-2 pour activer la deuxième colonne,\n8 pour activer la diagonale descendante,\n9 pour activer la diagonale montante) :");
            int choixJoueur = choix.nextInt();
            if (choixJoueur > 0 && choixJoueur <= grille.nbLignes) {
                grille.activerLigneDeCellules(choixJoueur - 1);
            } else if (choixJoueur < 0 && choixJoueur >= -grille.nbColonnes) {
                grille.activerColonneDeCellules(-choixJoueur - 1);
            } else if (choixJoueur == 7) {
                grille.activerDiagonaleDescendante();
            } else if (choixJoueur == 8) {
                grille.activerDiagonaleMontante();
                continue; 
            } else {
                System.out.println("Erreur saisie, veuillez réessayer");
                continue; 
            }
            nbCoups++;
            coupsRestants--;
            System.out.println("Grille après le coup " + nbCoups + " :");
            System.out.println(grille.toString());
        }
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        } else {
            System.out.println("Perdu ! Vous avez déjà joué tous vos coups.");
        }
    }
}