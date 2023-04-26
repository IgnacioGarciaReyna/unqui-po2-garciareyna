package ar.edu.unq.po2.tp3;

public class Trabajador {
	String nombre;
	String apellido;
	int edad;

	public Trabajador(String n, String a, int e) {
		nombre = n;
		apellido = a;
		edad = e;
	}

	public int getEdad() {
		return edad;
	}
}
