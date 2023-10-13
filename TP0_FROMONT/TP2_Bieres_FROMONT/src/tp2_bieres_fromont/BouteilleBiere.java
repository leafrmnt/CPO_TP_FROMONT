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
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

 



    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = (float) unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
        
    }
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            return false;
        }
    
}
    @Override
public String toString() {
    String chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte) {
        chaine_a_retourner += "oui";
    } else {
        chaine_a_retourner += "non";
    }
    return chaine_a_retourner;
}

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    

}