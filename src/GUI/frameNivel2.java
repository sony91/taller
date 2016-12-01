package GUI;

import Vista.LogicaJuego;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class frameNivel2 extends javax.swing.JFrame {

    private final LogicaJuego obj = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private final JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;

    public frameNivel2() {
        this.setUndecorated(true);
        initComponents();
        setCartas();
        this.setSize(this.getToolkit().getScreenSize()); 
        
         ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/panel3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
    }

    private void setCartas() {
        int[] numbers = obj.getCardNumbers16();
        jButton1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[0] + ".png")));
        jButton2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[1] + ".png")));
        jButton3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[2] + ".png")));
        jButton4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[3] + ".png")));
        jButton5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[4] + ".png")));
        jButton6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[5] + ".png")));
        jButton7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[6] + ".png")));
        jButton8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[7] + ".png")));
        jButton9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[8] + ".png")));
        jButton10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[9] + ".png")));
        jButton11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[10] + ".png")));
        jButton12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[11] + ".png")));
        jButton13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[12] + ".png")));
        jButton14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[13] + ".png")));
        jButton15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[14] + ".png")));
        jButton16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN2/c" + numbers[15] + ".png")));
        
    }

    private void reiniciar() {

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);

        primerc = false;
        caraUp = false;
        puntaje = 0;
    }

    private void btnEnabled(JButton btn) {
        if (!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        } else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }

    private void compare() {
        if (caraUp && primerc) {

            if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if (puntaje > 10) {
                    puntaje -= 10;
                }
            }
            caraUp = false;
        }
    }

    private void pregwin() {
        if (!jButton1.isEnabled() && !jButton2.isEnabled() && !jButton3.isEnabled() && !jButton4.isEnabled() && !jButton5.isEnabled() && !jButton6.isEnabled()
                && !jButton7.isEnabled() && !jButton8.isEnabled() && !jButton9.isEnabled() && !jButton10.isEnabled() && !jButton11.isEnabled()
                && !jButton12.isEnabled() && !jButton13.isEnabled() && !jButton14.isEnabled() && !jButton15.isEnabled() && !jButton16.isEnabled())
               {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: " + puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonRetornar = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nivel 2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Nivel 2");

        botonRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        botonRetornar.setBorder(null);
        botonRetornar.setBorderPainted(false);
        botonRetornar.setContentAreaFilled(false);
        botonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetornarActionPerformed(evt);
            }
        });

        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        botonReiniciar.setBorder(null);
        botonReiniciar.setBorderPainted(false);
        botonReiniciar.setContentAreaFilled(false);
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 284, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonReiniciar)
                                    .addComponent(botonRetornar))
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addGap(2, 2, 2)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton16))
                    .addComponent(jButton13))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton12)
                            .addComponent(jButton13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(botonReiniciar)
                                .addGap(41, 41, 41)
                                .addComponent(botonRetornar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9)
                            .addComponent(jButton10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton11)
                        .addComponent(jButton16))
                    .addComponent(jButton14))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void botonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetornarActionPerformed
        frameNiveles frame  = new frameNiveles();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRetornarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        btnEnabled(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        compare();
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        btnEnabled(jButton16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        compare();
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        btnEnabled(jButton15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        compare();
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        btnEnabled(jButton14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        compare();
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        btnEnabled(jButton13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        compare();
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        btnEnabled(jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        compare();
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        btnEnabled(jButton11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        compare();
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        btnEnabled(jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        compare();
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        btnEnabled(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        compare();
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        btnEnabled(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        compare();
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        btnEnabled(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        compare();
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        btnEnabled(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        compare();
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        btnEnabled(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        compare();
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        btnEnabled(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        compare();
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnEnabled(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        compare();
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnEnabled(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        compare();
    }//GEN-LAST:event_jButton1MouseExited


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameNivel2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonRetornar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
