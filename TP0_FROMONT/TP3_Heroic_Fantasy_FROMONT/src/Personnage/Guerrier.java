/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author leafr
 */
public class Guerrier extends Personnage  {
    boolean Cheval;
    static int nombreGuerriers = 0;
    public Guerrier(String nom, int niveauVie, boolean Cheval) {
        super(nom,niveauVie);
        this.Cheval = Cheval;
        nombreGuerriers++;
    }
    public boolean valeurCheval() {
        return Cheval;
    }
    public void modifCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }
    public void seFatiguer() {
    niveauVie -= 20;
    }

    @Override
    public void finalize() throws Throwable {
        nombreGuerriers--;
        super.finalize();
    }

    public boolean estVivant() {
    return niveauVie > 0; 
    }
}
 