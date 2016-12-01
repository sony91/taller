package Vista;

import java.awt.Graphics;

public interface Paintable {
	
	public abstract void paint(Graphics g);           // metodo grafico
	public abstract boolean update(int X, int Y);     // actualizacion de la  posicion del mause
	public abstract String getButton (int X, int Y);  // button updates.
	

}

