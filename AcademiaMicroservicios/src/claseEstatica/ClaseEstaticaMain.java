package claseEstatica;

import claseEstatica.OperacionesMatematicas.Matematicas;

public class ClaseEstaticaMain {

	public static void main(String[] args) throws Exception {
		int num1 = 20;
        int num2 = 0;
        
        // Uso de los métodos de la clase estática Matematicas sin instanciar la clase
        System.out.println("Suma: " + Matematicas.sumar(num1, num2));
        System.out.println("Resta: " + Matematicas.restar(num1, num2));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(num1, num2));
        System.out.println("División: " + Matematicas.dividir(num1, num2));

	}

}
