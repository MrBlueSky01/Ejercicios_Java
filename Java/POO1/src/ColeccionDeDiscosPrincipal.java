import java.util.*;

public class ColeccionDeDiscosPrincipal {

	static int N = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String codigoIntroducido;
		String autorIntroducido;
		Disco[] album = new Disco[N];

		for (int i = 0; i < N; i++) {
			album[i] = new Disco();
		}
		String tituloIntroducido;
		String generoIntroducido;
		String duracionIntroducidaString;
		int duracionIntroducido;
		int primeraLibre;
		int i;

		do {
			System.out.println("\n\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.println("");
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\nListado");
				System.out.println("=======");
				for (i = 0; i < N; i++) {
					if (!album[i].getCodigo().equals("LIBRE")) {
						System.out.println(album[i]);
					}
				}
				break;

			case 2:
				System.out.println("\nNuevo Disco");
				System.out.println("===========");

				primeraLibre = -1;
				do {
					primeraLibre++;
				} while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));

				System.out.print("Código: ");
				codigoIntroducido = sc.nextLine();

				album[primeraLibre].setCodigo(codigoIntroducido);

				System.out.print("Autor: ");
				autorIntroducido = sc.nextLine();
				album[primeraLibre].setAutor(autorIntroducido);

				System.out.print("Título: ");
				tituloIntroducido = sc.nextLine();
				album[primeraLibre].setTitulo(tituloIntroducido);

				System.out.print("Género: ");
				generoIntroducido = sc.nextLine();
				album[primeraLibre].setGenero(generoIntroducido);

				System.out.print("Duración: ");
				duracionIntroducido = sc.nextInt();
				album[primeraLibre].setDuracion(duracionIntroducido);

				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				System.out.print("Inntroduzca el código del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();

				i = -1;
				do {
					i++;
				} while (!((album[i].getCodigo()).equals(codigoIntroducido)));

				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

				System.out.println("Código: " + album[i].getCodigo());
				System.out.print("Nuevo código: ");
				codigoIntroducido = sc.nextLine();
				if (!codigoIntroducido.equals("")) {
					album[i].setCodigo(codigoIntroducido);
				}

				System.out.println("Autor: " + album[i].getAutor());
				System.out.print("Nuevo autor: ");
				autorIntroducido = sc.nextLine();
				if (!autorIntroducido.equals("")) {
					album[i].setAutor(autorIntroducido);
				}

				System.out.println("Título: " + album[i].getTitulo());
				System.out.print("Nuevo título: ");
				tituloIntroducido = sc.nextLine();
				if (!tituloIntroducido.equals(""))
					; {
				album[i].setTitulo(tituloIntroducido);

			}

				System.out.println("Género: " + album[i].getGenero());
				System.out.print("Nuevo género: ");
				generoIntroducido = sc.nextLine();
				if (!generoIntroducido.equals(""))
					; {
				album[i].setGenero(generoIntroducido);
			}

				System.out.println("Duración: " + album[i].getDuracion());
				System.out.print("Duración: ");
				duracionIntroducidaString = sc.nextLine();
				if (!duracionIntroducidaString.equals("")) {
					album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
				}

				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
				codigoIntroducido = sc.nextLine();

				i = -1;
				do {
					i++;
				} while (!((album[i].getCodigo()).equals(codigoIntroducido)));
				album[i].setCodigo("LIBRE");
				System.out.println("Album borrado.");

				break;

			default:

			}
		} while (opcion != 5);
	}

}
