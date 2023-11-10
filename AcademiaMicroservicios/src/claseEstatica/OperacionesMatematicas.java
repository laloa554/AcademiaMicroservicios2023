package claseEstatica;

public class OperacionesMatematicas {

    // Clase estática para operaciones matemáticas
    public static class Matematicas {

        public static int sumar(int a, int b) {
            return a + b;
        }

        public static int restar(int a, int b) {
            return a - b;
        }

        public static int multiplicar(int a, int b) {
            return a * b;
        }

		public static double dividir(double a, double b) /*throws Exception */{  	
        	try {
        		return a/b;
        	}catch(ArithmeticException ae) {
        		System.out.println("No se puede dividir por 0: " + ae);
        		return 0.0d;
        		//throw new Exception("No se puede dividir por 0: " + ae);       	
        	}/*finally{	
        		
        	}*/
            
        }
    }
}