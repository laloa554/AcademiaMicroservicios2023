package herencia.MultiniveJerarquica;

public class Moto extends Terrestre {
	private int noLlantas;
	private String tipoDeMoto;
	
	public Moto() {
		super(null, 0, 0, null, null);
		this.noLlantas = 0;
		this.tipoDeMoto = null;
	}
	public Moto(int noLlantas,String tipoDeMoto ,String configuracion, int velocidadMax, int kilometraje, String noDeSerie, String marca) {
		super(configuracion, velocidadMax, kilometraje, noDeSerie, marca);
		this.noLlantas = 0;
		this.tipoDeMoto = null;
	}
	public int getNoLlantas() {
		return noLlantas;
	}
	public void setNoLlantas(int noLlantas) {
		this.noLlantas = noLlantas;
	}
	public String getTipoDeMoto() {
		return tipoDeMoto;
	}
	public void setTipoDeMoto(String tipoDeMoto) {
		this.tipoDeMoto = tipoDeMoto;
	}
	
	public void quemarLlanta() {
		System.out.println("procede a acelerar");
	}
	@Override
	public String toString() {
		return "Moto [noLlantas=" + noLlantas + ", tipoDeMoto=" + tipoDeMoto + ", getNoLlantas()=" + getNoLlantas()
				+ ", getTipoDeMoto()=" + getTipoDeMoto() + ", getconfiguracion()=" + getconfiguracion()
				+ ", getVelocidadMax()=" + getVelocidadMax() + ", getKilometraje()=" + getKilometraje()
				+ ", getNoDeSerie()=" + getNoDeSerie() + ", getMarca()=" + getMarca() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
