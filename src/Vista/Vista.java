package Vista;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

//import Controlador.Controlador;
//import Controlador.MemorySerializer;
//import model.Cartas;
//import model.Memoria;
 
public class Vista extends JPanel {
	private static final long serialVersionUID = 1L;
	//private Parallax parallax;
	//private MenuPrincipal menuPrincipal;
	//private VerCartas verCartas;
	//private ComoJugar howToPlay;
	private MenuPausa pauseMenu;
	//private TablaPuntucaion highScore;
	//private Memoria memoria;
	private Timer tiempo;
	private ArrayList<Paintable> toPaint = new ArrayList<Paintable>();
	private int x = 0, y = 0;
	//private Controlador controller;

	public Vista(JFrame frame, Dimension screenSize) {
		super();
		// Crea el modelo de la memoria del juego.
	//	this.memoria = new Memoria();

		// configura las opcione del panel.
		this.setPreferredSize(screenSize);
		this.setSize(screenSize);
		this.setFocusable(true);

		// crea algunas vistas.
	//	this.verCartas = new VerCartas(screenSize.width, screenSize.height, memoria);
	//	this.howToPlay = new ComoJugar(screenSize.width, screenSize.height);
	//	this.highScore = new TablaPuntucaion(screenSize.width, screenSize.height);
		;

		// crea y anade el paralelaje de fondo,
	//	parallax = new Parallax(screenSize.width, screenSize.height);
	//	toPaint.add(parallax);

		// Inicializa el menu principal
	//	menuPrincipal = new MenuPrincipal(screenSize.width, screenSize.height);
	//	toPaint.add(menuPrincipal);

		// crea el munu pausa en el juego, desde el boton pausa o la tecla ESC .
		pauseMenu = new MenuPausa(screenSize.width, screenSize.height);

		// crea el controlador, configura los eventos del mouse para el controlador.
	//	controller = new Controlador(this, memoria);
	//	this.addMouseMotionListener(controller);
	//	this.addMouseListener(controller);
	//	this.addKeyListener(controller);

		// configura un nuevo cursor para el mouse.
		InputStream is;
		is = this.getClass().getClassLoader()
				.getResourceAsStream("images/hwcursor.gif");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = null;
		try {
			image = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Point pointer = new Point(0, 0);
		Cursor cursor = toolkit.createCustomCursor(image, pointer,
				"halloween-cursor");
		setCursor(cursor);

		// create a controller for updating the view every 1000/FPS ms.
		this.update();
	//	tiempo = new Timer(Math.round(1000 / FPS), controller);
		tiempo.start();

		// play ambient sound. //TODO add mute option.
		/*
		 * try { AmbientAudio.Play(this); //Getting errors on Linux systems }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
	}

	// actualiza el modelo de memoria, usado para resumir el estado de juego.
//	public void setMemoria(Memoria memoria) {
//		this.memoria = memoria;
//	}

	// esconde el verCartas.
//	public void cerrarJuego() {
//		toPaint.remove(verCartas);
//	}

	// muestra el verCartas
	public void openGame() { // openGame
//		verCartas.reset();
//		if (!toPaint.contains(verCartas))
//			toPaint.add(verCartas);
		update(this.x, this.y);
	}

	// muestra el como jugar
	public void showHowToPlay() {
//		if (!toPaint.contains(howToPlay))
//			toPaint.add(howToPlay);
	}

	// esconde el como jugar
	public void hideHowToPlay() {
//		toPaint.remove(howToPlay);
	}

	// muestra el  menu principal.
	public void showMainMenu() {
//		if (!toPaint.contains(menuPrincipal))
//			toPaint.add(menuPrincipal);
		update(this.x, this.y);
	}

	// cierra el menu principal.
	public void closeMainMenu() {
//		toPaint.remove(menuPrincipal);
		update(this.x, this.y);
	}

	// muestra la tabla de puntuacion.
	public void showHighScore() {
//		highScore.clearWinner();
//		if (!toPaint.contains(highScore))
//			toPaint.add(highScore);
	}

	//cierra la tabla de puntuacion.
	public void closeHighScore() {
//		toPaint.remove(highScore);
	}

	public String getButton(int X, int Y) {
		// TODO, mostraria todas las capasde las imagenes.
		return toPaint.get((toPaint.size() - 1)).getButton(X, Y);
	}

	public void togglePause() {
		if (toPaint.get(toPaint.size() - 1) instanceof MenuPausa) {
			toPaint.remove(pauseMenu);
//		} else if (toPaint.get(toPaint.size() - 1) instanceof MenuPrincipal) {
			// Do nothing
		} else {
			toPaint.add(pauseMenu);
		}
	}

	// llama al metodo actualizar de vista.java y anade en toPaint.
	public void update(int x, int y) {
		this.x = x;
		this.y = y;
		for (int i = 0; i < toPaint.size(); i++) {
			if (toPaint.get(i).update(x, y)) {
				toPaint.remove(i);
				i--;
			}
		}
		repaint();
	}

	// actualiza la vista.
	public void update() {
		update(this.x, this.y);
	}

	// un par ha sido selecionanado, y la notifica.
	public void parSeleccionado() {
//		verCartas.parSeleccionado();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < toPaint.size(); i++) {
			toPaint.get(i).paint(g);
		}
	}

	// controlador pregunta si una carta fue exitosa para el evento de uin click.
//	public Cartas mouseDown(int x, int y) {
//		Cartas card = null;
//		if (toPaint.get(toPaint.size() - 1).equals(verCartas))
//			card = verCartas.mouseDown(x, y);
//		return card;
//	}

	// esconde el menu pausa.
	public void hidePauseMenu() {
		toPaint.remove(pauseMenu);
	}

	// revisa si el juego es finalizaado, llama al tiempo desde tiempo.
//	public void gameFinished() {
//		if (toPaint.contains(verCartas)) {
//			if (verCartas.finalizado()) {
//				// si la vista del juego reporta finalizado, muestra la tabla de puntuacion.
//				toPaint.remove(verCartas);
//				showHighScore();
//				highScore.updateHighScore(memoria.getPlayerNames()[0],
//						memoria.getScoring()[0]);
//				highScore.updateHighScore(memoria.getPlayerNames()[1],
//						memoria.getScoring()[1]);
//				highScore.setWinner(memoria.winnerName(), memoria.winnerScore());
//				System.out.println("Winner Is: " + memoria.winnerName());
//			}
//		}
//	}

	// almacena el estado del juego desde el archivo file para continuar con el juego.
	public void storeGameState() {
//		MemorySerializer.storeGameState(memoria);
	}

	// carga el estdo del juego desde el archivo file y actualiza la memoria.
//	public boolean loadGameState() {
//		if ((memoria = MemorySerializer.cargarEstadoJuego()) != null) { //loadGameState
//			controller.setMemoria(memoria);
//			verCartas.setMemoria(memoria);
//			return true;
//		} else
//			return false;
//	}

	//private static final int FPS = 60;

}


