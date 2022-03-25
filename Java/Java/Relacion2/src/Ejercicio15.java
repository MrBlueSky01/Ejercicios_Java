import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int exponenteFinal=0, base=0;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un número real como base: ");
		base=sc.nextInt();
	    
	    System.out.print("Introduzca un múmero entero como exponente: ");
	    exponenteFinal=sc.nextInt();

	    double potencia;
	    int exponente;
	    
	        
	    for (int i = 1; i <= exponenteFinal; i++) {
	        
	      potencia = 1;
	      exponente = i;
	      
	      for (int j = 0; j < exponente; j++) {
	        potencia *= base;
	      }
	      
	      System.out.println(base + "^" + i + " = " + potencia);
	    }

	  }
	}	