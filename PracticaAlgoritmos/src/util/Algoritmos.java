package util;

public abstract class Algoritmos {
	
	/**
	 * 
	 * Metodo para calcular el numero de fibonacci
	 * 
	 * @param num Indice del numero de fibonacci que queremos
	 * @return 
	 */
	public static  int fibonacci(int num) {
		int actual = 0, siguiente = 1, auxiliar;
		
		for(int i = 0; i < num ; i++) {
			auxiliar = siguiente;
			siguiente += actual;
			actual = siguiente;
		}
		return actual;
	}
	

}
