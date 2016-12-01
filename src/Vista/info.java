package Vista;

import GUI.frameInformacion;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LEGOLAS
 */
public class info {

    public info() {
    }
    
    
    public void quienesSomos() {
         //para hacer exepciones
        try {
          //"Icon" ya viene con java   FORMA DE LLAMAR UNA IMAGEN 
            Icon icon = new ImageIcon(getClass().getResource("/imagenes/info.png"));
          //nomClass.nomVar.       (var icon);   AL LABEL LE ASIGNAMOS EL ICONO
            frameInformacion.icono.setIcon(icon);    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error...!!" + e);
        }
    }
}
