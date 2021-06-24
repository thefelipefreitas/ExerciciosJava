package aula35;

public class Fibonacci {

	public static int fibonacciR(int num) {
		
		if (num == 0 || num == 1) {
			return num;
		} else {
			return (fibonacciR(num - 1) + fibonacciR(num - 2));
		}
	}
}
