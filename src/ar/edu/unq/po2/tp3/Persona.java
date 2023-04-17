package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	String nombre;
	LocalDate fechaDeNacimiento;

	public Persona(String n, LocalDate fn) {
		this.nombre = n;
		this.fechaDeNacimiento = fn;
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public long getEdad() {
		LocalDate today = LocalDate.now();
		return ChronoUnit.YEARS.between(this.fechaDeNacimiento, today);
	}
	
	public Boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}

}
