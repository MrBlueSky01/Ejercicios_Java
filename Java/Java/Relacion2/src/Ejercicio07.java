import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 4;
	    int combUs;
	    int comb = 4321;
	    boolean acertado = false;
	    do {
	      System.out.print("Combinación: ");
	      combUs = sc.nextInt();
	      if (combUs == comb) {
	        acertado = true;
	      } else {
	        System.out.println("Combinación errónea");
	      }
	      i--;
	    } while((i > 0) && (!acertado));
	    if (acertado) {
	      System.out.println("La cámara ha sido abierta");
	    } else {
	      System.out.println("Lo siento, has agotado tus 4 oportunidades.");
	    }
	  }
	}