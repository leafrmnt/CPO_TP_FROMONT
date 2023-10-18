/*Fromont Léa
 *TDB
 *fantasy TP3
 *18/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fromont;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author leafr
 */
public class TP3_Heroic_Fantasy_FROMONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);
        for (Arme arme : armes) {
            System.out.println(arme);
        }
    }
}