package Vista;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Boton {
	private final int X1, X2, Y1, Y2;
	private BufferedImage idleBoton;
	private BufferedImage botonSeleccionado;
	private final String ValorBoton;
	
	
	//Retorna true si la imagen no es encontrada.
	public Boton (String fileName, String ValorBoton, int x1, int y1) {
		this.X1 = x1;
		this.Y1 = y1;
		this.ValorBoton = ValorBoton;
		InputStream is;

		
		try {
			is = this.getClass().getClassLoader().getResourceAsStream("images/"+fileName + ".png"); 
			idleBoton = ImageIO.read(is);
			is = this.getClass().getClassLoader().getResourceAsStream("images/"+fileName + "select.png"); 
			botonSeleccionado = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
			idleBoton = null; 
			botonSeleccionado = null;
		}
		
		this.Y2 = Y1 + idleBoton.getHeight();
		this.X2 = X1 + idleBoton.getWidth();
	}
	
	// boton constructor para la clase boton dentro del objeto boton.
	public Boton (int width, String fileName, String ValorBoton, int y1) {

		this.Y1 = y1;
		this.ValorBoton = ValorBoton;
		InputStream is;
		
		try {
			is = this.getClass().getClassLoader().getResourceAsStream("imagenes/"+fileName + ".png"); 
			idleBoton = ImageIO.read(is);
			is = this.getClass().getClassLoader().getResourceAsStream("imagenes/"+fileName + "select.png"); 
			botonSeleccionado = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
			idleBoton = null; 
			botonSeleccionado = null;
		}
		this.X1 = ((width-idleBoton.getWidth())/2);
		this.Y2 = Y1 + idleBoton.getHeight();
		this.X2 = X1 + idleBoton.getWidth();

	}
	
	// creacion de un boton desde un filename.
	public Boton (String fileName) {
		this.X1 = 0;
		this.Y1 = 0;
		this.Y2 = 0;
		this.X2 = 0;
		this.ValorBoton = null;
		InputStream is;
		
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(fileName + ".png"); 
			idleBoton = ImageIO.read(is);
			botonSeleccionado = idleBoton;	
		} catch (IOException e) {
			e.printStackTrace();
			idleBoton = null; 
			botonSeleccionado = null;
		}
	}
	

	// metodo para divujar un boron, x/y esta la posicion del mouse.
	public void paint (Graphics2D g2d, int X, int Y){
		if(isInside(X,Y)){
			g2d.drawImage(botonSeleccionado, null, X1, Y1);
		} else {
			g2d.drawImage(idleBoton, null, X1, Y1);
		}
	}
	
	// pintar el boton en sus coordenadas.
	public void paint (Graphics2D g2d){
		g2d.drawImage(idleBoton, null, X1, Y1);
	}
	
	public void paintIdle (Graphics2D g2d){
		g2d.drawImage(idleBoton, null, X1, Y1);
	}
	
	public void paintSelected (Graphics2D g2d){
		g2d.drawImage(botonSeleccionado, null, X1, Y1);
	}
	
	
	public BufferedImage getIdleImage(){
		return idleBoton;
	}
	public BufferedImage getSelectedImage(){
		return botonSeleccionado;
	}
	
	public int getX(){
		return X1;
	}
	public int getY(){
		return Y1;
	}
	
	public String getValue(){
		return ValorBoton;
	}
	
	// retorna si las coordenadas coinciden en la recta.
	public boolean isInside (int X, int Y){
		if (X >= X1 && X <= X2 && Y >= Y1 && Y <= Y2){
			return true;
		} else {
			return false;
		}
	}

}

