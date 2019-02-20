package main;

public class BlackJack {
	private int numOne;
	private int numTwo;
	
	public BlackJack(int a, int b) {
		numOne = a;
		numTwo = b;
	}
	
	public int check() {
		if(numOne < 22 && numTwo < 22) {
			int number = Math.max(numOne, numTwo);
			return(number);
		}
		else if(numOne > 21 && numTwo < 22) {
			return(numTwo);
		}
		else if (numOne < 22 && numTwo > 21) {
			return(numOne);
		}
		else {
			return(0);
		}
	}
}