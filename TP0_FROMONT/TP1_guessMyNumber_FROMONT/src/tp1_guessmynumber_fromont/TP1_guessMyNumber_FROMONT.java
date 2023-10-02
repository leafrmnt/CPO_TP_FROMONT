/*Fromont Léa
 *TDB
 *Guess my number TP1
 *02/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_fromont;
import java.util.Random;
import java.util.Scanner;

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

        
        int n = generateurAleat.nextInt(100);
        int devine;
        int tentative = 0;

        Scanner sc = new Scanner(System.in);
        int choix;
        int difference;
        Scanner nu = new Scanner(System.in);
        System.out.println("""
                           
                            Saisissez la conversion que vous souhaiter effectuer en ecrivant le numero correspondant:
                           1) Niveau facile
                           2) Niveau intermediaire
                           3) Niveau dificile """);
        choix = nu.nextInt();
        System.out.println("\n Devinez le nombre entre 0 et 99 !");
        
        
        switch (choix) {
            case 1 -> {
                while (true) { // Pas de limite de tentatives pour le niveau facile
                    System.out.print("Entrez votre proposition : ");
                    devine = sc.nextInt();
                    difference = n - devine;
                    
                    
                    if (difference > 20) {
                        System.out.println("\n Vraiment trop " + (devine > n ? "grand" : "petit"));
                    } else if (devine > n) {
                        System.out.println("\n Trop grand");
                    } else if (devine < n) {
                        System.out.println("\n Trop petit");
                    } else {
                        System.out.println("\n Gagné !");
                        System.out.println("\n Vous avez eu " + (tentative + 1) + " tentative(s)");
                        break;
                    }
                }
            }
            case 2 -> {
                // Niveau intermédiaire (par défaut)
                while (true) {
                    System.out.print("Entrez votre proposition : ");
                    devine = sc.nextInt();
                    
                    if (devine > n) {
                        tentative = tentative + 1;
                        System.out.println("\n Trop grand");
                    } else if (devine < n) {
                        tentative = tentative + 1;
                        System.out.println("\n Trop petit");
                        
                    } else {
                        tentative = tentative + 1;
                        System.out.println("\n Gagne !");
                        System.out.println("\n Vous avez eu " + tentative + "tentatives");
                        break;
                    }
                }
            }
            case 3 -> {
                // Niveau difficile (3 tentatives)
                for (int i = 0; i < 3; i++) {
                    System.out.print("Entrez votre proposition : ");
                    devine = sc.nextInt();
                    
                    if (devine > n) {
                        System.out.println("\n Trop grand");
                    } else if (devine < n) {
                        System.out.println("\n Trop petit");
                    } else {
                        System.out.println("\n Gagné !");
                        tentative= tentative +1;
                        System.out.println("\n Vous avez eu " + tentative  + " tentatives");
                        
                    }
                    if (tentative >= 3) {
                    System.out.println("\n Vous avez épuisé toutes vos tentatives. Le nombre était : " + n);
                    break;
                    }
                }
            }
            default -> System.out.println("Niveau non valide. Choisissez parmi les niveaux 1, 2 ou 3.");
        }
            
            }
    }
    



    
    

