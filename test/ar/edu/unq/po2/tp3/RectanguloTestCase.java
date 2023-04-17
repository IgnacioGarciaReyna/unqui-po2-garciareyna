package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	Rectangulo rectanguloDefault;
	Rectangulo rectanguloPersonalizado;

	@BeforeEach
	public void setUp() throws Exception {
		Punto puntoInicial = new Punto(3, 3);
		rectanguloDefault = new Rectangulo();
		rectanguloPersonalizado = new Rectangulo(puntoInicial, 3, 4);
	}

	@Test
	void testAreaRectangulo() {
		assertEquals(1, rectanguloDefault.getArea());
		assertEquals(12, rectanguloPersonalizado.getArea());
	}

	@Test
	void testPerimetroRectangulo() {
		assertEquals(4, rectanguloDefault.getPerimetro());
		assertEquals(14, rectanguloPersonalizado.getPerimetro());
	}

	@Test
	void testDireccionRectangulo() {
		assertTrue(rectanguloPersonalizado.esHorizontal());
		assertFalse(rectanguloPersonalizado.esVertical());
	}

}
