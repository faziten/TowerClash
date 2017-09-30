package GUI;

import javazoom.jl.player.Player;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import Mapa.Mapa;
import Mapa.logicaMapa;
import Unidades.Unidad;

public class GUI extends JPanel implements Runnable{
	static final int dx=16;
	static final int dy=16;
	static final int cel=32;
	static JFrame frame=new JFrame();
	
	//ENTIDADES
	protected volatile Pintor pintor=new Pintor(); //Multiples hilos le van a pedir cosas. 
	static logicaMapa logMapa=new logicaMapa();
	static Mapa map=logMapa.obtenerMapa();
	protected static GUI game; 
	protected volatile ExecutorService executorService = Executors.newSingleThreadExecutor(); //no creo que haga falta hacerla voltail.
	
	//ALIADOS Y TEMPORIZADOR
	long startTime = System.currentTimeMillis();  // TIMER!!
	protected volatile int instancia=0; //Multiples hilos modificaran sus estados internos. Nota instancia++ e instancia-- no son thread safe (Ver IBM tips). 
	private volatile char[] instancias=new char[32]; //Si bien no se puede hacer dos clicks al mismo tiempo, no es la forma en que se crearan necesariamente.
	
	//PATHFILES
	private static final String cardSource= "/img/cards/";
	private static final String objectSource="/img/objetos/";
	private static final String commonExt=".png";
	
	
	

	
	private void initialize() {
		
		/*SPRINT 3 BORRAR
		 * 
		 */
		for(int i=0;i<32;i++){
			instancias[i]='f';
		}
		/*
		 * SPRINT 3 BORRAR
		 */
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 50, 965, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//-------------------------------------------------------------------------------------------------------------------------
		//////BOTONES TRANSPARENTES PARA COLOCAR TORRETAS Y UNIDADES ALIADAS
		
		JPanel Torres = new JPanel();
		//Torres.setBackground(Color.LIGHT_);
		//Torres.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Torres.setBounds(216, 0, 512, 512);
		Torres.setLayout(null);
		frame.getContentPane().add(Torres);
		
				JButton btnTorre1 = new JButton("");
				btnTorre1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE1 PRESIONADO: "+"\n");
					}
				});
				
				btnTorre1.setIcon(null);
				btnTorre1.setBounds(240, 112, dx*3, dy*3);
				Torres.add(btnTorre1);
				//Borrado de del boton
				btnTorre1.setContentAreaFilled(true);
				btnTorre1.setOpaque(false);
				btnTorre1.setEnabled(true);
				//--------------------------------------------------
				JButton btnTorre2 = new JButton("");
				btnTorre2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE2 PRESIONADO: "+"\n");
					}
				});
				btnTorre2.setIcon(null);
				btnTorre2.setBounds(416, 160, dx*3, dy*3);
				Torres.add(btnTorre2);
				//Borrado de del boton
				btnTorre2.setContentAreaFilled(true);
				btnTorre2.setOpaque(false);
				btnTorre2.setEnabled(true);
				//---------------------------------------------------
				JButton btnTorre3 = new JButton("");
				btnTorre3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE3 PRESIONADO: "+"\n");
					}
				});
				btnTorre3.setIcon(null);
				btnTorre3.setBounds(416, 320, dx*3, dy*3);
				Torres.add(btnTorre3);
				//Borrado de del boton
				btnTorre3.setContentAreaFilled(true);
				btnTorre3.setOpaque(false);
				btnTorre3.setEnabled(true);
				//---------------------------------------------------
				JButton btnTorre4 = new JButton("");
				btnTorre4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE4 PRESIONADO: "+"\n");
					}
				});
				btnTorre4.setIcon(null);
				btnTorre4.setBounds(240, 367, dx*3, dy*3);
				Torres.add(btnTorre4);
				//Borrado de del boton
				btnTorre4.setContentAreaFilled(true);
				btnTorre4.setOpaque(false);
				btnTorre4.setEnabled(true);
				
				//----------------------------------------------------
				JButton btnTorre5 = new JButton("");
				btnTorre5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE5 PRESIONADO: "+"\n");
					}
				});
				btnTorre5.setIcon(null);
				btnTorre5.setBounds(48, 320, dx*3, dy*3);
				Torres.add(btnTorre5);
				//Borrado de del boton
				btnTorre5.setContentAreaFilled(true);
				btnTorre5.setOpaque(false);
				btnTorre5.setEnabled(true);
				//-----------------------------------------------------
				JButton btnTorre6 = new JButton("");
				btnTorre6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON TORRE6 PRESIONADO: "+"\n");
					}
				});
				btnTorre6.setIcon(null);
				btnTorre6.setBounds(48, 160, dx*3, dy*3);
				Torres.add(btnTorre6);
				//Borrado de del boton
				btnTorre6.setContentAreaFilled(true);
				btnTorre6.setOpaque(false);
				btnTorre6.setEnabled(true);
				
				//==========================================
				JButton btnAly1 = new JButton("");
				btnAly1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 1 PRESIONADO: "+"\n");
					}
				});
				btnAly1.setIcon(null);
				btnAly1.setBounds(210, 210, dx*2, dy*2);
				Torres.add(btnAly1);
				//Borrado de del boton
				btnAly1.setContentAreaFilled(true);
				btnAly1.setOpaque(false);
				btnAly1.setEnabled(true);
				//--------------------------------------------------
				JButton btnAly2 = new JButton("");
				btnAly2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 2 PRESIONADO: "+"\n");
					}
				});
				btnAly2.setIcon(null);
				btnAly2.setBounds(290, 210, dx*2, dy*2);
				Torres.add(btnAly2);
				//Borrado de del boton
				btnAly2.setContentAreaFilled(true);
				btnAly2.setOpaque(false);
				btnAly2.setEnabled(true);
				//---------------------------------------------------
				JButton btnAly3 = new JButton("");
				btnAly3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 3 PRESIONADO: "+"\n");
					}
				});
				btnAly3.setIcon(null);
				btnAly3.setBounds(305, 250, dx*2, dy*2);
				Torres.add(btnAly3);
				//Borrado de del boton
				btnAly3.setContentAreaFilled(true);
				btnAly3.setOpaque(false);
				btnAly3.setEnabled(true);
				//---------------------------------------------------
				JButton btnAly4 = new JButton("");
				btnAly4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 4 PRESIONADO: "+"\n");
					}
				});
				btnAly4.setIcon(null);
				btnAly4.setBounds(285, 285, dx*2, dy*2);
				Torres.add(btnAly4);
				//Borrado de del boton
				btnAly4.setContentAreaFilled(true);
				btnAly4.setOpaque(false);
				btnAly4.setEnabled(true);
				
				//----------------------------------------------------
				JButton btnAly5 = new JButton("");
				btnAly5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 5 PRESIONADO: "+"\n");
					}
				});
				btnAly5.setIcon(null);
				btnAly5.setBounds(210, 285, dx*2, dy*2);
				Torres.add(btnAly5);
				//Borrado de del boton
				btnAly5.setContentAreaFilled(true);
				btnAly5.setOpaque(false);
				btnAly5.setEnabled(true);
				//-----------------------------------------------------
				JButton btnAly6 = new JButton("");
				btnAly6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.print("BOTON SPAWN ALIADO CAMINO 6 PRESIONADO: "+"\n");
					}
				});
				btnAly6.setIcon(null);
				btnAly6.setBounds(190, 250, dx*2, dy*2);
				Torres.add(btnAly6);
				//Borrado de del boton
				btnAly6.setContentAreaFilled(true);
				btnAly6.setOpaque(false);
				btnAly6.setEnabled(true);
		
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
				public synchronized void actionPerformed(ActionEvent arg0) {
					System.out.print("BOTON CABALLERO PRESIONADO: Generando caballero..."+"\n");
					boolean generado=false;
					if(instancia<32){ //permitir hasta 32 personajes.
						int i=0;
						while(i<32 && !generado){
							if(instancias[i]=='f'){							 //f = "FREE"
								logMapa.generarCaballeroRandom(i);
								instancias[i]='c'; 							 //c= "CABALLERO"
								generado=true;
								i=0;
								instancia++;
							}else{
								i++;
								} 
						}
					}
						//logMapa.generarCaballeroRandom(instancia);
						//System.out.println("Tamaño del mapeo de LogMapa "+logMapa.obtenerUnidades().size());
						//System.out.println("Instancia del caballero "+(instancia+1));
						//instancia=instancia+1;}
					else{
						System.out.print("No caben mas caballeros!"+"\n");
					}
					generado=false; //reset flag
					
					//keepOn=false;
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
				public synchronized void actionPerformed(ActionEvent e) {
					System.out.print("BOTON ARQUERA PRESIONADO: Destruyendo duende... "+"\n");
					boolean destruido=false;
					if(instancia>0){ 										//que haya algo.
						int i=0;
						while(i<32 && !destruido){
							if(instancias[i]=='d'){							 //d = "DUENDE"
								logMapa.destruirDuende(i);
								instancias[i]='f'; 							 //f= "FREE"
								destruido=true;
								i=0;
								instancia--;
							}else{
								i++;
								} 
						}
					}
					else{
						System.out.print("No hay mas caballeros para matar!"+"\n");
					}
					destruido=false; 
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
			btnValquiria.setEnabled(false);
			
			
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
			btnMago.setEnabled(false);
			
			
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
			btnMegacaballero.setEnabled(false);
		
		
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
			btnChoza.setEnabled(false);
			
			
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
			btnInfernal.setEnabled(false);
			
			
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
			btnCannon.setEnabled(false);
			
			
			
			
			JButton btnEnemigo = new JButton("");
			btnEnemigo.addActionListener(new ActionListener() {
				public synchronized void actionPerformed(ActionEvent e) { //Si no estaba sincronizado me hacia cualquier gilada.
					System.out.print("BOTON DUENDE PRESIONADO: Generando duende..."+"\n");
					boolean generado=false;
					if(instancia<32){ //permitir hasta 32 personajes.
						int i=0;
						while(i<32 && !generado){
							if(instancias[i]=='f'){							 //f = "FREE"
								logMapa.generarDuendeRandom(i);
								instancias[i]='d'; 							 //d= "DUENDE"
								generado=true;
								i=0;
								instancia++;
							}else{
								i++;
								} 
						}
					}
					else{
						System.out.print("No caben mas duendes!"+"\n");
					}
					generado=false; //reset flag
					
				}
			});
			btnEnemigo.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"duende"+commonExt)));
			btnEnemigo.setBounds(110, 308, 71, 88);
			Cartas.add(btnEnemigo);
			//Borrado de del boton
			btnEnemigo.setContentAreaFilled(false);
			btnEnemigo.setOpaque(true);
			
			
			
			
			JButton btnNuclear = new JButton("");
			btnNuclear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.print("BOTON NUCLEAR PRESIONADO: "+"\n");
					if(instancia>0){
						for(int i=0;i<32;i++){
							if(instancias[i]=='d'){              //d= DUENDE
								logMapa.destruirDuende(i);
								instancia--;
								instancias[i]='f';
							}
						}
						System.out.println("Todos los duendes han muerto.");
					}else{
						System.out.println("El ataque nuclear ha caido, pero no había duendes para matar.");
					}
				}
			});
			btnNuclear.setIcon(new ImageIcon(GUIJuego.class.getResource(cardSource+"nuclear"+commonExt)));
			btnNuclear.setBounds(110, 407, 71, 88);
			Cartas.add(btnNuclear);
			//Borrado de del boton
			btnNuclear.setContentAreaFilled(false);
			btnNuclear.setOpaque(true);
			
			
			
			
			
			
			
			

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
		misil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON MISIL PRESIONADO: TODO"+"\n");
			}
		});
		misil.setBounds(50, 369, 100, 100);
		Objetos.add(misil);
		misil.setEnabled(false);
		
		RoundButton bola_fuego= new RoundButton();
		bola_fuego.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"Bola_fuego"+commonExt)));
		bola_fuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON BOLA FUEGO PRESIONADO: "+"\n");
				if(instancia>0){
					for(int i=0;i<32;i++){
						if(instancias[i]=='c'){              //c= CABALLERO
							logMapa.destruirCaballero(i);
							instancia--;
							instancias[i]='f';
						}
					}
					System.out.println("Todos han muerto.");
				}else{
					System.out.println("La bola de fuego ha caido, pero nadie ha muerto.");
				}
			}
		});
		bola_fuego.setBounds(50, 258, 100, 100);
		Objetos.add(bola_fuego);
		
		RoundButton globo= new RoundButton();
		globo.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"globo"+commonExt)));
		globo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON GLOBO PRESIONADO: TODO"+"\n");
			}
		});
		globo.setBounds(50, 147, 100, 100);
		Objetos.add(globo);
		globo.setEnabled(false);
		
		RoundButton golem= new RoundButton();
		golem.setIcon(new ImageIcon(GUIJuego.class.getResource(objectSource+"golem"+commonExt)));
		golem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("BOTON GOLEM PRESIONADO: TODO"+"\n");
			}
		});
		golem.setBounds(50, 36, 100, 100);
		Objetos.add(golem);
		golem.setEnabled(false);
		
		//------------------------------------------------------------------/PANEL OBJETOS--------------------------------------------
		
	
		this.setBounds(216, 0, 512, 512);
		this.setLayout(null);
		frame.getContentPane().add(this);
				
		
		}

	
	
	public GUI(){
		super();
		initialize();
	}

	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		for(int i=0;i<32;i++)
			for(int j=0;j<32;j++){
				for(int k=0;k<4;k++)
					g2d.drawImage(pintor.getTextura("tex"+Integer.toString( map.obtenerCelda(i, j).obtenerCode()[k] )),i*dx,j*dy,null); //Genera gráficos a partir de mapa.
				
				
			}
		g2d.drawString("Puntaje actual: "+Integer.toString(logMapa.getPuntaje()), 5, 12);
		g2d.drawString("Unidades vivas: "+Integer.toString(logMapa.obtenerUnidades().size()), 5, 24);
		g2d.drawString("Tiempo transcurrido: "+((System.currentTimeMillis()-startTime)/3600000)+":"+((System.currentTimeMillis()-startTime)/60000%60)+":"+((System.currentTimeMillis()-startTime)/1000%60), 5, 36); //TIMER!
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
		frame.getContentPane().setLayout(null);
		frame.setBounds(100,50,965,542);
        frame.add(game);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //EXCECUTORS
        System.out.println("Ejecuto game");
        game.run();
        //System.out.println("Ejecuto mapa----------------------------------------");
        //map.start();
        
        
    
        
        //////////END BENCHMARK/////////
        //long endTime   = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime+" milisegundos en ejecutar el programa MAIN de GUI");
		//////////END BENCHMARK/////////
 
	}
	
	private void sountrack(){
    	new Thread(new Runnable() {
			  public void run() {
				  try{
					  Player playMP3 = new Player(getClass().getResourceAsStream("/audio/soundtrack.mp3")); //Acceso relativo para .JAR ejecutable.
					  playMP3.play();}
    	
				  catch(Exception exc){
					  exc.printStackTrace();
					  System.out.println("Failed to play the file.");}
			  }}).start();}
		
	
	public void run() {

		Thread t = new Thread(new Runnable() { public void run() {   //TIMER CASERO
			  //System.out.println("waiting");
			  try {
				
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}});
		
		
		//while(true){
		//System.out.println("Pase por aca.");
		//Sonidor.playSound("soundtrack"); //Levanta el hilo desde una llamada static. 
		
		Collection<Unidad> c=logMapa.obtenerUnidades().values();
		//System.out.println("Tamaño de la colecion de unidades: "+logMapa.obtenerUnidades().values().size());
		game.repaint();
		
		//System.out.println(c.size());
		for(Unidad u: c){
			//game.repaint();
			executorService.submit(u);
			}
		executorService.submit(this);
		
		
		
		
		executorService.submit(t);  // INTRODUCE EL TIMER DEL ROUND TRIP
	            	//System.out.println("Round trip!");            	
	            
		game.repaint();
	}
		
	           // }
	        
	
     

} 
		


/////////////////////////CODIGOS RONIN////////////////////////////////

//while(keepOn){
/*
 * ESTO EJECUTA A LOS CABALLEROS EN EL HILO MAIN (TODO ES UN HILO).
 * t1.start();
 * logMapa.obtenerUnidades().get("robert").run(); //Nota esta forma de acceder a los atributos es temporal. Va a cambiar.
 * logMapa.obtenerUnidades().get("robert2").run(); 
 * 
 * */
////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
for(Unidad u: logMapa.obtenerUnidades().values()){
	u.run();
	game.repaint();
}
game.repaint();
try {
	//System.out.println(Thread.currentThread().getName()+ "Hilo de GUI");
	Thread.sleep(2);
} catch (InterruptedException e) {
	e.printStackTrace();
}
*/


//Alternativa 3: 
//ScheduledExecutorService executorService = null;
//executorService = Executors.newSingleThreadScheduledExecutor();


//////////////////////////////


//while(keepOn){
	/*
	 * ESTO EJECUTA A LOS CABALLEROS EN EL HILO MAIN (TODO ES UN HILO).
	 * t1.start();
	 * logMapa.obtenerUnidades().get("robert").run(); //Nota esta forma de acceder a los atributos es temporal. Va a cambiar.
	 * logMapa.obtenerUnidades().get("robert2").run(); 
	 * 
	 * */
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	for(Unidad u: logMapa.obtenerUnidades().values()){
		u.run();
		game.repaint();
	}
	game.repaint();
	try {
		//System.out.println(Thread.currentThread().getName()+ "Hilo de GUI");
		Thread.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	*/
	

	//Alternativa 3: 
	//ScheduledExecutorService executorService = null;
	//executorService = Executors.newSingleThreadScheduledExecutor();
///////////////////////////////////////////////////////////////////////////////////

/*
//Forma super hiper mega cool de ejecutar todos los hilos (No necesito conocer su nombre). Supongo que con el factory tendrá mas sentido.

for(Unidad u: logMapa.obtenerUnidades().values()){
	((Thread)u).start();
}
*/

/* ESTO EJECUTA CADA CABALLERO EN SU HILO (VER NOMBRE EN EL SYSTEM OUT DICE THREAD 2 y 3)-.
Thread t1=new Thread();
t1=(Thread)logMapa.obtenerUnidades().get("robert");
t1.start();
Thread t2=new Thread();
t2=(Thread)logMapa.obtenerUnidades().get("robert2");
t2.start();
*/
	