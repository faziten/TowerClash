package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficaChispitas extends GraficaUnidades{
	
	public GraficaChispitas(){
		imagen = new ImageIcon(this.getClass().getResource("/img.enemigos/chispitas.png"));
		miGrafico = new JLabel(imagen);
		
	}

}
