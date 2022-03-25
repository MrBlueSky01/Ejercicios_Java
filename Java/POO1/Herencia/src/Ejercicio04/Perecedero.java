package Ejercicio04;

public class Perecedero extends Producto {
	private int DiasCaducar;

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		DiasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return DiasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		DiasCaducar = diasCaducar;
	}

	public double Calcular(int Cantidad) {
		double PrecioTotal = Cantidad * this.Precio;

		switch (this.DiasCaducar) {
		case 1:
			PrecioTotal = (PrecioTotal / 4);
			break;
		case 2:
			PrecioTotal = (PrecioTotal / 3);
			break;
		case 3:
			PrecioTotal = (PrecioTotal / 2);
			break;
		}
		return (PrecioTotal);
	}

	public String MostrarDatos() {
		return ("Nombre: " + this.Nombre + " Precio: " + this.Precio + " Días a Caducar: " + this.DiasCaducar);
	}
}
