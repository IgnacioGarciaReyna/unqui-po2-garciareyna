package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private int alto;
	private int ancho;
	protected Punto puntoDeInicio;
	
	public Rectangulo() {
		this.puntoDeInicio = new Punto();
		this.setAlto(1);
		this.setAncho(1);
	};

	public Rectangulo(Punto p, int al, int an) {
		this.puntoDeInicio = p;
		this.setAlto(al);
		this.setAncho(an);
	}

	protected void setAlto(int al) {
		alto = al;
	}

	protected void setAncho(int an) {
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
