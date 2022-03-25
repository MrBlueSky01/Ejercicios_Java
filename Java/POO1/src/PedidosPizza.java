
public class PedidosPizza {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Margaita - ", "Mediana");
		Pizza p2 = new Pizza("Pepperoni - ", "Familiar");
		p2.sirve();
		Pizza p3 = new Pizza("Cuatro Quesos - ", "Mediana");
		System.out.println(p1);
		System.out.println("");
		System.out.println(p2);
		System.out.println("");
		System.out.println(p3);
		System.out.println("");
		p2.sirve();
		System.out.println("");
		System.out.println("Pedidas: " + Pizza.getTotalPedidas());
		System.out.println("");
		System.out.println("Servidad: " + Pizza.getTotalServidas());

	}
	 
}
