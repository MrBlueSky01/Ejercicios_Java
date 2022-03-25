
public class Disco {

	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

	//getters
	public String getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getDuracion() {
		return duracion;
	}

	//setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		String cadena = "\n------------------------------------------";
		cadena += "\nCódigo: " + this.codigo;
		cadena += "\nAutor: " + this.autor;
		cadena += "\nTítulo: " + this.titulo;
		cadena += "\nGénero: " + this.genero;
		cadena += "\nDuración: " + this.duracion;
		cadena += "\n------------------------------------------";

		return cadena;
	}
}
