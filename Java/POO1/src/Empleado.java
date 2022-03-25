
public class Empleado {
	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double tipoIRPF;
	private char casado;
	private int numeroHijos;
	private static double pagoPorHoraExtra;

	public Empleado() {

	}

	public Empleado(String nif) {
		this.nif = nif;
	}

	public String getnif() {
		return nif;
	}

	public void setnif(String nif) {
		this.nif = nif;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public double getsueldoBase() {
		return sueldoBase;
	}

	public void setsueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int gethorasExtras() {
		return horasExtras;
	}

	public void sethorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double gettipoIRPF() {
		return tipoIRPF;
	}

	public void settipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getnumeroHijos() {
		return numeroHijos;
	}

	public void setnumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public static double getpagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setpagoPorHoraExtra(double pagoPorHoraExtra) {
		Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public double calcularImporteHorasExtras() {
		return horasExtras * pagoPorHoraExtra;
	}

	public double calcularSueldoBruto() {
		return sueldoBase + calcularImporteHorasExtras();
	}

	public double calcularRetencionIrpf() {
		double tipo = tipoIRPF;
		if (casado == 's' || casado == 'S') {
			tipo = tipo - 2;
		}
		tipo = tipo - numeroHijos;
		if (tipo < 0) {
			tipo = 0;
		}
		return calcularSueldoBruto() * tipo / 100;
	}

	public double calcularSueldo() {
		return calcularSueldoBruto() - calcularRetencionIrpf();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNif: ");
		sb.append(nif);
		sb.append("\nSueldo Base: ");
		sb.append(sueldoBase);
		sb.append("\nHoras Extras: ");
		sb.append(horasExtras);
		sb.append("\ntipo IRPF: ");
		sb.append(tipoIRPF);
		sb.append("\nCasado: ");
		sb.append(casado);
		sb.append("\nNúmero de Hijos: ");
		sb.append(numeroHijos);
		return sb.toString();
	}

}
