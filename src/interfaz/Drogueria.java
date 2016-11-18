/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;   
   
/**   
 *      
 * @author SP         
 */
public class Drogueria extends javax.swing.JFrame {

    /**
     * Creates new form Drogueria
     */
    String ruta;    

    public Drogueria() {
        initComponents();
        ruta = "src/serializar/serializacion.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnIngresarDatos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        mnListadoCompleto = new javax.swing.JCheckBoxMenuItem();
        mnListadoGenerico_Comercial = new javax.swing.JCheckBoxMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnCantidadDeMedicamentos = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnIngresarDatosPersonas = new javax.swing.JCheckBoxMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        mnListadoCompletoPersonas = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnSalir = new javax.swing.JMenuItem();
        mnRetorno = new javax.swing.JCheckBoxMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DROGUERIA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleada-farmacia.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 460));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Galeria De Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 2, 24), new java.awt.Color(204, 51, 0))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(153, 0, 51));

        jMenu1.setForeground(new java.awt.Color(255, 0, 51));
        jMenu1.setText("Menu Principal");
        jMenu1.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N

        mnIngresarDatos.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        mnIngresarDatos.setForeground(new java.awt.Color(255, 153, 0));
        mnIngresarDatos.setText("Ingresar Datos");
        mnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarDatosActionPerformed(evt);
            }
        });
        jMenu1.add(mnIngresarDatos);
        jMenu1.add(jSeparator2);

        jMenu2.setForeground(new java.awt.Color(204, 0, 204));
        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        mnListadoCompleto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        mnListadoCompleto.setSelected(true);
        mnListadoCompleto.setText("Listado Completo");
        mnListadoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoCompletoActionPerformed(evt);
            }
        });
        jMenu2.add(mnListadoCompleto);

        mnListadoGenerico_Comercial.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        mnListadoGenerico_Comercial.setForeground(new java.awt.Color(255, 153, 102));
        mnListadoGenerico_Comercial.setSelected(true);
        mnListadoGenerico_Comercial.setText("Listado Generico-Comercial");
        mnListadoGenerico_Comercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoGenerico_ComercialActionPerformed(evt);
            }
        });
        jMenu2.add(mnListadoGenerico_Comercial);
        jMenu2.add(jSeparator4);

        mnCantidadDeMedicamentos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        mnCantidadDeMedicamentos.setForeground(new java.awt.Color(204, 102, 255));
        mnCantidadDeMedicamentos.setSelected(true);
        mnCantidadDeMedicamentos.setText("Cantidad de medicamentos");
        mnCantidadDeMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidadDeMedicamentosActionPerformed(evt);
            }
        });
        jMenu2.add(mnCantidadDeMedicamentos);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Menu Secundario");
        jMenu4.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N

        mnIngresarDatosPersonas.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        mnIngresarDatosPersonas.setSelected(true);
        mnIngresarDatosPersonas.setText("IngresarDatosPersona");
        mnIngresarDatosPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarDatosPersonasActionPerformed(evt);
            }
        });
        jMenu4.add(mnIngresarDatosPersonas);
        jMenu4.add(jSeparator5);

        jMenu5.setForeground(new java.awt.Color(255, 0, 51));
        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        mnListadoCompletoPersonas.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        mnListadoCompletoPersonas.setSelected(true);
        mnListadoCompletoPersonas.setText("Listado Completo");
        mnListadoCompletoPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoCompletoPersonasActionPerformed(evt);
            }
        });
        jMenu5.add(mnListadoCompletoPersonas);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(255, 153, 0));
        jMenu3.setText("Opciones");
        jMenu3.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N

        mnSalir.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        jMenu3.add(mnSalir);

        mnRetorno.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        mnRetorno.setForeground(new java.awt.Color(255, 0, 51));
        mnRetorno.setSelected(true);
        mnRetorno.setText("Retorno");
        mnRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRetornoActionPerformed(evt);
            }
        });
        jMenu3.add(mnRetorno);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSalirActionPerformed

    private void mnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarDatosActionPerformed
        IngresarDatos Drogueria = new IngresarDatos(this, true);
        Drogueria.setVisible(true);
    }//GEN-LAST:event_mnIngresarDatosActionPerformed

    private void mnListadoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoCompletoActionPerformed
        ListadoCompleto lc = new ListadoCompleto(this, true);
        lc.setVisible(true);
    }//GEN-LAST:event_mnListadoCompletoActionPerformed

    private void mnCantidadDeMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidadDeMedicamentosActionPerformed
        int cont;
        cont = Helper.traerDatos(ruta).size();
        Helper.mensaje(this, "La cantidad de mediacamentos es: " + cont, 1);
    }//GEN-LAST:event_mnCantidadDeMedicamentosActionPerformed

    private void mnListadoGenerico_ComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoGenerico_ComercialActionPerformed
        Listado_Generico_Comercial lGC = new Listado_Generico_Comercial(this, true);
        lGC.setVisible(true);
    }//GEN-LAST:event_mnListadoGenerico_ComercialActionPerformed

    private void mnRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRetornoActionPerformed
        Presentacion_Proyecto inicio = new Presentacion_Proyecto();
        inicio.setVisible(true); 
        dispose();   
    }//GEN-LAST:event_mnRetornoActionPerformed

    private void mnIngresarDatosPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarDatosPersonasActionPerformed
        IngresarDatosPersona Drogueria = new IngresarDatosPersona(this, true);
        Drogueria.setVisible(true);  
    }//GEN-LAST:event_mnIngresarDatosPersonasActionPerformed

    private void mnListadoCompletoPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoCompletoPersonasActionPerformed
        ListadoCompletoPersonas lc = new ListadoCompletoPersonas(this, true);
        lc.setVisible(true);    
    }//GEN-LAST:event_mnListadoCompletoPersonasActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Drogueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drogueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drogueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drogueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drogueria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JCheckBoxMenuItem mnCantidadDeMedicamentos;
    private javax.swing.JMenuItem mnIngresarDatos;
    private javax.swing.JCheckBoxMenuItem mnIngresarDatosPersonas;
    private javax.swing.JCheckBoxMenuItem mnListadoCompleto;
    private javax.swing.JCheckBoxMenuItem mnListadoCompletoPersonas;
    private javax.swing.JCheckBoxMenuItem mnListadoGenerico_Comercial;
    private javax.swing.JCheckBoxMenuItem mnRetorno;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
