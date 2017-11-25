package Disparos;

import GUI.Grafico;

	public abstract class Disparo extends Grafico {

		public Disparo(int x, int y, float daño, int velocidad) {
			super(x, y);
			this.daño = daño;
			this.velocidad = velocidad;
		}
		
		protected float daño;
		protected int velocidad;

		public float getDaño() {
			return daño;
		}

		public abstract void mover();

}
