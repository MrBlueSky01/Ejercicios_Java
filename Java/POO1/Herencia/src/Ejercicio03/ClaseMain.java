package Ejercicio03;

public class ClaseMain {

	public static void main(String[] args) {
		Comercial c1 = new Comercial("Manueh", 34, 1000, 200);
		Repartidor r1 = new Repartidor("Fernando", 24, 1200, "zona 3");

		c1.plus();
		r1.plus();

		System.out.println(c1);
		System.out.println(r1);
	}
}
