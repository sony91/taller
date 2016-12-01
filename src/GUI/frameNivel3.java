package GUI;

import Vista.LogicaJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author Ariel
 */
public class frameNivel3 extends javax.swing.JFrame {

    private LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public frameNivel3() {
        this.setUndecorated(true);//eliminar barra superior
        initComponents(); 
        
        setCards();
        this.setSize(this.getToolkit().getScreenSize()); 
        
         ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/panel3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    public class progreso implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            int n = jProgressBar1.getValue();

            if (n < 100) {
                n++;
                jProgressBar1.setValue(n);
            } else {
                timer.stop();
                JOptionPane.showMessageDialog(null, "se acabo el tiempo");
            }
        }
    }
    
    private void setCards(){
        int[] numbers = log.getCardNumbers20();
        
        btn1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[0]+".png")));
        btn2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[1]+".png")));
        btn3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[2]+".png")));
        btn4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[3]+".png")));
        btn5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[4]+".png")));
        btn6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[5]+".png")));
        btn7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[6]+".png")));
        btn8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[7]+".png")));
        btn9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[8]+".png")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[9]+".png")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[10]+".png")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[11]+".png")));
        btn13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[12]+".png")));
        btn14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[13]+".png")));
        btn15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[14]+".png")));
        btn16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[15]+".png")));
        btn17.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[16]+".png")));
        btn18.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[17]+".png")));
        btn19.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[18]+".png")));
        btn20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenesN3/a"+numbers[19]+".png")));
    }
    
    private void btnEnabled(JButton btn){
    
        if(!caraUp){
            btn.setEnabled(false);
            im1 = (ImageIcon)btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else{
            btn.setEnabled(false);
            im2 = (ImageIcon)btn.getDisabledIcon();
            pbtn[1]= btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }
    private void compare(){
        if(caraUp && primerc){
        
            if(im1.getDescription().compareTo(im2.getDescription()) !=0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10) puntaje -= 10;
            
            }
            caraUp = false;
        }
    }
    private void reinicio(){
    
        jProgressBar1.setValue(0);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        btn17.setEnabled(true);
        btn18.setEnabled(true);
        btn19.setEnabled(true);
        btn20.setEnabled(true);
        
        caraUp = false;
        primerc = false;
        puntaje = 0;
    
    }
    private void pregwin(){
        if(!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() && !btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() && 
           !btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled() && !btn10.isEnabled() && !btn11.isEnabled() && !btn12.isEnabled() && 
           !btn13.isEnabled() && !btn14.isEnabled() && !btn15.isEnabled() && !btn16.isEnabled() && !btn17.isEnabled() && !btn18.isEnabled() && 
           !btn19.isEnabled() && !btn20.isEnabled()){
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: "+puntaje,"Win!!",JOptionPane.INFORMATION_MESSAGE);
        
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btnreinicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("        NIVEL 3");

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setFocusable(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setFocusable(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setFocusable(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setFocusable(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusable(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setFocusable(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setFocusable(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn10.setBorder(null);
        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.setFocusable(false);
        btn10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn11.setBorder(null);
        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.setFocusable(false);
        btn11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn12.setBorder(null);
        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.setFocusable(false);
        btn12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn13.setBorder(null);
        btn13.setBorderPainted(false);
        btn13.setContentAreaFilled(false);
        btn13.setFocusable(false);
        btn13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn13MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn14.setBorder(null);
        btn14.setBorderPainted(false);
        btn14.setContentAreaFilled(false);
        btn14.setFocusable(false);
        btn14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn14MouseExited(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn15.setBorder(null);
        btn15.setBorderPainted(false);
        btn15.setContentAreaFilled(false);
        btn15.setFocusable(false);
        btn15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn15MouseExited(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn16.setBorder(null);
        btn16.setBorderPainted(false);
        btn16.setContentAreaFilled(false);
        btn16.setFocusable(false);
        btn16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn16MouseExited(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn17.setBorder(null);
        btn17.setBorderPainted(false);
        btn17.setContentAreaFilled(false);
        btn17.setFocusable(false);
        btn17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn17MouseExited(evt);
            }
        });
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn18.setBorder(null);
        btn18.setBorderPainted(false);
        btn18.setContentAreaFilled(false);
        btn18.setFocusable(false);
        btn18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn18MouseExited(evt);
            }
        });
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn19.setBorder(null);
        btn19.setBorderPainted(false);
        btn19.setContentAreaFilled(false);
        btn19.setFocusable(false);
        btn19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn19MouseExited(evt);
            }
        });
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back.png"))); // NOI18N
        btn20.setBorder(null);
        btn20.setBorderPainted(false);
        btn20.setContentAreaFilled(false);
        btn20.setFocusable(false);
        btn20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesN3/back2.png"))); // NOI18N
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn20MouseExited(evt);
            }
        });
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btnreinicio.setText("REINICIAR");
        btnreinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreinicioActionPerformed(evt);
            }
        });

        jLabel2.setText("TIEMPO");

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn11, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btn16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn7)
                                        .addComponent(btn12))
                                    .addComponent(btn17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn13, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btn18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn14, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(btn19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn10)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn15)
                                            .addComponent(btn20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnreinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(103, 103, 103)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn8)
                                .addComponent(btn9)
                                .addComponent(btn10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn11)
                            .addComponent(btn12)
                            .addComponent(btn13)
                            .addComponent(btn14)
                            .addComponent(btn15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn16)
                            .addComponent(btn17)
                            .addComponent(btn18)
                            .addComponent(btn19)
                            .addComponent(btn20))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btnEnabled(btn1);
        timer.start();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btnEnabled(btn2);
        timer.start();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btnEnabled(btn3);
        timer.start();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btnEnabled(btn4);
        timer.start();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btnEnabled(btn5);
        timer.start();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btnEnabled(btn6);
        timer.start();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btnEnabled(btn7);
        timer.start();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btnEnabled(btn8);
        timer.start();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btnEnabled(btn9);
        timer.start();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btnEnabled(btn10);
        timer.start();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btnEnabled(btn11);
        timer.start();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        btnEnabled(btn12);
        timer.start();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        btnEnabled(btn13);
        timer.start();
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btnEnabled(btn14);
        timer.start();
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btnEnabled(btn15);
        timer.start();
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        btnEnabled(btn16);
        timer.start();
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        btnEnabled(btn17);
        timer.start();
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        btnEnabled(btn18);
        timer.start();
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        btnEnabled(btn19);
        timer.start();
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        btnEnabled(btn20);
        timer.start();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn9MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn12MouseExited

    private void btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn13MouseExited

    private void btn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn14MouseExited

    private void btn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn15MouseExited

    private void btn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn16MouseExited

    private void btn17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn17MouseExited

    private void btn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn18MouseExited

    private void btn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn19MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn19MouseExited

    private void btn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn20MouseExited

    private void btnreinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreinicioActionPerformed
        reinicio();
    }//GEN-LAST:event_btnreinicioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(180, new frameNivel3.progreso());
        reinicio();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frameNiveles fn = new frameNiveles();
        fn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frameNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameNivel3().setVisible(true);
            }
        });
    }
    private Timer timer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnreinicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
