package Ejercicio04;

public class Producto {
	protected String Nombre;
	protected double Precio;

	public Producto(String nombre, double precio) {
		Nombre = nombre;
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public double Calcular(int Cantidad) {
		return(this.Precio*Cantidad);
	}
	
	public String MostrarDatos(){
	      return("Nombre: "+this.Nombre+" Precio: "+this.Precio);
	  }  

}
