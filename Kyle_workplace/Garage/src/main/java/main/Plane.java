package main;

public class Plane extends Vehicle {
	private String size;
	
	public Plane(String size) {
		super(8, 4, "Land, Air");
		this.size = size;
	}
	
	public double calcBill() {
		if(size.equals("Small")) {
			return 216.50;
		}
		else if (size.equals("Medium")) {
			return 301.50;
		}
		else if (size.equals("Large")) {
			return 530.00;
		}
		else {
			System.out.println("Not a valid size");
		}
		return 0;
	}
	
	public void move() {
		System.out.println("The plane moves forward then tilts up into the air.");
	}
	
	public void start() {
		System.out.println("The plane has started.");
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
		return "Plane [Wheels=" + numWheels + ", Doors=" + numDoors + ", Type of Travel=" + typeOfTravel + ", size=" + size + "]";
	}
}
