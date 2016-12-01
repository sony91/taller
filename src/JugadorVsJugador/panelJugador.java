package JugadorVsJugador;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JButton;

/**
 *
 * @author LEGOLAS
 */
public class panelJugador extends javax.swing.JPanel implements ComponentListener{
    
    //inicializamos el arreglo que contendra los botones
    private JButton [][] tabBotones = null;
    private int numFilas = 10;
    private int numColumnas = 10;
    

    public panelJugador() {
        initComponents();
        this.setLayout(null);//new FlowLayout()); //que conos ara pero hace que aparescan los botones
        this.setBackground(Color.WHITE);//asigna un fondo al panel
        
        //conecta los eventos del panel con el mismo panel
        this.addComponentListener(this);
    }
    
    // metodo para inicializar la estructura con los botones, nos 
    // permite parametrizar el numfilas numcol, para modificarlo despues
    public void inicializar(){
        tabBotones = new JButton[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {         //filas
            for (int j = 0; j < numColumnas; j++) {  //columnas
                JButton temp = new JButton();        //asignamos un boton temp
                temp.setText("(" + i + "," + j + ")");
                this.add(temp);                      //anadimos temp 
                tabBotones[i][j] = temp;             //en cada casilla de la matriz
            }
        }
    }
    
    public void ordenar(){
        int anchoTotal = this.getWidth();
        int altoTotal = this.getHeight();
        int anchoCasilla = anchoTotal/numFilas;
        int altoCasilla = altoTotal/numColumnas;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                JButton temp = tabBotones[i][j];//obtenemos la referencia del boton actual
                //fijar cada casilla a una posicion y tamanio en funcion a su fila y columna
                temp.setBounds(j*anchoCasilla, i*altoCasilla, anchoCasilla, altoCasilla);
                
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void componentResized(ComponentEvent ce) {
        //concretamente vamos a hacer uso del metodo componentRisized, de la interface ComponentListener
        //solo invocamos al metodo que acomoda los botones
        ordenar();
    }
    
    /*
        hacemos uso de un evento para el "risize" del panel, con el metodo acomodar del tablero,
        permite que los botones se ajusten en respuesta a eventos de cambio de tamanio
        "implements ComponetListener"
    */
    @Override
    public void componentMoved(ComponentEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentShown(ComponentEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //metodo que nos permite reacionar al click en cada una de las casillas
    //para esto usaremos ActionListener, permite aceptat eventos de tipo 
    //ActionEvent los cuales son producidos por los botones
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
