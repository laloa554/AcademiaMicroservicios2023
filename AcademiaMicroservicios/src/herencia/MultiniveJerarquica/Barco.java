package herencia.MultiniveJerarquica;

public class Barco extends Acuatico {
	
	private String nombreDelBarco;
	private String capitanNombre;
	private String tipo;
	private boolean salvavidas;
	
	public Barco(String nombreDelBarco, String capitanNombre, String tipo, boolean salvavidas,
			int noPasajeros, int kilometraje, String noDeSerie, String marca) {
		super(noPasajeros, kilometraje, noDeSerie, marca);
		this.nombreDelBarco = nombreDelBarco;
		this.capitanNombre = capitanNombre;
		this.tipo = tipo;
		this.salvavidas = salvavidas;
	}
	
	public Barco() {
		super(0, 0, null, null);
		this.nombreDelBarco = null;
		this.capitanNombre = null;
		this.tipo = null;
		this.salvavidas = false;
	}

	public String getNombreDelBarco() {
		return nombreDelBarco;
	}

	public void setNombreDelBarco(String nombreDelBarco) {
		this.nombreDelBarco = nombreDelBarco;
	}

	public String getCapitanNombre() {
		return capitanNombre;
	}

	public void setCapitanNombre(String capitanNombre) {
		this.capitanNombre = capitanNombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isSalvavidas() {
		return salvavidas;
	}

	public void setSalvavidas(boolean salvavidas) {
		this.salvavidas = salvavidas;
	}

	@Override
	public String toString() {
		return "Barco [nombreDelBarco=" + nombreDelBarco + ", capitanNombre=" + capitanNombre + ", tipo=" + tipo
				+ ", salvavidas=" + salvavidas + ", getNombreDelBarco()=" + getNombreDelBarco()
				+ ", getCapitanNombre()=" + getCapitanNombre() + ", getTipo()=" + getTipo() + ", isSalvavidas()="
				+ isSalvavidas() + ", getNoPasajeros()=" + getNoPasajeros() + ", getKilometraje()=" + getKilometraje()
				+ ", getNoDeSerie()=" + getNoDeSerie() + ", getMarca()=" + getMarca() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
