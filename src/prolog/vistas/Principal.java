/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.vistas;

import org.jpl7.Query;
import prolog.conectores.XmlReader;



/**
 *
 * @author Antonio
 */
public class Principal extends javax.swing.JFrame {

    private static String user;
    private static XmlReader xmlUser;
    private static int tipoPlan = 0;
    private static int rutinaH = 0; //Rutina actual
    private static int disponibilidad = 0; //Dias a la semana
    private static String musculosDia = "";
    /**
     * Creates new form Principal
     */
    public Principal() {
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
        verDetalleRutinas = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarRutinaDia = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        registroActividad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a SE-Fitness");

        verDetalleRutinas.setText("Detalles de la Rutina");
        verDetalleRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDetalleRutinasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rutina del Día");

        mostrarRutinaDia.setColumns(20);
        mostrarRutinaDia.setRows(5);
        jScrollPane1.setViewportView(mostrarRutinaDia);

        jToggleButton2.setText("Dieta del Día");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        registroActividad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registroActividad.setText("Registrar rutina actual");
        registroActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(verDetalleRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registroActividad)
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registroActividad)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verDetalleRutinas)
                    .addComponent(jToggleButton2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActividadActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_registroActividadActionPerformed

    private void verDetalleRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDetalleRutinasActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_verDetalleRutinasActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        //
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
        
    }

    public void iniciarValores(String usuario, XmlReader xml ){
        
        user = usuario;
        xmlUser = xml;
        
        String tipoPlan = xml.read("plan");
        String disp1 = xml.read("disponibilidad");
        String rutinaA = xml.read("rutinaAnterior"); //Ultima rutina hecha
        
        try {
            disponibilidad = Integer.valueOf(disp1);
            rutinaH = Integer.valueOf(rutinaA);
        }catch (NumberFormatException e){
            System.out.println("not a number"); 
        } 
                
        rutinaH ++;
        if(rutinaH > disponibilidad)  //Si ya hizo todoas las rutinas semanales, reiniciamos.
            rutinaH = 1;
        
        //Consultamos rutina actual...
        
        try{
            String rutinas = xml.read("rutinaSemanal");
            rutinas = rutinas.replace("\n", "");
            XmlReader xmlR = new XmlReader("./src/Recursos/Rutinas/" + rutinas + ".xml");
            musculosDia = xmlR.read("dia" + rutinaH);
            //System.out.println("Muscuslos:" + dia);
        }
        catch(Exception e){
            
        }
        //Fin de consulta de rutina actual...    
                
        mostrarRutinaDia.setText("Hoy te toca:" + musculosDia);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextArea mostrarRutinaDia;
    private javax.swing.JButton registroActividad;
    private javax.swing.JToggleButton verDetalleRutinas;
    // End of variables declaration//GEN-END:variables
}
