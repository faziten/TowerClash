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
import Unidades.Unidad;

public class GUI extends JPanel implements Runnable{
	static final int dx=16;
	static final int dy=16;
	static final int cel=32;
	static JFrame frame=new JFrame();
	Pintor pintor=new Pintor();
	static logicaMapa logMapa=new logicaMapa();
	static Mapa map=logMapa.obtenerMapa();
	protected static GUI game; 
	private boolean keepOn=true;
	
	//ADITION
	private static final String cardSource= "/img/cards/";
	private static final String objectSource="/img/objetos/";
	private static final String commonExt=".png";
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
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
			JButton btnCaballero = new JButton("");
			btnCaballero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.print("BOTON CABALLERO PRESIONADO: TODO"+"\n");
					haltThreads();
					keepOn=false;
				}
			});
			btnCaballero.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"caballero"+commonExt)));
			//btnCaballero.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/caballero.png")));
			btnCaballero.setBounds(29, 11, 71, 88);
			Cartas.add(btnCaballero);
			//Borrado de del boton
		//	btnEstructura5.setBorderPainted(false);
			btnCaballero.setContentAreaFilled(false);
			btnCaballero.setOpaque(true);
			
			
			JButton btnArquera = new JButton("");
			btnArquera.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON ARQUERA PRESIONADO: TODO"+"\n");
					
				}
			});
			
			btnArquera.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"arquera"+commonExt)));
			//btnArquera.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/arquera.png")));
			btnArquera.setBounds(29, 110, 71, 88);
			Cartas.add(btnArquera);
			//Borrado de del boton
			btnArquera.setContentAreaFilled(false);
			btnArquera.setOpaque(true);
			
			
			JButton btnValquiria = new JButton("");
			btnValquiria.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON VALQUIRIA PRESIONADO: TODO"+"\n");
				}
			});
			btnValquiria.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"valquiria"+commonExt)));
			//btnValquiria.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/valquiria.png")));
			btnValquiria.setBounds(29, 209, 71, 88);
			Cartas.add(btnValquiria);
			//Borrado de del boton
			btnValquiria.setContentAreaFilled(false);
			btnValquiria.setOpaque(true);
			
			
			JButton btnMago = new JButton("");
			btnMago.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON MAGO PRESIONADO: TODO"+"\n");
				}
			});
			btnMago.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"mago"+commonExt)));
			//btnMago.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/mago.png")));
			btnMago.setBounds(29, 308, 71, 88);
			Cartas.add(btnMago);
			//Borrado de del boton
			btnMago.setContentAreaFilled(false);
			btnMago.setOpaque(true);
			
			
			JButton btnMegacaballero = new JButton("");
			btnMegacaballero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON MEGACABALLERO PRESIONADO: TODO"+"\n");
				}
			});
			btnMegacaballero.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"megacaballero"+commonExt)));
			//btnMegacaballero.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/megacaballero.png")));
			btnMegacaballero.setBounds(29, 407, 71, 88);
			Cartas.add(btnMegacaballero);
			//Borrado de del boton
			btnMegacaballero.setContentAreaFilled(false);
			btnMegacaballero.setOpaque(true);
		
		
		//ESTRUCTURAS
			JButton btnChoza = new JButton("");
			btnChoza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON CHOZA PRESIONADO: TODO"+"\n");
				}
			});
			btnChoza.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"choza"+commonExt)));
			//btnChoza.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/choza.png")));
			btnChoza.setBounds(110, 11, 71, 88);
			Cartas.add(btnChoza);
			//Borrado de del boton
			btnChoza.setContentAreaFilled(false);
			btnChoza.setOpaque(true);
			
			
			JButton btnInfernal = new JButton("");
			btnInfernal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON INFERNAL PRESIONADO: TODO"+"\n");
				}
			});
			btnInfernal.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"infernal"+commonExt)));
			//btnInfernal.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/infernal.png")));
			btnInfernal.setBounds(110, 209, 71, 88);
			Cartas.add(btnInfernal);
			//Borrado de del boton
			btnInfernal.setContentAreaFilled(false);
			btnInfernal.setOpaque(true);
			
			
			JButton btnCannon = new JButton("");
			btnCannon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON CANON PRESIONADO: TODO"+"\n");
				}
			});
			btnCannon.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"canon"+commonExt)));
			//btnCannon.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/cartas/canon.png")));
			btnCannon.setBounds(110, 110, 71, 88);
			Cartas.add(btnCannon);
			//Borrado de del boton
			btnCannon.setContentAreaFilled(false);
			btnCannon.setOpaque(true);
			
			
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
		misil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON MISIL PRESIONADO: TODO"+"\n");
			}
		});
		misil.setBounds(50, 369, 100, 100);
		Objetos.add(misil);
		
		RoundButton bola_fuego= new RoundButton();
		bola_fuego.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"Bola_fuego"+commonExt)));
		//bola_fuego.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/objetos/Bola_fuego.png")));
		bola_fuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON BOLA FUEGO PRESIONADO: TODO"+"\n");
			}
		});
		bola_fuego.setBounds(50, 258, 100, 100);
		Objetos.add(bola_fuego);
		
		RoundButton globo= new RoundButton();
		globo.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"globo"+commonExt)));
		//globo.setIcon(new ImageIcon(GUIJuego.class.getResource("/res/objetos/globo.png")));
		globo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON GLOBO PRESIONADO: TODO"+"\n");
			}
		});
		globo.setBounds(50, 147, 100, 100);
		Objetos.add(globo);
		
		RoundButton golem= new RoundButton();
		golem.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"golem"+commonExt)));
		golem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON GOLEM PRESIONADO: TODO"+"\n");
			}
		});
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
		//System.out.println("Acabo de repintar");
		//System.out.println(map.printCodes());
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
	/**
	 * Ejecuta el juego. En esta entrega el juego y el personaje son controlados en el mismo hilo. 
	 */
	
	@SuppressWarnings("deprecation")
	private void haltThreads(){
		for(Unidad u: logMapa.obtenerUnidades().values()){
				((Thread)u).stop();	
		}
	}


	
	public synchronized void run() {
		
		//Forma super hiper mega cool de ejecutar todos los hilos (No necesito conocer su nombre). Supongo que con el factory tendrá mas sentido.
		
		for(Unidad u: logMapa.obtenerUnidades().values()){
			((Thread)u).start();
		}
		
		/* ESTO EJECUTA CADA CABALLERO EN SU HILO (VER NOMBRE EN EL SYSTEM OUT DICE THREAD 2 y 3)-.
		Thread t1=new Thread();
		t1=(Thread)logMapa.obtenerUnidades().get("robert");
		t1.start();
		Thread t2=new Thread();
		t2=(Thread)logMapa.obtenerUnidades().get("robert2");
		t2.start();
		*/
		while(keepOn){
			/*
			 * ESTO EJECUTA A LOS CABALLEROS EN EL HILO MAIN (TODO ES UN HILO).
			 * t1.start();
			 * logMapa.obtenerUnidades().get("robert").run(); //Nota esta forma de acceder a los atributos es temporal. Va a cambiar.
			 * logMapa.obtenerUnidades().get("robert2").run(); 
			 * 
			 * */
			 
			game.repaint();
			try {
				//System.out.println(Thread.currentThread().getName()+ "Hilo de GUI");
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
        } 	
	}
	
}
	