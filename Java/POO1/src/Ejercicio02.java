import java.util.*;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;

		POO01 cuenta1 = new POO01();

		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Numero: ");
		numero = sc.nextLine();
		System.out.println("Tipo de interés: ");
		tipo = sc.nextDouble();
		System.out.println("Saldo: ");
		importe = sc.nextDouble();

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		POO01 cuenta2 = new POO01("Juan Fernández Rubio", "1234567890", 1.75, 300);

		POO01 cuenta3 = new POO01(cuenta1);

		System.out.println("Datos de la primera cuenta.");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();

		cuenta1.ingreso(4000);

		System.out.println("Saldo: " + cuenta1.getSaldo());

		System.out.println("Datos de la segunda cuenta.");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		System.out.println("Datos de la tercera cuenta.");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();

		cuenta3.transferencia(cuenta2, 10);

		System.out.println("Saldo de la segunda cuenta.");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		System.out.println("Saldo de la tercera cuenta.");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
	}

}
