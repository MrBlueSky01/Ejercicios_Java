package Ejercicio02;

public abstract class Poligono {
	protected int numeroLado;
	
	
	public Poligono(int numeroLado) {
		this.numeroLado = numeroLado;
	}

	public int getNumeroLado() {
		return numeroLado;
	}

	@Override
	public String toString() {
		return "Poligono{"+"numeroLado=" + numeroLado + "}";
	}

	protected abstract double area();
	
}
