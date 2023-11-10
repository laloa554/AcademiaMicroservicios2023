package herencia.MultiniveJerarquica;

public class Acuatico extends Vehiculo {
	private int noPasajeros;
	
	public Acuatico() {
		super(0, null, null);
		this.noPasajeros = 0;
	}
	
	public Acuatico(int noPasajeros, int kilometraje, String noDeSerie, String marca) {
		super(kilometraje, noDeSerie, marca);
		this.noPasajeros = noPasajeros;
	}

	public int getNoPasajeros() {
		return noPasajeros;
	}

	public void setNoPasajeros(int noPasajeros) {
		this.noPasajeros = noPasajeros;
	}
	
	public void ambiente () {
		System.out.println("solo funciono en el agua");
	}
	
}
