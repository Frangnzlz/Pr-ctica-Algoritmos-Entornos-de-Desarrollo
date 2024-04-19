package app;

import java.util.Random;
import java.util.ArrayList;
import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		Random rn = new Random();
		ArrayList<Integer> numAleatorio = new ArrayList<>();
		ArrayList<Integer> fibonacciResults = new ArrayList<>();
		ArrayList<Integer> factorialResults = new ArrayList<>();
		ArrayList<Boolean> esPrimoResults = new ArrayList<>();
		
		for(int i = 0; i<5;i++) {
			numAleatorio.add(rn.nextInt(10)+1);
		}
		
		for(Integer fibonacci : numAleatorio) {
			fibonacciResults.add(Algoritmos.fibonacci(fibonacci));
		}
		
		for(Integer factorial : numAleatorio) {
			factorialResults.add(Algoritmos.factorial(factorial));
		}
		
		for(Integer factorial : numAleatorio) {
			esPrimoResults.add(Algoritmos.esPrimo(factorial));
		}
	}

}
