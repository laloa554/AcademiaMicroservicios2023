package herencia.Multiple;

import java.util.ArrayList;

public class Animal {
	private String nombre;
	private float tamano;
	private float peso;
	private ArrayList<String> colores;
	
	public Animal() {

	}

	public Animal(String nombre, float tamano, float peso, ArrayList<String> colores) {
		super();
		this.nombre = nombre;
		this.tamano = tamano;
		this.peso = peso;
		this.colores = colores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public ArrayList<String> getColores() {
		return colores;
	}

	public void setColores(ArrayList<String> colores) {
		this.colores = colores;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tamano=" + tamano + ", peso=" + peso + ", colores=" + colores + "]";
	}
	
	public String sonido(String nombre,String sonido) {
		return "soy un " + nombre +" y " + " hago el sonido: " + sonido;
	}

	public void comer(String comida) {
		System.out.println("Estoy comiendo: " + comida);
	}

}
