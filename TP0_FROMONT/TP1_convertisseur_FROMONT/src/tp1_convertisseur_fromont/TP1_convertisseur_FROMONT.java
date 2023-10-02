/*Fromont Léa
 *TDB
 *Convertisseur TP1
 *26/09/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_fromont;

import java.util.Scanner;

/**
 *
 * @author leafr
 */
public class TP1_convertisseur_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nbre1; // Création de 2 variables entiers nbre1 et nbre2
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour, rentrez une temperature: ");
        nbre1 = sc.nextDouble();
        int numero;
        Scanner nu = new Scanner(System.in);
        System.out.println("""
                           
                            Saisissez la conversion que vous souhaiter effectuer en ecrivant le numero correspondant:
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) FarenheitVersCelcius 
                           4) elciusVersFarenheit 
                           5) KelvinVersFarenheit 
                           6) De Farenheit vers Kelvin """);
        numero = nu.nextInt();
        double resultat;
        
        if (numero ==1) {
            resultat = CelciusVersKelvin(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        if (numero == 2) {
            resultat = KelvinVersCelcius(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        if (numero == 3) {
            resultat = FarenheitVersCelcius(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        if (numero == 4) {
            resultat = CelciusVersFarenheit(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        if (numero == 5) {
            resultat = KelvinVersFarenheit(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        if (numero == 6) {
            resultat = FarenheitVersKelvin(nbre1);
            System.out.println("\n La température est " + resultat);
        }
        
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;            
    }
    public static double KelvinVersCelcius (double Kelvin) {
        double Celcius = Kelvin - 273.15;
        return Celcius;     
    }
    public static double FarenheitVersCelcius(double tFar) {
        double tCel = (tFar - 32)* 5/9;
        return tCel;
    }
    public static double CelciusVersFarenheit(double tC) {
        double tFa = (tC * 1.8) + 32;
        return tFa;
    }
    public static double KelvinVersFarenheit(double tK) {
        double tF = (tK - 273.15)* 1.8 + 32;
        return tF;
    }
    public static double FarenheitVersKelvin(double TFA) {
        double TK = (TFA - 32)/ 1.8 + 273.15;
        return TK;
               
        
    }
}
