package main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public double calcBill() {
		double sum = 0;
		for (Vehicle v : vehicles) {
			sum = v.calcBill();
			System.out.println(sum);
		}
		return sum;
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return vehicles + "";
	}
	
	

}
