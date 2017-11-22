package Mapa;

import javax.swing.JLabel;

import GUI.Grafico;


	public abstract class ElementosMapa extends Grafico{
		
		public ElementosMapa(int x, int y) {
			super(x, y);
		}
		
		public abstract boolean visit(DisparoAli d);

		public abstract boolean visit(DisparoEne d);

		public abstract boolean visit(EnemigoContacto e);

		public abstract boolean visit(EnemigoDistancia e);

		public abstract void visit();

		public abstract boolean visit(Personaje j);

		public abstract void die();

}
