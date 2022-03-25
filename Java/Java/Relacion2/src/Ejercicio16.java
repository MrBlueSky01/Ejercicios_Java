import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int numeroIntroducido=0;
		Scanner sc=new Scanner(System.in);
	    System.out.print("Introduzca un número entero y le diré si es primo: ");
	    numeroIntroducido=sc.nextInt();
	    
	    boolean esPrimo = true;
	    
	    for (int i = 2; i < numeroIntroducido; i++) {
	      if ((numeroIntroducido % i) == 0) {
	        esPrimo = false;
	      }
	    }
	        
	    if (esPrimo) {
	      System.out.println("El número introducido es primo.");
	    } else {
	      System.out.println("El número introducido no es primo.");
	    }

	  }
	}