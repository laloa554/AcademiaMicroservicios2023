package herencia.MultiniveJerarquica;

public class Terrestre extends Vehiculo {
	private String configuracion;
	private int velocidadMax;
	
	public Terrestre(String configuracion, int velocidadMax,int kilometraje, String noDeSerie, String marca) {
		super(kilometraje,noDeSerie,marca);
		this.configuracion = configuracion;
		this.velocidadMax = velocidadMax;
	}

	public Terrestre() {
		super(0,null,null);
		this.configuracion = null;
		this.velocidadMax = 0;
	}

	public String getconfiguracion() {
		return configuracion;
	}

	public void setconfiguracion(String configuracion) {
		this.configuracion = configuracion;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	public void estacionar() {
		System.out.println("Buscando espacio para estacionar");
	}
		
}
