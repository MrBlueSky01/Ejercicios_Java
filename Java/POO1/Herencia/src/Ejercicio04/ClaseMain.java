package Ejercicio04;

public class ClaseMain {

	public static void main(String[] args) {
		Producto ListaProducto[] = new Producto[5];
		double suma = 0;
		
		ListaProducto[0] = new Producto("Pizza", 3.95);
		ListaProducto[1] = new Producto("Yogur", 1.20);
		ListaProducto[2] = new Producto("Kiwi", 3.95);
		ListaProducto[3] = new Producto("Salchichón", 1.75);
		ListaProducto[4] = new Producto("Monster", 1.50);

		 for(int i=0;i<ListaProducto.length;i++){
	           suma=suma+ListaProducto[i].Calcular(5);
	       }
	        System.out.println("El precio total de productos es: "+suma);
	      
	}

}
