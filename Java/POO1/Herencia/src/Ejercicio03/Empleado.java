package Ejercicio03;

public abstract class Empleado {
	private String Nombre;
	private int Edad;
	private double Salario;
	
	public final double PLUS = 300;

	public Empleado(String nombre, int edad, double salario) {
		this.Nombre = nombre;
		this.Edad = edad;
		this.Salario = salario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", Salario=" + Salario + "]";
	}
	
	public abstract boolean plus();
	
}
