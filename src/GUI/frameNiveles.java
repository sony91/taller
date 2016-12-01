
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author LEGOLAS
 */
public class frameNiveles extends javax.swing.JFrame {
    
    public frameNivel1 frame = new frameNivel1();
    public frameNivel2 frame1 = new frameNivel2();
    private frameNivel3 frame2 = new frameNivel3();
    private frameNivel4 frame3 = new frameNivel4();
    private frameNivel5 frame4 = new frameNivel5();

    public frameNiveles() {
        initComponents();
        this.setSize(this.getToolkit().getScreenSize());
        //this.setUndecorated(true);
			
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/bosque.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nivel1 = new javax.swing.JButton();
        nivel2 = new javax.swing.JButton();
        botonRetornar = new javax.swing.JButton();
        nivel3 = new javax.swing.JButton();
        nivel5 = new javax.swing.JButton();
        nivel4 = new javax.swing.JButton();
        nivel6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        nivel1.setText("Nivel 1");
        nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel1ActionPerformed(evt);
            }
        });

        nivel2.setText("Nivel 2");
        nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel2ActionPerformed(evt);
            }
        });

        botonRetornar.setText("Menu Principal");
        botonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetornarActionPerformed(evt);
            }
        });

        nivel3.setText("Nivel 3");
        nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel3ActionPerformed(evt);
            }
        });

        nivel5.setText("Nivel 5");
        nivel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel5ActionPerformed(evt);
            }
        });

        nivel4.setText("Nivel 4");
        nivel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel4ActionPerformed(evt);
            }
        });

        nivel6.setText("Nivel 6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nivel1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(nivel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nivel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nivel2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nivel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nivel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nivel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(botonRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel1ActionPerformed
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_nivel1ActionPerformed

    private void nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel2ActionPerformed
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_nivel2ActionPerformed

    private void botonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetornarActionPerformed
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRetornarActionPerformed

    private void nivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel3ActionPerformed
        frame2.setVisible(true);
        dispose();
                
    }//GEN-LAST:event_nivel3ActionPerformed

    private void nivel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel4ActionPerformed
        frame3.setVisible(true);
        dispose();
    }//GEN-LAST:event_nivel4ActionPerformed

    private void nivel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel5ActionPerformed
        frame4.setVisible(true);
        dispose();
    }//GEN-LAST:event_nivel5ActionPerformed
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRetornar;
    private javax.swing.JButton nivel1;
    private javax.swing.JButton nivel2;
    private javax.swing.JButton nivel3;
    private javax.swing.JButton nivel4;
    private javax.swing.JButton nivel5;
    private javax.swing.JButton nivel6;
    // End of variables declaration//GEN-END:variables
}
