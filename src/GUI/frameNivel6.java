/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author denniscolque93
 */
import Vista.LogicaJuego;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameNivel6 extends javax.swing.JFrame {
    static int cont=1;
    
    //private VFondo fondo;
    private LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;

   
    public frameNivel6() {
        initComponents();
        
        
      //  fondo = new VFondo(getWidth(), getHeight());
        //add(fondo, BorderLayout.CENTER);
        setCards();
    }
        
    public class progreso implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        int n = jProgressBar1.getValue();
        
        if (n<100){
        n++;
        jProgressBar1.setValue(n);
        }else{
            timer.stop();
            //timer.restart();
            JOptionPane.showMessageDialog(null, "se acabo el tiempo");
        }
    }
    }
    private void setCards() {
        int[] numbers = log.getCardNumbers36();
        jButton1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[0] + ".png")));
        jButton2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[1] + ".png")));
        jButton3.setDisabledIcon(new ImageIcon(getClass().getResource("/imageneD/" + numbers[2] + ".png")));
        jButton4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[3] + ".png")));
        jButton5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[4] + ".png")));
        jButton6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[5] + ".png")));
        jButton7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[6] + ".png")));
        jButton8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[7] + ".png")));
        jButton9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[8] + ".png")));
        jButton10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[9] + ".png")));
        jButton11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[10] + ".png")));
        jButton12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[11] + ".png")));
        jButton13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[12] + ".png")));
        jButton14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[13] + ".png")));
        jButton15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[14] + ".png")));
        jButton16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[15] + ".png")));
        jButton17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[16] + ".png")));
        jButton18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[17] + ".png")));
        jButton19.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[18] + ".png")));
        jButton20.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[19] + ".png")));
        jButton21.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[20] + ".png")));    
        jButton22.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[21] + ".png")));
        jButton23.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[22] + ".png")));
        jButton24.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[23] + ".png")));
        jButton25.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[24] + ".png")));
        jButton26.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[25] + ".png")));
        jButton27.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[26] + ".png")));
        jButton28.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[27] + ".png")));
        jButton29.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[28] + ".png")));
        jButton30.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[29] + ".png")));
        jButton31.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[30] + ".png")));
        jButton32.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[31] + ".png")));
        jButton33.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[32] + ".png")));
        jButton34.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[33] + ".png")));
        jButton35.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[34] + ".png")));
        jButton36.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesD/" + numbers[35] + ".png")));
        cont=1;
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
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
        cont = 1;
    } 
    
    private void pregwin() {
        if (!jButton1.isEnabled() && !jButton2.isEnabled() && !jButton3.isEnabled() && !jButton4.isEnabled() && !jButton5.isEnabled() && !jButton6.isEnabled()
                && !jButton7.isEnabled() && !jButton8.isEnabled() && !jButton9.isEnabled() && !jButton10.isEnabled() && !jButton11.isEnabled()
                && !jButton12.isEnabled()&& !jButton13.isEnabled() && !jButton14.isEnabled() && !jButton15.isEnabled() && !jButton16.isEnabled()
                && !jButton17.isEnabled()&& !jButton18.isEnabled() && !jButton19.isEnabled() && !jButton20.isEnabled()&& !jButton21.isEnabled()
                && !jButton22.isEnabled()&& !jButton23.isEnabled()&& !jButton24.isEnabled()&& !jButton25.isEnabled()&& !jButton26.isEnabled()&& !jButton27.isEnabled()
                && !jButton28.isEnabled()&& !jButton29.isEnabled()&& !jButton30.isEnabled()&& !jButton31.isEnabled()&& !jButton32.isEnabled()&& !jButton33.isEnabled()
                && !jButton34.isEnabled()&& !jButton35.isEnabled()&& !jButton35.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: " + puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        REINICIAR = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusable(false);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setFocusable(false);
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setFocusable(false);
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusable(false);
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusable(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusable(false);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusable(false);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusable(false);
        jButton21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setFocusable(false);
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusable(false);
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusable(false);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusable(false);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusable(false);
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusable(false);
        jButton23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusable(false);
        jButton24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setFocusable(false);
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusable(false);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
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

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton33.setBorder(null);
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setFocusable(false);
        jButton33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton33MouseExited(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton32.setBorder(null);
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setFocusable(false);
        jButton32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton32MouseExited(evt);
            }
        });
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton34.setBorder(null);
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setFocusable(false);
        jButton34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton34MouseExited(evt);
            }
        });
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton36.setBorder(null);
        jButton36.setBorderPainted(false);
        jButton36.setContentAreaFilled(false);
        jButton36.setFocusable(false);
        jButton36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton36MouseExited(evt);
            }
        });
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setFocusable(false);
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton27MouseExited(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setFocusable(false);
        jButton35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton35MouseExited(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setFocusable(false);
        jButton29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton29MouseExited(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton31.setBorder(null);
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setFocusable(false);
        jButton31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton31MouseExited(evt);
            }
        });
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setFocusable(false);
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton28MouseExited(evt);
            }
        });
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setFocusable(false);
        jButton30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton30MouseExited(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setFocusable(false);
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton26MouseExited(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/null.jpg"))); // NOI18N
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setFocusable(false);
        jButton25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.jpg"))); // NOI18N
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton25MouseExited(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addGap(10, 10, 10)
                                .addComponent(jButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton24))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton8))
                    .addComponent(jButton34)
                    .addComponent(jButton27)
                    .addComponent(jButton33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton13)
                        .addComponent(jButton14))
                    .addComponent(jButton18)
                    .addComponent(jButton35)
                    .addComponent(jButton36)
                    .addComponent(jButton31))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22)
                    .addComponent(jButton21)
                    .addComponent(jButton20)
                    .addComponent(jButton19)
                    .addComponent(jButton28)
                    .addComponent(jButton30)
                    .addComponent(jButton32)
                    .addComponent(jButton29)
                    .addComponent(jButton23))
                .addGap(49, 49, 49))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIVEL 6");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JUEGO DE MEMORIA");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jProgressBar1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel3.setText("MOVIMIENTOS:");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TIEMPO:");

        jLabel5.setText("PUNTAJE:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        REINICIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reiniciar.png"))); // NOI18N
        REINICIAR.setText("jButton37");
        REINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REINICIARActionPerformed(evt);
            }
        });

        VOLVER.setText("VOLVER");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(REINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(VOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(REINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(VOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton1);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
        btnEnabled(jButton2);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            // TODO add your handling code here:
        btnEnabled(jButton3);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton4);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton5);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            // TODO add your handling code here:
        btnEnabled(jButton6);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
            // TODO add your handling code here:
        btnEnabled(jButton33);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton31);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton28);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton7);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton8);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton9);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton10);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton11);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton12);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton32);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton29);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton30);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton13);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton14);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton15);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton16);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton17);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton18);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton34);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton35);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton26);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton19);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton20);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton21);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton22);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton23);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton24);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton36);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton27);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        btnEnabled(jButton25);
        contarMovimiento();
        timer.start();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton33MouseExited

    private void jButton31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton31MouseExited

    private void jButton28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton28MouseExited

    private void jButton30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton30MouseExited

    private void jButton29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton29MouseExited

    private void jButton32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton32MouseExited

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton34MouseExited

    private void jButton35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton35MouseExited

    private void jButton26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton26MouseExited

    private void jButton25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton25MouseExited

    private void jButton27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton27MouseExited

    private void jButton36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton36MouseExited

    private void jButton24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton24MouseExited

    private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton23MouseExited

    private void jButton22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton22MouseExited

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
            // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        // TODO add your handling code here:
        compare(); 
    }//GEN-LAST:event_jButton19MouseExited

    private void REINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REINICIARActionPerformed
        // TODO add your handling code here:
        reiniciar ();
        timer.restart();
        timer.start();
    }//GEN-LAST:event_REINICIARActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                // TODO add your handling code here:
        timer = new Timer(150,new progreso());
        reiniciar();
        repaint();
    }//GEN-LAST:event_formWindowOpened

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frameNiveles fn = new frameNiveles();
        fn.setVisible(true);
    }//GEN-LAST:event_VOLVERActionPerformed

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
            java.util.logging.Logger.getLogger(frameNivel6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameNivel6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameNivel6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameNivel6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameNivel6().setVisible(true);
            }
        });
    }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REINICIAR;
    private javax.swing.JButton VOLVER;
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
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
private void contarMovimiento() {        
        jTextField1.setText(String.valueOf(cont++));
}

}
