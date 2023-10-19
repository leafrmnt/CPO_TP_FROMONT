/*Fromont Léa
 *TDB
 *fantasy TP3
 *18/10/2023
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author leafr
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            this.niveauAttaque = 100; 
        }
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }
    

    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}

