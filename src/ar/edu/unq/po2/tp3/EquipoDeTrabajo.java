package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	String nombre;
	ArrayList<Trabajador> integrantes = new ArrayList<Trabajador>();
	
	public void addIntegrante(Trabajador t) {
		integrantes.add(t);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPromedioEdadIntegrantes() {
		return integrantes.stream().mapToInt(t -> t.getEdad()).sum();
	}
}
