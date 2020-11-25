package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable {

	
	final Integer VELOCIDADMAXIMA = 80;
	
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado
	
	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		
		super(patente, velocidadActual, limiteVelocidad);
		// TODO Auto-generated constructor stub
	}

	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		
		super(patente, velocidadActual, limiteVelocidad);
		
		this.cantidadDeEjes = cantidadDeEjes;
	}


	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}



	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	

	@Override
	public Boolean enInfraccion() {

		return this.getVelocidadActual() >= this.VELOCIDADMAXIMA;
	}
	
}
