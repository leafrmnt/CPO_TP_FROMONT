/*Fromont Léa
 *TDB
 *Guess my number TP1
 *02/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_fromont;
import java.util.Random;

/**
 *
 * @author leafr
 */
public class TP1_guessMyNumber_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random generateurAleat = new Random();
        
        System.out.println("\n Les nombres aléatoires sont : ");
        
        for (int i = 0; i < 5;) {
            int nombreAleatoire = generateurAleat.nextInt();
            System.out.println("Nombre aléatoire :" + nombreAleatoire);
            i++;
        }
    }
}
        
    
    

