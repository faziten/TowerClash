package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaCaballero extends GraficaUnidades{
	
	public GraficaCaballero(){

		imagen = new ImageIcon(this.getClass().getResource("/img.unidades/caballero.png"));
		miGrafico = new JLabel(imagen);
	}

}
