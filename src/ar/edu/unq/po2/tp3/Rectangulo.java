package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private int alto;
	private int ancho;
	private Punto puntoDeInicio;

	Rectangulo(Punto p, int al, int an) {
		puntoDeInicio = p;
		setAlto(al);
		setAncho(an);
	}

	private void setAlto(int al) {
		alto = al;
	}

	private void setAncho(int an) {
		ancho = an;
	}

	public int getArea() {
		return alto * ancho;
	}

	public int getPerimetro() {
		return (alto * 2) + (ancho * 2);
	}

	public Boolean esHorizontal() {
		return ancho > alto;
	}

	public Boolean esVertical() {
		return alto > ancho;
	}
}
