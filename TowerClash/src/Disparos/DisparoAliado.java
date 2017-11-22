package Disparos;

import Mapa.ElementosMapa;
import Mapa.Jugador;
import Mapa.Mapa;

public class DisparoAliado extends Disparo{
	
	public DisparoAliado(int x, int y, float daño, int velocidad) {
		super(x, y, daño, velocidad);
	}
	
	public void mover() {
		ElementosMapa e;
		if (x/Mapa.EJE>=0)
			e = Jugador.getInstance().getEntidad(x/Mapa.EJE, y/Mapa.EJE); 
		else {
			if (x<-Mapa.EJE)
				Jugador.getInstance().eliminar(this);		
			e = null;
		}
		if (e!=null) {
			if (e.visit(this))
				Jugador.getInstance().eliminar(this);
			else {
				if (x/Mapa.EJE+1<Mapa.ANCHO)
					e = Jugador.getInstance().getEntidad(x/Mapa.EJE, y/Mapa.EJE); 
				else
					e = null;
				if (e!=null && e.visit(this)) 
					Jugador.getInstance().eliminar(this); 
				else {
					x-=velocidad;
					lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
				}				
			}
		}
		else {
			x-=velocidad;
			lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		}
	}

}
