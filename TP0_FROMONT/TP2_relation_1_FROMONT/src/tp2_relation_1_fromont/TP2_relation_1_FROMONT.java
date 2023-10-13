/*Fromont Léa
 *TDB
 *Realtion TP2
 *13/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_fromont;

/**
 *
 * @author leafr
 */
public class TP2_relation_1_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);
        System.out.println("la premiere voiture de Bob est " + bob.listeVoitures[0] ) ;
    }
}    

