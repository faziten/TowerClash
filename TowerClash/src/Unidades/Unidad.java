package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.ElementosMapa;
import Mapa.Mapa;
import PowerUp.Tiempo;

public abstract class Unidad extends ElementosMapa {
		
		protected float vida_maxima;
		protected float vida;
		protected float daño;
		protected int velocidad;	
		protected int precio;
		protected JLabel efecto;
		protected Tiempo miPWTiempo;

		public Unidad(int x, int y, float maxVida, float daño, int velocidad, int valor) {
			super(x, y);
			this.vida_maxima = maxVida;
			vida = maxVida;
			this.daño = daño;
			this.velocidad = velocidad;
			this.precio = valor;
		}	
		
		public float getVida() {
			return vida;
		}
		
		public boolean rellenarVida() {
			return vida/vida_maxima==1;
		}
		
		public float getDaño() {
			if (miPWTiempo!=null) {
				return miPWTiempo.getDaño(daño);
			}
			else {
				return daño;
			}		
		}

		public int getPrecio() {
			return precio;
		}

		public abstract void accion();

		public void recuperarVida() {
			vida = vida_maxima;
		}

		public void recibirDaño(float daño) {
			if (miPWTiempo!=null) {
				vida -= miPWTiempo.recibirDaño(daño);
			}
			else {
				vida -= daño;
			}	
			if (vida<=0) {
				die();
			}
		}

		public void setPW(Tiempo pu) {
			miPWTiempo = pu;
			efecto(pu!=null);
		}
		
		protected void agregarPW() {
			efecto = new JLabel();
			lbl.add(efecto);
			efecto.setBounds(0, 0, Mapa.EJE, Mapa.EJE);
		}

		protected void efecto(boolean hayPU) {
			if (efecto!=null) {
				if (hayPU) {
					efecto.setIcon(new ImageIcon(this.getClass().getResource("/images/curacion.png")));
				}
				else {
					efecto.setIcon(null);
				}
			}		
		}

}
