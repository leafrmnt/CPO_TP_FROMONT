/*Fromont Léa
 *TDB
 *manipNombresInt TP                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        1 
 *26/09/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_fromont;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class TP1_manipNombresInt_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nbre1; // Création de 2 variables entiers nbre1 et nbre2
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Rentrez un nombre");
        nbre1 = sc.nextInt();
        int nbre2;
        Scanner nb = new Scanner(System.in);
        System.out.println("\n Rentrez un nombre");
        nbre2 = sc.nextInt();
        int resultat; // création d'une variable résultat (entier) qui va stocker les valeurs de mes opérations
        resultat = nbre1 + nbre2; // addition
        System.out.println("\n La somme de " + nbre1 + " et " + nbre2 + " est : " + resultat);
        resultat = nbre1 - nbre2; // difference
        System.out.println("\n La difference de " + nbre1 + " et " + nbre2+ " est : " + resultat);
        resultat = nbre1 * nbre2; // produit
        System.out.println("\n Le produit de " + nbre1 + " et " + nbre2 + " est: " + resultat);
        resultat = nbre1 / nbre2; // quotient
        System.out.println("\n Le quotient de " + nbre1 + " et " + nbre2 + " est: " + resultat);
        resultat = nbre1 % nbre2; // reste
        System.out.println("\n Le reste de " + nbre1 + " et " + nbre2 + " est: " + resultat);
        
        
    }
    
}
