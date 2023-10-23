/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
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
        this.inventaireArmes = new ArrayList<>();
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
    public void seFatiguer() {
    niveauVie -= 10; 
    if (niveauVie < 0) {
        niveauVie = 0; 
    }
    }

    public void attaquer(Personnage cible) {

    int niveauAttaqueArme = armeEnMain.getNiveauAttaque();

    if (this instanceof Magicien && armeEnMain instanceof Baton) {
        int ageBaton = ((Baton) armeEnMain).getAge();
        niveauAttaqueArme *= ageBaton;
        seFatiguer();
    }

    if (this instanceof Guerrier && armeEnMain instanceof Epee) {
        int finesseEpee = ((Epee) armeEnMain).getFinesse();
        niveauAttaqueArme *= finesseEpee;

        seFatiguer();
    }

    if ((this instanceof Magicien && ((Magicien) this).valeurConfirme()) || (this instanceof Guerrier && ((Guerrier) this).valeurCheval())) {
        niveauAttaqueArme /= 2;
    }

    cible.estAttaque(niveauAttaqueArme);
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

    public void estAttaque(int points) {
    niveauVie -= points;
    if (niveauVie < 0) {
        niveauVie = 0; 
    }
    }

}
