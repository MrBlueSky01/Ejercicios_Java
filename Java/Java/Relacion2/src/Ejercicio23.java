import java.util.*;

public class Ejercicio23 {

	public static void main(String[] args) {
		int numeroIntroducido;
	    int suma = 0;
	    int numeroDeElementos = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce números.");
	    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
	    
	    do {
	      numeroIntroducido = sc.nextInt();
	      suma += numeroIntroducido;
	      numeroDeElementos++;
	    } while (suma <= 10000);
	    
	    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
	    System.out.println("La suma total es " + suma + ".");
	    System.out.println("La media es " + suma / numeroDeElementos + ".");
	  }
	}