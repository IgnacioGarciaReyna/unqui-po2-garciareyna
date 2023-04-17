package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	Cuadrado cuadradoDefault;
	Cuadrado cuadradoPersonalizado;

	@BeforeEach
	public void setUp() throws Exception {
		Punto puntoInicial = new Punto(3, 3);
		cuadradoDefault = new Cuadrado();
		cuadradoPersonalizado = new Cuadrado(puntoInicial, 3);
	}

	@Test
	void testAreaCuadrado() {
		assertEquals(1, cuadradoDefault.getArea());
		assertEquals(9, cuadradoPersonalizado.getArea());
	}

	@Test
	void testPerimetroCuadrado() {
		assertEquals(4, cuadradoDefault.getPerimetro());
		assertEquals(12, cuadradoPersonalizado.getPerimetro());
	}

	@Test
	void testDireccionCuadrado() {
		assertFalse(cuadradoPersonalizado.esHorizontal());
		assertFalse(cuadradoPersonalizado.esVertical());
	}
}
