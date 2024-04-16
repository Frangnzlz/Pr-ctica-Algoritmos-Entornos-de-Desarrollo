package util;

public abstract class Algoritmos {
	
	/**
	 * Metodo para calcular el numero de fibonacci de un numero que pasamos por parametro
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
	/**
	 * Metodo para coalcular el factorial de un numero que pasamos por parametro
	 * 
	 * @param num Numero que queremos calcular el factorial
	 * @return
	 */
	public static int factorial(int num) {
		int result =1;
		for(int i = num; i > 0 ;i--) {
			result *= i;
		}
		return result;		
	}
	

}
