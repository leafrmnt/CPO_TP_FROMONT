/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import static Personnage.Magicien.nombreMagiciens;
import java.util.ArrayList;

/**
 *
 * @author leafr
 */
public abstract class Personnage {
    String nom;
    int niveauVie;
    ArrayList<Arme> inventaireArmes;
    Arme armeEnMain;
    static int nombrePersonnages = 0;
    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
         nombrePersonnages++;
        
    }
    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }
    public void ajouterArme(Arme arme) {
    if (inventaireArmes.size() < 5) {
        inventaireArmes.add(arme);
    } else {
        System.out.println("Le personnage a déjà 5 armes dans son inventaire, vous ne pouvez pas en ajouter plus.");
    }
}

    public void equiperArme(String nomArme) {
    for (Arme arme : inventaireArmes) {
        if (arme.getNom().equals(nomArme)) {
            armeEnMain = arme;
            System.out.println(nom + " a équipé l'arme : " + arme.getNom());
            return;
        }
    }
    System.out.println("L'arme avec le nom " + nomArme + " n'a pas été trouvée dans l'inventaire de " + nom);
}

    @Override
    public String toString() {
        String personnageString = "Nom : " + nom + "\nNiveau de vie : " + niveauVie;
        if (armeEnMain != null) {
            personnageString += "\nArme en main : " + armeEnMain.getNom();
        }
        return personnageString;
}
    @Override
    public void finalize() throws Throwable {
        nombreMagiciens--;
        super.finalize();
    }
}
