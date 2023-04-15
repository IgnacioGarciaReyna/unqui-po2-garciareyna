package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MultioperadorTestCase {
	private Multioperador multioperador;
	ArrayList<Integer> enteros;

	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();
		enteros = new ArrayList<Integer>();
		enteros.add(1);
		enteros.add(2);
		enteros.add(3);
	}

	@Test
	public void testSuma() {
		Integer suma = multioperador.Sumar(enteros);
		assertEquals(6, suma);
	}

	@Test
	public void testResta() {
		Integer resta = multioperador.Restar(enteros);
		assertEquals(-4, resta);
	}

	@Test
	public void testMultiplicacion() {
		Integer producto = multioperador.Multiplicar(enteros);
		assertEquals(6, producto);
	}
}
