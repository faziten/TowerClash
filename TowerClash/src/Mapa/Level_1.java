package Mapa;

import javax.swing.ImageIcon;

public class Level_1 extends Mapa {

	public Level_1() {
		super();
		icono = new ImageIcon(this.getClass().getResource("/images/cesped.jpg"));	
	}
	
	public Mapa reiniciarLevel(boolean completado) {
		if (completado) {
			return null;
		}
		else {
			return new Level_1();
		}
	}

}
