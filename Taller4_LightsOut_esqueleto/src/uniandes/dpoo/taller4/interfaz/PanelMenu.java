package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelMenu extends JPanel implements ActionListener{

	private Pantalla padre;
	
	public PanelMenu(Pantalla padre) {
		
		this.padre = padre;
		
		setLayout(new GridLayout(9, 1));
				
		JLabel esp1 = new JLabel("");
		
		JButton nuevo = new JButton("NUEVO");
		nuevo.setBackground(Color.CYAN);
		
		JLabel esp2 = new JLabel("");
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.setBackground(Color.CYAN);
		
		JLabel esp3 = new JLabel("");
		
		JButton top10 = new JButton("TOP-10");
		top10.setBackground(Color.CYAN);
		
		JLabel esp4 = new JLabel("");
			
		JButton cambJug = new JButton("CAMBIAR JUGADOR");
		cambJug.setBackground(Color.CYAN);
		
		add(esp1);
		add(nuevo);
		add(esp2);
		add(reiniciar);
		add(esp3);
		add(top10);
		add(esp4);
		add(cambJug);
		
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		JOptionPane.showMessageDialog(padre, "Ha presionado el botón" + comando + "!");
		
	}

}
