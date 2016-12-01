package Vista;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class MenuPausa implements Paintable {
	
	private ArrayList<Boton> botones = new ArrayList<Boton>();
	private int width, height;
	private int X,Y;
        
        
	
	public MenuPausa (int width, int height){  //constructor para las diferentes opciones del menu.
		this.width = width;
		this.height = height;
		//anadimos los botones que se muestran al precionar el boton pausa.
		int placmentY = Math.round(height / 2 - (400 / 2) - 40);
		botones.add(new Boton(this.width, "KeepPlay", "Keep Play", placmentY));
		placmentY+= 80;
		botones.add(new Boton(this.width, "MainMenu", "Main Menu", placmentY));
		placmentY+= 80;
		botones.add(new Boton(this.width, "HowToPlay", "How To Play", placmentY));
		placmentY+= 160;
		botones.add(new Boton(this.width, "Quit", "Quit", placmentY));
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		
		AlphaComposite ac = AlphaComposite.getInstance(
				AlphaComposite.SRC_OVER, 0.5f);
		g2d.setComposite(ac);
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(0, 0, width, height);
		ac = AlphaComposite.getInstance(
				AlphaComposite.SRC_OVER, 1.0f);
		g2d.setComposite(ac);
		
		for (int i = 0; i < botones.size(); i++) { 
			botones.get(i).paint(g2d, X, Y);
		}
		g2d.dispose();

	}

	@Override
	public boolean update(int X, int Y) {
		this.X = X;
		this.Y = Y;
		return false;
	}

	@Override
	public String getButton(int X, int Y) {
		for (int i = 0; i < botones.size(); i++) {
			if(botones.get(i).isInside(X, Y)){
				return botones.get(i).getValue();
			}
		}
		return null;
	}



}
