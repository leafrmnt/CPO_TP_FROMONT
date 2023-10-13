/*Fromont Léa
 *TDB
 *Convertisseur TP2
 *13/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_fromont;

/**
 *
 * @author leafr
 */
public class TP2_manip_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        assiette2.nbCalories += 100;
        System.out.println("nb de calories de Assiette 2 après incrémentation : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 après incrémentation : " + assiette3.nbCalories);
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        System.out.println("nb de calories de Assiette 1 après inversion : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 après inversion : " + assiette2.nbCalories);
        Moussaka[] moussakaArray = new Moussaka[10];
        for (int i = 0; i < moussakaArray.length; i++) {
            moussakaArray[i] = new Moussaka(100); 
        }
    }
}

    
    

