/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshippc3.qrcode;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos Alberto Mestas Escarcena
 */
public class FrameImagen extends javax.swing.JFrame{
    
    public FrameImagen(){
      //  add(new PanelImagen());

}
    
    public static void main(String[]args){
        ImageIcon icon = new ImageIcon("src/images/QRCode.jpg");
        JOptionPane.showMessageDialog(null, "Escanea el código qr.\nJugador 1", 
                "JUGADOR 1", JOptionPane.INFORMATION_MESSAGE, icon);        
    }
    
}
