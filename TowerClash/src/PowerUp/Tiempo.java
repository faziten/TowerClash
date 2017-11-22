package PowerUp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Mapa.Jugador;


public abstract class Tiempo extends PowerUp {

	public Tiempo(int x, int y) {
		super(x, y);
	}

	public abstract float getDa�o(float da�o);

	public abstract int getVelocidad(int vel);

	public abstract float recibirDa�o(float da�o);

	protected class UsarPWTiempo extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			pwTiempo btn = (pwTiempo) e.getSource();
			Jugador.getInstance().setPowerup(btn.getPW());
			Jugador.getInstance().eliminarPW(btn.getPW());
			new HiloPowerUp(5).start();
		}
	}
	{

}
