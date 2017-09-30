package GUI;

import java.awt.Image;
import java.util.HashMap;

import img.*;

import javax.imageio.ImageIO;

/**
 * 
 * @author Faccio
 * @author Fernandez
 * @author Orellano
 * 
 */

public class Pintor {
	
	private static final String source="/img/";
	private static final String ext=".png";
	HashMap<String, Image> mapeo=new HashMap<String, Image>(); //Las imagenes son halladas por su clave.
	
	//Nota sería piola implementar algo del palo 0-100 texturas de mapa 100-200 texturas de pjes, etc.
	private static Image tex0; //default
	private static Image tex1; //pasto
	private static Image tex2; //arena
	private static Image tex3; //Caballero
	private static Image tex4; //Duende
	
	private static Image tex5; //sangre humana
	private static Image tex6; //espacio de construccion de estructuras
	private static Image tex7; 
	private static Image tex8; 
	private static Image tex9; 
	private static Image tex10; 
	/**
	 * El constructor de la clase Pintor, se encarga de inicializar los objetos gráficos que corresponden a las texturas. Estas seran llamadas de forma dinámica por el juego a medida que se necesiten. 
	 * Iniciar las texturas y referenciarlas por su puntero ayuda a aumentar el rendimiento del dibujado.
	 */
	public Pintor(){
		try{
			tex0=ImageIO.read(getClass().getResourceAsStream(source+"0"+ext));
			mapeo.put("tex0", tex0);
			tex1=ImageIO.read(getClass().getResourceAsStream(source+"1"+ext));
			mapeo.put("tex1", tex1);
			tex2=ImageIO.read(getClass().getResourceAsStream(source+"2"+ext));
			mapeo.put("tex2", tex2);
			tex3=ImageIO.read(getClass().getResourceAsStream(source+"3"+ext));
			mapeo.put("tex3", tex3);
			tex4=ImageIO.read(getClass().getResourceAsStream(source+"4"+ext));
			mapeo.put("tex4", tex4);			
			tex5=ImageIO.read(getClass().getResourceAsStream(source+"5"+ext));
			mapeo.put("tex5", tex5);
			tex6=ImageIO.read(getClass().getResourceAsStream(source+"6"+ext));
			mapeo.put("tex6", tex6);
			tex7=ImageIO.read(getClass().getResourceAsStream(source+"7"+ext));
			mapeo.put("tex7", tex7);
			tex8=ImageIO.read(getClass().getResourceAsStream(source+"8"+ext));
			mapeo.put("tex8", tex8);
			tex9=ImageIO.read(getClass().getResourceAsStream(source+"9"+ext));
			mapeo.put("tex9", tex9);
			tex10=ImageIO.read(getClass().getResourceAsStream(source+"10"+ext));
			mapeo.put("tex10", tex10);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public Image getTextura(String code){
		return mapeo.get(code);
	}
}
