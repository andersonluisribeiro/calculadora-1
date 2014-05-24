import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

	Calculadora calculadora;
	
	@Before
	public void inicio(){
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveSomar() {
		Integer resultado = calculadora.somar(10, 20);
		Integer resultadoEsperado = 30;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveMultiplicar(){
		Integer resultado = calculadora.multiplicar(2, 3);
		Integer resultadoEsperado = 6;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveSubtrair(){
		Integer resultado = calculadora.subtrair(5, 60);
		Integer resultadoEsperado = 55;
		assertEquals(resultadoEsperado, resultado);
	}

}
