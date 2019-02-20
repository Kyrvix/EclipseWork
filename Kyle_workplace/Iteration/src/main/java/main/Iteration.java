package main;

public class Iteration {
	
	public void iterate() {
		for(int i=101; i<1000; i++) {
			System.out.println(i);
		}
	}
	
	public void numberWords() {
		String[] numberWordArray = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] decWordArray = {"twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety"};
		int n = 0;
		
		for(String i : numberWordArray) {
			System.out.println(i);
		}
		for(String i : decWordArray) {
			System.out.println(i);
			for(String j : numberWordArray) {
				if(n < 10) {
					System.out.println(i+j);
				}
			}
		}
	}
	
}
