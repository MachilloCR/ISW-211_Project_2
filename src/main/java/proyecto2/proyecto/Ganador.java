
package proyecto2.proyecto;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ganador extends javax.swing.JDialog {

    
    public Ganador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarGanador();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        JG.setBackground(new java.awt.Color(255, 255, 0));
        JG.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JG.setForeground(new java.awt.Color(51, 51, 51));
        JG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JG.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JG, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void mostrarGanador(){
        String auxpuntos="";
        String auxganador="";
        String Nombre_J1=Jugadores.Jugador1.getText();// get the name of the 1 player
        String Nombre_J2=Jugadores.Jugador2.getText();// get the name of the 2 player
        String winner=Gato.GanadorRonda.getText();
        String ptsX=Gato.PuntajeX.getText();// get the score of X
        String ptsO=Gato.PuntajeO.getText();// get the score of O
        
        if(winner.equals("1")){
            JG.setText("¡"+Nombre_J1+" a ganado la partida!");// show the winner of the game
            auxpuntos=ptsX;
            auxganador=Nombre_J1;
        }
        if(winner.equals("2")){
            JG.setText("¡"+Nombre_J2+" a ganado la partida!");// show the winner of the game
            auxpuntos=ptsO;
            auxganador=Nombre_J2;
        }
        if(winner.equals("3")){
            JG.setText("¡Empate!");// shows that the game has been drawn
        }
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");// take the current date and time
        //System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        // Record the data of each game in a file
        try(
                BufferedWriter Registro=new BufferedWriter(new FileWriter("C:\\Users\\Machillo\\Desktop\\Ejercicios\\Proyecto\\src\\main\\java\\RegistrosGato\\registro.txt",true));
                BufferedReader Registrobr=new BufferedReader(new FileReader("C:\\Users\\Machillo\\Desktop\\Ejercicios\\Proyecto\\src\\main\\java\\RegistrosGato\\registro.txt"))
            ){
            Registro.write("Fecha:"+dtf.format(LocalDateTime.now())+" Puntos:"+" X:"+ptsX+",O:"+ptsO+"\n");//write in file
            Registro.close();// close file
            }
            catch(IOException e){
                System.out.println("Error E/S:"+e);
            }
        // Record the winner of each game and their score
        try(
                BufferedWriter RegPuntaje=new BufferedWriter(new FileWriter("C:\\Users\\Machillo\\Desktop\\Ejercicios\\Proyecto\\src\\main\\java\\RegistrosGato\\RegPuntaje.txt",true));
                BufferedReader RegPuntajebr=new BufferedReader(new FileReader("C:\\Users\\Machillo\\Desktop\\Ejercicios\\Proyecto\\src\\main\\java\\RegistrosGato\\RegPuntaje.txt"))
            ){
            RegPuntaje.write(auxpuntos+" "+auxganador+"\n");//write in file
            RegPuntaje.close();// close file
            }
            catch(IOException e){
                System.out.println("Error E/S:"+e);
            }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ganador dialog = new Ganador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JG;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
