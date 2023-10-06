/*Fromont Léa
 *TDB
 *Bieres TP2
 *06/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_fromont;

/**
 *
 * @author leafr
 */
public class TP2_Bieres_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        BouteilleBiere deuxiemeBiere = new BouteilleBiere() ;
        deuxiemeBiere.Nom = "Leffe";
        deuxiemeBiere.degreAlcool = 6.6 ;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        deuxiemeBiere.ouverte = false;
        deuxiemeBiere.lireEtiquette();

    }
    
}
