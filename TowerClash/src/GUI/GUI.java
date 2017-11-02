package GUI;

import java.awt.Component;

import javax.swing.*;

public class GUI implements Runnable {
	
	private static JFrame frame; 
	private JPanel cartas;
	private JButton [] [] mapa;
	//private Object [] [] mapa;
	private static final String cardSource= "/img/cards/";
	private static final String commonExt= ".png";
	
	public GUI(){
		frame= new JFrame();
		frame.setBounds(75, 50, 1045, 488);
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
				if(j==0 || j== 1)
					mapa[i][j].setEnabled(false);
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
		
		//Panel Cartas
		Mercado m= new Mercado();
		m.setBounds(0, 0, 160, 450);
		frame.getContentPane().add(m);;
		
		//Panel Poderes
		Poderes p= new Poderes();
		p.setBounds(910, 0, 120, 450);
		frame.getContentPane().add(p);
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String [] arg){
		GUI g= new GUI();
		frame.setVisible(true);
	}
}
