
public class Pizza {

	private String tamano;
	private String tipo;
	private String estado;
	private static int totalPedidas = 0;
	private static int totalServidas = 0;

	public Pizza(String tipo, String tamano) {
		this.tipo = tipo;
		this.tamano = tamano;
		this.estado = "pedida";
		totalPedidas++;
	}

	public String toString() {
		return "- Pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
	}

	public static int getTotalPedidas() {
		return Pizza.totalPedidas;
	}

	public static int getTotalServidas() {
		return Pizza.totalServidas;
	}

	public void sirve() {
		if (this.estado.equals("pedida")) {
			this.estado = "servida";
			Pizza.totalServidas++;
		} else {
			System.out.println("La segunda pizza ya se ha servido");
		}
	}
}
