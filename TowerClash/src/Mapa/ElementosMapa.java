package Mapa;

import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import GUI.Grafico;
import Unidades.EnemigoCerca;
import Unidades.EnemigoLejos;
import Unidades.Unidad;


	public abstract class ElementosMapa extends Grafico{
		
		public ElementosMapa(int x, int y) {
			super(x, y);
		}
		
		public abstract boolean visit(DisparoAliado d);

		public abstract boolean visit(DisparoEnemigo d);

		public abstract boolean visit(EnemigoCerca e);

		public abstract boolean visit(EnemigoLejos e);

		public abstract void visit();

		public abstract boolean visit(Unidad u);

		public abstract void die();

}
