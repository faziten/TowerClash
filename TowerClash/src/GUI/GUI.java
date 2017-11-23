package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Mapa.Jugador;


public class GUI extends JFrame{
	
	protected static GUI game;
	private static JFrame frame; 
	
	
	//PANELES
	private JPanel cartas;
	private JPanel objetos;
	private JPanel panelJuego;
	
	//Labels Informacion
	private JLabel puntaje;
	private JLabel monedas;
	private JLabel fondo;
	
	
	
	
	public GUI(){
		iniciarPanelJuego();
	
		iniciarPanelAliados();
		
		iniciarPanelObjetos();
		
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
		//Inicio paneles de aliados
				cartas= new JPanel(new GridLayout(5, 1));
			/* SE DEBE AGREGAR BOTON PARA CADA ALIADO
				cartas.add(new btnCaballero(new OyenteCrear()));
				cartas.add(new btnArquera(new OyenteCrear()));
				cartas.add(new btnValquiria(new OyenteCrear()));
				cartas.add(new btnMago(new OyenteCrear()));
				cartas.add(new btnMegacaballero(new OyenteCrear()));
				*/
				
	}
	
	public void iniciarPanelObjetos(){
		//Panel de objetos
				objetos= new JPanel(new GridLayout(4, 1));
				/*objetos.add(new btnGolem(new OyenteCrear()));
				objetos.add(new btnGlobo(new OyenteCrear()));
				objetos.add(new btnLago(new OyenteCrear()));		
				objetos.add(new btnLava(new OyenteCrear()));*/
				panelJuego.add(objetos);
				
				puntaje = new JLabel("Puntos: " + Jugador.getInstance().getPuntos());
				puntaje.setFont(new Font("Tahoma", Font.PLAIN, 30));
				monedas = new JLabel("Dinero: " + Jugador.getInstance().getDinero());
				monedas.setFont(new Font("Tahoma", Font.PLAIN, 30));
				objetos.add(monedas);
				objetos.add(puntaje);

				
	}
	
	public void refrescar() {
		puntaje.setText("Puntos : " + Jugador.getInstance().getPuntos());
		monedas.setText("Dinero : " + Jugador.getInstance().getDinero());
	}
	

public static void main(String [] arg){
		game= new GUI();
		frame.setVisible(true);
	}
}
