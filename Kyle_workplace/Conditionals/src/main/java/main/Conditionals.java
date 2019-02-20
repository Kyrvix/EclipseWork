package main;

public class Conditionals {
	private double numOne;
	private double numTwo;
	private boolean bool;
	
	public Conditionals(int a, int b, boolean c) {
		numOne = a;
		numTwo = b;
		bool = c;
	}
	
	public void perform() {
		if(bool == true) {
			System.out.println(numOne + numTwo);
		} else {
			System.out.println(numOne * numTwo);
		}
	}
	
	public void logic() {
		for(int a = 100; a < 201; a++) {
			System.out.println(a);
		}
	}
	
	public void appendix() {
		if(numOne > 2000) {
			System.out.println("A");
			if(numOne > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if(numOne > 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if(numOne > 100) {
				System.out.println("3");
				if(numOne > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(numOne > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
	}
}
