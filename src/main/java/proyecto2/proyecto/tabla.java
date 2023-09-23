/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.proyecto;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Andre Rodríguez C
 */
public class tabla extends javax.swing.JFrame {
    public String sCadena;
    public LinkedList<String> list = new LinkedList<String>();// this is the list of people who have played
    public int[] puntos;
    public int n1;
        public int n2;
        public int n3;
        public int[] var = new int[5];
        
    /**
     * Creates new form tabla
     */
    public tabla(int punto,int nivel,int variante[]) throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        jPanel1.setBackground(Color.BLACK);
        leer();
// Here it only verifies that the .txt is greater than 5 people, if it is less, it only shows the people who are added to show them in last games
        if(list.size()==1){
            String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if(newStr.length>1){
                jLabel23.setText(newStr[0]);
                jLabel28.setText(newStr[1]);}}
          if(list.size()==2){
            String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel23.setText(newStr[0]);
            jLabel28.setText(newStr[1]);}
            texto=list.get(1);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel24.setText(newStr[0]);
            jLabel29.setText(newStr[1]);}}
      if(list.size()==3){
            String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel23.setText(newStr[0]);
            jLabel28.setText(newStr[1]);}
            texto=list.get(1);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel24.setText(newStr[0]);
            jLabel29.setText(newStr[1]);}
            texto=list.get(2);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel25.setText(newStr[0]);
            jLabel30.setText(newStr[1]);}}
      if(list.size()==4){
          String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel23.setText(newStr[0]);
            jLabel28.setText(newStr[1]);}
            texto=list.get(1);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel24.setText(newStr[0]);
            jLabel29.setText(newStr[1]);}
            texto=list.get(2);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel25.setText(newStr[0]);
            jLabel30.setText(newStr[1]);}
            texto=list.get(3);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel26.setText(newStr[0]);
            jLabel31.setText(newStr[1]);}}
      if(list.size()>=5){
          String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel23.setText(newStr[0]);
            jLabel28.setText(newStr[1]);}
            texto=list.get(1);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel24.setText(newStr[0]);
            jLabel29.setText(newStr[1]);}
            texto=list.get(2);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel25.setText(newStr[0]);
            jLabel30.setText(newStr[1]);}
            texto=list.get(3);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel26.setText(newStr[0]);
            jLabel31.setText(newStr[1]);}
            texto=list.get(4);
            texto = texto.trim();
            newStr = texto.split("\\s+");
             if(newStr.length>1){
            jLabel27.setText(newStr[0]);
            jLabel32.setText(newStr[1]);}}
      
      variante[0]=0;//poits in 0
    for (int k=0;k<variante.length;k++){
        variante[0]=variante[0]+variante[k];// here just add the points of the level list to show them
    }
        jLabel9.setText(String.valueOf(variante[0]));
    
    if(nivel>=1){
        jLabel10.setText(String.valueOf(variante[1]));
        jLabel11.setText("Bloqueado");
        jLabel12.setText("Bloqueado");
        jLabel13.setText("Bloqueado");
        jLabel14.setText("Bloqueado");
        
        if(nivel>=2){// here it asks what level it is, and thus show the points per level
            
            jLabel11.setText(String.valueOf(variante[2]));
            
            if(nivel>=3){
                
                jLabel12.setText(String.valueOf(variante[3]));
                if(nivel>=4){
                    
                    jLabel13.setText(String.valueOf(variante[4]));
                    if(nivel>=5){
                        
                        jLabel14.setText(String.valueOf(variante[5]));
                    }
                }
            }
        }
        
    }
   
    // Here it is very repetitive, choose the two best players
        puntos=new int[list.size()];
        
        if (puntos.length>1){
        for (int i=0;i<list.size();i++){
            n1=puntos[0];
            n2=puntos[1];
            String texto=list.get(i);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if(newStr.length>1)
            puntos[i]=Integer.parseInt(newStr[1]);
        }}else if(list.size()>0){
            n1=puntos[0];
            String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if(newStr.length>1)
            puntos[0]=Integer.parseInt(newStr[1]);
        }
        if(list.size()>0){
        String texto=list.get(0);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if(newStr.length>1){
            jLabel19.setText(newStr[1]);
            jLabel16.setText(newStr[0]);}
            }
        for(int l=0;l<puntos.length;l++){
            String texto = list.get(l);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if (puntos[l] > n1) {
		n1 = puntos[l];
                if(newStr.length>1){
                jLabel19.setText(newStr[1]);
                jLabel16.setText(newStr[0]);}}
            
        }
        for(int j=0;j<puntos.length;j++){
      
            String texto = list.get(j);
            texto = texto.trim();
            String[] newStr = texto.split("\\s+");
            if(jLabel16.getText().equals(newStr[0])){
            }else if (n1>=n2 && n2<puntos[j]) {
                n2=puntos[j];
                if(newStr.length>1){
                 jLabel17.setText(newStr[0]);
                 jLabel20.setText(newStr[1]);  }
            }
        }
            
        
        
           
    }
    public void leer() throws IOException{
        try {
			
            
            //LinkedList<String> list = new LinkedList<String>();
            // List to store what was read
            //read the .txt
            FileReader fr = new FileReader("src/main/java/imagenydata/ahorcadoUj.txt");
            BufferedReader bf = new BufferedReader(fr);
            // add the players from the .txt to the list
            while ((sCadena = bf.readLine())!=null) {
                    list.add(sCadena);				
            }
           // set the descending list to show the most recent games
            Collections.reverse(list);
             for (int i=0;i<list.size();i++)
                System.out.println(list.get(i));
            // Cerramos el Buffer
            bf.close();

            } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
		
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

        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jLabel18.setText("none");

        jLabel21.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Records");
        setLocation(new java.awt.Point(530, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)), "Record por nivel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Nivel 1=");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Nivel 2=");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Nivel 3=");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Nivel 4=");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Nivel 5=");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Record total=");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("0");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("0");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("0");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 255));
        jLabel14.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 7, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 255));
        jLabel2.setText("Mejores Records");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("-----------------------------------------");
        jLabel15.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 255));
        jLabel16.setText("none");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 255));
        jLabel17.setText("none");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 255));
        jLabel19.setText("0");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 255));
        jLabel20.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("Ultimos juegos");

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 102));
        jLabel23.setText("none");

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 102));
        jLabel24.setText("none");

        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 102));
        jLabel25.setText("none");

        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 102));
        jLabel26.setText("none");

        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 102));
        jLabel27.setText("none");

        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 102));
        jLabel28.setText("0");

        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 102));
        jLabel29.setText("0");

        jLabel30.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 102));
        jLabel30.setText("0");

        jLabel31.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 102));
        jLabel31.setText("0");

        jLabel32.setFont(new java.awt.Font("Tw Cen MT", 3, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 102));
        jLabel32.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
