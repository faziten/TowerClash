package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaArquera extends GraficaUnidades{
	
	public GraficaArquera(){
		imagen = new ImageIcon(this.getClass().getResource("/img.unidades/arquera.png"));
		miGrafico = new JLabel(imagen);
	}

}
