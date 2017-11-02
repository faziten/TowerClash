package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Puntaje extends JPanel{
	
	//ENTIDADES
	protected volatile Pintor pintor=new Pintor();
	
	long startTime = System.currentTimeMillis();  // TIMER!!
	
	//CONSTRUCTOR
	public Puntaje(){
		this.setBackground(Color.BLACK);
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setBounds(0, 450, 1045,70);
		this.setLayout(null);
		this.setVisible(true);
	
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		
	//	g2d.drawString("Puntaje actual: "+Integer.toString(log.getPuntaje()), 5, 12);
	//	g2d.drawString("Unidades vivas: "+Integer.toString(log.obtenerUnidades().size()), 5, 24);
		g2d.drawString("Tiempo transcurrido: "+((System.currentTimeMillis()-startTime)/3600000)+":"+((System.currentTimeMillis()-startTime)/60000%60)+":"+((System.currentTimeMillis()-startTime)/1000%60), 5, 36); //TIMER!
	}
}
