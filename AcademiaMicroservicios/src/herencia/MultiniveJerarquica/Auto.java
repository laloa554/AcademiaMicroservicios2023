package herencia.MultiniveJerarquica;

public class Auto extends Terrestre {
	private String modelo;
	private String tipoDeAcientos;

	public Auto(String modelo,String tipoDeAcientos, String configuracion, int velocidadMax, int kilometraje, String noDeSerie, String marca) {
		super(configuracion, velocidadMax, kilometraje, noDeSerie, marca);
		this.modelo = modelo;
		this.tipoDeAcientos = tipoDeAcientos;
	}
	public Auto() {
		super(null, 0, 0, null, null);
		this.modelo = null;
		this.tipoDeAcientos = null;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoDeAcientos() {
		return tipoDeAcientos;
	}
	public void setTipoDeAcientos(String tipoDeAcientos) {
		this.tipoDeAcientos = tipoDeAcientos;
	}
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", tipoDeAcientos=" + tipoDeAcientos + ", getModelo()=" + getModelo()
				+ ", getTipoDeAcientos()=" + getTipoDeAcientos() + ", getconfiguracion()=" + getconfiguracion()
				+ ", getVelocidadMax()=" + getVelocidadMax() + ", getKilometraje()=" + getKilometraje()
				+ ", getNoDeSerie()=" + getNoDeSerie() + ", getMarca()=" + getMarca() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
