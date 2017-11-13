package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import Mapa.*;

public class GUI implements Runnable {
	
	protected static GUI game;
	private static JFrame frame; 
	private JPanel cartas;
	private JButton [] [] mapa;
	private static final String source= "/img/";
	private static final String cardSource= "/img/cards/";
	private static final String commonExt= ".png";
	
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
	
	
	private static Puntaje estado;
	
	public GUI(Jugador jugador){
		frame= new JFrame();
		frame.setBounds(75, 50, 1045, 550);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Mi jugador y mi mapa
		miJugador= jugador;
		mapaLogica=jugador.getMapa();
		creador= new CreadorConcreto();
		
		//Inicilializo el mapa
		int x=160;
		int y=0;
		mapa= new JButton[6][10];
		for(int i= 0; i< 6; i++){
			for(int j=0; j< 10; j++){
				mapa[i][j]= new JButton("");
				mapa[i][j].setEnabled(true);
				mapa[i][j].setBounds(x, y, 75, 75);
				x+=75;
				mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(source+"0"+commonExt)));
				if(j==0 || j== 1)
					mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(source+"1"+commonExt)));
				if(j==9){
					mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(cardSource+"KingTower"+commonExt)));
					mapa[i][j].setContentAreaFilled(false);
					mapa[i][j].setOpaque(true);
					
				}
				mapa[i][j].addMouseListener(new OyenteMouse());
				frame.getContentPane().add((Component) mapa[i][j]);
			}
			x=160;
			y+=75;
		}
		
	//Inicio paneles del Mapa
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

		//Boton Objetos
		
		
		
		//Panel Cartas
		cartas.setBounds(0, 0, 160, 450);
		frame.getContentPane().add(cartas);;
		
		//Panel Poderes
		Poderes p= new Poderes();
		p.setBounds(910, 0, 120, 450);
		frame.getContentPane().add(p);
		
		//Panel Puntaje
		estado= new Puntaje();
		estado.setBounds(0, 450, 1045,70);
		frame.getContentPane().add(estado);
	}
	
	

	public void run() {
		
		Thread t = new Thread(new Runnable() { public void run() {   //TIMER CASERO
			  //System.out.println("waiting");
			  try {
				
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}});
		
		estado.run();
		
	}
	
	private class OyenteCrear implements ActionListener {
		private int n;
		public OyenteCrear(int num){
			n=num;
		}
        public void actionPerformed(ActionEvent e)
        {
        	creado = n;
        }
    }
	
	private class OyenteMouse implements MouseListener {
        public void mousePressed(MouseEvent e)
        {
        	int i = e.getY();
        	int j = e.getX();
        	
        	if(creado>=1)
        	{
        		Celda celdaActual = mapaLogica.obtenerCelda(i, j);
        		ElementosMapa nuevo=null;
    			switch (creado) {
                case 1:  if(40<=miJugador.getOro())
                			nuevo = creador.crearCaballero(mapaLogica,celdaActual);
                         break;
                         
                case 2:  if(50<=miJugador.getOro()) 
                			nuevo = creador.crearArquera(mapaLogica, celdaActual);
                         break;
                         
                case 3:  if(50<=miJugador.getOro()) 
                			nuevo = creador.crearValquiria(mapaLogica, celdaActual);
                         break;
                case 0:  if(100<=miJugador.getOro())
                			nuevo = creador.crearMago(mapaLogica, celdaActual);
                		 break;
                case 4:  if(125<=miJugador.getOro()) 
                			nuevo = creador.crearMegacaballero(mapaLogica, celdaActual);
       		 			 break;
                case 5:  if(150<=miJugador.getOro())
                			nuevo = creador.crearGlobo(mapaLogica, celdaActual);
		 			 	 break;
                case 6:  if(40<=miJugador.getOro()) 
                			nuevo = creador.crearGolem(mapaLogica, celdaActual);
                		 break;
                case 7:  if(80<=miJugador.getOro()) 
                			nuevo = creador.crearLago(mapaLogica, celdaActual);
                		 break;
                case 8:  if(160<=miJugador.getOro()) 
                			nuevo = creador.crearLava(mapaLogica, celdaActual);
       		 			 break;
                case 9:  
            	}
    			
    			if(nuevo!=null)
    			{
    				//Restar oro
    				
    				//Si la celda ya tiene algo, entonces NO AGREGAR
    				
    			}
        		
        		creado=0;
        	}
        }

	public void mouseClicked(MouseEvent arg0) {
		
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mouseReleased(MouseEvent arg0) {
		
	}
	}
	
public static void main(String [] arg){
		
		game= new GUI(new Jugador());
		game.run();
		frame.setVisible(true);
		estado.run();
	}
}
