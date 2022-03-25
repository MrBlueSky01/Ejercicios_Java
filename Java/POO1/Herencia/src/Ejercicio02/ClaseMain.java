package Ejercicio02;

import java.util.ArrayList;
import java.util.*;

public class ClaseMain {
	static ArrayList poligono = new ArrayList();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		llenarPoligono();

		mostrarResultados();
	}

	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.println("Menú");
				System.out.println("1.Introducir triángulo");
				System.out.println("2.Introducir rectángulo");
				System.out.printf("\nElija una opcion:");
				opcion = sc.nextInt();

			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:
					llenarTriangulo();
				break;

			case 2:
					llenarRectangulo();
				break;
			}

			System.out.println("\n¿Querrá introducir otro poligono?(s|n)");
			respuesta = sc.next().charAt(0);
			System.out.println("");
		} while (respuesta == 's' || respuesta == 'S');

	}

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("Introduzca el primer lado");
		lado1 = sc.nextDouble();
		System.out.println("Introduzca el segundo lado");
		lado2 = sc.nextDouble();
		System.out.println("Introduzca el tercer lado");
		lado3 = sc.nextDouble();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
	
		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.println("Introduzca el primer lado");
		lado1 = sc.nextDouble();
		System.out.println("Introduzca el segundo lado");
		lado2 = sc.nextDouble();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		poligono.add(rectangulo);
	}

	public static void mostrarResultados() {
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("Area = "+poli.area());
		}
	}
}
