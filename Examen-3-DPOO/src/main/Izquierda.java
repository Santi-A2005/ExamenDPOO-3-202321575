package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Izquierda extends JPanel implements ActionListener {
	
	JTextField rojo;
	JTextField azul;
	JTextField verde;
	private static final String CIRCULO = "Círculo";
	private static final String CUADRADO = "Cuadrado";
	JButton circ;
	JButton cuadr;
	public Izquierda() {
		JPanel detallesRes = new JPanel();
    	detallesRes.setLayout(new GridLayout(3, 2));
		rojo = new JTextField(5);
		JLabel r = new JLabel("r");
		detallesRes.add(r);
		detallesRes.add(rojo);
		JLabel a = new JLabel("a");
		azul = new JTextField(5);
		detallesRes.add(a);
		detallesRes.add(azul);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
