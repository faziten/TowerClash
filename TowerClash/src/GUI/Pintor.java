package GUI;

import java.awt.Image;
import java.util.HashMap;

import img.*;

import javax.imageio.ImageIO;

/**
 * La existencia de esta clase, se justifica con optimizar el renderizado. No es necesaria, ni bonita, pero acelera bastante el asunto. 
 * @author Faccio
 * @author Fernandez
 * @author Orellano
 * 
 */

public class Pintor {
	
	private static final String source="/img/";
	private static final String ext=".png";
	HashMap<String, Image> mapeo=new HashMap<String, Image>(); //Las imagenes son halladas por su clave.
	Image[] arreglo=new Image[100]; //Nota, este numero puede ser mas grande por ahora puse 100. 

	/**
	 * El constructor de la clase Pintor, se encarga de inicializar los objetos gráficos que corresponden a las texturas. Estas seran llamadas de forma dinámica por el juego a medida que se necesiten. 
	 * Iniciar las texturas ayuda a aumentar el rendimiento del dibujado.
	 */
	
	public Pintor(){
		
		
		
		try{
			for(int i=0; i<arreglo.length;i++){
				arreglo[i]=ImageIO.read(getClass().getResourceAsStream(source+Integer.toString(i)+ext));}	
		}catch (Exception e){
			System.out.println("Textura no cargada: ");
		}
		
	}
	public Image getTextura(String code){
		return arreglo[Integer.parseInt(code)];
	}
}
