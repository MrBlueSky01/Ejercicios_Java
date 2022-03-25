import java.util.*;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroIntroducido = 0;
		
		System.out.print("Introduzce un número entero: ");
		 numeroIntroducido = sc.nextInt();

	    int numero = numeroIntroducido;
	    int volteado = 0;
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	    } 
	    
	    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
	  }
	}