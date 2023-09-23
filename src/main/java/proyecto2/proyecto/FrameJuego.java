/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class FrameJuego extends JFrame{

    public FrameJuego(){ //Constructor del frame del juego
        this.add(new PanelJuego());
        this.setTitle("Juego de Snake"); //
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        if (this.isShowing() == false) {
            System.out.println("sas");
            //Puntaje v2 = new Registro(this, true);
            //v2.pack();
            //v2.setVisible(true);
        }
    }
    
//    public  void abrirPuntaje(){
//        Registro v2 = new Registro(this, true);
//        v2.pack();
//        v2.setVisible(true);
//    }
    
    
}
