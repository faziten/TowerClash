package Disparos;

import GUI.Grafico;

	public abstract class Disparo extends Grafico {

		public Disparo(int x, int y, float da�o, int velocidad) {
			super(x, y);
			this.da�o = da�o;
			this.velocidad = velocidad;
		}
		
		protected float da�o;
		protected int velocidad;

		public float getDa�o() {
			return da�o;
		}

		public abstract void mover();

}
