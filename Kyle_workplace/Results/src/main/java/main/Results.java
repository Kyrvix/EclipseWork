package main;

public class Results {

	private double physics;
	private double chemistry;
	private double biology;
	private double total;
	private double percentage;

	public Results(int phy, int che, int bio) {
		physics = phy;
		chemistry = che;
		biology = bio;
		total = physics + chemistry + biology;
	}

	public void printResults() {
		System.out.println("The Physics result is " + physics);
		System.out.println("The Chemistry result is " + chemistry);
		System.out.println("The Biology result is " + biology);
		System.out.println("The total mark is " + total);
	}

	public void getPerc() {
		System.out.println("Total percentage: " + workPercentage(total, 450));
		
		if(workPercentage(physics, 150) < 60) {
			boolean phyPass = false;
			System.out.println("You have failed Physics");
		}
		
		if(workPercentage(chemistry, 150) < 60) {
			boolean chePass = false;
			System.out.println("You have failed Chemistry");
		}
		
		if(workPercentage(biology, 150) < 60) {
			boolean bioPass = false;
			System.out.println("You have failed Biology");
		}
		if(phyPass && chePass && bioPass = true) {
			System.out.println("Congratulations you have passed!");
		}
			
	}
	
	private double workPercentage(double mark, double divider) {
		double result = ((mark * 100) / divider);
		return result;
	}
	
}
