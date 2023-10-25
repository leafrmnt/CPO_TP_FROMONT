/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    public Partie() {
        grille = new GrilleDeJeu(7, 7);
        nbCoups =0;
    }
public void initialiserPartie() {
    grille.melangerMatriceAleatoirement(5); 
}
    /**
     *
     */
    public void lancerPartie() {
        Scanner choix = new Scanner(System.in);
        System.out.println(grille.toString());
        String choixJoueur;
        nbCoups = 0;
        while (!grille.cellulesToutesEteintes()) {
            System.out.println("\n Entrer le coup que vous voulez jouer : /n DD pour la diagonale descendante (DD) /n 1C pour la premiere colonne /n 2C pour la deuxieme colonne /n 3C /n 4C /n 5C /n 6C /n 7C /n 1L pour la premiere ligne /n 2L /n 3L /n 4L /n 5L /n 6L /n 7L /n DM");
            choixJoueur = choix.next();
            if (choixJoueur.equals("L")) {
                grille.activerLigneDeCellules(nbCoups);
            } else if (choixJoueur.equals("C")) {
                grille.activerColonneDeCellules(nbCoups);
            } else if (choixJoueur.equals("DD")) {
                grille.activerDiagonaleDescendante();
            } else if (choixJoueur.equals("DM")) {
                grille.activerDiagonaleMontante();
            } else {
                System.out.println(".Veuillez saisir un des numero indique");
                continue; 
            }
        nbCoups++;
        System.out.println("Grille après le coup " + nbCoups + " :");
        System.out.println(grille.toString());
        }
        
    }
}
 