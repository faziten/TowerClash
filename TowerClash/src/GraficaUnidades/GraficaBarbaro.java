package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaBarbaro extends GraficaUnidades{
	
	public GraficaBarbaro(){

		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/barbaro.png"));
		miGrafico = new JLabel(imagen);
	}

}
