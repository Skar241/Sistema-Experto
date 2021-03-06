/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.vistas;

import org.jpl7.Query;
import prolog.conectores.XmlReader;
import prolog.conectores.Imagen;
import javax.swing.ImageIcon;

/**
 *
 * @author Zafiro
 */
public class DetalleRutinas extends javax.swing.JFrame {

    /**
     * Creates new form detalleRutinas
     */
    private String musculo = "";
    private String archivoMusculo = "";
    private String ejercicios = "";
    private int numEjercicio = 0;
    private int totalEjercicios = 4; //Total de etiques con rutas en los xmls
    private XmlReader xmlR;
    
    
    public DetalleRutinas() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        botonPecho = new javax.swing.JButton();
        botonEspalda = new javax.swing.JButton();
        botonBiceps = new javax.swing.JButton();
        botonTriceps = new javax.swing.JButton();
        botonPierna = new javax.swing.JButton();
        botoHombros = new javax.swing.JButton();
        botonAbdominales = new javax.swing.JButton();
        siguienteEjercicio = new javax.swing.JButton();
        regresarEjercicio = new javax.swing.JButton();
        botonCardio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regresarPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Detalle de músculos y ejercicios");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonPecho.setText("Pecho");
        botonPecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPechoActionPerformed(evt);
            }
        });

        botonEspalda.setText("Espalda");
        botonEspalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspaldaActionPerformed(evt);
            }
        });

        botonBiceps.setText("Biceps");
        botonBiceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBicepsActionPerformed(evt);
            }
        });

        botonTriceps.setText("Triceps");
        botonTriceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTricepsActionPerformed(evt);
            }
        });

        botonPierna.setText("Pierna");
        botonPierna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiernaActionPerformed(evt);
            }
        });

        botoHombros.setText("Hombros");
        botoHombros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoHombrosActionPerformed(evt);
            }
        });

        botonAbdominales.setText("Abdominales");
        botonAbdominales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbdominalesActionPerformed(evt);
            }
        });

        siguienteEjercicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        siguienteEjercicio.setText("Siguiente");
        siguienteEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteEjercicioActionPerformed(evt);
            }
        });

        regresarEjercicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regresarEjercicio.setText("Anterior");
        regresarEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarEjercicioActionPerformed(evt);
            }
        });

        botonCardio.setText("Cardio");
        botonCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCardioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Selecciona un músculo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Detalle de los ejercicios:");

        regresarPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regresarPrincipal.setText("Regresar a página principal");
        regresarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regresarPrincipal)
                                .addGap(132, 132, 132)
                                .addComponent(regresarEjercicio)
                                .addGap(18, 18, 18)
                                .addComponent(siguienteEjercicio))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonEspalda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonTriceps, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonPierna, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botoHombros, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonAbdominales, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonCardio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPecho)
                        .addGap(18, 18, 18)
                        .addComponent(botonEspalda)
                        .addGap(18, 18, 18)
                        .addComponent(botonBiceps)
                        .addGap(27, 27, 27)
                        .addComponent(botonTriceps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(botonPierna)
                        .addGap(18, 18, 18)
                        .addComponent(botoHombros)
                        .addGap(26, 26, 26)
                        .addComponent(botonAbdominales)
                        .addGap(18, 18, 18)
                        .addComponent(botonCardio)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresarPrincipal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(siguienteEjercicio)
                        .addComponent(regresarEjercicio)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteEjercicioActionPerformed
        // TODO add your handling code here:       
        try{
            numEjercicio ++;
            if( numEjercicio == 5)
                numEjercicio = 1;
            
            ejercicios = xmlR.read("ejercicio" + numEjercicio);
            //System.out.println("Ruta: " + ejercicios);              
              
            Imagen im = new Imagen(jPanel1, ejercicios);
            jPanel1.add(im).repaint();
            
            System.out.println("Se pasó a la imagen: " + numEjercicio + " de " + musculo);

        }catch(Exception e){
            System.out.println("Error al mostrar imagen siguiente...");
        }
        
    }//GEN-LAST:event_siguienteEjercicioActionPerformed

    private void regresarEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarEjercicioActionPerformed
        // TODO add your handling code here:
        try{
            numEjercicio --;
            if( numEjercicio == 0)
                numEjercicio = 5;
            ejercicios = xmlR.read("ejercicio" + numEjercicio);
            //System.out.println("Ruta: " + ejercicios);              
              
            Imagen im = new Imagen(jPanel1, ejercicios);
            jPanel1.add(im).repaint();
            System.out.println("Se regresó a la imagen " + numEjercicio + " de " + musculo);

        }catch(Exception e){
            System.out.println("Error al mostrar imagen anterior...");
        }
    }//GEN-LAST:event_regresarEjercicioActionPerformed

    private void botonCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCardioActionPerformed
        // TODO add your handling code here:
        musculo = "cardio";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonCardioActionPerformed

    private void regresarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarPrincipalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_regresarPrincipalActionPerformed

    private void botonPechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPechoActionPerformed
        // TODO add your handling code here:
        musculo = "pecho";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonPechoActionPerformed

    private void botonEspaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspaldaActionPerformed
        // TODO add your handling code here:
        musculo = "espalda";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonEspaldaActionPerformed

    private void botonBicepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBicepsActionPerformed
        // TODO add your handling code here:
        musculo = "biceps";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonBicepsActionPerformed

    private void botonTricepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTricepsActionPerformed
        // TODO add your handling code here:
        musculo = "triceps";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonTricepsActionPerformed

    private void botonPiernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiernaActionPerformed
        // TODO add your handling code here:
        musculo = "pierna";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonPiernaActionPerformed

    private void botoHombrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoHombrosActionPerformed
        // TODO add your handling code here:
        musculo = "hombros";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botoHombrosActionPerformed

    private void botonAbdominalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbdominalesActionPerformed
        // TODO add your handling code here:
        musculo = "abdominales";
        numEjercicio = 1;
        cambiarMusculo();
    }//GEN-LAST:event_botonAbdominalesActionPerformed

    public void iniciarDetalles(String musculo) {                                                 
        // TODO add your handling code here:
        this.musculo = musculo;
        numEjercicio = 1;
        cambiarMusculo();
    }                                                

    
    public void cambiarMusculo(){

        try{
            String conexion= "consult('bd.pl')";
            Query con= new Query(conexion);
            System.out.println(conexion + " " + (con.hasMoreSolutions()? "Aceptado": "False"));
            
            String consulta = "ejerciciosMusculos(" + musculo + ",X).";
            Query ejecutar = new Query(consulta);
            
            if(ejecutar.hasSolution()){
                archivoMusculo = ejecutar.oneSolution().get("X").toString();
                xmlR = new XmlReader("./src/Recursos/Ejercicios/" + archivoMusculo + ".xml");
                System.out.println("archivo del " + musculo + ": "+ archivoMusculo + ".xml");
                ejercicios = xmlR.read("ejercicio" + numEjercicio);
                System.out.println("Ruta: " + ejercicios);              
                
                Imagen im = new Imagen(jPanel1, ejercicios);
                jPanel1.add(im).repaint();
                System.out.println("Se cambió a imágenes de " + musculo);
            }
            else
                System.out.println("Error al buscar en BC el archivo de ejercicios para " + musculo);
        }catch(Exception e){
            System.out.println("Error al ejecutar consulta de query BC");
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(DetalleRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleRutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleRutinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoHombros;
    private javax.swing.JButton botonAbdominales;
    private javax.swing.JButton botonBiceps;
    private javax.swing.JButton botonCardio;
    private javax.swing.JButton botonEspalda;
    private javax.swing.JButton botonPecho;
    private javax.swing.JButton botonPierna;
    private javax.swing.JButton botonTriceps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresarEjercicio;
    private javax.swing.JButton regresarPrincipal;
    private javax.swing.JButton siguienteEjercicio;
    // End of variables declaration//GEN-END:variables
}
