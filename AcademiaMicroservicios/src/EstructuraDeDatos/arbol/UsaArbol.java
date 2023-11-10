package EstructuraDeDatos.arbol;

public class UsaArbol {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		//Nodo nodo = new Nodo();
		arbol.addNodo(new Nodo(2));
		arbol.addNodo(new Nodo(3));
		arbol.addNodo(new Nodo(8));
		arbol.addNodo(new Nodo(6));
		arbol.addNodo(new Nodo(4));
		arbol.addNodo(new Nodo(7));
	}

}
