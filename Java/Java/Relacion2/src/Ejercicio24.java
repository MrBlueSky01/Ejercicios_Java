import java.util.*;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int alturaIntroducida = 0;
		 
	    System.out.print("Por favor, introduzca la altura de la pirámide:");
	    alturaIntroducida = sc.nextInt();

	    int altura = 1;
	    int i = 0;
	    int espacios = alturaIntroducida - 1;
	    
	    while (altura <= alturaIntroducida) {
	      
	      for (i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
	      
	      for (i = 1; i < altura; i++) {
	        System.out.print(i);
	      }
	      
	      for (i = altura; i > 0; i--) {
	        System.out.print(i);
	      }
	      
	      System.out.println();
	      
	      altura++;
	      espacios--;
	    } 
	  }
	}