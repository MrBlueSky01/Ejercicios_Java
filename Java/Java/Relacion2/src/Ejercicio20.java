import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int alturaIntroducida=0;
		String relleno;
		
		System.out.print("Introduzcir la altura de la pirámide: ");
		alturaIntroducida=sc.nextInt();
		
	    System.out.print("Introduzcir el relleno: ");
	    relleno=sc.next();
	    
	    int altura = 1;
	    int i = 0;
	    int espaciosPorDelante = alturaIntroducida - 1;
	    int espaciosInternos = 0;
	    
	    while (altura < alturaIntroducida) {
	      
	      for (i = 1; i <= espaciosPorDelante; i++) {
	        System.out.print(" ");
	      }
	      
	      System.out.print(relleno);
	      for (i = 1; i < espaciosInternos; i++) {
	        System.out.print(" ");
	      }
	      
	      if (altura>1) {
	        System.out.print(relleno);
	      }
	      
	      System.out.println();
	      altura++;
	      espaciosPorDelante--;
	      espaciosInternos += 2;
	    } 
	    
	    for (i = 1; i < altura*2; i++) {
	      System.out.print(relleno);
	    }
	  }
	}