/*Fromont Léa
 *TDB
 *LightOff
 *24/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_fromont_version_console;

import java.util.Scanner;



/**
 *
 * @author leafr
 */
public class LightOff_FROMONT_version_console {

    /**
     * initialise la partie
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Niveaux = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff !\nChoisissez le niveau de difficulte :\n1. Facile (pas de limite de coups)\n2. Moyen (limite a 10 coups)\n3. Difficile (limite a 10 coups, pas de coups en double)");
        System.out.print("Entrez le numero du niveau : ");
        int niveau = Niveaux.nextInt();
        if (niveau < 1 || niveau > 3) {
            System.out.println("Niveau invalide, erreur saisie. Le jeu sera configure en mode par defaut (facile)");
            niveau = 1;
        }
        int nbLignes, nbColonnes;
        while (true) {
            System.out.println("Entrez le nombre de lignes (entre 3 et 10) : ");
            nbLignes = scanner.nextInt();
            if (nbLignes >= 3 && nbLignes <= 10) {
                break; 
            } else {
                System.out.println("Le nombre de lignes doit etre compris entre 3 et 10.");
            }
        }
        while (true) {
            System.out.println("Entrez le nombre de colonnes (entre 3 et 10) : ");
            nbColonnes = scanner.nextInt();
            if (nbColonnes >= 3 && nbColonnes <= 10) {
                break; 
            } else {
                System.out.println("Le nombre de colonnes doit etre compris entre 3 et 10.");
            }
        }
    Partie partie = new Partie(nbLignes, nbColonnes, niveau);
    partie.initialiserPartie();
    partie.lancerPartie();
    }
}
    

