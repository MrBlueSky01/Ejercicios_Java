import java.util.*;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero = 0;
	      int i;
	      
	      System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
	      
	      for (i = 0; i < 15; i++) {
	    	  numero = sc.nextInt();
	      }
	      
	      System.out.println();
	      

	      System.out.println("Array original:");
	      for (i = 0; i < 15; i++) {
	        System.out.printf("|%3d ", i);
	      }
	      System.out.println("|");
	      for (i = 0; i < 75; i++) {
	        System.out.print("⎯");
	      }
	      System.out.println("⎯");
	      for (i = 0; i < 15; i++) {
	        System.out.printf("|%3d ", numero);
	      }
	      System.out.println("|");
	      

	      int aux = numero;
	      for (i = 14; i > 0; i--) {
	        numero = numero-1;
	      }
	      numero = aux;



	      System.out.println("\nArray rotado a la derecha una posición:");
	      for (i = 0; i < 15; i++) {
	        System.out.printf("|%3d ", i);
	      }
	      System.out.println("|");
	      for (i = 0; i < 75; i++) {
	        System.out.print("⎯");
	      }
	      System.out.println("⎯");
	      for (i = 0; i < 15; i++) {
	        System.out.printf("|%3d ", numero);
	      }
	      System.out.println("|");

	  }
	}