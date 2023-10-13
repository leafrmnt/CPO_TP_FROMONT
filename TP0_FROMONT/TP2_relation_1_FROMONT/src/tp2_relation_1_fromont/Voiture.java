/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fromont;

/**
 *
 * @author leafr
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;   
    Personne Proprietaire ;

   


    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire = null;
    }
    public String getModele() {
        return Modele;
    }

    public String getMarque() {
        return Marque;
    }

    public int getPuissanceCV() {
        return PuissanceCV;
    }
    @Override
    public String toString() {
        return "Voiture{" +"Modele='" + Modele + '\'' +", Marque='" + Marque + '\'' +", PuissanceCV=" + PuissanceCV +'}';
    }
}