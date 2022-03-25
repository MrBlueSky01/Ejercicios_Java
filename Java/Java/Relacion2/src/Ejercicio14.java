import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		System.out.println("Cálculo de una potencia");
		
		int exponente=0, base=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Introduzca la base: ");
	    base=sc.nextInt();
	    
	    System.out.print("Introduzca el exponente: ");
	    exponente=sc.nextInt();
	    
	    double potencia = 1;
	        
	    if (exponente == 0) {
	      potencia = 1;
	    }
	    
	    if (exponente > 0) {
	      for (int i = 0; i < exponente; i++) {
	        potencia *= base;
	      }
	    }
	    
	    if (exponente < 0) {
	      for (int i = 0; i < -exponente; i++) {
	        potencia *= base;
	      }
	      
	      potencia = 1/potencia;
	    }

	    System.out.println(base + "^" + exponente + " = " + potencia);
	  }
	}