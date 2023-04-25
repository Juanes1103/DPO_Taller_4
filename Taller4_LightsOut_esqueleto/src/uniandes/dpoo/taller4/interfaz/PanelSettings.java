package uniandes.dpoo.taller4.interfaz;

import java.util.ArrayList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelSettings extends JPanel implements ActionListener{
	
	private Pantalla padre;
	
	public PanelSettings(Pantalla padre) {
		
		this.padre = padre;
		
		setLayout(new FlowLayout());
		
		JLabel tamano = new JLabel("Tamaño:");
		tamano.setBackground(Color.CYAN);
		tamano.setOpaque(true);
		
		//
		JComboBox<String> selTam = new JComboBox<String>();
		
		ArrayList<String> tamanos = new ArrayList<String>();
		tamanos.add("3x3");
		tamanos.add("5x5");
		tamanos.add("7x7");
		tamanos.add("9x9");
		tamanos.add("11x11");
		
		for(int i = 0; i<tamanos.size(); i++) {
			String el = tamanos.get(i);
			selTam.addItem(el);
		}
		//
		
		JLabel dificultad = new JLabel("Dificultad:");
		
		JRadioButton facil = new JRadioButton("Fácil");
		facil.setBackground(Color.CYAN);
		
		JRadioButton medio = new JRadioButton("Medio");
		medio.setBackground(Color.CYAN);
		
		JRadioButton dificil = new JRadioButton("Dificil");
		dificil.setBackground(Color.CYAN);
		
		add(tamano);
		add(selTam);
		add(dificultad);
		add(facil);
		add(medio);
		add(dificil);
		
		setVisible(true);
		setBackground(Color.CYAN);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String comando = e.getActionCommand();
		String[] pt = comando.split("x");
		int fila = Integer.parseInt(pt[0]);
		int columna = Integer.parseInt(pt[1]);
		
//		padre.jugar(fila, columna);
		
	}

}
