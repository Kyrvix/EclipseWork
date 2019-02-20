package main;

public class Main {

	public static void main(String[] args) {
		Conditionals condition = new Conditionals(1, 2, true);
		condition.perform();
		
		Conditionals conditionTwo = new Conditionals(3, 3, false);
		conditionTwo.perform();
		
		Conditionals conditionThree = new Conditionals(1, 1, true);
		conditionThree.perform();
		
		condition.logic();
		
		Conditionals appTest = new Conditionals(550, 0, true);
		appTest.appendix();
	}

}
