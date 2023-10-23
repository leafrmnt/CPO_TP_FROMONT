/*Fromont Léa
 *TDB
 *fantasy TP3
 *18/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_fromont;

import Personnage.Guerrier;
import Personnage.Personnage;
import Personnage.Magicien;
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

        Magicien magicien = new Magicien("Merlin", 100, false); 
        Guerrier guerrier = new Guerrier("Arthur", 150, true); 

        magicien.ajouterArme(excalibur);
        guerrier.ajouterArme(durandal);
        magicien.ajouterArme(chene);
        guerrier.ajouterArme(charme);

        magicien.equiperArme("Excalibur");
        guerrier.equiperArme("Durandal");

        magicien.attaquer(guerrier);
        System.out.println("Caracteristiques magicien après attaque :" + magicien.toString());
        System.out.println("Caracteristiques guerrier après attaque : " + guerrier.toString());

        guerrier.attaquer(magicien);
        System.out.println("Caracteristiques guerrier apres attaque :");
        System.out.println(guerrier.toString());
        System.out.println("Caracteristiques magicien apres attaque :");
        System.out.println(magicien.toString());

   
        if (magicien.estVivant()) {
            System.out.println("Le magicien est vivant");
        } else {
            System.out.println("Le magicien est dead");
        }

        if (guerrier.estVivant()) {
            System.out.println("Le guerrier est vivant");
        } else {
            System.out.println("Le guerrier est dead");
        }
    }
}

    
        