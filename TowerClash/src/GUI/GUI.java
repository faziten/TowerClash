package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import Mapa.*;

public class GUI extends JFrame{
	
	private static JFrame frame; 
	
	//PANELES
	private JPanel cartas;
	private JPanel objetos;
	private JPanel panelJuego;
	
	
	//Labels Informacion
	private JLabel puntaje;
	private JLabel monedas;
	private JLabel fondo;
	
	//Botones de cartas
	private JButton btnCaballero;
	private JButton btnArquera;
	private JButton btnValquiria;
	private JButton btnMago;
	private JButton btnMegacaballero;
	
	
	//Logica
	private Jugador miJugador;
	private Mapa mapaLogica;
	
	
	public GUI(){

		frame= new JFrame();
		frame.setBounds(75, 50, 1045, 550);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		//Mi jugador y mi mapa

		miJugador.crearHilos();
		

		iniciarPanelJuego();
	
		iniciarPanelAliados();
		
		iniciarPanelObjetos();
		
		puntaje = new JLabel("Puntos: " + Jugador.getInstance().getPuntos());
		puntaje.setFont(new Font("Tahoma", Font.PLAIN, 30));
		monedas = new JLabel("Dinero: " + Jugador.getInstance().getDinero());
		monedas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		objetos.add(puntaje);
		objetos.add(monedas);
		
	}
	
	public void iniciarPanelJuego(){
		getContentPane().setLayout(null);
		panelJuego=new JPanel();
		panelJuego.setLayout(new FlowLayout());
		setContentPane(panelJuego);
		setBounds(200, 100, 1100, 480);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		panelJuego.setSize(640, 384);
		
		fondo = new JLabel();		
		fondo.setBorder(new LineBorder(new Color(0, 0, 0)));
		//fondo.addMouseListener(new OyenteCrearEliminar());
		panelJuego.add(fondo);
	}
	
	public void iniciarPanelAliados(){
		cartas = new JPanel(new GridLayout(5, 1));
		panelJuego.add(cartas);
		/*SE DEBE AGREGAR CADA BOTON
		cartas.add(new btnCaballero(new OyenteCrear()));
		cartas.add(new btnArquera(new OyenteCrear()));
		cartas.add(new btnValquiria(new OyenteCrear()));
		cartas.add(new btnMago(new OyenteCrear()));
		cartas.add(new btnMegacaballero(new OyenteCrear()));
		*/
	}
	
	public void iniciarPanelObjetos(){
		objetos = new JPanel(new GridLayout(4, 1));
		/*SE DEBE AGREGAR BOTON OBJETO
		objetos.add(new btnGolem(new OyenteCrear()));
		objetos.add(new btnGlobo(new OyenteCrear()));
		objetos.add(new btnLago(new OyenteCrear()));		
		objetos.add(new btnLava(new OyenteCrear()));*/
		panelJuego.add(objetos);
	}
	
	public void refrescar() {
		puntaje.setText("Puntos : " + Jugador.getInstance().getPuntos());
		monedas.setText("Dinero : " + Jugador.getInstance().getDinero());
	}
	
		

	
public static void main(String [] arg){
	GUI frame= new GUI();
	frame.setVisible(true);
	}
}
