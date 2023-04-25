package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PanelStats extends JPanel implements ActionListener{
	
	private Pantalla padre;
	
	public PanelStats(Pantalla padre) {
		
		this.padre = padre;
		
		setLayout(new GridLayout(1, 4));
		
		
		JLabel jugadas = new JLabel("Jugadas:");
		jugadas.setBackground(Color.LIGHT_GRAY);
		jugadas.setOpaque(true);
		
		JTextField nJug = new JTextField("0");
		nJug.setBackground(Color.WHITE);
		nJug.setEditable(false);
		
		JLabel jugador = new JLabel("Jugador:");
		jugador.setBackground(Color.LIGHT_GRAY);
		jugador.setOpaque(true);
		
		JTextField nomJug = new JTextField("AAA");
		nomJug.setBackground(Color.WHITE);
		nomJug.setEditable(false);
		
		add(jugadas);
		add(nJug);
		add(jugador);
		add(nomJug);
		
		setVisible(true);
		setBackground(Color.WHITE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

}
