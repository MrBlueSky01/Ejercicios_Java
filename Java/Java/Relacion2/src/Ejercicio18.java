import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		 int primerNumero=0;
		    int segundoNumero=0;
		    
		    
		    do {
		      Scanner sc=new Scanner(System.in);
		      System.out.print("Introduzca un número entero: ");
		      primerNumero=sc.nextInt();
		      
		      System.out.print("Introduzca otro número entero distinto al anterior: ");
		      segundoNumero=sc.nextInt();
		      
		      if(primerNumero == segundoNumero) {
		        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
		      }
		    } while (primerNumero == segundoNumero);
		    
		    
		    if (primerNumero > segundoNumero) {
		      int aux = primerNumero;
		      primerNumero = segundoNumero;
		      segundoNumero = aux;
		    }
		    
		    for(int i = primerNumero; i <= segundoNumero; i += 7) {
		      System.out.print(i + " ");
		    }
		    
		    System.out.println();
		  }
		}