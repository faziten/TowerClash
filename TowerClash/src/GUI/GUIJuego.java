package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Rectangle;
import img.*;

public class GUIJuego extends JFrame implements Runnable{
	private static final String cardSource= "/img/cards/";
	private static final String objectSource="/img/objetos/";
	private static final String commonExt=".png";
	private JFrame frame;
	GUI g;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //EDT EVENT DISPATCH THREAD
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIJuego window = new GUIJuego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIJuego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 50, 965, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//------------------------------------------------------------------PANEL CARTAS---------------------------------------------
		JPanel Cartas = new JPanel();
		Cartas.setBackground(Color.LIGHT_GRAY);
		Cartas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Cartas.setBounds(0, 0, 216, 504);
		Cartas.setLayout(null);
		frame.getContentPane().add(Cartas);
		
		
		//ALIADOS
			JButton btnAliado1 = new JButton("");
			btnAliado1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnAliado1.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"caballero"+commonExt)));
			//btnAliado1.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/caballero.png")));
			btnAliado1.setBounds(29, 11, 71, 88);
			Cartas.add(btnAliado1);
			//Borrado de del boton
		//	btnEstructura5.setBorderPainted(false);
			btnAliado1.setContentAreaFilled(false);
			btnAliado1.setOpaque(true);
			
			
			JButton btnAliado2 = new JButton("");
			btnAliado2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			btnAliado2.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"arquera"+commonExt)));
			//btnAliado2.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/arquera.png")));
			btnAliado2.setBounds(29, 110, 71, 88);
			Cartas.add(btnAliado2);
			//Borrado de del boton
			btnAliado2.setContentAreaFilled(false);
			btnAliado2.setOpaque(true);
			
			
			JButton btnAliado3 = new JButton("");
			btnAliado3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAliado3.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"valquiria"+commonExt)));
			//btnAliado3.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/valquiria.png")));
			btnAliado3.setBounds(29, 209, 71, 88);
			Cartas.add(btnAliado3);
			//Borrado de del boton
			btnAliado3.setContentAreaFilled(false);
			btnAliado3.setOpaque(true);
			
			
			JButton btnAliado4 = new JButton("");
			btnAliado4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAliado4.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"mago"+commonExt)));
			//btnAliado4.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/mago.png")));
			btnAliado4.setBounds(29, 308, 71, 88);
			Cartas.add(btnAliado4);
			//Borrado de del boton
			btnAliado4.setContentAreaFilled(false);
			btnAliado4.setOpaque(true);
			
			
			JButton btnAliado5 = new JButton("");
			btnAliado5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAliado5.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"megacaballero"+commonExt)));
			//btnAliado5.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/megacaballero.png")));
			btnAliado5.setBounds(29, 407, 71, 88);
			Cartas.add(btnAliado5);
			//Borrado de del boton
			btnAliado5.setContentAreaFilled(false);
			btnAliado5.setOpaque(true);
		
		
		//ESTRUCTURAS
			JButton btnEstructura1 = new JButton("");
			btnEstructura1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEstructura1.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"choza"+commonExt)));
			//btnEstructura1.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/choza.png")));
			btnEstructura1.setBounds(110, 11, 71, 88);
			Cartas.add(btnEstructura1);
			//Borrado de del boton
			btnEstructura1.setContentAreaFilled(false);
			btnEstructura1.setOpaque(true);
			
			
			JButton btnEstructura2 = new JButton("");
			btnEstructura2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEstructura2.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"infernal"+commonExt)));
			//btnEstructura2.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/infernal.png")));
			btnEstructura2.setBounds(110, 209, 71, 88);
			Cartas.add(btnEstructura2);
			//Borrado de del boton
			btnEstructura2.setContentAreaFilled(false);
			btnEstructura2.setOpaque(true);
			
			
			JButton btnEstructura3 = new JButton("");
			btnEstructura3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEstructura3.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"canon"+commonExt)));
			//btnEstructura3.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/canon.png")));
			btnEstructura3.setBounds(110, 110, 71, 88);
			Cartas.add(btnEstructura3);
			//Borrado de del boton
			btnEstructura3.setContentAreaFilled(false);
			btnEstructura3.setOpaque(true);
			
			
			JButton btnEstructura4 = new JButton("");
			btnEstructura4.setBounds(110, 308, 71, 88);
			Cartas.add(btnEstructura4);
			//Borrado de del boton
			btnEstructura4.setContentAreaFilled(false);
			btnEstructura4.setOpaque(true);
			
			
			JButton btnEstructura5 = new JButton("");
			btnEstructura5.setBounds(110, 407, 71, 88);
			Cartas.add(btnEstructura5);
			//Borrado de del boton
			btnEstructura5.setContentAreaFilled(false);
			btnEstructura5.setOpaque(true);
			
		

		//------------------------------------------------------------------/PANEL CARTAS---------------------------------------------
		
		
		//------------------------------------------------------------------PANEL OBJETOS--------------------------------------------
		JPanel Objetos = new JPanel();
		Objetos.setBackground(Color.GRAY);
		Objetos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Objetos.setBounds(727, 0, 222, 513);
		frame.getContentPane().add(Objetos);
		Objetos.setLayout(null);
		
		JLabel lblObjetos = new JLabel("Objetos: ");
		lblObjetos.setBounds(10, 11, 53, 14);
		Objetos.add(lblObjetos);
		
		
		
		RoundButton misil= new RoundButton();
		misil.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"Cohete"+commonExt)));
		//misil.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/objetos/Cohete.png")));
		misil.setBounds(50, 369, 100, 100);
		Objetos.add(misil);
		
		RoundButton bola_fuego= new RoundButton();
		bola_fuego.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"Bola_fuego"+commonExt)));
		//bola_fuego.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/objetos/Bola_fuego.png")));
		bola_fuego.setBounds(50, 258, 100, 100);
		Objetos.add(bola_fuego);
		
		RoundButton globo= new RoundButton();
		globo.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"globo"+commonExt)));
		//globo.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/objetos/globo.png")));
		globo.setBounds(50, 147, 100, 100);
		Objetos.add(globo);
		
		RoundButton golem= new RoundButton();
		golem.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"golem"+commonExt)));
		golem.setBounds(50, 36, 100, 100);
		Objetos.add(golem);
		
		//------------------------------------------------------------------/PANEL OBJETOS--------------------------------------------
		
		JPanel Juego = new JPanel();
		Juego.setBounds(216, 0, 512, 512);
		Juego.setLayout(null);
		g= new GUI();
		g.setBounds(new Rectangle(0, 0, 512, 512));
		Juego.add(g);
		g.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		/*
		GraPan g= new GraPan();
		g.setBounds(new Rectangle(0, 0, 512, 512));
		Juego.add(g);
		g.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
		frame.getContentPane().add(Juego);
				
		
		}

	public synchronized void run() {
		while(true){
			g.run();
			repaint();
		}
	}
}