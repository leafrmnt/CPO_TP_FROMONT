package tp2_convertisseurobjet_fromont;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leafr
 */
public class Convertisseur {
    private int nbConversions;
    public Convertisseur() {
        nbConversions = 0; 
    }
    public void CelsiusVersFahrenheit(double celsius) { 
        double fahrenheit = (celsius*9/5) + 32; 
        nbConversions++; 
        System.out.println(celsius + " °C = " + fahrenheit + " °F"); 
    }
    public void CelsiusVersKelvin(double celsius) {
        double kelvin = celsius+273.15;
        nbConversions++;
        System.out.println(celsius + " °C = " + kelvin + " K");
    }
    public void KelvinVersFahrenheit(double kelvin) {
        double fahrenheit = (kelvin-273.15)*9/5+32;
        nbConversions++;
        System.out.println(kelvin + " K = " + fahrenheit + " °F");
    }

    @Override
    public String toString() {
        return "Nb de conversions " + nbConversions;
    }
}
