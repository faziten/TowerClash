package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;


public class Mercado extends JPanel{

	//PATHFILES
	private static final String cardSource= "/img/cards/";
	private static final String commonExt= ".png";
	
	public Mercado(){
		new JPanel();
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setBounds(0, 0, 216, 504);
		this.setLayout(null);
		
	
	//ALIADOS
		JButton btnCaballero = new JButton("");
		/*
		btnCaballero.addActionListener(new ActionListener() {
			public synchronized void actionPerformed(ActionEvent arg0) {
				System.out.print("BOTON CABALLERO PRESIONADO: Generando caballero..."+"\n");
			}}
		);*/
		btnCaballero.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"caballero"+commonExt)));
		//btnCaballero.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/caballero.png")));
		btnCaballero.setBounds(29, 11, 71, 88);
		this.add(btnCaballero);
		//Borrado de del boton
	//	btnEstructura5.setBorderPainted(false);
		btnCaballero.setContentAreaFilled(false);
		btnCaballero.setOpaque(true);
		btnCaballero.setEnabled(false);
		
		
		JButton btnArquera = new JButton("");
		
		btnArquera.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"arquera"+commonExt)));
		//btnArquera.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/arquera.png")));
		btnArquera.setBounds(29, 110, 71, 88);
		this.add(btnArquera);
		//Borrado de del boton
		btnArquera.setContentAreaFilled(false);
		btnArquera.setOpaque(true);
		//btnArquera.setEnabled(false);
		
		
		JButton btnValquiria = new JButton("");
		
		btnValquiria.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"valquiria"+commonExt)));
		//btnValquiria.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/valquiria.png")));
		btnValquiria.setBounds(29, 209, 71, 88);
		this.add(btnValquiria);
		//Borrado de del boton
		btnValquiria.setContentAreaFilled(false);
		btnValquiria.setOpaque(true);
		btnValquiria.setEnabled(false);
		
		
		JButton btnMago = new JButton("");
		
		btnMago.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"mago"+commonExt)));
		//btnMago.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/mago.png")));
		btnMago.setBounds(29, 308, 71, 88);
		this.add(btnMago);
		//Borrado de del boton
		btnMago.setContentAreaFilled(false);
		btnMago.setOpaque(true);
		btnMago.setEnabled(false);
		
		
		JButton btnMegacaballero = new JButton("");
		
		btnMegacaballero.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"megacaballero"+commonExt)));
		//btnMegacaballero.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/megacaballero.png")));
		btnMegacaballero.setBounds(29, 407, 71, 88);
		this.add(btnMegacaballero);
		//Borrado de del boton
		btnMegacaballero.setContentAreaFilled(false);
		btnMegacaballero.setOpaque(true);
		btnMegacaballero.setEnabled(false);
	
	
	//ESTRUCTURAS
		JButton btnChoza = new JButton("");
		
		btnChoza.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"choza"+commonExt)));
		//btnChoza.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/choza.png")));
		btnChoza.setBounds(110, 11, 71, 88);
		this.add(btnChoza);
		//Borrado de del boton
		btnChoza.setContentAreaFilled(false);
		btnChoza.setOpaque(true);
		btnChoza.setEnabled(false);
		
		
		JButton btnInfernal = new JButton("");
	
		btnInfernal.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"infernal"+commonExt)));
		//btnInfernal.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/infernal.png")));
		btnInfernal.setBounds(110, 209, 71, 88);
		this.add(btnInfernal);
		//Borrado de del boton
		btnInfernal.setContentAreaFilled(false);
		btnInfernal.setOpaque(true);
		btnInfernal.setEnabled(false);
		
		
		JButton btnCannon = new JButton("");
	
		btnCannon.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"canon"+commonExt)));
		//btnCannon.setIcon(new ImageIcon(Mercado.class.getResource("/res/this/canon.png")));
		btnCannon.setBounds(110, 110, 71, 88);
		this.add(btnCannon);
		//Borrado de del boton
		btnCannon.setContentAreaFilled(false);
		btnCannon.setOpaque(true);
		btnCannon.setEnabled(false);
		
		
		
		
		JButton btnEnemigo = new JButton("");
		
		btnEnemigo.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"duende"+commonExt)));
		btnEnemigo.setBounds(110, 308, 71, 88);
		this.add(btnEnemigo);
		//Borrado de del boton
		btnEnemigo.setContentAreaFilled(false);
		btnEnemigo.setOpaque(true);
		btnEnemigo.setEnabled(true);
		
		
		
		
		JButton btnNuclear = new JButton("");
		btnNuclear.setIcon(new ImageIcon(Mercado.class.getResource(cardSource+"nuclear"+commonExt)));
		btnNuclear.setBounds(110, 407, 71, 88);
		this.add(btnNuclear);
		//Borrado de del boton
		btnNuclear.setContentAreaFilled(false);
		btnNuclear.setOpaque(true);
		
		
		
		
		
		
		
		

	//------------------------------------------------------------------/MERCADO---------------------------------------------
	}
}

