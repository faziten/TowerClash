package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaPekka extends GraficaUnidades{
	public GraficaPekka(){
		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/pekka.png"));
		miGrafico = new JLabel(imagen);
	}

}
