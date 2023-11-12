/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;

/**
 *cellule lumineuse qui peut être "allumée" ou "éteinte". 
 * @author leafr
 */
public class CelluleLumineuse {
    private boolean etat;
    private CelluleLumineuse[][] matriceCellules;
    
    /**
     *cellule lumineuse initialement éteinte
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * renvoie etat de la cellule true=allumée false=éteinte
     * @return
     */
    public boolean getetat() {
        return etat;
    }

    /**
     * inverse etat actuelle cellule
     */
    public void activerCellule() {
        this.etat = !this.etat;
    }

    /**
     * eteint Cellule (false)
     */
    public void eteindreCellule() {
       this.etat= false;
    }

    /**
     * verifie si cellule eteinte, renvoie true=eteinte ou false=allumée
     * @return
     */
    public boolean estEteint() {
        return !this.etat;   
    }
    

   

    /**
     * afficher etat cellule, allumée=X éteinte=O
     * @return
     */
    @Override
    public String toString() {
        if (this.etat==true) {
            return "X";            
        } else if (this.etat==false) {
            return "O";   
        }
        return null;
    }       
}

