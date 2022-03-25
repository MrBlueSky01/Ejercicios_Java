import java.util.*;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroGrande = 0;
		int numeroPequeno = 0;
		
		System.out.print("Introduzca un número entero positivo (relativamente grande): ");
		numeroGrande = sc.nextInt();

	    System.out.print("Introduzca otro número (relativamente pequeño): ");
	    numeroPequeno = sc.nextInt();

	    System.out.print("Los números enteros positivos menores que " + numeroGrande );
	    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

	    int cuenta = 0;
	    int suma = 0;

	    for (int i = 1; i < numeroGrande; i++) {
	      if ((i % numeroPequeno) != 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	}