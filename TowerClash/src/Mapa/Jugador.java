package Mapa;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedDeque;

import Disparos.Disparo;
import GUI.GUI;
import Hilos.HiloAliados;
import Hilos.HiloDisparos;
import Hilos.HiloEnemigos;
import Hilos.HiloHordas;
import Hilos.HiloPowerUp;
import Objeto.Objeto;
import PowerUp.Bomba;
import PowerUp.Congelar;
import PowerUp.Curacion;
import PowerUp.Furia;
import PowerUp.PowerUp;
import PowerUp.Tiempo;
import Unidades.*;


public class Jugador {
	private static Jugador instance;
	private static int dinero_inicial = 300;
	
	protected int dinero;
	protected int puntaje;
	protected Mapa mapa; 
	protected GUI gui;
	
	private Tiempo pwTiempo;

	private Collection<Aliado> misAliados; 
	private Collection<Enemigo> misEnemigos;
	private Collection<Disparo> misDisparos;

	//Hilos
	private HiloEnemigos he;
	private HiloAliados ha;
	private HiloDisparos hd;
	private HiloHordas hh;
	
	
	public Jugador(){
		misAliados = new ConcurrentLinkedDeque<Aliado>();
		misEnemigos = new ConcurrentLinkedDeque<Enemigo>();
		misDisparos = new ConcurrentLinkedDeque<Disparo>();		
		
		dinero = dinero_inicial;

	}
	//Para que se cree solo un jugador
	public static Jugador getInstance() {
		if (instance==null) {
			instance = new Jugador();
		}
		return instance;
	}
	
	public void crearMapa() {
		mapa = new Level_1();
		gui.setFondo(mapa);
	}

	public void crearHilos() {
		ha = new HiloAliados();
		ha.start();
		he = new HiloEnemigos();	
		he.start();
		hd = new HiloDisparos();
		hd.start();	
		hh = new HiloHordas();
		hh.start();
	}
	
	public void setGUI(GUI gui) {
		this.gui = gui;
	}

	public void crearNivel(boolean completado) {
		puntaje = 0;
		dinero = dinero_inicial;
		gui.refrescar();
		mapa = mapa.reiniciarLevel(completado);
		gui.setFondo(mapa);
		if (mapa!=null) {
			crearHilos();
		}		
	}

	public void GameOver(boolean ganaste) {
		misAliados = new ConcurrentLinkedDeque<Aliado>();
		misEnemigos = new ConcurrentLinkedDeque<Enemigo>();
		misDisparos = new ConcurrentLinkedDeque<Disparo>();
		he.gameOver();
		ha.GameOver();
		hd.GameOver();	
		hh.GameOver();
		gui.GameOver(ganaste);
		
	}

	public void moverJugadores() {
		for (Unidad u : misAliados) {
			u.accion();		
		}
	}

	public void moverEnemigos() {	
		for (Enemigo e : misEnemigos) {
			e.accion();
			mapa.setElemento(e);
		}		
	}	

	public void moverDisparos() {
		gui.repaint();
		for (Disparo d : misDisparos) {
			d.mover();			
		}
	}		
	
	public void crearJugador(Aliado j) {
		j.setPW(pwTiempo);
		misAliados.add(j);
		mapa.setElemento(j);
		gui.crearGrafico(j, 1);
		dinero -= j.getPrecio();
	}

	public Enemigo crearEne() {
		Random rnd = new Random();
		int fila = rnd.nextInt(6);
		int r = rnd.nextInt(100);		
		Enemigo e;
		if (r>=0 && r<25) {
			e = new Barbaro(-Mapa.EJE, fila*Mapa.EJE);
		} else if (r>=25 && r<45) {
			e = new Pekka(-Mapa.EJE, fila*Mapa.EJE);
		} else if (r>=45 && r<65) {
			e = new Gigante(-Mapa.EJE, fila*Mapa.EJE);
		} else if (r>=65 && r<85) {
			e = new Chispitas(-Mapa.EJE, fila*Mapa.EJE);
		} else if (r>=85 && r<95) {
			e = new Duende(-Mapa.EJE, fila*Mapa.EJE);
		} else {
			e = new Esqueleto(-Mapa.EJE, fila*Mapa.EJE);
		}
		if (rnd.nextInt(9)==0) {
			e.setPW(new Curacion(-Mapa.EJE, fila*Mapa.EJE));
			HiloPowerUp hpu = new HiloPowerUp(10, e);
			hpu.start();
		}
		misEnemigos.add(e);
		gui.crearGrafico(e, 1);
		return e;
	}	

	public void crearDisparo(Disparo d) {
		misDisparos.add(d);
		gui.crearGrafico(d, 2);
	}

	public void crearObjeto(Objeto oc) {
		mapa.setElemento(oc);
		gui.crearGrafico(oc, 2);
		dinero -= oc.getValor();
	}

	public void eliminar(Aliado j) {
		gui.eliminarGrafico(j);
		mapa.eliminarElementoMapa(j);
		misAliados.remove(j);
	}

	public void eliminar(Enemigo e) {
		puntaje += e.getPrecio();
		dinero += e.getPrecio();
		gui.eliminarGrafico(e);
		gui.refrescar();
		mapa.eliminarElementoMapa(e);
		misEnemigos.remove(e);
	}
	
	public void eliminarEnemigos(int fila) {
		Enemigo [] en = new Enemigo[misEnemigos.size()];
		int i = 0;
		for (Enemigo e : misEnemigos) {
			if (e.getY()==fila) {
				en[i] = e;
				i++;
			}
		}
		i = 0;
		while (i<en.length && en[i]!=null) {
			eliminar(en[i]);
			i++;
		}
	}

	public void eliminar(Disparo d) {
		misDisparos.remove(d);		
		gui.eliminarGrafico(d);
	}

	public void dibujarObjeto(Objeto o) {
		gui.crearGrafico(o, 1);
	}


	public int getPuntos() {
		return puntaje;		
	}

	public int getDinero() {
		return dinero;
	}
	
	public ElementosMapa getElemento(int x, int y) {
		return mapa.getElemento(x, y);
	}

	public void setPowerup(Tiempo pu) {
		pwTiempo = pu;
		for (Unidad u : misAliados) {
			u.setPW(pwTiempo);
		}
	}

	public void dropPowerUp(int x, int y) {
		Random rnd = new Random();
		int r = rnd.nextInt(100);
		PowerUp pu;
		
		if (r>=0 && r<25) {
			pu = new Furia(x, y);
		}
		else if (r>=25 && r<50) {
			pu = new Bomba(x, y);
		}
		else if (r>=50 && r<75) {
			pu = new Congelar(x, y);
		}
		else 
			pu = new Curacion(x, y);
		
		gui.crearGrafico(pu, 2);
	}
	
	public void eliminarPW(PowerUp pu) {
		gui.eliminarGrafico(pu);
	}

	public boolean hayPowerUpActivo() {
		return pwTiempo!=null;
	}

	public void congelarEnemigos(int seg) {
		he.congelar(seg);
		hh.congelar(seg);
	}

	public void hacerDañoEnemigos(float daño) {
		for (Enemigo e : misEnemigos) {
			e.recibirDaño(daño);
		}
	}

	public boolean hayEnemigos() {
		return !misEnemigos.isEmpty();
	}
	
	public void venderUnidad(Aliado j) {
		if (j.rellenarVida()) {
			dinero += j.getPrecio();
		}
		else {
			dinero += j.getPrecio()/2;
		}
		gui.refrescar();
		j.die();
	}
	
	public void eliminarObjeto(Objeto o) {
		mapa.eliminarElementoMapa(o);
		gui.eliminarGrafico(o);
	}
}

