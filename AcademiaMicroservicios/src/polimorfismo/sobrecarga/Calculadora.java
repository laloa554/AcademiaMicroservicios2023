package polimorfismo.sobrecarga;

public class Calculadora {

	// M�todo para sumar dos n�meros enteros
	public int sumar(int a, int b) {
		return a + b;
	}

	// M�todo sobrecargado para sumar tres n�meros enteros
	public int sumar(int a, int b, int c) {
		return a + b + c;
	}

	// M�todo sobrecargado para sumar dos n�meros flotantes
	public float sumar(float a, float b) {
		return a + b;
	}
	
	public float sumar(int a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		System.out.println("Suma de dos enteros: " + calc.sumar(5, 3));
		System.out.println("Suma de tres enteros: " + calc.sumar(5, 3, 10));
		System.out.println("Suma de dos flotantes: " + calc.sumar(2.5f, 3.7f));
		System.out.println("Suma de dos flotantes: " + calc.sumar(1,0.0f));
	}
}
