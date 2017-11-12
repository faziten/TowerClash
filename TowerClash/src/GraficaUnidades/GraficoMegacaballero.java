package GraficaUnidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GraficoMegacaballero extends GraficaUnidades{
	
	public GraficoMegacaballero(){

		imagen = new ImageIcon(this.getClass().getResource("/img.unidades/megacaballero.png"));
		miGrafico = new JLabel(imagen);
	}

}
