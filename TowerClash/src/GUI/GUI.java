package GUI;
import img.*;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import Mapa.Mapa;
import Mapa.logicaMapa;

public class GUI extends JPanel implements Runnable{
	static final int dx=16;
	static final int dy=16;
	static final int cel=32;
	static JFrame frame=new JFrame();
	Pintor pintor=new Pintor();
	static logicaMapa logMapa=new logicaMapa();
	static Mapa map=logMapa.obtenerMapa();
	protected static GUI game; 
	
	//ADITION
	private static final String cardSource= "/img/cards/";
	private static final String objectSource="/img/objetos/";
	private static final String commonExt=".png";
	
	
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
		
	
		this.setBounds(216, 0, 512, 512);
		this.setLayout(null);
		//g= new GUI();
		//g.setBounds(new Rectangle(0, 0, 512, 512));
		//Juego.add(g);
		//g.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		/*
		GraPan g= new GraPan();
		g.setBounds(new Rectangle(0, 0, 512, 512));
		Juego.add(g);
		g.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
		frame.getContentPane().add(this);
				
		
		}

	
	
	public GUI(){
		super();
		initialize();
		//TESTING ONLY CODESPACE//
        //map.obtenerCelda(16, 16).setCode((byte) 1);
		//System.out.println(map.printCodes());
        //TESTING ONLY CODESPACE//
	}

	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		for(int i=0;i<32;i++)
			for(int j=0;j<32;j++){
	
				g2d.drawImage(pintor.getTextura("tex"+Integer.toString( map.obtenerCelda(i, j).obtenerCode() )),i*dx,j*dy,null); //Genera gráficos a partir de mapa.
			}
		System.out.println("Acabo de repintar");
		System.out.println(map.printCodes());
	}

	public static void main(String [] arg){
		//////////BENCHMARK/////////
		//long startTime = System.currentTimeMillis();
		//////////BENCHMARK/////////
		
		//SETTING GAME MAP PANEL SETTINGS
		game = new GUI();
		game.setSize(512,512);
		game.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//MAIN FRAME
		//frame.setLayout(null);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100,50,965,542);
        frame.add(game);
        //frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //EXCECUTORS
        System.out.println("Ejecuto game");
        game.run(); //TESTING KAPPA1234
        System.out.println("Ejecuto mapa");
        map.start();
        
        
    
        
        //////////END BENCHMARK/////////
        //long endTime   = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime+" milisegundos en ejecutar el programa MAIN de GUI");
		//////////END BENCHMARK/////////
 
	}
	
	public synchronized void run() {
		
		while(true){
			
			logMapa.obtenerUnidades().get("robert").run();
			game.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
        } 	
	}
	
}
	