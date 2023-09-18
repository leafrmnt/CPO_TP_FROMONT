/**Fromont Léa
 * TDB
 *Exo 1 TD0 
 *18/09/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        int result;
        int ind;
        result=0;
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind=ind+1;
        }
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
        }
        
    
    

