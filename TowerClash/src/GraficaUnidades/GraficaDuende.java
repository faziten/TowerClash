package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaDuende extends GraficaUnidades{
	
	public GraficaDuende(){
		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/duende.png"));
		miGrafico = new JLabel(imagen);
	}

}
