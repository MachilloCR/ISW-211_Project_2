
package proyecto2.proyecto;
import java.awt.*;
import javax.swing.*;



public class Gato extends javax.swing.JFrame {
    
    int TerminarJuego =0;
    int PuntosX=0;
    int PuntosO=0;
    boolean FinRonda=true;//variable that prevents further checking boxes 
    String Siguientejuego="O";
    String Turno="X";// Indicates the turn 
    JLabel lbs[]=new JLabel[9];//List for easier and faster access to the jlabels
    int Casos_Victoria[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}};// All possible cases of victory
    public Gato() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        lbs[0]=jLabel1;
        lbs[1]=jLabel2;
        lbs[2]=jLabel3;
        lbs[3]=jLabel4;
        lbs[4]=jLabel5;
        lbs[5]=jLabel6;
        lbs[6]=jLabel7;
        lbs[7]=jLabel8;
        lbs[8]=jLabel9;
        Jugadores VentanaJ= new Jugadores(this,true);
        VentanaJ.pack();
        VentanaJ.setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo_Lineas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonReiniciar = new javax.swing.JButton();
        BotonTurno = new javax.swing.JLabel();
        IconoX = new javax.swing.JLabel();
        IconoO = new javax.swing.JLabel();
        PuntajeX = new javax.swing.JLabel();
        PuntajeO = new javax.swing.JLabel();
        GanadorRonda = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MostrarRonda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Fondo_Lineas.setBackground(new java.awt.Color(51, 153, 255));
        Fondo_Lineas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Fondo_LineasLayout = new javax.swing.GroupLayout(Fondo_Lineas);
        Fondo_Lineas.setLayout(Fondo_LineasLayout);
        Fondo_LineasLayout.setHorizontalGroup(
            Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Fondo_LineasLayout.createSequentialGroup()
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Fondo_LineasLayout.setVerticalGroup(
            Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo_LineasLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo_LineasLayout.createSequentialGroup()
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fondo_LineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonReiniciar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonReiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.setBorder(null);
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        BotonTurno.setBackground(new java.awt.Color(51, 153, 255));
        BotonTurno.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BotonTurno.setForeground(new java.awt.Color(51, 51, 51));
        BotonTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonTurno.setText("Turno de X");
        BotonTurno.setOpaque(true);

        IconoX.setBackground(new java.awt.Color(255, 255, 255));
        IconoX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IconoX.setForeground(new java.awt.Color(255, 0, 0));
        IconoX.setText("X");

        IconoO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IconoO.setForeground(new java.awt.Color(0, 0, 255));
        IconoO.setText("O");

        PuntajeX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PuntajeX.setText("0");
        PuntajeX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PuntajeO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PuntajeO.setText("0");
        PuntajeO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GanadorRonda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GanadorRonda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Ronda:");

        MostrarRonda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MostrarRonda.setForeground(new java.awt.Color(51, 51, 51));
        MostrarRonda.setText("0/5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GanadorRonda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(BotonTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(IconoX)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PuntajeX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(IconoO)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(MostrarRonda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fondo_Lineas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarRonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IconoX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PuntajeX, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IconoO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(Fondo_Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(GanadorRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        Presionar(3);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        Presionar(9);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        Presionar(8);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        Presionar(7);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Presionar(6);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        Presionar(5);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        Presionar(4);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Presionar(2);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Presionar(1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        TerminarJuego=TerminarJuego+1;// Counter to control the end of the game
        
        if(TerminarJuego>=0&&TerminarJuego<=5){// If the variable is between 0 and 5, go to the next round
            MostrarRonda.setText(Integer.toString(TerminarJuego)+"/5");// show in the window which round they are in
            for(int i=0;i<lbs.length;i++){// go through all the spaces and clean them
                lbs[i].setText("");
                lbs[i].setBackground(Color.white);
            }
            Turno=Siguientejuego;//turns the variable Turno between each game
            if(Siguientejuego.equals("O")){
                Siguientejuego="X";
            }else {
                Siguientejuego="O";
            }
            BotonTurno.setText("Turno de:"+Turno);
            GanadorRonda.setText("");//clean winner text
            FinRonda=true;// indicates that a new game can start
            PuntosX=0;// reset X points
            PuntosO=0;// reset O points
        }else{// open the window where the winner is indicated
            ganador();
            Ganador VentanaGanador= new Ganador(this,true);
            VentanaGanador.pack();
            VentanaGanador.setVisible(true);
        }
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    public void Presionar(int espacio){//the buttons send a number that indicates the label where you should mark X or O
        if(lbs[espacio-1].getText().equals("")&&FinRonda==true){//check if the space is empty
            
            if(Turno.equals("X")){// Change the color of the letter and fill the space with an X
                lbs[espacio-1].setForeground(Color.red);
                lbs[espacio-1].setText(Turno);
                PuntosX=PuntosX+1;
                
            }else{// Change the color of the letter and fill the space with an O
                lbs[espacio-1].setForeground(Color.blue);
                lbs[espacio-1].setText(Turno);
                PuntosO=PuntosO+1;
                
            }
            CambioTurno();
            Verif_Ganador();
        }
    }
    public void CambioTurno(){
        // check that X and O are Turning
        if(Turno.equals("X")){
            Turno="O";
        }else{
            Turno="X";
        }
        BotonTurno.setText("Turno de:"+Turno);//indica el turno
    }
    public void Verif_Ganador(){
        
        for(int i=0; i<Casos_Victoria.length;i++){// scroll through the list of victory cases
            if(lbs[Casos_Victoria[i][0]-1].getText().equals("X")&&
                    lbs[Casos_Victoria[i][1]-1].getText().equals("X")&&
                    lbs[Casos_Victoria[i][2]-1].getText().equals("X")){
                // paint the boxes of the winning combination
                lbs[Casos_Victoria[i][0]-1].setBackground(Color.green);
                lbs[Casos_Victoria[i][1]-1].setBackground(Color.green);
                lbs[Casos_Victoria[i][2]-1].setBackground(Color.green);
                PuntosX=PuntosX*2;// double the winner's points
                PuntajeX.setText(Integer.toString(Integer.parseInt(PuntajeX.getText())+PuntosX));
                PuntajeO.setText(Integer.toString(Integer.parseInt(PuntajeO.getText())+PuntosO));
                GanadorRonda.setForeground(Color.red);// change the letter to red
                String Nombre_J1=Jugadores.Jugador1.getText();// save the name of the winning player
                GanadorRonda.setText("¡"+Nombre_J1+" es el ganador!");// Indicates the winner of the game
                FinRonda=false;// Change to false to end the game
                PuntosX=0;
                PuntosO=0;
                
            }
            if(lbs[Casos_Victoria[i][0]-1].getText().equals("O")&&
                    lbs[Casos_Victoria[i][1]-1].getText().equals("O")&&
                    lbs[Casos_Victoria[i][2]-1].getText().equals("O")){
                // paint the boxes of the winning combination
                lbs[Casos_Victoria[i][0]-1].setBackground(Color.green);
                lbs[Casos_Victoria[i][1]-1].setBackground(Color.green);
                lbs[Casos_Victoria[i][2]-1].setBackground(Color.green);
                PuntosO=PuntosO*2;// double the winner's points
                PuntajeO.setText(Integer.toString(Integer.parseInt(PuntajeO.getText())+PuntosO));
                PuntajeX.setText(Integer.toString(Integer.parseInt(PuntajeX.getText())+PuntosX));
                GanadorRonda.setForeground(Color.blue);// change the letter to blue
                String Nombre_J2=Jugadores.Jugador2.getText();//guarda el nombre del jugador ganador
                GanadorRonda.setText("¡"+Nombre_J2+" es el ganador!");// Indicates the winner of the game
                FinRonda=false;// Change to false to end the game
                PuntosX=0;
                PuntosO=0;    
            }
        }//fin for
    
    }
    public void ganador(){
        int ptsx=Integer.parseInt(PuntajeX.getText());// Convert the points from String to Int
        int ptso=Integer.parseInt(PuntajeO.getText());// Convert the points from String to Int
        if(ptsx>ptso){
            GanadorRonda.setText("1");// player1 wins
        }
        if(ptsx<ptso){
            GanadorRonda.setText("2");// player1 wins
        }
        if(ptsx==ptso){
            GanadorRonda.setText("3");//tie
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
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonTurno;
    private javax.swing.JPanel Fondo_Lineas;
    public static javax.swing.JLabel GanadorRonda;
    private javax.swing.JLabel IconoO;
    private javax.swing.JLabel IconoX;
    private javax.swing.JLabel MostrarRonda;
    public static javax.swing.JLabel PuntajeO;
    public static javax.swing.JLabel PuntajeX;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
