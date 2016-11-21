/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.DAO;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;
import java.awt.image.BufferedImage;

/**
 *
 * @author elektra
 */
public class Fondo implements Border
{
    private BufferedImage imagen;

    public Fondo(BufferedImage img) 
    {
        this.imagen = img;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
    {
        int x0 = x+(width-imagen.getWidth())/2;
        int y0 = y+(height-imagen.getHeight())/2;
        g.drawImage(imagen, x0,y0, null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
