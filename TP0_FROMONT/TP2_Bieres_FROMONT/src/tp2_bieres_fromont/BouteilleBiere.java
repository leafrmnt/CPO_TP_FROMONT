package tp2_bieres_fromont;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leafr
 */
public class BouteilleBiere {
    String Nom; 
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
}

