package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Mapa.ElementosMapa;
import Mapa.Jugador;
import Mapa.Mapa;


public class GUI extends JFrame{
	
	protected static GUI game;
	
	
	//PANELES
	private JPanel cartas;
	private JPanel objetos;
	private JPanel panelJuego;
	
	//Labels Informacion
	private JLabel puntaje;
	private JLabel monedas;
	private JLabel fondo;
	

	
	private BotonAbstracto unidadActual;
	
	
	
	
	public GUI(){
		getContentPane().setLayout(null);
		panelJuego=new JPanel();
		panelJuego.setLayout(new FlowLayout());
		setContentPane(panelJuego);
		setBounds(200, 100, 1100, 480);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		panelJuego.setSize(640, 384);
		
		cartas= new JPanel(new GridLayout(5, 1));
		panelJuego.add(cartas);
		cartas.add(new BotonCaballero(new OyenteCrear()));
		cartas.add(new BotonArquera(new OyenteCrear()));
		cartas.add(new BotonValquiria(new OyenteCrear()));
		cartas.add(new BotonMago(new OyenteCrear()));
		cartas.add(new BotonMegacaballero(new OyenteCrear()));
		
		fondo = new JLabel();		
		fondo.setBorder(new LineBorder(new Color(0, 0, 0)));
		fondo.addMouseListener(new OyenteCrearEliminar());
		panelJuego.add(fondo);
	
		objetos= new JPanel(new GridLayout(4, 1));
		objetos.add(new BotonGolem(new OyenteCrear()));
		objetos.add(new BotonGlobo(new OyenteCrear()));
		objetos.add(new BotonLago(new OyenteCrear()));		
		objetos.add(new BotonLava(new OyenteCrear()));
		panelJuego.add(objetos);
		
		puntaje = new JLabel("Puntos: " + Jugador.getInstance().getPuntos());
		puntaje.setFont(new Font("Tahoma", Font.PLAIN, 30));
		monedas = new JLabel("Dinero: " + Jugador.getInstance().getDinero());
		monedas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		objetos.add(monedas);
		objetos.add(puntaje);
		
		cargarLogica();
		
	}
	
	public void refrescar() {
		puntaje.setText("Puntos : " + Jugador.getInstance().getPuntos());
		monedas.setText("Dinero : " + Jugador.getInstance().getDinero());
	}
	
	public void setFondo(Mapa m) {
		if (m!=null) {
			fondo.setIcon(m.getIcono());
		}
		else {
			panelJuego.removeAll();			
		}
		repaint();
	}

	public void crearGrafico(Grafico g, int capa) {
		fondo.add(g.getLbl());
		g.getLbl().setBounds(g.getX(), g.getY(), Mapa.EJE, Mapa.EJE);
		if (capa>=0 && capa<fondo.getComponentCount()) {
			fondo.setComponentZOrder(g.getLbl(), capa);
		}		
	}
	

	public void eliminarGrafico(Grafico g) {
		fondo.remove(g.getLbl());
	}
	private void cargarLogica() {
		Jugador.getInstance().setGUI(this);
		Jugador.getInstance().crearMapa();
		Jugador.getInstance().crearHilos();
	}
	

	public void GameOver(boolean ganaste) {
		repaint();
		JLabel label;	
		fondo.removeAll();
		if (ganaste) {
			label = new JLabel("Has ganado!");
		} else {			
			label = new JLabel("Has perdido!");	
		}		
		label.setFont(new Font("Tahoma", Font.PLAIN, 80));
		fondo.add(label);
		label.setBounds(100, 0, 640, 384);
	}
	
	
	private class OyenteCrear implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {	
			if (unidadActual!=null) {
				unidadActual.setBorder(null);
			}
			unidadActual = (BotonAbstracto) e.getSource();
			unidadActual.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		}
	}
	
	private class OyenteCrearEliminar extends MouseAdapter {		
		
		public void mouseClicked(MouseEvent e) {			
			if (unidadActual!=null) {
				if (e.getX()>=196 && Jugador.getInstance().getElemento(e.getX()/Mapa.EJE, e.getY()/Mapa.EJE)==null && e.getButton()==MouseEvent.BUTTON1) {
					unidadActual.crearUnidadObjeto(e.getX()/Mapa.EJE*Mapa.EJE, e.getY()/Mapa.EJE*Mapa.EJE);
					refrescar();
				}
				unidadActual.setBorder(null);
				unidadActual = null;
			}
			else {
				if (e.getButton()==MouseEvent.BUTTON3) {	
					ElementosMapa en = Jugador.getInstance().getElemento(e.getX()/Mapa.EJE, e.getY()/Mapa.EJE);
					if (en!=null) {
						en.visit();
					}
				}
			}
		}
	}
	

public static void main(String [] arg){
		GUI window= new GUI();
		window.setVisible(true);
	}
}
