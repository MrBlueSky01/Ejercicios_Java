
public class Articulo {
	private String codigo = "LIBRE";
	private String descripcion;
	private double precioDeCompra;
	private double precioDeVenta;
	private int stock;

	public String getCodigo(){
		return codigo;
	}

	public String getDescripcion(){
		return descripcion;
	}
	
	public double getPrecioDeCompra(){
		return precioDeCompra;
	}
	
	public double getPrecioDeVenta(){
		return precioDeVenta;
	}
	
	public int getStock(){
		return stock;
	}
	
	
	public void setCodigo(String codigo) {
	    this.codigo = codigo;
	  }
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecioDeCompra(double precioDeCompra) {
		this.precioDeCompra = precioDeCompra;
	}
	
	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
	    String cadena = "------------------------------------------";
	    cadena += "\nCódigo: " + this.codigo;
	    cadena += "\nDescripción: " + this.descripcion;
	    cadena += "\nPrecio de compra: " + this.precioDeCompra;
	    cadena += "\nPrecio de venta: " + this.precioDeVenta;
	    cadena += "\nStock: " + this.stock + " unidades";
	    cadena += "\n------------------------------------------";
	    return cadena;
	  }
}
