package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0, k = 0;
        boolean repetir;
        do {
            repetir = false;
            try {
                System.out.print("Introduce primer n�mero entero: ");                                             
                x = sc.nextInt();

                System.out.print("Introduce segundo n�mero entero: ");
                y = sc.nextInt();

                System.out.print("Introduce tercer n�mero entero: ");
                z = sc.nextInt();

                System.out.print("Introduce cuarto n�mero entero: ");
                k = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no v�lido" + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        System.out.println("int introducido -> " + x);
        System.out.println("int introducido -> " + y);
        System.out.println("int introducido -> " + z);
        System.out.println("int introducido -> " + k);

	}

}
