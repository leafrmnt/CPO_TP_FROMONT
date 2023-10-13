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
        if (uneBiere.Decapsuler()) {
            System.out.println("biere ouverte");
            uneBiere.ouverte= true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
        }
        System.out.println(uneBiere) ;
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.ouverte = false;
         if (autreBiere.Decapsuler()) {
            System.out.println("biere ouverte");
            autreBiere.ouverte= true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
        }
        System.out.println(autreBiere) ;
        BouteilleBiere deuxBiere = new BouteilleBiere("Heineken", 2.0 ,"Marseille") ;
        deuxBiere.ouverte = false;
         if (deuxBiere.Decapsuler()) {
            System.out.println("biere ouverte");
            deuxBiere.ouverte= true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
        }
        System.out.println(deuxBiere) ;
        BouteilleBiere troisBiere = new BouteilleBiere("Desperados", 12.0 ,"Fronti") ;
        troisBiere.ouverte = true;
         if (troisBiere.Decapsuler()) {
            System.out.println("biere ouverte");
            troisBiere.ouverte= true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
        }
        System.out.println(troisBiere) ;
        BouteilleBiere quatreBiere = new BouteilleBiere("Coca", 4.0 ,"Paris") ;
        quatreBiere.ouverte = false;
         if (quatreBiere.Decapsuler()) {
            System.out.println("biere ouverte");
            quatreBiere.ouverte= true;
        } else {
            System.out.println("erreur : biere déjà ouverte");
        }
       System.out.println(quatreBiere) ;



    }
    
}
