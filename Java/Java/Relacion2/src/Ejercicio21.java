import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Introduce números enteros.");
		    System.out.println("Puede terminar introduciendo 1un número negativo.");

		    int numeroIntroducido;
		    int numeroDeElementos = 0;
		    int sumaImpares = 0;
		    int numeroDeElementosImpares = 0;
		    int maximoPar = 0;
		    
		    do {
		    	numeroIntroducido=sc.nextInt();
		      
		      if (numeroIntroducido >= 0) {
		        numeroDeElementos++;
		        if ((numeroIntroducido % 2) == 1) { 
		          sumaImpares += numeroIntroducido;
		          numeroDeElementosImpares++;
		        } else { 
		          if (numeroIntroducido > maximoPar)
		            maximoPar = numeroIntroducido;
		        }
		      }
		    } while (numeroIntroducido >= 0);

		    System.out.println("Ha introducido " + numeroDeElementos + " números");
		    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
		    System.out.println("El máximo de los pares es " + maximoPar);
		  }
		}