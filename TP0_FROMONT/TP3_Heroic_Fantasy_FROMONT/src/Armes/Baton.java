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
public class Baton extends Arme {
    int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age < 100) {
            this.age = age;
        } else {
            this.age = 99; // Assure que l'âge ne dépasse pas 99.
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}