
package GUI;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author LEGOLAS
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    private final  frameNiveles frame = new frameNiveles();
    private final  frameJugadorJugador frm = new frameJugadorJugador();
    
   
    public ventanaPrincipal() {
        initComponents();
        
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        //this.setExtendedState(MAXIMIZED_BOTH); //  SOLO FUNCIONA CON UN FRAME  maximiza el frame
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JugadorVsJugador = new javax.swing.JButton();
        JugadorSoloNiveles = new javax.swing.JButton();
        demo = new javax.swing.JButton();
        informacion = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JugadorVsJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugadorVsJugador.jpg"))); // NOI18N
        JugadorVsJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JugadorVsJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JugadorVsJugador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        JugadorVsJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorVsJugadorActionPerformed(evt);
            }
        });

        JugadorSoloNiveles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugadorSolo.jpg"))); // NOI18N
        JugadorSoloNiveles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JugadorSoloNiveles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/soloP.jpg"))); // NOI18N
        JugadorSoloNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorSoloNivelesActionPerformed(evt);
            }
        });

        demo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/demo.jpg"))); // NOI18N
        demo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        demo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/demoP.jpg"))); // NOI18N

        informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.jpg"))); // NOI18N
        informacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        informacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acercaP.jpg"))); // NOI18N
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.jpg"))); // NOI18N
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demo, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JugadorSoloNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JugadorVsJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 505, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(JugadorVsJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JugadorSoloNiveles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informacion)
                .addGap(138, 138, 138)
                .addComponent(Salir)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void JugadorVsJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorVsJugadorActionPerformed
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_JugadorVsJugadorActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed
         frameInformacion dialog = new frameInformacion(new javax.swing.JFrame(), true);
         dialog.setVisible(true);
         dialog.setTitle("Quines Somos");
        
    }//GEN-LAST:event_informacionActionPerformed

    private void JugadorSoloNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorSoloNivelesActionPerformed
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_JugadorSoloNivelesActionPerformed

    //GridLayout dd=new GridLayout
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JugadorSoloNiveles;
    private javax.swing.JButton JugadorVsJugador;
    private javax.swing.JButton Salir;
    private javax.swing.JButton demo;
    private javax.swing.JButton informacion;
    // End of variables declaration//GEN-END:variables
}
