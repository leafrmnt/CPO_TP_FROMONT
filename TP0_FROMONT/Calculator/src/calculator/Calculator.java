/*Fromont Léa
 *TDB
 *Exo 1 TD0 
 *25/09/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           1) add 
                           2) substract 
                           3) multiply
                           4) divide
                           5) modulo""");
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Rentrez un nombre");
        operateur = sc.nextInt();
        if (operateur < 1) {
            System.out.println("\n Erreur le nombre doit etre compris entre 1 et 7");
            System.out.println("\n Retentez, attention dernière chance !");
            operateur = sc.nextInt();
            System.out.println("\n Trop d'erreur");
            System.exit(0);
        }
        if (operateur > 5) {
            System.out.println("\n Erreur le nombre doit etre compris entre 1 et 7");
            System.out.println("\n Retentez, attention dernière chance !");
            operateur = sc.nextInt();
            System.out.println("\n Trop d'erreur");
            System.exit(0);
        } else {
            int operand1;
            Scanner fi = new Scanner(System.in);
            System.out.println("\n Entrer une premiere valeur :");
            operand1 = sc.nextInt();
            int operand2;
            Scanner se = new Scanner(System.in);
            System.out.println("\n Entrer une seconde valeur :");
            operand2 = sc.nextInt();
            int resultat;
            resultat = operand1 + operand2;
            System.out.println("\n Le resultat est :" + resultat);

        }
    }

}
