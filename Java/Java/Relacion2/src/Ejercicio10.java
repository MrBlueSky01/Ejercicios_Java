import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		double numeros = 0;
	    double num = 0;
	    double suma = 0;

	    System.out.println("Este programa calcula la media de los números positivos introducidos.");
	    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");
	
	    while (num >= 0) {
	      num = Double.parseDouble(System.console().readLine());
	      numeros++;
	      suma += num;
	    
	    System.out.println("La media de los números positivos introducidos es " + (suma - num)/ (numeros - 1));
	    }
	}
}
	
