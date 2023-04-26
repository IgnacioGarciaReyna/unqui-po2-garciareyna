package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	EquipoDeTrabajo equipo = new EquipoDeTrabajo();

	@Test
	void PromedioEdadEquipoTest() {
		Trabajador persona1 = new Trabajador("Harry", "Potter", 11);
		Trabajador persona2 = new Trabajador("Frodo", "Bolson", 80);
		Trabajador persona3 = new Trabajador("Albus", "Dumbledore", 145);
		Trabajador persona4 = new Trabajador("Bilbo", "Bolson", 110);
		Trabajador persona5 = new Trabajador("Anakin", "Skywalker", 11);
		equipo.addIntegrante(persona1);
		equipo.addIntegrante(persona2);
		equipo.addIntegrante(persona3);
		equipo.addIntegrante(persona4);
		equipo.addIntegrante(persona5);
		assertEquals(equipo.getPromedioEdadIntegrantes(), 357);
	}

}
