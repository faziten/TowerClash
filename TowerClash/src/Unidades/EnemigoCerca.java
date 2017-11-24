package Unidades;

import Mapa.ElementosMapa;
import Mapa.Jugador;
import Mapa.Mapa;

public abstract class EnemigoCerca extends Enemigo {

	public EnemigoCerca(int x, int y, float maxVida, float daño, int velocidad, int valor) {
		super(x, y, maxVida, daño, velocidad, valor);
	}
	
	public void accion() {
		if (x>=Mapa.EJE*Mapa.ANCHO) {
			Jugador.getInstance().GameOver(false);
		}
		else {
			ElementosMapa e = Jugador.getInstance().getElemento(x/Mapa.EJE+1, y/Mapa.EJE);
			if (e!=null) {
				if (e.visit(this)) {
					lbl.setIcon(icono);
				}
							
			}
			else {
				if (miPWTiempo!=null) {
					x+= miPWTiempo.getVelocidad(velocidad);
				}
				else {
					x+= velocidad;
				}		
				lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);	
			}
		}		
	}	
}

		
