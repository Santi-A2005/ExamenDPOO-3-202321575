package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Izquierda;

public class ventanaMain extends JFrame implements ActionListener{
	
	boolean VF;
	JTextField rojo;
	JTextField azul;
	JTextField verde;
	private static final String CIRCULO = "Círculo";
	private static final String CUADRADO = "Cuadrado";
	JButton circ;
	JButton cuadr;
	JLabel dibujo;
	int roj;
	int verd;
	int azu;
	
	public ventanaMain() {
		this.setTitle("Parcial de Santiago Álvarez Ramírez");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(900, 700);
		this.setLocationRelativeTo( null );
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		JPanel detallesRes = new JPanel();
    	detallesRes.setLayout(new GridLayout(8, 2));
    	detallesRes.setSize(100, 200);
		rojo = new JTextField();
		JLabel r = new JLabel("R");
		detallesRes.add(r);
		detallesRes.add(rojo);
		JLabel v = new JLabel("G");
		verde = new JTextField();
		detallesRes.add(v);
		detallesRes.add(verde);
		JLabel a = new JLabel("B");
		azul = new JTextField();
		detallesRes.add(a);
		detallesRes.add(azul);
		this.add(detallesRes, BorderLayout.WEST);
		JLabel vacio = new JLabel("");
		circ = new JButton("Circulo");
		circ.setActionCommand(CIRCULO);
		cuadr = new JButton("Cuadrado");
		cuadr.setActionCommand(CUADRADO);
		circ.setSize(20, 30);
		detallesRes.add(cuadr);
		detallesRes.add(circ);
		detallesRes.add(vacio);
		detallesRes.add(vacio);
		dibujo = new JLabel();
		this.add(dibujo, BorderLayout.CENTER);
		VF = false;
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ventanaMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if(comando.equals(CIRCULO)) {
			VF = true;
			this.repaint();
		}else if (comando.equals(CUADRADO)) {
			VF = false;
			this.repaint();
		}
	}
	
	public void paint(Graphics g) {
		numeros();
		Color col = new Color(roj, verd, azu);
		
		super.paint( g );
        Graphics2D g2d = ( Graphics2D )g;
        g2d.setColor(col);
        if(VF = true) {
        	g2d.fillOval(350, 100, 500, 500);}
        else if (VF = false) {
        	g2d.fillRect(40, 40, 40, 40);
        }
        
		
	}
	public void numeros() {
		try {
			roj = Integer.parseInt(rojo.getText());
			verd = Integer.parseInt(verde.getText());
			azu = Integer.parseInt(azul.getText());
		} catch (NumberFormatException e) {
			roj = 100;
			verd = 100;
			azu = 100 ;
		} catch (Exception e) {
			;
		}

	}
}
