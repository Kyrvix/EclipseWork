package main;

public class Motorbike extends Vehicle {
	private String size;
	
	public Motorbike(String size) {
		super(2, 0, "Land");
		this.size = size;
	}
	
	public double calcBill() {
		if(size.equals("Small")) {
			return 20.50;
		}
		else if (size.equals("Medium")) {
			return 50.00;
		}
		else if (size.equals("Large")) {
			return 80.00;
		}
		else {
			System.out.println("Not a valid size");
		}
		return 0;
	}
	
	public void move() {
		System.out.println("The Motorbike moves forward.");
	}
	
	public void start() {
		System.out.println("The Motorbike has started.");
		setEngineOn(true);
	}
	
	@Override
	public int getNumDoors() {
		return super.getNumDoors();
	}
	@Override
	public String getTypeOfTravel() {
		return super.getTypeOfTravel();
	}
	@Override
	public int getNumWheels() {
		return super.getNumWheels();
	}
	
	String typeOfTravel = getTypeOfTravel();
	int numWheels = getNumWheels();
	int numDoors = getNumDoors();
	
	@Override
	public String toString() {
		return "Motorbike [Wheels=" + numWheels + ", Doors=" + numDoors + ", Type of Travel=" + typeOfTravel + ", size=" + size + "]";
	}
}
