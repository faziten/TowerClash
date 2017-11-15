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

public class GUI {
	
	protected static GUI game;
	private static JFrame frame; 
	
	private JLabel [] [] mapa;
	private static final String source= "/img/";
	private static final String cardSource= "/img/cards/";
	private static final String enemySource= "/img/enemigos/";
	private static final String commonExt= ".png";
	
	//PANELES
	private JPanel cartas;
	private JPanel objetos;
	private JPanel informacion;
	
	//Labels Informacion
	private JLabel puntaje;
	private JLabel monedas;
	
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
		miJugador= new Jugador(this);
		miJugador.crearHilos();
		mapaLogica=miJugador.getMapa();
		creador= new CreadorConcreto();
		
		
		
		
		//Inicilializo el mapa
		int x=160;
		int y=0;
		mapa= new JLabel[6][10];
		for(int i= 0; i< 6; i++){
			for(int j=0; j< 10; j++){
				mapa[i][j]= new JLabel("");
				mapa[i][j].setEnabled(true);
				mapa[i][j].setBounds(x, y, 75, 75);
				x+=75;
				mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(source+"0"+commonExt)));
				if(j==0 || j== 1)
					mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(source+"1"+commonExt)));
				if(j==9){
					mapa[i][j].setIcon(new ImageIcon(GUI.class.getResource(cardSource+"KingTower"+commonExt)));
					mapa[i][j].setOpaque(true);
					
				}
				mapa[i][j].addMouseListener(new OyenteMouse(i,j));
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
		
		//Panel Cartas
		cartas.setBounds(0, 0, 160, 450);
		frame.getContentPane().add(cartas);
		
		//Panel de objetos
		objetos= new JPanel();
		objetos.setBackground(Color.DARK_GRAY);
		objetos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		objetos.setBounds(0, 0, 300, 300);
		objetos.setLayout(null);
		objetos.setVisible(true);

		//Boton Objetos
		RoundButton globo= new RoundButton();
		globo.setIcon(new ImageIcon(GUI.class.getResource("/img/objetos/globo.png")));
		globo.setBounds(10, 230, 100, 100);
		globo.addActionListener(new OyenteCrear(6));
		objetos.add(globo);
		
		
		RoundButton golem= new RoundButton();
		golem.setIcon(new ImageIcon(GUI.class.getResource("/img/objetos/golem.png")));
		golem.setBounds(10, 340, 100, 100);
		golem.addActionListener(new OyenteCrear(7));
		objetos.add(golem);
		
		RoundButton lago= new RoundButton();
		lago.setIcon(new ImageIcon(GUI.class.getResource("/img/objetos/lago.png")));
		lago.setBounds(10,10,100,100);
		lago.addActionListener(new OyenteCrear(8));
		objetos.add(lago);
		
		RoundButton lava= new RoundButton();
		lava.setIcon(new ImageIcon(GUI.class.getResource("/img/objetos/volcan.png")));
		lava.setBounds(10,120,100,100);
		lava.addActionListener(new OyenteCrear(9));
		objetos.add(lava);
		
		//Panel objetos
		objetos.setBounds(910, 0, 120, 450);
		frame.getContentPane().add(objetos);
		
		//Panel Puntaje
		informacion= new JPanel();
		informacion.setBounds(0, 450, 1045,70);
		informacion.setBackground(Color.BLACK);
		informacion.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		informacion.setBounds(0, 450, 1045,70);
		informacion.setLayout(null);
		informacion.setVisible(true);
		//puntaje.setText("Puntaje: "+miJugador.getPuntaje());
		//puntaje.setBounds(100, 36, 10, 20);
		//informacion.add(puntaje);
		//monedas.setText("Oro: "+ miJugador.getOro());
		//monedas.setBounds(450, 60, 10, 20);
		//informacion.add(monedas);
		frame.getContentPane().add(informacion);
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
		private int i,j;
		public OyenteMouse(int i, int j){
			this.i=i;
			this.j=j;
		}
    public void mousePressed(MouseEvent e)
        {
        	Celda celdaActual= mapaLogica.obtenerCelda(i, j);
        	if (celdaActual.estaVacia()){
        	
        		if(creado>=1)
        		{
        			ElementosComprables nuevo=null;
        			switch (creado) {
        			case 1:  if(30<=miJugador.getOro())
                			nuevo = creador.crearCaballero(mapaLogica,celdaActual);
                         	break;
                         
        			case 2:  if(30<=miJugador.getOro()) 
                			nuevo = creador.crearArquera(mapaLogica, celdaActual);
                         	break;
                         
        			case 3:  if(40<=miJugador.getOro()) 
                			nuevo = creador.crearValquiria(mapaLogica, celdaActual);
                         	break;
        			case 4:  if(50<=miJugador.getOro())
                			nuevo = creador.crearMago(mapaLogica, celdaActual);
                		 	break;
        			case 5:  if(70<=miJugador.getOro()) 
                			nuevo = creador.crearMegacaballero(mapaLogica, celdaActual);
        					break;
        			case 6:  if(30<=miJugador.getOro())
                			nuevo = creador.crearGlobo(mapaLogica, celdaActual);
		 			 	 	break;
        			case 7:  if(60<=miJugador.getOro()) 
                			nuevo = creador.crearGolem(mapaLogica, celdaActual);
                		 	break;
        			case 8:  if(20<=miJugador.getOro()) 
                			nuevo = creador.crearLago(mapaLogica, celdaActual);
                		 	break;
        			case 9:  if(30<=miJugador.getOro()) 
                			nuevo = creador.crearLava(mapaLogica, celdaActual);
       		 			 	break;  
        			}
    			
        			if(nuevo!=null){
        				miJugador.restarOro(nuevo.getPrecio());
        				mapaLogica.agregarElementoComprable(nuevo);
        				celdaActual.setElemento(nuevo);
        				mapa[i][j].setIcon(nuevo.getImagen());
        				
    				
        			}
        		}
        	}
        	creado=0;
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
	
	public void crearGrafico(Icon img) {
		JLabel background = new JLabel();
		background.setIcon(img);
		background.setBounds(200, 200, 75, 75);
		frame.add(background);
	}
	
public static void main(String [] arg){
		game= new GUI();
		frame.setVisible(true);
	}
}
