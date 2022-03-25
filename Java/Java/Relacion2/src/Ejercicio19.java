import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int alturaIntroducida=0;
		String relleno;
		
	    System.out.print("Introduzce la altura de la pirámide: ");
	    alturaIntroducida=sc.nextInt();
	   
	    System.out.print("Introducir el relleno: ");
	    relleno=sc.next();
	    
	    int planta = 1;
	    int longitudDeLinea = 1;
	    int espacios = alturaIntroducida-1;
	    
	    while (planta <= alturaIntroducida) {
	      
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }

	      for (int i = 1; i <= longitudDeLinea; i++) {
	        System.out.print(relleno);
	      }

	      System.out.println();

	      planta++;
	      espacios--;
	      longitudDeLinea += 2;
	    }
	  }
	}