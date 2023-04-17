package ar.edu.unq.po2.tp3;

public class Punto {
	private int x;
	private int y;

	public Punto() {
		this.setX(0);
		this.setY(0);
	}

	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void setX(int x1) {
		x = x1;
	}

	public void setY(int y1) {
		y = y1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moverPunto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public Punto sumarPunto(Punto puntoASumar) {
		int newX = this.getX() + puntoASumar.getX();
		int newY = this.getY() + puntoASumar.getY();
		return new Punto(newX, newY);
	}
}
