package herencia.MultiniveJerarquica;

public class Vehiculo {	
	private int kilometraje;
	private String noDeSerie;
	private String marca;
	
	public Vehiculo() {
		this.kilometraje = 0;
		this.noDeSerie = "";
		this.marca = "";
	}

	public Vehiculo(int kilometraje, String noDeSerie, String marca) {
		this.kilometraje = kilometraje;
		this.noDeSerie = noDeSerie;
		this.marca = marca;
	} 

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getNoDeSerie() {
		return noDeSerie;
	}

	public void setNoDeSerie(String noDeSerie) {
		this.noDeSerie = noDeSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void encender() {
		System.out.println("Encendido");
	}
	
	public void apagar() {
		System.out.println("apagado");
	}

	@Override
	public String toString() {
		return "Vehiculo [kilometraje=" + kilometraje + ", noDeSerie=" + noDeSerie + ", marca=" + marca
				+ ", getKilometraje()=" + getKilometraje() + ", getNoDeSerie()=" + getNoDeSerie() + ", getMarca()="
				+ getMarca() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
		
}
