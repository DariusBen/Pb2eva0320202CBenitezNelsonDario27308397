package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;



public class Autopista {
	// Si es necesario Utilice herencia o implemente de Interfaces
	// Se debe crear contructeres getters y Setters y los atributos o metodos que
	// crean convenientes
	private HashMap<Integer, Vehiculo> telepase = new HashMap<>();
	private HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<>();

	public Autopista() {
		
	}

	
	public Boolean ingresarAutopista(Integer numeroTelepase) throws Exception {
		// si el telepase no esta registrado lanza una Exceptios del tipo
		// VehiculoNotFounException
		// y no permite ingresar al autopista
		boolean puedeIngresar = true;
		
		if (!telepase.containsKey(numeroTelepase))
		{
		
			puedeIngresar = false;
		
			throw new VehiculoNotFounException("No tiene telepase");
		
		}
		else
		{
			vehiculosEnCirculacion.add(telepase.get(numeroTelepase));
		}
		
		return puedeIngresar;
	}

	public void salirAutpista(Vehiculo vehiculo) throws Exception {
		// lanza Una exception VehiculoNotFounException si no esta en circulacion
		
		if (!vehiculosEnCirculacion.contains(vehiculo))
		{
	
			throw new VehiculoNotFounException("El vehiculo no esta en circulacion");
		
		}
		else
		{
			vehiculosEnCirculacion.remove(vehiculo);
		}

	}

	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente() {

		return null;
	}

	public Integer cantidadDeVehiculosENCirculacion() {

		return vehiculosEnCirculacion.size() - 1;
	}


	public HashSet<Vehiculo> getVehiculosEnCirculacion() {
		return vehiculosEnCirculacion;
	}

	public void setVehiculosEnCirculacion(HashSet<Vehiculo> vehiculosEnCirculacion) {
		this.vehiculosEnCirculacion = vehiculosEnCirculacion;
	}

	public Boolean registrarTelepase(Integer numeroTelpase, Vehiculo vehiculo) {
		
		telepase.put(numeroTelpase, vehiculo);
		
		return null;
	}
	
	
	public Vehiculo ObtenerVehiculoPorTelepase(Integer numeroTelepase) {

		Vehiculo aux = null;
		
		if (telepase.containsKey(numeroTelepase))
		{
			aux = telepase.get(numeroTelepase);
		}
		
		return aux;
	}

	
	

}
