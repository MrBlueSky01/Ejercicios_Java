import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido=0;
		System.out.print("Introduzca un número: ");
		numeroIntroducido = sc.nextInt();

	    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
	      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
	    }
	}
}
