package main;

public class Taxes {
	
	
	
	public double taxPercentage(double salary) {
		if(salary < 15000) {
			return 0;
		}
		else if(salary > 14999 && salary < 20000) {
			return 10;
		}
		else if(salary > 19999 && salary < 30000) {
			return 15;
		}
		else if(salary > 29999 && salary < 45000) {
			return 20;
		}
		else {
			return 25;
		}
	}
	
	public double actualSal(double salary) {
		double result = (salary / 100) * this.taxPercentage(salary);
		double newSalary = salary - result;
		return newSalary;
	}
	
	
}
