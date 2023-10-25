/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_fromont_version_console;

/**
 *
 * @author leafr
 */
public class CelluleLumineuse {
    private boolean etat;
    
    public CelluleLumineuse() {
        this.etat = false;
    }

    public boolean getetat(boolean etat) {
        return etat;
    }
    public void activerCellule() {
        this.etat = !this.etat;
    }
    public void eteindreCellule() {
       this.etat= false;
    }

    /**
     *
     * @return
     */
    public boolean estEteint() {
        return !this.etat;   
    }
}
