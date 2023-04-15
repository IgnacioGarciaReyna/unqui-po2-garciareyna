package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTestCase {

	@Test
	void testPuntoDefault() {
		Punto puntoDefault = new Punto();
		assertEquals(0, puntoDefault.getX());
		assertEquals(0, puntoDefault.getY());
	}
	
	@Test
	void testPuntoPersonalizado() {
		Punto puntoPersonalizado = new Punto(1,2);
		assertEquals(1, puntoPersonalizado.getX());
		assertEquals(2, puntoPersonalizado.getY());
	}
	
	@Test
	void testSumarPunto() {
		Punto puntoDefault = new Punto();
		Punto puntoPersonalizado = new Punto(1,2);
		Punto nuevoPunto = puntoDefault.sumarPunto(puntoPersonalizado);
		assertEquals(1, nuevoPunto.getX());
		assertEquals(2, nuevoPunto.getY());
	}

}
