package GUI;

import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class GUI implements Runnable {
	
	protected static GUI game;
	private static JFrame frame; 
	private JPanel cartas;
	private JButton [] [] mapa;
	private static final String source= "/img/";
	private static final String cardSource= "/img/cards/";
	private static final String unitSource= "/img/unidades/";
	private static final String commonExt= ".png";
	
	
	private static Puntaje estado;
	
	public GUI(){
		frame= new JFrame();
		frame.setBounds(75, 50, 1045, 550);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

				mapa[i][j].setIcon(new ImageIcon(Mercado.class.getResource(source+"0"+commonExt)));
				if(j==0 || j== 1)
					mapa[i][j].setIcon(new ImageIcon(Mercado.class.getResource(source+"1"+commonExt)));
				if(j==9){
					mapa[i][j].setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"KingTower"+commonExt)));
					mapa[i][j].setContentAreaFilled(false);
					mapa[i][j].setOpaque(true);
					
				}
				frame.getContentPane().add((Component) mapa[i][j]);
			}
			x=160;
			y+=75;
		}

		mapa[5][6].setIcon(new ImageIcon(Mercado.class.getResource(unitSource+"arquera"+commonExt)));
		mapa[2][8].setIcon(new ImageIcon(Mercado.class.getResource(unitSource+"caballero"+commonExt)));
		mapa[4][3].setIcon(new ImageIcon(Mercado.class.getResource(unitSource+"golem"+commonExt)));
		mapa[4][7].setIcon(new ImageIcon(Mercado.class.getResource(unitSource+"valquiria"+commonExt)));
		
		//Panel Cartas
		Mercado m= new Mercado();
		m.setBounds(0, 0, 160, 450);
		frame.getContentPane().add(m);;
		
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
	
	public static void main(String [] arg){

		game= new GUI();
		game.run();
		frame.setVisible(true);
		estado.run();
	}
}
