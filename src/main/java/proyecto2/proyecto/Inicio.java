/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.proyecto;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Inicio extends javax.swing.JFrame {

    static protected String nombre = ""; //This Variable stores the name of the player
    static String[] puntos = new String[0]; //This array will save the current best time
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); //Blocks the ability to resize the jframe
        calcularMejor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnRP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMT = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opIns1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        opIns2 = new javax.swing.JMenuItem();
        opIns3 = new javax.swing.JMenuItem();
        opIns4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego de Snake");
        setBackground(new java.awt.Color(153, 189, 119));
        setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("src/main/java/imagenydata/culebra.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnIniciar.setBackground(new java.awt.Color(0, 153, 51));
        btnIniciar.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRP.setBackground(new java.awt.Color(204, 204, 204));
        btnRP.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnRP.setText("Registros Pasados");
        btnRP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRP.setPreferredSize(new java.awt.Dimension(128, 24));
        btnRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Snake");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMT.setBackground(new java.awt.Color(204, 204, 204));
        btnMT.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnMT.setText("Mejor Tiempo");
        btnMT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTActionPerformed(evt);
            }
        });

        opIns1.setText("Instrucciones");

        jMenuItem1.setText("Iniciar el Juego");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opIns1.add(jMenuItem1);

        opIns2.setText("Controles");
        opIns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opIns2ActionPerformed(evt);
            }
        });
        opIns1.add(opIns2);

        opIns3.setText("Reglas del Juego");
        opIns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opIns3ActionPerformed(evt);
            }
        });
        opIns1.add(opIns3);

        opIns4.setText("Botones Secundarios");
        opIns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opIns4ActionPerformed(evt);
            }
        });
        opIns1.add(opIns4);

        jMenuBar1.add(opIns1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRP, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(btnMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Opens the window to register the player's name
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Registro nv = new Registro(this, true);
        nv.pack();
        nv.setVisible(true);
        
    }//GEN-LAST:event_btnIniciarActionPerformed
    //Shows a new window with the high scores
    private void btnRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPActionPerformed
        PuntajesCompletos nVentana = new PuntajesCompletos(this, true);
        nVentana.pack();
        nVentana.setVisible(true);
    }//GEN-LAST:event_btnRPActionPerformed
    //This method and the others bellow open new windows with the instructions for the game
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "Debe dar click en el botón de 'Iniciar' para comenzar.\n Se abrirá una nueva ventana para ingresar el nombre del jugador.\n Una vez hecho eso, debe de dar click al botón 'Jugar' y empezará el juego. \nCuando el juego finalice, debe de cerrar la ventana si desea jugar de nuevo.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opIns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opIns2ActionPerformed
        JOptionPane.showMessageDialog(this, "Para mover a la serpiente debe de utilizar las flechas del teclado.");
    }//GEN-LAST:event_opIns2ActionPerformed

    private void opIns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opIns3ActionPerformed
        JOptionPane.showMessageDialog(this, "El objetivo del juego es el de comer los frutos rojos con la serpiente. Por cada fruto comido, la serpiente crece más.\n "
                + "Para ganar el juego debe de alcanzar un puntaje de 300 puntos. De ser así, su puntaje se multiplicará a la hora de finalizar la partida.\n "
                + "La partida puede terminar si la serpiente colisiona contra una de las paredes o contra si misma, en este caso el puntaje no se duplicará");
    }//GEN-LAST:event_opIns3ActionPerformed

    private void opIns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opIns4ActionPerformed
        JOptionPane.showMessageDialog(this, "En la ventana principal aparecen dos botones.\n Estos muestran el registro completo de las partidas y los puntajes con los mejores tiempos.");
    }//GEN-LAST:event_opIns4ActionPerformed

    private void btnMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTActionPerformed
        calcularMejor();
        if (puntos.length == 0) {
            JOptionPane.showMessageDialog(this, "No hay registros existentes.");
        }else{
            JOptionPane.showMessageDialog(this, "Nombre: "+puntos[1]+"\n Puntos: "+puntos[2]+"\n Tiempo: "+puntos[3]+"."+puntos[4]);
        }
    }//GEN-LAST:event_btnMTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public Inicio(JButton btnIniciar, JButton btnMT, JButton btnRP, JLabel jLabel1, JLabel jLabel2, JMenuBar jMenuBar1, JMenuItem jMenuItem1, JPanel jPanel1, JMenu opIns1, JMenuItem opIns2, JMenuItem opIns3, JMenuItem opIns4) throws HeadlessException {
        this.btnIniciar = btnIniciar;
        this.btnMT = btnMT;
        this.btnRP = btnRP;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jMenuBar1 = jMenuBar1;
        this.jMenuItem1 = jMenuItem1;
        this.jPanel1 = jPanel1;
        this.opIns1 = opIns1;
        this.opIns2 = opIns2;
        this.opIns3 = opIns3;
        this.opIns4 = opIns4;
    }
    //Calculates which score has the highest amount of point with the fastest time
    public static void calcularMejor(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/imagenydata/Marcador.txt"));
            String s;
            int x = 0;
            while ((s = br.readLine()) != null) {
                String[] lineas = s.split(Pattern.quote("^"));
                if (puntos.length == 0) {
                    puntos = lineas;
                }else{
                    if (Integer.parseInt(puntos[2]) < Integer.parseInt(lineas[2])) {
                        puntos = lineas;
                    }else if (Integer.parseInt(puntos[2]) == Integer.parseInt(lineas[2])) {
                        if (Integer.parseInt(puntos[3]) > Integer.parseInt(lineas[3])) {
                            puntos = lineas;
                        }else if (Integer.parseInt(puntos[3]) == Integer.parseInt(lineas[3])) {
                            if (Integer.parseInt(puntos[4]) > Integer.parseInt(lineas[4])) {
                                puntos = lineas;
                            }
                        }    
                    }else{
                        puntos = puntos;
                    }
//                    if (Integer.parseInt(puntos[2]) == Integer.parseInt(lineas[2])) {
//                        if (Integer.parseInt(puntos[3]) > Integer.parseInt(lineas[3])) {
//                            puntos = lineas;
//                        }
//                        if (Integer.parseInt(puntos[3]) == Integer.parseInt(lineas[3])) {
//                            if (Integer.parseInt(puntos[4]) > Integer.parseInt(lineas[4])) {
//                                puntos = lineas;
//                            }
//                            else{
//                                puntos = puntos;
//                            }
//                        }else{
//                            puntos = puntos;
//                        }
//                    }else{
//                        puntos = puntos;
//                    }
                }
            }
        } catch (Exception e) {
            return;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMT;
    private javax.swing.JButton btnRP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu opIns1;
    private javax.swing.JMenuItem opIns2;
    private javax.swing.JMenuItem opIns3;
    private javax.swing.JMenuItem opIns4;
    // End of variables declaration//GEN-END:variables
}
