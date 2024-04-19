package util;

public abstract class Algoritmos {
	
	/**
	 * Metodo para calcular el numero de fibonacci de un numero que pasamos por parametro
	 * 
	 * @param num Indice del numero de fibonacci que queremos
	 * @return devuelve el numero de fibonacci
	 */
	public static  int fibonacci(int num) {
		int actual = 0, siguiente = 1, auxiliar;
		
		for(int i = 0; i < num-1 ; i++) {
	        auxiliar = siguiente + actual;
	        actual = siguiente;
	        siguiente = auxiliar;
		}
		return actual;
	}
	/**
	 * Metodo para calcular el factorial de un numero que pasamos por parametro
	 * 
	 * @param num Numero que queremos calcular el factorial
	 * @return Devuelve el factorial del numero introducido
	 */
	public static int factorial(int num) {
		int result =1;
		for(int i = num; i > 0 ;i--) {
			result *= i;
		}
		return result;		
	}
	
	/**
	 * Metodo para comprobar si un numero es primo o no
	 * 
	 * @param num Numero que queremos saber si es primo
	 * @return Devuelve un true si el numero es primo un false si no lo es
	 */
	public static boolean esPrimo(int num) {
		
		if(num <= 0) {
			return false;
		}
		for(int i = num-1 ; i>1;i--) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}

}
