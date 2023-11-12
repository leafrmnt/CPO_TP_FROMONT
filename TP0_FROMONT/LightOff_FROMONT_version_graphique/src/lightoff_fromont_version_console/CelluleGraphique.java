package lightoff_fromont_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import lightoff_fromont_version_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leafr
 */
public class CelluleGraphique extends JButton {

    int largeur; 
    int hauteur; 
    CelluleLumineuse celluleLumineuseAssociee;

    
        public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
            this.largeur = l;
            this.hauteur = h;
            this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        }

    /**
     * Mise en page: rouge= cellule eteinte, jaune=allumée
     * @param g
     */
    @Override
        protected void paintComponent(Graphics g) {
            int w = this.getWidth();
            int h = this.getHeight();
            if (celluleLumineuseAssociee.estEteint() == true) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.yellow);
            }
            g.fillOval(2, 2, w - 4, h - 4);

        }
    }

