package herencia.MultiniveJerarquica;

public class Submarino extends Acuatico{
	
	private String tipo;
	private String capitanNombre;
	
	
	public Submarino() {
		super(0, 0, null, null);
		this.capitanNombre = null;
		this.tipo = null;
	}
	public Submarino(String capitanNombre, String tipo, int noPasajeros, int kilometraje, String noDeSerie, String marca) {
		super(noPasajeros, kilometraje, noDeSerie, marca);
		this.capitanNombre = capitanNombre;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCapitanNombre() {
		return capitanNombre;
	}
	public void setCapitanNombre(String capitanNombre) {
		this.capitanNombre = capitanNombre;
	}
	
	public void sumergir() {
		System.out.println("Me estoy sumergiendo");
	}
	
	public void emergir() {
		System.out.println("Estoy volviendo a la superficie");
	}
	
	@Override
	public String toString() {
		return "Submarino [tipo=" + tipo + ", capitanNombre=" + capitanNombre + ", getTipo()=" + getTipo()
				+ ", getCapitanNombre()=" + getCapitanNombre() + ", getNoPasajeros()=" + getNoPasajeros()
				+ ", getKilometraje()=" + getKilometraje() + ", getNoDeSerie()=" + getNoDeSerie() + ", getMarca()="
				+ getMarca() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
