package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PanelTablero extends JPanel implements ActionListener{
	
	@SuppressWarnings("unused")
	
	private Pantalla padre;
	
	public PanelTablero(Pantalla padre, int tam) {
		
		this.padre = padre;
		
//		paint(null);
		
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setBackground(Color.BLACK);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
