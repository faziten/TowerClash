package Mapa;


public class Jugador {
	
	private static Jugador unicoJugador; //Aplico singleton para crear un solo jugador.
	protected int oro;
	protected int puntaje;
	protected int tiempo; //esto debe ser un timer para a medida que pase el tiempo se vayan creando enemigos
	protected Mapa map; 
	
	public Jugador(int oro){
		this.oro=oro;
		puntaje=0;
		map= new Mapa(); 
	}
	
	public Jugador(){
		this(500);
	}
	
	//Estos metodos son mas que nada para que los use la GUI.
	public int getOro() {
		return oro;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setMonedas(int oro) {
		this.oro = oro;
	}
	
	public void setPuntos(int puntaje) {
		this.puntaje = puntaje;
	}

	public static Jugador getUnicoJugador(){
		if(unicoJugador == null)
			unicoJugador = new Jugador();
		return unicoJugador;
	}
	
	public void agregarPuntaje(int masPuntaje){
		puntaje+=masPuntaje;
	}
	
	public void agregarOro(int masOro){
		oro+=masOro;
	}

}
