package GUI;

import com.barcodelib.barcode.QRCode;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.Document;
import javax.swing.text.Element;
import ACFinal.*;
/**
 *
 * @author Carlos Alberto Mestas Escarcena
 */
public class Conexion extends javax.swing.JFrame {
    
    Game game = new GameTresEnRaya();
    PrintBoard printL = new PrintBoard(game);
    static Socket s;
    static ServerSocket ss;
    static InputStreamReader isr;
    static BufferedReader br;
    static String message;
    static String ipJugador1;
    static String ipJugador2;
    static String model1;
    static String model2;
    
    /**
     * Creates new form NewJFrame
     */
    public Conexion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Games for all");
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/Barquito_de_papel2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonAddPlayer1 = new javax.swing.JButton();
        buttonAddPlayer2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(515, 530));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        buttonAddPlayer1.setText("Agregar Jugador 1");
        buttonAddPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPlayer1ActionPerformed(evt);
            }
        });

        buttonAddPlayer2.setText("Agregar Jugador 2");
        buttonAddPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPlayer2ActionPerformed(evt);
            }
        });

        jTextField2.setEnabled(false);

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GAMES FOR ALL");

        jButton4.setText("Conectar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ventana de acciones");

        jButton1.setText("TRES EN RAYA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2)))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(136, 136, 136)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddPlayer1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddPlayer2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPlayer1ActionPerformed
        try {
            // Creacion del codigo QR, genera el codigo de acuerdo a la direccion IP de la computadora
            // Tanto para el jugador 1 y para jugador 2 se genera el mismo codigo QR
            // Porque ambos realizaran la conexion con la misma computadora
            createQRCode();
            // Creacion de la imagen
            ImageIcon icon = new ImageIcon("src/images/QRCode.jpg");
            // Muestra de la imagen
            JOptionPane.showMessageDialog(null, "Escanea el código qr.\nJugador 1", 
                "JUGADOR 1", JOptionPane.INFORMATION_MESSAGE, icon);       
            
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddPlayer1ActionPerformed
    
    // Funciona de la misma manera que el boton anterior en la creacion y muestra del codigo QR
    private void buttonAddPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPlayer2ActionPerformed
        try {
            createQRCode();
            ImageIcon icon = new ImageIcon("src/images/QRCode.jpg");
            JOptionPane.showMessageDialog(null, "Escanea el código qr.\nJugador 2", 
                "JUGADOR 2", JOptionPane.INFORMATION_MESSAGE, icon);       
            
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddPlayer2ActionPerformed
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Realiza la conexion con las direcciones ip enviadas por los celulares
        // Se extrae solamente la direccion IP del texto recibido
        // Ya que se recibe la IP y el modelo del celular
        ipJugador1 = jTextField2.getText().substring(0,13);
        // Luego de recibir la direccion solamente seleccionamos el modelo del celular para mostrarlo
        model1 = jTextField2.getText().substring(14,jTextField2.getText().length());
        jTextField2.setText(jTextField2.getText().substring(13,jTextField2.getText().length()));
        ipJugador2 = jTextField3.getText().substring(0,13);
        model2 = jTextField3.getText().substring(14,jTextField2.getText().length());
        jTextField3.setText(jTextField3.getText().substring(13,jTextField3.getText().length()));
        System.out.println(ipJugador1+"\n"+ipJugador2);
        System.out.println(model1+"\n"+model2);
        
        try{
            // Se crean dos sockes, con el mismo puerto pero con diferente direccion de envio
            // Una direccion de envio para cada celular de acuerdo al jugador
            Socket s1 = new Socket(ipJugador1,7801);
            Socket s2 = new Socket(ipJugador2,7801);
        
            PrintWriter pw1 = new PrintWriter(s1.getOutputStream());
            PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
            
            // Mensaje enviado a cada celular, en cada celular aparecera un mensaje de celular conectado
            pw1.write("Jugador 1 Conectado");
            pw2.write("Jugador 2 Conectado");
            
            pw1.flush();
            pw2.flush();
            
            pw1.close();
            pw2.close();
            
            s1.close();
            s2.close();
        
        }
        catch(IOException e){
        }
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    // Se envia el nombre del juego que se va a jugar, en este caso tres en raya
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            // Generacion de los sockets
            Socket s1 = new Socket(ipJugador1,7801);
            Socket s2 = new Socket(ipJugador2,7801);
        
            PrintWriter pw1 = new PrintWriter(s1.getOutputStream());
            PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
            
            // Se envia la informacion del juego
            // Ya en android al recibir este mensaje se cambiara a otra actividad donde se
            // encontrara la interfaz de Android
            pw1.write("3eR");
            pw2.write("3eR");
            
            pw1.flush();
            pw2.flush();
            
            pw1.close();
            pw2.close();
            
            s1.close();
            s2.close();
        
        }
        catch(IOException e){
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
                            Conexion conexion = new Conexion();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conexion().setVisible(true);

            }
        });
        
        // El primer metodo donde vamos a recibir los datos
        try{
            // Creamos un socket con el puerto donde recibiremos los mensajes
            ss = new ServerSocket(7800);
            while(true){
                s = ss.accept();
                isr = new InputStreamReader(s.getInputStream());
                br = new BufferedReader(isr);
                message = br.readLine();

                System.out.println(message);
                
                
                // Se va imprimiendo los mensajes enviados
                if(jTextArea1.getText().toString().equals("")){
                    jTextArea1.setText(message);
                }
                else{
                    jTextArea1.setText(jTextArea1.getText() + "\n" + message);
                }
                
                // Primeramente donde veremos la primera direccion y modelo
                // En el caso de que este vacio lo considerara como jugador 1
                if(jTextField2.getText().equals("")){
                    jTextField2.setText(message);
                    ipJugador1 = message;
                    System.out.println(ipJugador1);
                }
                
                // En el caso de que ya este lleno, se llenara con otros dos valores
                else if(jTextField2.getText().equals(ipJugador1.toString())){
                    if(jTextField3.getText().equals("")){
                        jTextField3.setText(message);
                        ipJugador2 = message.substring(0,11);;
                    }   
                
                }
                
                else{// if((jTextField2.getText().length() != 0) && (jTextField3.getText().length() != 0)){
                    conexion.sendMessage(message);
                
                }

            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // Metodo donde generamos el codigo QR
    public void createQRCode() throws Exception{
        String myLocalIPv4 = getLocalIPv4(); 
        
        int udm = 0, resol = 72, rot = 0;
        float mi = 0.000f, md = 0.000f, ms = 0.000f, min = 0.000f, tam = 5.00f;
    
        try{
            QRCode ipCode = new QRCode();
            // Colocamos la informacion de la direccion IP de la computadora
            ipCode.setData(myLocalIPv4);
            ipCode.setDataMode(QRCode.MODE_BYTE);
            ipCode.setUOM(udm);
            ipCode.setLeftMargin(mi);
            ipCode.setRightMargin(md);
            ipCode.setTopMargin(ms);
            ipCode.setBottomMargin(min);
            ipCode.setResolution(resol);
            ipCode.setRotate(rot);
            ipCode.setModuleSize(tam);
            // Se crea la imagen respectiva de la direccion ip
            String file = System.getProperty("user.dir")+("/src/images/QRCode.jpg");
            ipCode.renderBarcode(file);
                                            
        }
        catch(Exception e){
            
        }
    
    }
    
    // Obtencion de la direccion IP de la computadora
    public String getLocalIPv4() throws Exception{
        InetAddress address = InetAddress.getLocalHost();
        return address.getHostAddress();    
    }
    
    public void sendMessage(String message){
        System.out.println(message.substring(0,9));
        if(message.substring(0,9).equals("Jugador 1")){
            try{
            Socket s2 = new Socket(ipJugador2,7801);
        
            PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
            
            pw2.write(message);
            
            pw2.flush();
            
            pw2.close();
            
            s2.close();
        
            }
            
            catch(IOException e){
            }
        }
        if(message.substring(0,9).equals("Jugador 2")){
            try{
            Socket s2 = new Socket(ipJugador1,7801);
        
            PrintWriter pw2 = new PrintWriter(s2.getOutputStream());
            
            pw2.write(message);
            
            pw2.flush();
            
            pw2.close();
            
            s2.close();
        
            }
            
            catch(IOException e){
            }
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddPlayer1;
    private javax.swing.JButton buttonAddPlayer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
