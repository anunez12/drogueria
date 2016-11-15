/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author SP   
 */       
public class Bienvenidos extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenidos
     */
    public Bienvenidos() {
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

        PanelSeleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmdSalir = new javax.swing.JButton();
        cmdEntrar = new javax.swing.JButton();
        Acceder = new javax.swing.JRadioButton();
        Salir = new javax.swing.JRadioButton();
        cmdPresentacion = new javax.swing.JButton();
        Presentacion = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bienvenidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tunga", 2, 24), new java.awt.Color(153, 51, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdSalir.setFont(new java.awt.Font("Tunga", 2, 24)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(255, 204, 0));
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel2.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, -1));

        cmdEntrar.setFont(new java.awt.Font("Tunga", 2, 24)); // NOI18N
        cmdEntrar.setForeground(new java.awt.Color(255, 51, 51));
        cmdEntrar.setText("Entrar");
        cmdEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, -1));

        PanelSeleccion.add(Acceder);
        Acceder.setText("Acceder");
        jPanel2.add(Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        PanelSeleccion.add(Salir);
        Salir.setText("Salir");
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        cmdPresentacion.setFont(new java.awt.Font("Tunga", 2, 24)); // NOI18N
        cmdPresentacion.setText("Presentacion");
        cmdPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPresentacionActionPerformed(evt);
            }
        });
        jPanel2.add(cmdPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 60));

        PanelSeleccion.add(Presentacion);
        Presentacion.setText("Presentacion");
        jPanel2.add(Presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 430, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/large_article_im220_pharmaceuticals.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntrarActionPerformed
        if (Acceder.isSelected()) {
            Administrador Principal = new Administrador();
            Principal.setVisible(true);
        }
    }//GEN-LAST:event_cmdEntrarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        if (Salir.isSelected()) {
            System.exit(0);
        }
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPresentacionActionPerformed
        if (Presentacion.isSelected()) {
            Presentacion_Proyecto Principal = new Presentacion_Proyecto();
            Principal.setVisible(true);
        }  
    }//GEN-LAST:event_cmdPresentacionActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Acceder;
    private javax.swing.ButtonGroup PanelSeleccion;
    private javax.swing.JRadioButton Presentacion;
    private javax.swing.JRadioButton Salir;
    private javax.swing.JButton cmdEntrar;
    private javax.swing.JButton cmdPresentacion;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
