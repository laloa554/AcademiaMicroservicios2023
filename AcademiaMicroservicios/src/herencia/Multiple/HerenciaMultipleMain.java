package herencia.Multiple;

import java.util.ArrayList;

public class HerenciaMultipleMain {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("blanco");
		colores.add("verde");
		colores.add("amarillo");
		TodoTerreno animal = new TodoTerreno("Pato",0.60f,1.6f,colores,"Anade real");
		animal.caminar();
		animal.volar();
		animal.nadar();
		animal.comer();
	}

}
