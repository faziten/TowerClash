package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaGigante extends GraficaUnidades{
	public GraficaGigante(){

		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/gigante.png"));
		miGrafico = new JLabel(imagen);
	}

}
