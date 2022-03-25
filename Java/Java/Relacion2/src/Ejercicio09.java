import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("Introduce un número ");
		num = sc.nextInt();
	    int i;
	    for (i = 0; num > 0; i++){
	      num = num/10;
	    }
	    System.out.println("El número tiene "+i+" cifras.");
	}
}