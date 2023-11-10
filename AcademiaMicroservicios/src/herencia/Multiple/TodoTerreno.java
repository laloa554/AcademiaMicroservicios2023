package herencia.Multiple;

import java.util.ArrayList;

public class TodoTerreno extends Animal implements Acuatico, Aereo, Terrestre{
	
	private String especie;
	
	public TodoTerreno() {
		super();
	}

	public TodoTerreno(String nombre, float tamano, float peso, ArrayList<String> colores, String especie) {
		super(nombre, tamano, peso, colores);
		this.especie = especie;
	}

	@Override
	public void caminar() {
		System.out.println("Puedo caminar en la superficie");
	}

	@Override
	public void volar() {
		System.out.println("Tengo alas y puedo volar");
	}

	@Override
	public void nadar() {
		System.out.println("Soy muy buen nadador");
	}
	
	public void sonido() {
		String nombre = super.getNombre();
		super.sonido(nombre, "Quack");
	}
	
	public void comer() {
		super.comer("pan");
	}

	@Override
	public String toString() {
		return "TodoTerreno [especie=" + especie + ", getNombre()=" + getNombre() + ", getTamano()=" + getTamano()
				+ ", getPeso()=" + getPeso() + ", getColores()=" + getColores() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
