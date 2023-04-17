package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;

public class PersonaTestCase {
	Persona persona1;
	Persona persona2;
	LocalDate nacimiento1;
	LocalDate nacimiento2;
	
	@BeforeEach
	public void setUp() throws Exception {
		nacimiento1 = LocalDate.of(1972, Month.MAY, 23);
		nacimiento2 = LocalDate.of(1952, Month.FEBRUARY, 27);
		persona1 = new Persona("Charles Xavier", nacimiento1);
		persona2 = new Persona("Gandalf 'El Gris'", nacimiento2);
	}
	
}
