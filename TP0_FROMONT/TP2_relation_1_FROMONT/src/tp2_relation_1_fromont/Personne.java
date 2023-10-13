/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_fromont;

/**
 *
 * @author leafr
 */
public class Personne {
    String nom;
    String prenom; 
    Voiture[] listeVoitures;
    int nbVoitures;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        listeVoitures = new Voiture [3] ;
        nbVoitures = 0;

    }  
        public boolean ajouter_voiture(Voiture voiture_a_ajouter) { 
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;} 
        if (nbVoitures >= 3) {
            return false;} 
        listeVoitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.Proprietaire = this;
        return true;
    }
    public String getnom() {
        return nom;
    }

    public String getprenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +"nom='" + nom + '\'' +", prenom='" + prenom + '}';
    }
    
}
