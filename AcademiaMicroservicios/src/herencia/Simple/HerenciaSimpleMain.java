package herencia.Simple;

import java.util.ArrayList;

public class HerenciaSimpleMain {

	public static void main(String[] args) {

		Person p = new Person("Eduardo", "Alvarado", "Hombre", 25);
		System.out.println(p.toString());
		
		ArrayList<String> pB = new ArrayList<String>();
		pB.add("USB");
		pB.add("notebook");
		pB.add("pen");
		Student s = new Student(20164564, "Ale", "BO", "Mujer", 25, 9.5f, pB);
		System.out.println(s.toString());

	}

}
