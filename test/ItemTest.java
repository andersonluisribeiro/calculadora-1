import static org.junit.Assert.*;

import org.junit.Test;


public class ItemTest {

	@Test
	public void deveCalcularOValorTotalDoItem() {
		
		Produto produto = new Produto();
		produto.valorUnitario = 2.99f;
		
		Item item = new Item();
		item.quantidade = 5f;
		item.produto = produto;
		
		Float resultado = item.valorTotal();
		Float resultadoEsperado = 14.95f;
	
		assertEquals(resultadoEsperado, resultado);
		
	}

}
