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
