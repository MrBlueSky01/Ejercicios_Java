import java.util.*;

public class Pruebas {

	private static char Pista[] = new char[12];

	private static void numerarPista() {
		for (int i = 0; i < 12; i++) {
			Pista[i] = Integer.toString(i + 1).charAt(0);
		}
	}

	private static void vaciarPista() {
		for (int i = 0; i < 12; i++) {
			Pista[i] = ' ';
		}
	}

	private static void pintaPista() {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				System.out.println("     1   2   3   4   5   6   7   8   9   10   11  ");
				break;
			case 1:
				System.out.println("   - - - - - - - - - - - - - - - - - - - - - - -");
				break;
			case 2:
				System.out.println("J1 | " + Pista[1] + " | " + Pista[2] + " | " + Pista[3] + " | " + Pista[4] + " | "
						+ Pista[5] + " | " + Pista[6] + " | " + Pista[7] + " | " + Pista[8] + " | " + Pista[9] + " | "
						+ Pista[10] + " | " + Pista[11] + " |");
				break;
			case 3:
				System.out.println("   - - - - - - - - - - - - - - - - - - - - - - -");
				break;
			case 4:
				System.out.println("J2 | " + Pista[1] + " | " + Pista[2] + " | " + Pista[3] + " | " + Pista[4] + " | "
						+ Pista[5] + " | " + Pista[6] + " | " + Pista[7] + " | " + Pista[8] + " | " + Pista[9] + " | "
						+ Pista[10] + " | " + Pista[11] + " |");
				break;
			case 5:
				System.out.println("   - - - - - - - - - - - - - - - - - - - - - - -");
				break;

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minDado = 0;
		int maxDado = 0;
		int fichaJ1 = 0;
		int fichaJ2 = 0;
		String nomJ1;
		String nomJ2;
		int suma = 0;
		boolean sumaDeNumerosEsPrimo = true;
		int tiraDados;
		String continuar;

		System.out.println("¡BIENVENIDOS A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cuál es el número mínimo del dado?");
		minDado = sc.nextInt();
		System.out.println("¿Cuál es el número máximo del dado?");
		maxDado = sc.nextInt();
		System.out.println("¿Cuál es el nombre del Jugador 1?");
		nomJ1 = sc.nextLine();
		System.out.println("¿Cuál es el nombre del Jugador 2?");
		nomJ2 = sc.nextLine();

		System.out.println("¡COMENCEMOS A JUGAR!");
		numerarPista();
		vaciarPista();
		pintaPista();

		System.out.println("Pulsa cualquier tecla para continuar:");
		continuar = sc.nextLine();
		System.out.println("Turno para el Jugador 1" + nomJ1);

		for (int i = 0; i < 2; i++) {
			tiraDados = (int) (Math.random() * maxDado) + 1;
			System.out.println("Ha sacado un " + tiraDados + " en esta tirada");
			suma += tiraDados;
		}

		for (int i = 2; i < suma; i++) {
			if ((suma % i) == 0) {
				sumaDeNumerosEsPrimo = false;
			}
		}

		if (sumaDeNumerosEsPrimo) {
			System.out.println("¡TIRADA VÁLIDA!");
		} else {
			System.out.println("¡TIRADA NO VÁLIDA!");
			System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
		}

		System.out.println("");

	}

}