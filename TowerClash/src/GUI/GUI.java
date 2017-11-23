package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

import Mapa.*;
import Unidades.Enemigo;

public class GUI {
	
	protected static GUI game;
	private static JFrame frame; 
	
	private static final String cardSource= "/img/cards/";
	private static final String commonExt= ".png";
	
	//PANELES
	private JPanel cartas;
	private JPanel objetos;
	
	//Labels Informacion
	private JLabel puntaje;
	private JLabel monedas;
	private JLabel labelInfo;
	private JTextField textInfo;
	
	//Botones de cartas
	private JButton btnCaballero;
	private JButton btnArquera;
	private JButton btnValquiria;
	private JButton btnMago;
	private JButton btnMegacaballero;
	
	
	//Logica
	private Jugador miJugador;
	private Mapa mapaLogica;
	private CreadorElementosComprables creador;
	private int creado=0;
	
	
	public GUI(){

		frame= new JFrame();
		frame.setBounds(75, 50, 1045, 550);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		//Mi jugador y mi mapa

		miJugador.crearHilos();

		iniciarMapa();
	
		iniciarPanelAliados();
		
		iniciarPanelObjetos();
		
	}
	
	public void iniciarMapa(){
		cantColumnas= mapaLogica.getLargo();
		cantFilas= mapaLogica.getAncho();
		panelJuego= new JPanel();
		frame.getContentPane().add(panelJuego);
		etiqueta= new JLabel();
		panelJuego.setLayout(null);
		panelJuego.setBackground(Color.BLUE);
		panelJuego.setBounds(160,0, 750, 450);
		int x=0;
		int y=0;
		for(int i=0;i<cantFilas;i++)
		{
			for(int j=0;j<cantColumnas;j++)
			{		
					etiqueta= new JLabel();
					etiqueta.setBounds(x,y,75,75);
					panelJuego.add(etiqueta);
					x+=75;
			}
			x=0;
			y+=75;
		}
		panelJuego.addMouseListener(new OyenteMouse());
		
	}
	
	public void agregar(JLabel j)
	{
		if(j!=null)
		{
			panelJuego.add(j);
		}
	}
	
	public void iniciarPanelAliados(){
		//Inicio paneles de aliados
				cartas= new JPanel();
				cartas.setBackground(Color.LIGHT_GRAY);
				cartas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				cartas.setBounds(0, 0, 300, 300);
				cartas.setLayout(null);
				cartas.setVisible(true);
				
				//Boton Caballero
				btnCaballero = new JButton("");
				btnCaballero.setIcon(new ImageIcon(GUI.class.getResource(cardSource+"caballero"+commonExt)));
				btnCaballero.setBounds(5, 5, 71, 88);
				cartas.add(btnCaballero);
				btnCaballero.setContentAreaFilled(false);
				btnCaballero.setOpaque(true);
				btnCaballero.setEnabled(true);
				btnCaballero.addActionListener(new OyenteCrear(1));
				
				//Boton Arquera
				btnArquera = new JButton("");
				btnArquera.setIcon(new ImageIcon(GUI.class.getResource(cardSource+"arquera"+commonExt)));
				btnArquera.setBounds(5, 95, 71, 88);
				cartas.add(btnArquera);
				btnArquera.setContentAreaFilled(false);
				btnArquera.setOpaque(true);
				btnArquera.addActionListener(new OyenteCrear(2));
				
				//Boton Valquiria
				btnValquiria = new JButton("");
				btnValquiria.setIcon(new ImageIcon(GUI.class.getResource(cardSource+"valquiria"+commonExt)));
				btnValquiria.setBounds(5, 185, 71, 88);
				cartas.add(btnValquiria);
				btnValquiria.setContentAreaFilled(false);
				btnValquiria.setOpaque(true);
				btnValquiria.setEnabled(true);
				btnValquiria.addActionListener(new OyenteCrear(3));
				
				//Boton Mago
				btnMago = new JButton("");
				btnMago.setIcon(new ImageIcon(GUI.class.getResource(cardSource+"mago"+commonExt)));
				btnMago.setBounds(5, 275, 71, 88);
				cartas.add(btnMago);
				btnMago.setContentAreaFilled(false);
				btnMago.setOpaque(true);
				btnMago.setEnabled(true);
				btnMago.addActionListener(new OyenteCrear(4));
				
				//BotonMegacaballero
				btnMegacaballero = new JButton("");
				btnMegacaballero.setIcon(new ImageIcon(GUI.class.getResource(cardSource+"megacaballero"+commonExt)));
				btnMegacaballero.setBounds(5, 365, 71, 88);
				cartas.add(btnMegacaballero);
				btnMegacaballero.setContentAreaFilled(false);
				btnMegacaballero.setOpaque(true);
				btnMegacaballero.setEnabled(true);
				btnMegacaballero.addActionListener(new OyenteCrear(5));
				
				//Panel aliados
				cartas.setBounds(0, 0, 160, 450);
				frame.getContentPane().add(cartas);
	}
	
	public void iniciarPanelObjetos(){
		//Panel de objetos
				objetos= new JPanel();
				objetos.setBackground(Color.DARK_GRAY);
				objetos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				objetos.setBounds(0, 0, 300, 300);
				objetos.setLayout(null);
				objetos.setVisible(true);

				
				//Panel objetos
				objetos.setBounds(910, 0, 120, 450);
				frame.getContentPane().add(objetos);
	}
	
	

	
	
	

	
public static void main(String [] arg){
		game= new GUI();
		frame.setVisible(true);
	}
}
