
package main;

import GUI.ventanaPrincipal;
import Vista.audio;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGOLAS
 */
public class main {

    
    public static void main(String[] args) {
       
        //audio rep = new audio();
        //rep.reproducir();
        
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setTitle("DemoTallerDeProgramacion");
        
				
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		if ((screenSize.getWidth() < 1024 || screenSize.getWidth() > 2770)
				|| (screenSize.getHeight() < 720
						|| screenSize.getHeight() > 1600))
			JOptionPane.showMessageDialog(ventana,
					"Resolution [" + Math.round(screenSize.getWidth()) + "x"
							+ Math.round(screenSize.getHeight())
							+ "] No Soportado!\r\n"
							+ "Requires [720x720] to [720x720].",
					"Resolucion Error!", JOptionPane.ERROR_MESSAGE);
		else {
			//ventana.setUndecorated(true);
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ventana.setExtendedState(ventanaPrincipal.MAXIMIZED_BOTH);  //JFrame
			//ventana.getContentPane().setBackground(new Color(0, 0, 0)); fonfo negro
			ventana.setVisible(true);
			//ventanaPrincipal view = new ventanaPrincipal();//frame, screenSize);
			//ventana.getContentPane().add(view);
			
		}
	}
                
  }
    
