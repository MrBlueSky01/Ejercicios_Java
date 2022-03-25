import java.util.*;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;

		Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
		Libro libro2 = new Libro();

		System.out.print("Introduce titulo: ");
		titulo = sc.nextLine();
		System.out.print("Introduce autor: ");
		autor = sc.nextLine();
		System.out.print("Numero de ejemplares: ");
		ejemplares = sc.nextInt();

		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setEjemplares(ejemplares);

		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getEjemplares());
		System.out.println("Prestados: " + libro1.getPrestados());
		System.out.println();

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}
		System.out.println("");
		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getEjemplares());
		System.out.println("Prestados: " + libro1.getPrestados());
		System.out.println();

		System.out.println("Libro 2:");
		System.out.println("Titulo: " + libro2.getTitulo());
		System.out.println("Autor: " + libro2.getAutor());
		System.out.println("Ejemplares: " + libro2.getEjemplares());
		System.out.println("Prestados: " + libro2.getPrestados());
		System.out.println();
	}
}
