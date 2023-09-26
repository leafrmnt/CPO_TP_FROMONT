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
        System.out.println("\n Saisissez la conversion que vous souhaiter effectuer en ecrivant le numéro correspondant: /n" +
"1) De Celcius vers Kelvin\n" +
"2) De Kelvin vers Celcius \n" +
"3) FarenheitVersCelcius \n" +
"4) elciusVersFarenheit \n" + 
"5) KelvinVersFarenheit \n" +
"6) De Farenheit vers Kelvin ");
        numero = sc.nextInt();
        if (numero ==1) {
            System.out.println("\n La température est " +tKelvin);
        }
        if (numero == 2) {
            System.out.println("\n La température est " +Celcius);
        }
        if (numero == 3) {
            System.out.println("\n La température est " +tCel);
        }
        if (numero == 4) {
            System.out.println("\n La température est " +tFa);
        }
        if (numero == 5) {
            System.out.println("\n La température est " +tF);
        }
        if (numero == 6) {
            System.out.println("\n La température est " +TK);
        }
        double resultat;
        resultat= nbre1 +273.15;
        System.out.println("\n La température en degré Kelvin est " + resultat);
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
