package GUI;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Poderes extends JPanel{
	//PATHFILES
	private static final String cardSource= "/img/cards/";
	private static final String objectSource="/img/objetos/";
	private static final String commonExt=".png";
	
	public Poderes(){
			new JPanel();
			this.setBackground(Color.DARK_GRAY);
			this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			this.setBounds(0, 0, 300, 300);
			this.setLayout(null);
			this.setVisible(true);
			
			RoundButton misil= new RoundButton();
			misil.setIcon(new ImageIcon(Poderes.class.getResource(objectSource+"Cohete"+commonExt)));
			//misil.setIcon(new ImageIcon(Poderes.class.getResource("/res/objetos/Cohete.png")));
			misil.setBounds(10, 10, 100, 100);
			this.add(misil);
			
			RoundButton bola_fuego= new RoundButton();
			bola_fuego.setIcon(new ImageIcon(Poderes.class.getResource(objectSource+"Bola_fuego"+commonExt)));
			//bola_fuego.setIcon(new ImageIcon(Poderes.class.getResource("/res/objetos/Bola_fuego.png")));
			bola_fuego.setBounds(10, 120, 100, 100);
			this.add(bola_fuego);
			
			RoundButton globo= new RoundButton();
			globo.setIcon(new ImageIcon(Poderes.class.getResource(objectSource+"globo"+commonExt)));
			//globo.setIcon(new ImageIcon(Poderes.class.getResource("/res/objetos/globo.png")));
			globo.setBounds(10, 230, 100, 100);
			this.add(globo);
			
			RoundButton golem= new RoundButton();
			golem.setIcon(new ImageIcon(Poderes.class.getResource(objectSource+"golem"+commonExt)));
			golem.setBounds(10, 340, 100, 100);
			this.add(golem);
		
		
	}
}
