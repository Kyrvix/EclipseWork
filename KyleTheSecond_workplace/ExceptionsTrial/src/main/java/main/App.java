package main;

public class App {

	public static void main(String[] args) {
		UsingExceptions useExcept = new UsingExceptions();
		System.out.println(useExcept.divide());
		
		int x = 5;
		int y = 0;
		if(y == 0) {
			throw new ArithmeticException();
		}
	}
}