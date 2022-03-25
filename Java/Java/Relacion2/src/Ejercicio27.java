import java.util.*;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroIntroducido = 0;
		
		System.out.print("Introduzca un número entero mayor que 1: ");
		 numeroIntroducido = sc.nextInt();
		
	    int cuenta = 0;
	    int suma = 0;
	    
	    for (int i = 1; i < numeroIntroducido; i++) {
	      if ((i % 3) == 0) {
	        System.out.print(i + " ");
	        cuenta++;
	        suma += i;
	      }
	    }
	        
	    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
	    System.out.println(" múltiplos de 3 y suman " + suma);
	  }
	}