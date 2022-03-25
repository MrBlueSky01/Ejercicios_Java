import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		int numeroIntroducido = 0;
	    
	    do {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("Introduzca un número entero positivo: ");
	      numeroIntroducido=sc.nextInt(); 
	      
	      if(numeroIntroducido < 0) {
	        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
	      }
	    } while (numeroIntroducido < 0);
	    
	    int suma = 0;
	    
	    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
	      suma += i;
	    }

	    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
	  }
	}