/*Fromont Léa
 *TDB
 *stats TP1
 *02/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_fromont;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class TP1_stats_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int[] Des = new int[6];

        System.out.print("Entrez le nombre de lancers : ");
        int m = sc.nextInt();
        
       
        Random generateurAleat = new Random();
        for (int i = 0; i < m; i++) { // Utilisation de i++ pour incrémenter i à chaque itération
            int resultat = generateurAleat.nextInt(6);
            Des[resultat]++; // Incrémenter la case correspondante du tableau
        }
        
        
        System.out.println("Résultats des lancers en pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcent = (double) Des[i] / m * 100.0;
            System.out.println( (i + 1) + " : " + pourcent + "%");
        }
    }
}
    
    

