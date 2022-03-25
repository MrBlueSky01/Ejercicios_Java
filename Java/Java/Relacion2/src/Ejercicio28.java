import java.util.*;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroIntroducido = 0;
	    
	    do {
	      System.out.print("Introduce un número entero: ");
	      numeroIntroducido = sc.nextInt();
	      
	      if (numeroIntroducido < 0) {
	        System.out.println("El número introducido no es correcto.");
	      }
	    } while (numeroIntroducido < 0);

	    int factorial = numeroIntroducido;
	    
	    if (numeroIntroducido == 0) {
	      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
	    } else {
	      for (int i = 1; i < numeroIntroducido; i++) {
	        factorial *= i;
	      }

	      System.out.println(numeroIntroducido + "! = " + factorial);
	    }
	  }
	}