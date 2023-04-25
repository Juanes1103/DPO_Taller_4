package uniandes.dpoo.taller4.interfaz;
import uniandes.dpoo.taller4.modelo.Tablero;

import java.awt.*;
import javax.swing.*;


public class Pantalla extends JFrame{
	
	private Tablero modelo;
	
	private int tam = 5;
	
	private PanelTablero panelTablero;
	private PanelSettings panelSettings;
	private PanelMenu panelMenu;
	private PanelStats panelStats;
	
	public Pantalla() {
		
		setLayout(new BorderLayout());
		
		panelTablero = new PanelTablero(this, tam);
		add(panelTablero, BorderLayout.CENTER);
		
		panelSettings = new PanelSettings(this);
		add(panelSettings, BorderLayout.NORTH);
		
		panelMenu = new PanelMenu(this);
		add(panelMenu, BorderLayout.EAST);
		
		panelStats = new PanelStats(this);
		add(panelStats, BorderLayout.SOUTH);
		
		
		
//		Caracteristicas de la Ventana
		setTitle("LightsOut");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 750);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	public void jugar(int filas, int columnas) {
		
		
	}
	

	public static void main(String[] args) {
		new Pantalla();
		

	}

}
