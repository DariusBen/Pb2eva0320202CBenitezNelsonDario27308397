package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestAutoPista {

	@Test
	public void queSePuedaRegistrarTelepase() {
		Autopista mayo = new Autopista();
		
		Automovil auto = new Automovil("ABC123", 50, 80);
		
		mayo.registrarTelepase(555, auto);
		
		assertEquals("ABC123",  mayo.ObtenerVehiculoPorTelepase(555).getPatente());
		
	}

	@Test(expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista Mayo = new Autopista();

		Vehiculo miauto = new Vehiculo("AAABBB12",60, 80);

		Mayo.salirAutpista(miauto);
	}

	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() {

	}

}
