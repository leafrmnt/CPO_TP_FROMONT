/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author leafr
 */
public class Magicien extends Personnage{
    boolean confirme;
    ArrayList<String> armesDePredilection = new ArrayList<>();
    static int nombreMagiciens = 0;

    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;
        nombreMagiciens++;
    }

    public boolean valeurConfirme() {
        return confirme;
    }

    public void modifConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    public void ajouterArmeDePredilection(String nomArme) {
        armesDePredilection.add(nomArme);
    }
    public int compterArmesDePredilection() {
        int i = 0;
        for (Arme arme : inventaireArmes) {
            if (armesDePredilection.contains(arme.getNom())) {
                i++;
            }
        }
        return i;
    }
    public void seFatiguer() {
    niveauVie -= 20;
    }

    @Override
    public void finalize() throws Throwable {
        nombreMagiciens--;
        super.finalize();
    }
   public boolean estVivant() {
    return niveauVie > 0; 
    }
}
