package Unidades;

import Mapa.ElementosMapa;
import Mapa.Jugador;
import Mapa.Mapa;

public abstract class EnemigoLejos extends Enemigo {

	protected int rango;
	protected float tiempo;

	public EnemigoLejos(int x, int y, float maxVida, float daño, int velocidad, int valor, int alcance) {
		super(x, y, maxVida, daño, velocidad, valor);
		this.rango = alcance;
	}
	
	public void accion() {
		if (x>=Mapa.EJE*Mapa.ANCHO) {
			Jugador.getInstance().GameOver(false);
		}
		else {
			if (tiempo<=0) {
				ElementosMapa e = null;
				boolean encontre = false;
				int i = 1;
				while (!encontre && i<=rango && (x/Mapa.EJE+i<=Mapa.ANCHO) && (x/Mapa.EJE+i>=0)) {
					e = Jugador.getInstance().getElemento(x/Mapa.EJE+i, y/Mapa.EJE);
					if (e!=null) {
						encontre = e.visit(this);
					}	
					i++;
				}
				if (encontre && x>0) {
					crearDisparo();
					tiempo = 2.5f;
				}
				else {
					e = Jugador.getInstance().getElemento(x/Mapa.EJE+1, y/Mapa.EJE);
					if (e==null) {
						if (miPWTiempo!=null) {
							x+= miPWTiempo.getVelocidad(velocidad);
						}
						else {
							x+= velocidad;
						}			
						lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);	
					}	
					else {
						lbl.setIcon(icono);
					}
				}
			}
			else {
				tiempo -= 0.125;
			}
		}		
	}
	protected abstract void crearDisparo();
}
