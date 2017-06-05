/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.conectores;

/**
 *
 * @author Zafiro
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    int x, y;
    private String ruta = "";
    
    public Imagen(JPanel jPanel1, String ruta) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.ruta = ruta;
        
    }

    @Override
    public void paint(Graphics g) {
        //ImageIcon Img = new ImageIcon(getClass().getResource("/Recursos/Imagenes/Pecho/ejercicio1.gif"));
        try{
        ruta = ruta.trim();
        /*
        String direccion = "/Recursos/Imagenes/Pecho/ejercicio1.gif" ;
        if( direccion.equals(ruta)){
            System.out.println("Las rutas son iguales");
        }
        else{
            System.out.println("Las cadenas son diferentes");
            System.out.println("Ruta 1:" + ruta);
            System.out.println("Ruta 2:" + direccion);
        }
        */
        ImageIcon Img = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
        }catch(Exception e){
        }
        
    }    

}