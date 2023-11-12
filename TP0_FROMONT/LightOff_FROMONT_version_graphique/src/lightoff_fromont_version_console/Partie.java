/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Partie du jeu Lightoff
 * @author leafr
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    int limiteCoups;
    int niveau;
    List<Integer> coupsJoues;
    List<String> coupsSpeciauxDejaJoues;
    
    /**
     *nouvelle instance grille cellules lumineuses
     * @param nbLignes
     * @param nbColonnes
     * @param niveau
     */
    public Partie(int nbLignes, int nbColonnes, int niveau) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups =0;
        coupsJoues = new ArrayList<>();
        this.niveau= niveau;
         
        
        switch (niveau) {
            case 2 -> limiteCoups = 10; 
            case 3 -> {
                limiteCoups = 10; 
                grille.eteindreToutesLesCellules(); 
            }
            default -> limiteCoups = Integer.MAX_VALUE; 
        }
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
        if (niveau==1) {
            Scanner choix = new Scanner(System.in);
            System.out.println(grille.toString());

            while (!grille.cellulesToutesEteintes()) {
                System.out.println("Entrez le coup que vous voulez jouer (par exemple,\n1 pour activer la première ligne,\n2 pour activer la deuxième ligne,\n-1 pour activer la première colonne,\n-2 pour activer la deuxième colonne,\nD pour activer la diagonale descendante,\nM pour activer la diagonale montante,\nQ pour quitter la partie) :");

                String choixJoueur = choix.next();

                if (choixJoueur.equals("Q")) {
                    System.out.println("Vous avez quitté la partie.");
                    break;
                } else if (choixJoueur.equals("D")) {
                    grille.activerDiagonaleDescendante();
                } else if (choixJoueur.equals("M")) {
                    grille.activerDiagonaleMontante();
                } else {
                    try {
                        int choixInt = Integer.parseInt(choixJoueur);
                        if (choixInt > 0 && choixInt <= grille.nbLignes) {
                            grille.activerLigneDeCellules(choixInt - 1);
                        } else if (choixInt < 0 && choixInt >= -grille.nbColonnes) {
                            grille.activerColonneDeCellules(-choixInt - 1);
                        } else {
                            System.out.println("Erreur de saisie, veuillez réessayer");
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur de saisie, veuillez réessayer");
                        continue;
                    }
                }

                nbCoups++;
                System.out.println("Grille après le coup " + nbCoups + " :");
                System.out.println(grille.toString());
            }

            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
    
            
        }
        if (niveau==2) {
            Scanner choix = new Scanner(System.in);
            System.out.println(grille.toString());

            while (!grille.cellulesToutesEteintes() && nbCoups < limiteCoups) {
                System.out.println("\nIl vous reste " + (limiteCoups - nbCoups) + " coups. Entrez le coup que vous voulez jouer (par exemple,\n1 pour activer la première ligne,\n2 pour activer la deuxième ligne,\n-1 pour activer la première colonne,\n-2 pour activer la deuxième colonne,\nD pour activer la diagonale descendante,\nM pour activer la diagonale montante,\nQ pour quitter la partie) :");

                String choixJoueur = choix.next();

                if (choixJoueur.equals("Q")) {
                    System.out.println("Vous avez quitté la partie.");
                    return;
                } else if (choixJoueur.equals("D")) {
                    grille.activerDiagonaleDescendante();
                } else if (choixJoueur.equals("M")) {
                    grille.activerDiagonaleMontante();
                } else {
                    try {
                        int choixInt = Integer.parseInt(choixJoueur);
                        if (choixInt > 0 && choixInt <= grille.nbLignes) {
                            grille.activerLigneDeCellules(choixInt - 1);
                        } else if (choixInt < 0 && choixInt >= -grille.nbColonnes) {
                            grille.activerColonneDeCellules(-choixInt - 1);
                        } else {
                            System.out.println("Erreur de saisie, veuillez réessayer");
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur de saisie, veuillez réessayer");
                        continue;
                    }
                }

                nbCoups++;
                System.out.println("Grille après le coup " + nbCoups + " :");
                System.out.println(grille.toString());

                if (grille.cellulesToutesEteintes()) {
                    System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
                    return;
                } else if (nbCoups >= limiteCoups) {
                    System.out.println("Perdu ! Vous avez atteint la limite de coups.");
                    return;
                }
            }
            
        }
        if (niveau==3) {
            Set<String> coupsPossibles = new HashSet<>();
            coupsPossibles.add("D");
            coupsPossibles.add("M");
            for (int i = 1; i <= grille.nbLignes; i++) {
                coupsPossibles.add(Integer.toString(i));
            }
            for (int i = -1; i >= -grille.nbColonnes; i--) {
                coupsPossibles.add(Integer.toString(i));
            }
            Set<String> coupsJouesSet  = new HashSet<>();
            Scanner choix = new Scanner(System.in);
            System.out.println(grille.toString());

            while (!grille.cellulesToutesEteintes() && nbCoups < limiteCoups) {
                System.out.println("\nIl vous reste " + (limiteCoups - nbCoups) + " coups. Entrez le coup que vous voulez jouer (par exemple,\n1 pour activer la première ligne,\n2 pour activer la deuxième ligne,\n-1 pour activer la première colonne,\n-2 pour activer la deuxième colonne,\nD pour activer la diagonale descendante,\nM pour activer la diagonale montante,\nQ pour quitter la partie) :");

                String choixJoueur = choix.next();

                if (choixJoueur.equals("Q")) {
                    System.out.println("Vous avez quitté la partie.");
                    return;
                } else if (coupsSpeciauxDejaJoues.contains(choixJoueur)) {
                    System.out.println("Ce coup spécial a déjà été joué. Choisissez un autre coup.");
                    continue;
                } else if (coupsJouesSet.contains(choixJoueur)) {
                    System.out.println("Ce coup a déjà été joué. Choisissez un autre coup.");
                    continue;
                } else if (!coupsPossibles.contains(choixJoueur)) {
                    System.out.println("Coup invalide. Veuillez réessayer.");
                    continue;
        
                } else if (choixJoueur.equals("D")) {
                    coupsSpeciauxDejaJoues.add("D");
                    grille.activerDiagonaleDescendante();
                } else if (choixJoueur.equals("M")) {
                    coupsSpeciauxDejaJoues.add("M");
                    grille.activerDiagonaleMontante();
                } else {
                    try {
                        int choixInt = Integer.parseInt(choixJoueur);
                        if (choixInt > 0 && choixInt <= grille.nbLignes) {
                            if (coupsJouesSet.contains(choixInt)) {
                                System.out.println("Cette ligne a déjà été activée. Choisissez une autre ligne.");
                                continue; 
                            } else {
                                coupsJouesSet.add(Integer.toString(choixInt));
                                grille.activerLigneDeCellules(choixInt - 1);
                            }
                        } else if (choixInt < 0 && choixInt >= -grille.nbColonnes) {
                            if (coupsJouesSet.contains(choixInt)) {
                                System.out.println("Cette colonne a déjà été activée. Choisissez une autre colonne.");
                                continue; 
                            } else {
                                    coupsJouesSet.add(Integer.toString(choixInt));
                                    grille.activerColonneDeCellules(-choixInt - 1);
                            }
                        } else {
                            System.out.println("Erreur de saisie, veuillez réessayer");
                            continue; 
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur de saisie, veuillez réessayer");
                        continue;
                    }
                }

                nbCoups++;
                System.out.println("Grille après le coup " + nbCoups + " :");
                System.out.println(grille.toString());
                if (grille.cellulesToutesEteintes()) {
                    System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
                    return;
                }
            }
            if (nbCoups >= limiteCoups) {
                System.out.println("Perdu ! Vous avez atteint la limite de coups.");
                
            } else {
                System.out.println("Perdu ! Toutes les possibilités de coups ont été jouées.");
                
            }
              
            
        }
    }
}


   
    