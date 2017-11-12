package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaMago extends GraficaUnidades{
	
	public GraficaMago(){

		imagen = new ImageIcon(this.getClass().getResource("/img.unidades/mago.png"));
		miGrafico = new JLabel(imagen);
	}

}
