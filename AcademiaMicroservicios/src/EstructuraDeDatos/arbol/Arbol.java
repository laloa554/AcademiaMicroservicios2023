package EstructuraDeDatos.arbol;

	public class Arbol {

		/* Atributos */
		private Nodo raiz;

		/* Contructories */
		public Arbol() {

		}

		public Arbol(int valor) {
			this.raiz = new Nodo(valor);
		}

		public Arbol(Nodo raiz) {
			this.raiz = raiz;
		}

		/* Setters y Getters */
		public Nodo getRaiz() {
			return raiz;
		}

		public void setRaiz(Nodo raiz) {
			this.raiz = raiz;
		}

		/* Funciones */
		private void addNodo(Nodo nodo, Nodo raiz) {
			/* 2.- Partiendo de la ra�z preguntamos: Nodo == null ( o no existe ) ? */
			if (raiz == null) {
				/*
				 * 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya hemos ingresado
				 * nuestro primer dato.
				 */
				raiz = nodo;
			} else {
				/* 4.- En caso negativo preguntamos: X < Nodo */
				if (nodo.getValor() <= raiz.getValor()) {
					/*
					 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del que acabamos de
					 * preguntar y repetimos desde el paso 2 partiendo del Nodo al que acabamos de
					 * visitar
					 */
					addNodo(nodo, raiz.getHojaIzquierda());
				} else {
					/*
					 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal cual hicimos con
					 * el caso anterior repetimos desde el paso 2 partiendo de este nuevo Nodo.
					 */
					addNodo(nodo, raiz.getHojaDerecha());
				}
			}
		}

		public void addNodo(Nodo nodo) {
			this.addNodo(nodo, this.raiz);
		}

	}

