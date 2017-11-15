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
	private int dinero;
	
	public GUI_Mercado(JButton[][] mapa){
		juego=mapa;
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
	
	
	//------------------------------------------------------------------/MERCADO---------------------------------------------
	}
	public void setDinero(int x){
		lbldinero.setText("Dinero: "+(dinero-x));
	}
}

