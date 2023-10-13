/*Fromont Léa
 *TDB
 *Convertisseur TP2
 *13/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fromont;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class TP2_convertisseurObjet_FROMONT {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Convertisseur convertisseur = new Convertisseur(); //initialisation
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choisir la "); //affichage menu de choix de conversion
            System.out.println("1 Celsius à Fahrenheit");
            System.out.println("2 Celsius à Kelvin");
            System.out.println("3 Kelvin à Fahrenheit");
            int choix = scanner.nextInt(); //choix du type de conversion
            switch (choix) {
                case 1 ->                     {
                        //Si le choix dans le menu c'est 1 (celsius a farenheit)
                        System.out.print("température en celsius : "); //affichage demande d'entrer la T°
                        double tempCelsius = scanner.nextDouble(); //entrée de la valeur de la T° par l'utilisateur
                        convertisseur.CelsiusVersFahrenheit(tempCelsius); //utilisation de la méthode qui passe de C° en F°
                    }
                case 2 ->                     {
                        System.out.print("température en celsius : ");
                        double tempCelsius = scanner.nextDouble();
                        convertisseur.CelsiusVersKelvin(tempCelsius);
                    }
                case 3 -> {
                    System.out.print("température en kelvin : ");
                    double tempKelvin = scanner.nextDouble();
                    convertisseur.KelvinVersFahrenheit(tempKelvin);
                }
                default -> {
                }
            }
        }
    }
}

