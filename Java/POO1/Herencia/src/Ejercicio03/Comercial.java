package Ejercicio03;

public class Comercial extends Empleado{
	private double comision;
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Comercial [comision=" + comision + "]";
	}
	
	public boolean plus() {
		 if (super.getEdad() > 30 && this.comision > 200) {
	            double nuevoSalario = super.getSalario() + super.PLUS;
	            super.setSalario(nuevoSalario);
	            System.out.println("Se le ha añadido el plus, al empleado " + super.getNombre());
	            return true;
	        }

	        return false;
	}
}
