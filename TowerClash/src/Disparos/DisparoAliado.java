package Disparos;


public class DisparoAliado extends Disparo{
	//protected MoverDisparoAliado moverme;
	
	public void mover()
	{
		
	}
	
	public void destruir()
	{
		//moverme.terminate();
		super.quitar();
	}

}
