package claseAbstracta;

public class ClaseAbstractaMain {

	public static void main(String[] args) {
		// Figura figura = new Figura();
		Cuadrado cuadrado = new Cuadrado("rojo", 5.5);
		Triangulo triangulo = new Triangulo("verde", 5, 5);

		System.out.println("Area Triangulo: " + triangulo.calcularArea());
		System.out.println("Area Cuadrado: " + cuadrado.calcularArea());
		
	} 

}
