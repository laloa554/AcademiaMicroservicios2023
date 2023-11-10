package EstructuraDeDatos.array;

public class Arrays {
	private int[] simpleArray;
	private int[][] matrix;
	
	public Arrays() {
		this.simpleArray = null;
		this.matrix = null;
	}

	public int[] getSimpleArray() {
		return simpleArray;
	}

	public void setSimpleArray(int[] simpleArray) {
		this.simpleArray = simpleArray;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void showArray() {
		if(simpleArray ==  null) {
			System.out.println("the array is null");
			return;
		}
		for(int i = 0; i<simpleArray.length; i++) {
			System.out.print("[ "+simpleArray[i]+" ]");
		}
		System.out.println("");
	}
	
	public void showMatriz() {
		if(matrix ==  null) {
			System.out.println("the matrix is null");
			return;
		}
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix.length; j++) {
				System.out.print("[ "+matrix[i][j]+" ]");
			}
			System.out.println("");
		}
		System.out.println("");
	}


}
