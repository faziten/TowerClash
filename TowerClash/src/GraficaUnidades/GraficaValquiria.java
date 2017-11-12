package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaValquiria extends GraficaUnidades {
	
	public GraficaValquiria(){
		
	imagen = new ImageIcon(this.getClass().getResource("/img.unidades/valquiria.png"));
	miGrafico = new JLabel(imagen);
	
	}
}
