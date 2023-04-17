package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(Punto p, int largoLados) {
		super();
		this.puntoDeInicio = p;
		this.setAlto(largoLados);
		this.setAncho(largoLados);
	}
}
