package Unidades;

public abstract class Enemigo extends Terrestre{
	
	public synchronized void moveteChiquitaMovete(int X, int Y){ //PARA SPRINT 3 asume valores razonables :D
		int x=celdaActual.obtenerCoordX();
		int y=celdaActual.obtenerCoordY();
		if(celdaActual.obtenerCoordX()>X & celdaActual.obtenerCoordY()>Y) 									//mover para izquierda arriba										
			moveNext(x-1, y-1);	
		else
			if(celdaActual.obtenerCoordX()>X & celdaActual.obtenerCoordY()<Y)									//mover para izquierda abajo										
				moveNext(x-1, y+1);
			else
				if(celdaActual.obtenerCoordX()>X & celdaActual.obtenerCoordY()==Y)									//mover para izquierda 										
					moveNext(x-1, y);
				else
					if(celdaActual.obtenerCoordX()<X & celdaActual.obtenerCoordY()>Y)									//mover para derecha arriba										
						moveNext(x+1, y-1);
					else
						if(celdaActual.obtenerCoordX()<X & celdaActual.obtenerCoordY()<Y)									//mover para derecha abajo									
							moveNext(x+1, y+1);
						else
							if(celdaActual.obtenerCoordX()<X & celdaActual.obtenerCoordY()==Y)									//mover para derecha									
								moveNext(x+1, y);
							else
								if(celdaActual.obtenerCoordX()==X & celdaActual.obtenerCoordY()>Y)									//mover para arriba									
									moveNext(x, y-1);
								else
									if(celdaActual.obtenerCoordX()==X & celdaActual.obtenerCoordY()<Y)									//mover para abajo									
										moveNext(x, y+1);
		}

	/**
	 * Pasito a pasito suavecito. 
	 * @param x	coord x
	 * @param y coord y. 
	 */
	private synchronized void moveNext(int x, int y){
		celdaActual.vaciarUnidad(); 
		celdaActual.setCode(-1, 0, -1, -1);
		
		celdaActual=celdaActual.obtenerCelda(x, y);
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 4, -1, -1); //SOBREESCRIBIR EN LAS UNIDADESSS el 0 es textura transparente -.-
	}
	
}