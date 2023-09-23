/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.proyecto;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author Andre Rodríguez C
 */
public class Proyecto extends javax.swing.JFrame {
     public ImageIcon imgs[];
     public ImageIcon pista[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public String res[];
    public Image img;
    public int puntos;
    public String nom1;
    public int var[];
    public int conta;
    public int variante[];
    public int puntoP;
    
    /**
     * Creates new form Proyecto
     */
    public Proyecto(String n1, int varrp[],int ranrp,int cont, int punt,int variant[]) {
        initComponents();
        var=varrp;
        ran=ranrp;
        nom1=n1;
        conta=cont;
        puntos=punt;
        jLabel4.setText(String.valueOf(punt));
        imgs = new ImageIcon[5];// list of images in case the letter is not in the word
        pista = new ImageIcon[6];// list of track images
        btns = new JButton[28];// the number of buttons for the keyboard
        msgs = new String[6];// a list for the words to guess
        variante=variant;
        btns[1]=jButton1;
        btns[2]=jButton2;
        btns[3]=jButton3;
        btns[4]=jButton10;
        btns[5]=jButton4;
        btns[6]=jButton6;
        btns[7]=jButton7;
        btns[8]=jButton8;
        btns[9]=jButton9;
        btns[10]=jButton11;
        btns[11]=jButton12;
        btns[12]=jButton13;
        btns[13]=jButton14;
        btns[14]=jButton15;
        btns[15]=jButton16;
        btns[16]=jButton17;
        btns[17]=jButton18;
        btns[18]=jButton19;
        btns[19]=jButton20;
        btns[20]=jButton21;
        btns[21]=jButton22;
        btns[22]=jButton23;
        btns[23]=jButton24;
        btns[24]=jButton25;
        btns[25]=jButton26;
        btns[26]=jButton27;
        btns[27]=jButton28;
        imgs[0] = new ImageIcon("src/main/java/imagenydata/Imagen1.PNG");// assign the path to each image
        imgs[1] = new ImageIcon("src/main/java/imagenydata/Imagen2.PNG");
        imgs[2] = new ImageIcon("src/main/java/imagenydata/Imagen3.PNG");
        imgs[3] = new ImageIcon("src/main/java/imagenydata/Imagen4.PNG");
        imgs[4] = new ImageIcon("src/main/java/imagenydata/Imagen5.PNG");
        pista[0] = new ImageIcon("src/main/java/imagenydata/pista1.PNG");
        pista[1] = new ImageIcon("src/main/java/imagenydata/pista2.PNG");
        pista[2] = new ImageIcon("src/main/java/imagenydata/pista3.PNG");
        pista[3] = new ImageIcon("src/main/java/imagenydata/pista4.PNG");
        pista[4] = new ImageIcon("src/main/java/imagenydata/pista5.PNG");
        pista[5] = new ImageIcon("src/main/java/imagenydata/pista6.PNG");
        msgs[0] = "Gato".toUpperCase();// uppercase letters
        msgs[1] = "Perro".toUpperCase();
        msgs[2] = "Tortuga".toUpperCase();
        msgs[3] = "Gallina".toUpperCase();
        msgs[4] = "Conejo".toUpperCase();
        msgs[5] = "Pajaro".toUpperCase();
        // when pressing a letter it calls to check letter with the letter that corresponds to it
        for (int i = 1; i < 28; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        
        
        iniciar(nom1);
    }
    public void iniciar(String n1) {
        
        if(conta==6){// If I have already passed level 5, the game is restarted
            conta=1;
            puntos=0;
            variante[0]=0;variante[1]=0;variante[2]=0;variante[3]=0;variante[4]=0;variante[5]=0;
        }
        int puntoP=0;
        String jugador;
        //player name
        jLabel3.setText(n1);
        //ERRORS in 0
        err = 0;
        //punts
        jLabel4.setText(String.valueOf(puntoP));
        //Dibujo.setIcon(imgs[0]);
        jTextField1.setText("");
        //adjust the image to the size of the jlabel
       ImageIcon img = new ImageIcon(imgs[0].getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(),Image.SCALE_DEFAULT));
       //add image to jlabel
        jLabel7.setIcon(img);
        
        // to activate the board letters
        for (int i = 1; i < 28; i++) {
            btns[i].setEnabled(true);
        }
       
        // to randomly generate a word without repeating by level
        if (ran==-1){
            while (true){
                ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
                    if (var[ran]==0){
                        var[ran]=1;
                        break;}
            }}
        
        
        //adjust the pist image to the size of the jlabel
        ImageIcon pist = new ImageIcon(pista[ran].getImage().getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_DEFAULT));
        jLabel5.setIcon(pist);
        // SEPARATE THE MESSAGE BY WORDS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // will be the hyphens that go under the letters as a separation _
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextField1.setText(jTextField1.getText() + "_ ");
                res[j++] = "_";
            }
            jTextField1.setText(jTextField1.getText() + "\n");
            res[j++] = " ";
        }
    }
    
    // when pressing a letter, it will be searched if it belongs to the word, otherwise it will mark it as an error
    public void checarLetra(ActionEvent e) {
        
        
        JButton bt = (JButton) e.getSource();
        String gp="";
        boolean gano = false;//to know if the player win
        char c[];
        c = new char[27];
        //letter list
        c[0]='A';c[1]='B';c[2]='C';c[3]='D';c[4]='E';c[5]='F';c[6]='G';c[7]='H';c[8]='I';c[9]='J';c[10]='K';c[11]='L';c[12]='M';c[13]='N';
        c[14]='Ñ';c[15]='O';c[16]='P';c[17]='Q';c[18]='R';c[19]='S';c[20]='T';c[21]='U';c[22]='V';c[23]='W';c[24]='X';c[25]='Y';c[26]='Z';
        // find the letter in the word after it has been pressed
        for (int i = 1; i < 28; i++) {
            if (bt == btns[i]) {
                // the key is initialized
                // find if the letter is in the phrase
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[i-1] == msgs[ran].charAt(j)) {
                        res[j] = c[i-1] + "";
                        puntoP=puntoP+1;//if the letters is in the phrase, +1 point to eich letter
                        esta = true;
                    }
                }
                // IF THE LETTER IS IN THE MESSAGE IT IS SHOWN ON THE TEXTPANEL
                if (esta) {
                    jTextField1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            jTextField1.setText(jTextField1.getText() + "\n");
                            
                        } else {
                            jTextField1.setText(jTextField1.getText() + re + " ");
                            
                        }
                    }
                   // makes a check of the remaining and missing letters, in case there are no letters, it will be the winner
                    gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    // when winning goes to the results screens
                    
                    if (gano) { 
                        if (err==0)
                            puntoP=puntoP*2;// if I don't fail, points * 2
                            jLabel4.setText(String.valueOf(puntoP));
                            variante[conta]=puntoP;// in the list of levels we assign the score obtained by level
                            puntos=puntos+puntoP;// we add the points of the level to the total of points
                        gp="HAS GANADO";
                        txt();// The player who passed all 5 levels will be added to the playlist
                        
                        resultados resul = new resultados(gp,puntos,nom1,var,ran,conta,msgs,puntoP,variante);// invoke the results screen
                        resul.setVisible(true);
                        this.setVisible(false);
                        
                        iniciar(nom1);
                        return;
                    }
                    // IF THE LETTER IS NOT IN THE MESSAGE, THE ERROR WILL INCREASE AND THE IMAGE IS CHANGED
                } else {
                    //change the image of the hanged man
                    ImageIcon img = new ImageIcon(imgs[++err].getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(),Image.SCALE_DEFAULT));
                    jLabel7.setIcon(img);
                    // IF THE 5 ERRORS ARE REACHED THEN THE GAME IS LOST AND THE MESSAGE OF:
                    if (err == 4) {
                        gp="HAS PERDIDO";
                        variante[conta]=puntoP;
                        resultados resul = new resultados(gp,puntos,nom1,var,ran,conta,msgs,puntoP,variante);// invoke the results screen
                        resul.setVisible(true);
                        this.setVisible(false);
                        return;
                    }
                }
                
                jLabel4.setText(String.valueOf(puntoP));
                // this is the line that deactivates the letters after being used
                bt.setEnabled(false);
                break;
            }
        }

    }      
    public void txt (){
        try
        {// create a file and edit
            FileWriter fichero = new FileWriter("src/main/java/imagenydata/ahorcadoUj.txt",true);
            //If you still do not finish the 5 levels, then do not add it to the file
            if(conta==5)
            fichero.write("\r\n"+nom1+" "+puntos);
            fichero.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Font font = new Font("Goudy Old Style", Font.BOLD, 14);
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        jButton2 = new javax.swing.JButton();
        this.getContentPane().setBackground(Color.BLACK);
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jButton5.setText("E");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(jTextPane2);

        jLabel6.setText("jLabel6");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ahorcado");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(475, 300));
        setResizable(false);

        jButton2.setText("B");
        jButton2.setFont(font);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(new Color(255,255,255));
        jButton2.setBorder(border);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton1.setText("A");
        jButton1.setFont(font);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(new Color(132,192,199));

        jButton1.setBorder(border);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("C");
        jButton3.setFont(font);
        jButton3.setBackground(Color.BLACK);
        jButton3.setForeground(new Color(132,192,199));
        jButton3.setBorder(border);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("E");
        jButton4.setFont(font);
        jButton4.setBackground(Color.BLACK);
        jButton4.setForeground(new Color(132,192,199));
        jButton4.setBorder(border);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("F");
        jButton6.setFont(font);
        jButton6.setBackground(Color.BLACK);
        jButton6.setForeground(new Color(132,192,199));
        jButton6.setBorder(border);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("G");
        jButton7.setFont(font);
        jButton7.setBackground(Color.BLACK);
        jButton7.setForeground(new Color(132,192,199));
        jButton7.setBorder(border);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("H");
        jButton8.setFont(font);
        jButton8.setBackground(Color.BLACK);
        jButton8.setForeground(new Color(132,192,199));
        jButton8.setBorder(border);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("I");
        jButton9.setFont(font);
        jButton9.setBackground(Color.BLACK);
        jButton9.setForeground(new Color(132,192,199));
        jButton9.setBorder(border);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("D");
        jButton10.setFont(font);
        jButton10.setBackground(Color.BLACK);
        jButton10.setForeground(new Color(132,192,199));
        jButton10.setBorder(border);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("J");
        jButton11.setFont(font);
        jButton11.setBackground(Color.BLACK);
        jButton11.setForeground(new Color(132,192,199));
        jButton11.setBorder(border);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("K");
        jButton12.setFont(font);
        jButton12.setBackground(Color.BLACK);
        jButton12.setForeground(new Color(132,192,199));
        jButton12.setBorder(border);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("L");
        jButton13.setFont(font);
        jButton13.setBackground(Color.BLACK);
        jButton13.setForeground(new Color(132,192,199));
        jButton13.setBorder(border);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("M");
        jButton14.setFont(font);
        jButton14.setBackground(Color.BLACK);
        jButton14.setForeground(new Color(132,192,199));
        jButton14.setBorder(border);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("N");
        jButton15.setFont(font);
        jButton15.setBackground(Color.BLACK);
        jButton15.setForeground(new Color(132,192,199));
        jButton15.setBorder(border);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Ñ");
        jButton16.setFont(font);
        jButton16.setBackground(Color.BLACK);
        jButton16.setForeground(new Color(132,192,199));
        jButton16.setBorder(border);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("O");
        jButton17.setFont(font);
        jButton17.setBackground(Color.BLACK);
        jButton17.setForeground(new Color(132,192,199));
        jButton17.setBorder(border);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("P");
        jButton18.setFont(font);
        jButton18.setBackground(Color.BLACK);
        jButton18.setForeground(new Color(132,192,199));
        jButton18.setBorder(border);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Q");
        jButton19.setFont(font);
        jButton19.setBackground(Color.BLACK);
        jButton19.setForeground(new Color(132,192,199));
        jButton19.setBorder(border);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("R");
        jButton20.setFont(font);
        jButton20.setBackground(Color.BLACK);
        jButton20.setForeground(new Color(132,192,199));
        jButton20.setBorder(border);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("S");
        jButton21.setFont(font);
        jButton21.setBackground(Color.BLACK);
        jButton21.setForeground(new Color(132,192,199));
        jButton21.setBorder(border);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("T");
        jButton22.setFont(font);
        jButton22.setBackground(Color.BLACK);
        jButton22.setForeground(new Color(132,192,199));
        jButton22.setBorder(border);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("U");
        jButton23.setFont(font);
        jButton23.setBackground(Color.BLACK);
        jButton23.setForeground(new Color(132,192,199));
        jButton23.setBorder(border);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("V");
        jButton24.setFont(font);
        jButton24.setBackground(Color.BLACK);
        jButton24.setForeground(new Color(132,192,199));
        jButton24.setBorder(border);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("W");
        jButton25.setFont(font);
        jButton25.setBackground(Color.BLACK);
        jButton25.setForeground(new Color(132,192,199));
        jButton25.setBorder(border);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("X");
        jButton26.setFont(font);
        jButton26.setBackground(Color.BLACK);
        jButton26.setForeground(new Color(132,192,199));
        jButton26.setBorder(border);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Y");
        jButton27.setFont(font);
        jButton27.setBackground(Color.BLACK);
        jButton27.setForeground(new Color(132,192,199));
        jButton27.setBorder(border);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("Z");
        jButton28.setFont(font);
        jButton28.setBackground(Color.BLACK);
        jButton28.setForeground(new Color(132,192,199));
        jButton28.setBorder(border);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntos:");
        jLabel1.setFont(font);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setForeground(new Color(132,192,199));

        jLabel2.setText("Jugador:");
        jLabel2.setFont(font);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setForeground(new Color(132,192,199));

        jLabel3.setText("0");
        jLabel3.setFont(font);
        jLabel3.setBackground(Color.WHITE);
        jLabel3.setForeground(new Color(132,192,199));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");

        jLabel4.setText("0");
        jLabel4.setFont(font);
        jLabel4.setBackground(Color.WHITE);
        jLabel4.setForeground(new Color(132,192,199));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("");
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setFont(font);
        jTextField1.setForeground(new Color(132,192,199));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8)
                                .addComponent(jButton4)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton12)
                                .addComponent(jButton13)
                                .addComponent(jButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17)
                            .addComponent(jButton16)
                            .addComponent(jButton15)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton21)
                            .addComponent(jButton20)
                            .addComponent(jButton19)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton25)
                            .addComponent(jButton24)
                            .addComponent(jButton23)
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton28)
                            .addComponent(jButton27)
                            .addComponent(jButton26))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //w Proyecto().setVisible(true);
                
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private transient javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
