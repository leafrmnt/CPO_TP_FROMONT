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
public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 99; // Assure que la finesse ne dépasse pas 99.
        }
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}

