import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("Introduce un número ");
		num = sc.nextInt();
	    System.out.println("Tabla de multiplicar del "+num+"\n");
	    for (int i = 1; i<= 10; i++){
	      System.out.println(num+" x "+i+" = "+num*i);
	    }
	}
}