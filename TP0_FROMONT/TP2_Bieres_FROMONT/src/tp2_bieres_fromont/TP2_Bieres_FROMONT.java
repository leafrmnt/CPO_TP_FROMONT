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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        

    }
    
}
