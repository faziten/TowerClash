package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Mapa.Mapa;
import Unidades.Unidad;

public class GUIReal extends JPanel implements Runnable{
	static final int dx=16;
	static final int dy=16;
	static final int cel=32;
	static JFrame frame=new JFrame();
	
	//ENTIDADES
	protected volatile Pintor pintor=new Pintor(); //Multiples hilos le van a pedir cosas. 
	//protected static volatile Logica log=new Logica();
	//Mapa map=log.obtenerMapa();
	protected static GUIReal game; 
	protected volatile ExecutorService executorService = Executors.newSingleThreadExecutor(); //no creo que haga falta hacerla voltail.
	//protected volatile ExecutorService executorService = Executors.newWorkStealingPool(); //IMPLEMENTACION EN FORK-JOIN CAUSE I'MA PRO ¬o-o
	
	//ALIADOS Y TEMPORIZADOR
	long startTime = System.currentTimeMillis();  // TIMER!!

	
	
	//PATHFILES
		private static final String cardSource= "/img/cards/";
		private static final String objectSource="/img/objetos/";
		private static final String commonExt=".png";
	
	
		public void run() {
			
			
			Thread t = new Thread(new Runnable() { public void run() {   //TIMER CASERO
				  //System.out.println("waiting");
				  try {
					
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				}});
			
			
			//Collection<Unidad> c=log.obtenerUnidades().values();
			game.repaint();
			//map=log.obtenerMapa();
			//System.out.println(log.obtenerMapa().printCodes());
			executorService.execute(this);
			/*for(Unidad u: c){
				executorService.submit(u);//.execute(u) genera NULL pointers en destruccion de unidades. 
				}*/
			
			
			
			
			
			executorService.execute(t);  // INTRODUCE EL TIMER DEL ROUND TRIP
		            	//System.out.println("Round trip!");    
			//map=log.obtenerMapa();
			//map.printCodes();
			

		            
			game.repaint();// Tiene que estar sino muestra cosas raras
			
			
		}
	
	private void initialize(){
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 50, 965, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
	
	public GUIReal(){
		super();
		initialize();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		/*for(int i=0;i<32;i++)
			for(int j=0;j<32;j++){
				for(int k=0;k<4;k++)
					g2d.drawImage(pintor.getTextura(Integer.toString( map.obtenerCelda(i, j).obtenerCode()[k] )),i*dx,j*dy,null); //Genera gráficos a partir de mapa.
				
				
			}
		g2d.drawString("Puntaje actual: "+Integer.toString(log.getPuntaje()), 5, 12);
		g2d.drawString("Unidades vivas: "+Integer.toString(log.obtenerUnidades().size()), 5, 24);
		g2d.drawString("Tiempo transcurrido: "+((System.currentTimeMillis()-startTime)/3600000)+":"+((System.currentTimeMillis()-startTime)/60000%60)+":"+((System.currentTimeMillis()-startTime)/1000%60), 5, 36); //TIMER!*/
	}
	
	public static void main(String [] arg){
		//////////BENCHMARK/////////
		//long startTime = System.currentTimeMillis();
		//////////BENCHMARK/////////
		
		//SETTING GAME MAP PANEL SETTINGS
		game = new GUIReal();
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
       /* 
        log.generarCaballeroRandom(3,15);
        log.generarDuendeRandom(3,15);
        log.generarCaballeroRandom(5,14);
        log.generarDuendeRandom(5,14);
        log.generarCaballeroRandom(20,13);
        log.generarDuendeRandom(20,13);
      */  
        //NOTA USA UN FUCKING OBSERVER PARA MATAR UNIDADES, AHORA ES UN ASCO COMO ESTA.
        
        
        //////////END BENCHMARK/////////
        //long endTime   = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime+" milisegundos en ejecutar el programa MAIN de GUI");
		//////////END BENCHMARK/////////
 
	}
		
	
	
	
	
}
