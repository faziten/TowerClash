package Mapa;

import javax.swing.JLabel;

import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import GUI.Grafico;
import Unidades.Unidad;


	public abstract class ElementosMapa extends Grafico{
		
		public ElementosMapa(int x, int y) {
			super(x, y);
		}
		
		public abstract boolean visit(DisparoAliado d);

		public abstract boolean visit(DisparoEnemigo d);

		public abstract boolean visit(EnemigoContacto e);

		public abstract boolean visit(EnemigoDistancia e);

		public abstract void visit();

		public abstract boolean visit(Unidad u);

		public abstract void die();

}
