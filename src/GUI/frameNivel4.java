
package GUI;

import Vista.LogicaJuego;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGOLAS
 */
public class frameNivel4 extends javax.swing.JFrame {
    
    private final LogicaJuego obj = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private final JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public frameNivel4() {
        
        this.setUndecorated(true); //elemina la barra superior
        initComponents();
        setCartas();
        
    }
    
     private void setCartas() {
        int[] numbers = obj.getCardNumbers24();
        jButton1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[0] + ".png")));
        jButton2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[1] + ".png")));
        jButton3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[2] + ".png")));
        jButton4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[3] + ".png")));
        jButton5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[4] + ".png")));
        jButton6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[5] + ".png")));
        jButton7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[6] + ".png")));
        jButton8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[7] + ".png")));
        jButton9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[8] + ".png")));
        jButton10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[9] + ".png")));
        jButton11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[10] + ".png")));
        jButton12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[11] + ".png")));
        jButton13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[12] + ".png")));
        jButton14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[13] + ".png")));
        jButton15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[14] + ".png")));
        jButton16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[15] + ".png")));
        jButton17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[16] + ".png")));
        jButton18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[17] + ".png")));
        jButton19.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[18] + ".png")));
        jButton20.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[19] + ".png")));
        jButton21.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[20] + ".png")));
        jButton22.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[21] + ".png")));
        jButton23.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[22] + ".png")));
        jButton24.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesN4/b" + numbers[23] + ".png")));
        
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
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);

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
        if (!jButton1.isEnabled() && !jButton2.isEnabled() && !jButton3.isEnabled() && !jButton4.isEnabled() && !jButton5.isEnabled() 
                && !jButton6.isEnabled() && !jButton7.isEnabled() && !jButton8.isEnabled() && !jButton9.isEnabled() 
                && !jButton10.isEnabled() && !jButton11.isEnabled() && !jButton12.isEnabled() && !jButton13.isEnabled()
                &&!jButton14.isEnabled() && !jButton15.isEnabled() && !jButton16.isEnabled() && !jButton17.isEnabled()
                && !jButton18.isEnabled() && !jButton19.isEnabled() && !jButton20.isEnabled() && !jButton21.isEnabled()
                && !jButton22.isEnabled() && !jButton23.isEnabled() && !jButton24.isEnabled())
               {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: " + puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1380, 770));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
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

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton20MouseExited(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton22MouseExited(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton23MouseExited(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton24MouseExited(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Retornar");

        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton22)
                            .addComponent(jButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton25)
                            .addComponent(botonReiniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24)
                        .addGap(2, 2, 2)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonReiniciar)
                        .addGap(37, 37, 37)
                        .addComponent(jButton25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1))
                                .addComponent(jButton5))
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton8)
                            .addComponent(jButton7)
                            .addComponent(jButton6)
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addComponent(jButton23)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16)
                            .addComponent(jButton24)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19)
                            .addComponent(jButton20))))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnEnabled(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnEnabled(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        btnEnabled(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        btnEnabled(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        btnEnabled(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        btnEnabled(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        btnEnabled(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        btnEnabled(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        btnEnabled(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        btnEnabled(jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        btnEnabled(jButton11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        btnEnabled(jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         btnEnabled(jButton13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        btnEnabled(jButton14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        btnEnabled(jButton15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        btnEnabled(jButton16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         btnEnabled(jButton17);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        btnEnabled(jButton19);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        btnEnabled(jButton20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        compare();
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        compare();
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       compare();
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        compare();
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        compare();
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        compare();
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        compare();
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
       compare();
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        compare();
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
       compare();
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
       compare();
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        compare();
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
       compare();
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
       compare();
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
       compare();
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
       compare();
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
       compare();
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
      compare();
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
      compare();
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
       compare();
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        btnEnabled(jButton18);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        btnEnabled(jButton21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        btnEnabled(jButton22);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        btnEnabled(jButton23);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        btnEnabled(jButton24);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
        compare();
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseExited
        compare();
    }//GEN-LAST:event_jButton22MouseExited

    private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
        compare();
    }//GEN-LAST:event_jButton23MouseExited

    private void jButton24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseExited
        compare();
    }//GEN-LAST:event_jButton24MouseExited

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_botonReiniciarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frameNivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameNivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameNivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameNivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameNivel4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
