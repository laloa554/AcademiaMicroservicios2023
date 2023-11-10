package claseEstatica;

import claseEstatica.OperacionesMatematicas.Matematicas;

public class ClaseEstaticaMain {

	public static void main(String[] args) throws Exception {
		int num1 = 20;
        int num2 = 0;
        
        // Uso de los m�todos de la clase est�tica Matematicas sin instanciar la clase
        System.out.println("Suma: " + Matematicas.sumar(num1, num2));
        System.out.println("Resta: " + Matematicas.restar(num1, num2));
        System.out.println("Multiplicaci�n: " + Matematicas.multiplicar(num1, num2));
        System.out.println("Divisi�n: " + Matematicas.dividir(num1, num2));

	}

}
