/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoInterfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Gonzalo
 */
public class PantallaDatos extends javax.swing.JDialog {

    private boolean modoOscuro = false;

    private PantallaPrincipal pantallaPrincipal;

    /**
     * Creates new form PantallaDatos
     */
    public PantallaDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal) parent;
        initComponents();
        //Para que la ventana se inicie en el centro
        setLocationRelativeTo(null);
        jLabelInfoIntegrantes.setBackground(Color.decode("#ADE1FF"));
        jLabelFecha.setBackground(Color.decode("#ADE1FF"));
        jLabelReview.setBackground(Color.decode("#ADE1FF"));
        //Para que el fondo de los labels sean opacos y se sobrepongan al del
        //jpanel
        jLabelInfoIntegrantes.setOpaque(true);
        jLabelFecha.setOpaque(true);
        jLabelReview.setOpaque(true);
        //posición del texto del jLabelReview
        jLabelReview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReview.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelInfo = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelInfoIntegrantes = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jButtonNoche = new javax.swing.JButton();
        jLabelReview = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jButtonVolver.setBackground(new java.awt.Color(173, 225, 255));
        jButtonVolver.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(56, 185, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonVolver);

        jButtonSalir.setBackground(new java.awt.Color(173, 225, 255));
        jButtonSalir.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(56, 185, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonSalir);

        jPanelInfo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInfo.setForeground(new java.awt.Color(0, 0, 0));
        jPanelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFecha.setBackground(new java.awt.Color(173, 225, 255));
        jLabelFecha.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(56, 185, 255));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelFechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelFechaMouseExited(evt);
            }
        });
        jPanelInfo.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1130, 40));

        jLabelInfoIntegrantes.setBackground(new java.awt.Color(173, 225, 255));
        jLabelInfoIntegrantes.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelInfoIntegrantes.setForeground(new java.awt.Color(56, 185, 255));
        jLabelInfoIntegrantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfoIntegrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInfoIntegrantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelInfoIntegrantesMouseExited(evt);
            }
        });
        jPanelInfo.add(jLabelInfoIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1140, 40));

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_cerrar.png"))); // NOI18N
        jButtonCerrar.setBorderPainted(false);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_cerrar_pulsado.png"))); // NOI18N
        jButtonCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_cerrar_rollover.png"))); // NOI18N
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanelInfo.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 20, 30));

        jButtonNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton_cambia_modo.png"))); // NOI18N
        jButtonNoche.setBorderPainted(false);
        jButtonNoche.setContentAreaFilled(false);
        jButtonNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNocheActionPerformed(evt);
            }
        });
        jPanelInfo.add(jButtonNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 50, -1));

        jLabelReview.setBackground(new java.awt.Color(173, 225, 255));
        jLabelReview.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelReview.setForeground(new java.awt.Color(56, 185, 255));
        jLabelReview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReview.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReviewMouseExited(evt);
            }
        });
        jPanelInfo.add(jLabelReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 1130, 350));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 93, 178));
        jLabel1.setText("Integrantes del grupo:");
        jPanelInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 93, 178));
        jLabel3.setText("Review:");
        jPanelInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 93, 178));
        jLabel2.setText("Año lanzamiento");
        jPanelInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
            .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sale del programa por completo, cierra ambas ventanas
     * @param evt 
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        pantallaPrincipal.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * Vuelve a la pantalla principal, cerrando la de datos
     * @param evt 
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * Cierra la pantalla de datos
     * @param evt 
     */
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    /**
     * Cambia el texto del jLabel de los integrantes según el String
     * que le llega por parámetro
     * @param texto 
     */
    public void actualizarInfoIntegrantes(String texto) {
        jLabelInfoIntegrantes.setText(texto);
    }

    /**
     * Cambia el texto con la fecha según el String que le llega por parámetro
     * @param texto 
     */
    public void actualizarInfoFechaLanzamiento(String texto) {
        jLabelFecha.setText(texto);
    }

    /**
     * Cambia el texto de la review según el disco seleccionado
     * @param texto String del item seleccionado del jComboBox
     */
    public void actualizarInfoReview(String texto) {
        jLabelReview.setText(texto);
    }


    /**
     * Cambiar la venatana a modo oscuro, cambiando sus componentes.
     * @param evt 
     */
    private void jButtonNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNocheActionPerformed
        if (!modoOscuro) {

            jPanelInfo.setBackground(Color.decode("#17181a"));
            jPanelBotones.setBackground(Color.decode("#17181a"));
            jLabelInfoIntegrantes.setForeground(Color.decode("#ade1ff"));
            jLabelFecha.setForeground(Color.decode("#ade1ff"));
            jLabelReview.setForeground(Color.decode("#ade1ff"));
            jButtonVolver.setBackground(Color.decode("#005db2"));
            jButtonSalir.setBackground(Color.decode("#005db2"));
            jButtonVolver.setForeground(Color.decode("#ade1ff"));
            jButtonSalir.setForeground(Color.decode("#ade1ff"));
            jButtonNoche.setIcon(new ImageIcon(getClass().getResource("/images/boton_modo_noche_activado.png")));
            jLabelInfoIntegrantes.setBackground(Color.decode("#005db2"));
            jLabelFecha.setBackground(Color.decode("#005db2"));
            jLabelReview.setBackground(Color.decode("#005db2"));
            jLabelInfoIntegrantes.setOpaque(true);
            jLabelFecha.setOpaque(true);
            jLabelReview.setOpaque(true);

            modoOscuro = true;

        } else {
            PantallaPrincipal frame = new PantallaPrincipal();

            this.dispose();
            frame.setVisible(true);
            modoOscuro = false;
        }
    }//GEN-LAST:event_jButtonNocheActionPerformed

    /**
     * Método que intercambia los colores de los fondos de los 3 jLabel, cuando
     * se pasa el ratón por encima y se sale de ellos, en función de si está el
     * modo oscuro activado o no
     * @param mouseEntered
     * @param label 
     */
    private void ajustarColores(boolean mouseEntered, JLabel label) {
        if (modoOscuro) {
            if (mouseEntered) {
                 // Azul más claro para el fondo del label y más oscuro para las
                 //letras si está el modo oscuro activado y entra el ratón
                label.setBackground(Color.decode("#ADE1FF"));
                label.setForeground(Color.decode("#005db2"));
            } else {
                //azul más oscuro para el fondo
                label.setBackground(Color.decode("#005db2"));
                //azul más claro para las letras
                label.setForeground(Color.decode("#ADE1FF"));
            }
        } else {
            //si no está el modo oscuro activado, azul oscuro para el fondo
            //y azul claro para las letras
            if (mouseEntered) {
                label.setBackground(Color.decode("#005db2"));
            } else {
                label.setBackground(Color.decode("#ADE1FF"));
            }
        }
    }

    /**
     * Métodos que llaman al método de ajustar los colores de los fondos y letras
     * de los jLabel, al entrar y salir el ratón de ellos
     * @param evt 
     */
    private void jLabelInfoIntegrantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInfoIntegrantesMouseEntered
        ajustarColores(true, jLabelInfoIntegrantes);
    }//GEN-LAST:event_jLabelInfoIntegrantesMouseEntered

    private void jLabelInfoIntegrantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInfoIntegrantesMouseExited
        ajustarColores(false, jLabelInfoIntegrantes);
    }//GEN-LAST:event_jLabelInfoIntegrantesMouseExited

    private void jLabelFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFechaMouseEntered
        ajustarColores(true, jLabelFecha);
    }//GEN-LAST:event_jLabelFechaMouseEntered

    private void jLabelFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFechaMouseExited
        ajustarColores(false, jLabelFecha);
    }//GEN-LAST:event_jLabelFechaMouseExited

    private void jLabelReviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReviewMouseEntered
        ajustarColores(true, jLabelReview);
    }//GEN-LAST:event_jLabelReviewMouseEntered

    private void jLabelReviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReviewMouseExited
        ajustarColores(false, jLabelReview);
    }//GEN-LAST:event_jLabelReviewMouseExited

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
            java.util.logging.Logger.getLogger(PantallaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaDatos dialog = new PantallaDatos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonNoche;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelInfoIntegrantes;
    private javax.swing.JLabel jLabelReview;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelInfo;
    // End of variables declaration//GEN-END:variables
}
