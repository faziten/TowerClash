package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.ElementosMapa;
import Mapa.Mapa;
import PowerUp.Tiempo;

public abstract class Unidad extends ElementosMapa {
		
		protected float vida_maxima;
		protected float vida;
		protected float da�o;
		protected int velocidad;	
		protected int precio;
		protected JLabel efecto;
		protected Tiempo miPWTiempo;

		public Unidad(int x, int y, float maxVida, float da�o, int velocidad, int valor) {
			super(x, y);
			this.vida_maxima = maxVida;
			vida = maxVida;
			this.da�o = da�o;
			this.velocidad = velocidad;
			this.precio = valor;
		}	
		
		public float getVida() {
			return vida;
		}
		
		public boolean rellenarVida() {
			return vida/vida_maxima==1;
		}
		
		public float getDa�o() {
			if (miPWTiempo!=null) {
				return miPWTiempo.getDa�o(da�o);
			}
			else {
				return da�o;
			}		
		}

		public int getPrecio() {
			return precio;
		}

		public abstract void accion();

		public void recuperarVida() {
			vida = vida_maxima;
		}

		public void recibirDa�o(float da�o) {
			if (miPWTiempo!=null) {
				vida -= miPWTiempo.recibirDa�o(da�o);
			}
			else {
				vida -= da�o;
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
