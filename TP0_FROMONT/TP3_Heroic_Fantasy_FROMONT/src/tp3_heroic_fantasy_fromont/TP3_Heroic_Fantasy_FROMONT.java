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
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);
          for (int i = 0; i < armes.size(); i++) {
        Arme arme = armes.get(i);
        System.out.println(arme);
        System.out.println(); 
        }
          
          
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);
        for (Personnage personnage : personnages) {
            System.out.println(personnage);
            System.out.println(); // Séparateur entre les personnages
        }
        Guerrier guerrier = new Guerrier("Arthur", 78, false);
        Magicien magicien = new Magicien("Lancelot", 65, true);

        Arme baton1 = new Baton("Bâton 1", 4, 5);
        Arme epee1 = new Epee("Épée 1", 7, 5);
        Arme epee2 = new Epee("Épée 2", 5, 4);
        Arme baton2 = new Baton("Bâton 2", 6, 6);
        Arme baton3 = new Baton("Bâton 3", 3, 4);

        guerrier.ajouterArme(baton1);
        guerrier.ajouterArme(epee1);
        guerrier.ajouterArme(epee2);

        magicien.ajouterArme(baton2);
        magicien.ajouterArme(baton3);
        magicien.ajouterArme(epee1);

        guerrier.equiperArme("Épée 1");

        int nombreArmesPreferees = magicien.compterArmesDePredilection();
        System.out.println(magicien.getNom() + " possède " + nombreArmesPreferees + " armes de prédilection.");

        System.out.println(guerrier);
        System.out.println();
        System.out.println(magicien);
    
    }
}