package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import GUI.GUI.*;
import Unidades.*;


public class GUI_Mercado extends JPanel{

	//PATHFILES
	private static final String cardSource= "/img/cards/";
	private static final String commonExt= ".png";
	private JButton[][] juego;

	//Labels
	private JLabel lbldinero;
	
	//Otros
	int dinero;
	
	public GUI_Mercado(JButton[][] mapa){
		juego=mapa;
		new JPanel();
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setBounds(0, 0, 300, 300);
		this.setLayout(null);
		this.setVisible(true);
		
	
	//ALIADOS
		JButton btnCaballero = new JButton("");
		
		btnCaballero.addActionListener(new ActionListener() {
			public synchronized void actionPerformed(ActionEvent arg0) {
				//Caballero c= new Caballero();
			}}
		);
		btnCaballero.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"caballero"+commonExt)));
		btnCaballero.setBounds(5, 5, 71, 88);
		this.add(btnCaballero);
	
		btnCaballero.setContentAreaFilled(false);
		btnCaballero.setOpaque(true);
		btnCaballero.setEnabled(true);
		
		
		JButton btnArquera = new JButton("");
		
		btnArquera.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"arquera"+commonExt)));
		btnArquera.setBounds(5, 95, 71, 88);
		this.add(btnArquera);
		btnArquera.setContentAreaFilled(false);
		btnArquera.setOpaque(true);
		
		
		JButton btnValquiria = new JButton("");
		
		btnValquiria.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"valquiria"+commonExt)));
		btnValquiria.setBounds(5, 185, 71, 88);
		this.add(btnValquiria);
		
		btnValquiria.setContentAreaFilled(false);
		btnValquiria.setOpaque(true);
		btnValquiria.setEnabled(true);
		
		
		JButton btnMago = new JButton("");
		
		btnMago.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"mago"+commonExt)));
		btnMago.setBounds(5, 275, 71, 88);
		this.add(btnMago);
		
		btnMago.setContentAreaFilled(false);
		btnMago.setOpaque(true);
		btnMago.setEnabled(true);
		
		
		JButton btnMegacaballero = new JButton("");
		
		btnMegacaballero.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"megacaballero"+commonExt)));
		btnMegacaballero.setBounds(5, 365, 71, 88);
		this.add(btnMegacaballero);
		
		btnMegacaballero.setContentAreaFilled(false);
		btnMegacaballero.setOpaque(true);
		btnMegacaballero.setEnabled(true);
	
	
	//ESTRUCTURAS
		JButton btnChoza = new JButton("");
		
		btnChoza.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"choza"+commonExt)));
		//btnChoza.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/choza.png")));
		btnChoza.setBounds(80, 5, 71, 88);
		this.add(btnChoza);
		
		btnChoza.setContentAreaFilled(false);
		btnChoza.setOpaque(true);
		btnChoza.setEnabled(true);
		
		/*
		JButton btnInfernal = new JButton("");
	
		btnInfernal.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"infernal"+commonExt)));
		//btnInfernal.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/infernal.png")));
		btnInfernal.setBounds(80, 185, 71, 88);
		this.add(btnInfernal);
		
		btnInfernal.setContentAreaFilled(false);
		btnInfernal.setOpaque(true);
		btnInfernal.setEnabled(true);
		*/
		
		JButton btnCannon = new JButton("");
	
		btnCannon.setIcon(new ImageIcon(GUI_Mercado.class.getResource(cardSource+"canon"+commonExt)));
		//btnCannon.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/canon.png")));
		btnCannon.setBounds(80, 185, 71, 88);
		this.add(btnCannon);
		
		btnCannon.setContentAreaFilled(false);
		btnCannon.setOpaque(true);
		btnCannon.setEnabled(true);
		
		dinero=1000;
		lbldinero= new JLabel("Dinero: "+dinero);
		lbldinero.setBounds(80, 350, 100, 100);
		this.add(lbldinero);
	//------------------------------------------------------------------/MERCADO---------------------------------------------
	}
	public void setDinero(int x){
		lbldinero.setText("Dinero: "+(dinero-x));
	}
	
	
}

