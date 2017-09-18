package GUI;
import img.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
	
	public GUI(){
		super();
		
		//TESTING ONLY CODESPACE//
        map.obtenerCelda(16, 16).setCode((byte) 1);
		//System.out.println(map.printCodes());
        //TESTING ONLY CODESPACE//
	}
	public GUI getGUI(){
		return game;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		for(int i=0;i<32;i++)
			for(int j=0;j<32;j++){
				//System.out.println(map.obtenerCelda(i,j).obtenerCode());
				//System.out.println(map);
				g2d.drawImage(pintor.getTextura("tex"+Integer.toString( map.obtenerCelda(i, j).obtenerCode() )),i*dx,j*dy,null); //Genera gráficos a partir de mapa.
			}
		System.out.println("Acabo de repintar");
		System.out.println(map.printCodes());
	}

	public static void main(String [] arg){
		//////////BENCHMARK/////////
		long startTime = System.currentTimeMillis();
		//////////BENCHMARK/////////
		
		
		game = new GUI();
		game.setSize(512,512);
		game.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.setLayout(null);
        frame.add(game);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Ejecuto game");
        game.run(); //TESTING KAPPA1234
        System.out.println("Ejecuto mapa");
        map.start();
        
        
        //logMapa.run(); //ESTO NO LE GUSTA A JAVA.
        
        //////////END BENCHMARK/////////
        long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime+" milisegundos en ejecutar el programa MAIN de GUI");
		//////////END BENCHMARK/////////
   /*
        
		while(true){
			
			System.out.println(map.printCodes()); //momento derp de la noche
			game.repaint();
			System.out.println("Acabo de repintar");
			try {
				Thread.sleep(33);
				//System.out.println(Thread.currentThread().getName());
			
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
        }*/ 
	}
	
	public synchronized void run() {
		
		while(true){
			
			//System.out.println(map.printCodes()); //momento derp de la noche
			//System.out.println("Ejecuto unidad");
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
	