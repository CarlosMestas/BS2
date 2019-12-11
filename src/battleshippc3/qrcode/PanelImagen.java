/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshippc3.qrcode;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Alberto Mestas Escarcena
 */
public class PanelImagen extends JPanel{
    
    
    @Override
    public void paintComponents(Graphics g){
        Dimension tam = getSize();
        
        ImageIcon image = new ImageIcon(this.getClass().getResource("/imagen/QrSistemas.jpg"));
        g.drawImage(image.getImage(), 0, 0, tam.width, tam.height, null);
        
        
    }
}
