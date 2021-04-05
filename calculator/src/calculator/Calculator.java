package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println("Calculator");
		System.out.println("Sum: (2 + 3) = " + sum(2,3));
		System.out.println("Substract: (2 + 3) = " + substract(2,3));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int substract(int a, int b) {
		return a - b;
	}
}
