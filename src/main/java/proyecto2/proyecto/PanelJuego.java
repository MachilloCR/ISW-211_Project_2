/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Random;
import javax.swing.*;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date;  

/**
 *
 * @author Admin
 */
public class PanelJuego extends JPanel implements ActionListener{
    
    static final int anchoPant = 850; //Determines the width of the panel
    static final int altoPant = 850; //Determines the height of the panel
    static final int tamSprite =50; //Determines the size of the game's sprites in multiple instances
    static final int unidadesJuego = (anchoPant * altoPant) / tamSprite; //Helps determine the X and Y position of the panel
    static final int retraso = 150; //Used to determine the speed on which the game runs. The bigger the number, the slower
    
    //Saves the address of the image used for the game's background
    Image fondo = Toolkit.getDefaultToolkit().createImage("src/main/java/imagenydata/pasto.jpg"); 
    
    final int posX[] = new int[unidadesJuego]; //Houses the X coordinates
    final int posY[] = new int[unidadesJuego]; //Houses the Y coordinates
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  //Gives format to the current date and time
    Date fecha  = Calendar.getInstance().getTime();; //Variable used to get the current date and time
     
    int parteCuerpo = 4; //Determine the initial size of the snake  
    int puntajeFruta = 0; //Saves the player's score
    int seg = 0; //Saves the seconds that passed while playing
    int min = 0; //Saves the minutes that passed while playing
    int frutaPosX; //Saves the X coordinate for the fruit
    int frutaPosY; //Saves the Y coordinate for the fruit
    String fechaActual = formato.format(fecha); //Converts the date to a String variable
    char sentido = 'D'; //Determines the initial direction in which the snake moves at the start of the game
    boolean correr = false; //This boolean variable determine if the snakes moves or not
    Timer tmEjecucion; //Variable used to run a background timer to execute the game
    Timer tempo; //Timer used to register the user's play time
    Random nRand; //Creates a random number used for the fruit location in the game
    
    public PanelJuego() { //PanelJuego's builder
        nRand = new Random();
        this.setPreferredSize(new Dimension(anchoPant, altoPant)); //Establisher the size for the panel
        this.setBackground(Color.black);    //Sets the background's color for the panel
        this.setFocusable(true);
        this.addKeyListener(new adaptTecla());
        temporizador();
        tempo.start();
        iniciar();
    }
    
    public void iniciar(){ //Method used to star the game
        dibFruta();
        correr = true;
        tmEjecucion = new Timer(retraso, this); //EstablisheS the clock speed for the game
        tmEjecucion.start();
    }
    
    public void paintComponent(Graphics g){ //Method used to to paint the components on the panel
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, null); //Sets the background's image
        dibujar(g);
    }
    
    public void dibujar(Graphics g){ //Method used to draw specific elements for the game
        if (correr) {
            //for (int i = 0; i < altoPant/tamSprite; i++) { 
            //    g.drawLine((i*tamSprite), 0, (i*tamSprite), altoPant);
            //    g.drawLine(0, (i*tamSprite), anchoPant, (i*tamSprite));
            //}
            //Draws the fruit
            g.setColor(Color.red);
            g.fillRect(frutaPosX, frutaPosY, tamSprite, tamSprite);
            //Draws the snake
            for (int i = 0; i < parteCuerpo; i++) {
                if (i == 0) {//Dibuja la cabeza
                    g.setColor(new Color(0, 0, 255));
                    g.fillOval(posX[i], posY[i], tamSprite, tamSprite);
                }else{//Dibuja el cuerpo
                    g.setColor(new Color(0, 128, 255));
                    g.fillOval(posX[i], posY[i], tamSprite, tamSprite);
                }
            }
            //Shows the score
            g.setColor(Color.WHITE);
            g.setFont( new Font("Comic Sans",Font.BOLD, 40));
            FontMetrics puntos = getFontMetrics(g.getFont());
            g.drawString("Puntaje: "+puntajeFruta, (200 - puntos.stringWidth("Puntaje: "+puntajeFruta))/2, g.getFont().getSize());
            
            //Shows the player's name
            g.setColor(Color.WHITE);
            g.setFont( new Font("Comic Sans",Font.BOLD, 40));
            FontMetrics nombre = getFontMetrics(g.getFont());
            g.drawString("Nombre: "+Inicio.nombre, (900 - nombre.stringWidth(Inicio.nombre))/2, g.getFont().getSize());
            
            //Show the current date and time
            g.setColor(Color.WHITE);
            g.setFont( new Font("Comic Sans",Font.BOLD, 40));
            FontMetrics fecha = getFontMetrics(g.getFont());
            g.drawString("Fecha y Hora: "+fechaActual, (400 - nombre.stringWidth(fechaActual))/2, 840);
            
        }else{ //If the games detects that the snake is not moving, it ends
            terminarJuego(g);
        }    
    }
    
    public void dibFruta(){ //Method used to randomly create a position for the fruit to spawn
        frutaPosX = nRand.nextInt((int)(anchoPant/tamSprite))*tamSprite;
        frutaPosY = nRand.nextInt((int)(altoPant/tamSprite))*tamSprite;
    }
    
    public void moverse(){ //Method used to change the direction the snake takes 
        for (int i = parteCuerpo; i > 0; i--) {
            posX[i] = posX[i-1];
            posY[i] = posY[i-1];
        }
        switch (sentido) {
            case 'A':
                posY[0] = posY[0] - tamSprite;
                break;
            case 'B':
                posY[0] = posY[0] + tamSprite;
                break;
            case 'D':
                posX[0] = posX[0] + tamSprite;
                break;
            case 'I':
                posX[0] = posX[0] - tamSprite;
                break;     
        }
        
    }
    
    public void puntuar(){ //Method used to score the player
        if (posX[0] == frutaPosX && posY[0] == frutaPosY) {
            parteCuerpo++;
            puntajeFruta = puntajeFruta + 5;
            dibFruta();
        }
        
    }
    
    public void colision(){ //Method used to detect the snake's collision
        for (int i = parteCuerpo; i > 0; i--) { //Verifies if the snake hit is own body
            if (posX[0] == posX[i] && posY[0] == posY[i]) { 
                correr = false;
            }
        }
        
        if (posX[0] < 0 || posX[0] > anchoPant-1) { //Checks if the snake crasher with the sides
            correr = false;
        }
        if (posY[0] < 0 || posY[0] > altoPant-1) { //Checks if the snake crashes with the top or bottom
            correr = false;
        }
        if (!correr) {//If the snake doesn't move anymore, stops the internal clock
            tmEjecucion.stop();
        }
        
    }
    
    public void max(){ //Method to determine the maximum size for the snake
        if (parteCuerpo == 60){
            correr = false;
        }
        if (!correr) {//Ends the game when the snake reaches its maximum size
            
            tmEjecucion.stop();
        }
    }
    
    public void terminarJuego(Graphics g){ //Method to end the game and register the player's score
        tempo.stop();
        g.setColor(Color.red);
        g.setFont( new Font("Comic Sans",Font.BOLD, 75));
        FontMetrics metrica = getFontMetrics(g.getFont());
	g.drawString("Juego Finalizado.", (anchoPant - metrica.stringWidth("Juego Finalizado."))/2, altoPant/2);
        if (parteCuerpo == 30) {
            puntajeFruta = puntajeFruta * 2;
            escribirDatos();
            
        }else{
            puntajeFruta = puntajeFruta;
            escribirDatos();
        }
    }
    
    public void escribirDatos(){ //Method to write the players score
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/imagenydata/Marcador.txt", true));
            bw.write(fechaActual+"^"+Inicio.nombre+"^"+puntajeFruta+"^"+min+"^"+seg+"^"+"\n");
            bw.close();
        } catch (Exception e) {
            return;
        }
        
    }
    

    public void temporizador() { //Method in charge of converting the timer used to register the player's time
        tempo = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seg++;
            if (seg == 60) {
                seg = 0;
                min++;
            }
	}
        });
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) { //Method to execute other important methods to run the game and repaint every component of it	
	if(correr) {
            moverse();
            puntuar();
            colision();
            max();
	}
	repaint();
    }
    //This subclass is in charge of detecting the keypresses to move the snake
    public class adaptTecla extends KeyAdapter{  
	@Override
	public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(sentido != 'D') {
                        sentido = 'I';
                    }
                    break;
		case KeyEvent.VK_RIGHT:
                    if(sentido != 'I') {
                        sentido = 'D';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(sentido != 'B') {
                        sentido = 'A';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(sentido != 'A') {
                        sentido = 'B';
                    }
                    break;
            }
        }
    }
}
