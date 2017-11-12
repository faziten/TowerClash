package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaEsqueleto extends GraficaUnidades{
	
	public GraficaEsqueleto(){
		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/esqueleto.png"));
		miGrafico = new JLabel(imagen);
	}

}
