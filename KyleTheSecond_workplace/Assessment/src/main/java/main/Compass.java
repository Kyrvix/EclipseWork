package main;

import java.util.Random;

public class Compass {

	private double disty = 7;
	private double distx = 4;
	private double distance;
	private String direction;

	public double newDist(String direction) {
		Random r = new Random();
		if (direction.toUpperCase().equals("N") || direction.toUpperCase().equals("NORTH")) {
			disty -= r.doubles(0.5, 2.0).findFirst().getAsDouble();
			return distance = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		} else if (direction.toUpperCase().equals("E") || direction.toUpperCase().equals("EAST")) {
			distx -= r.doubles(0.25, 1.0).findFirst().getAsDouble();
			return distance = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		} else if (direction.toUpperCase().equals("S") || direction.toUpperCase().equals("SOUTH")) {
			disty += r.doubles(0.5, 2.0).findFirst().getAsDouble();
			return distance = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		} else if (direction.toUpperCase().equals("W") || direction.toUpperCase().equals("WEST")) {
			distx += r.doubles(0.25, 1.0).findFirst().getAsDouble();
			return distance = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		} else {
			System.out.println("That is not a valid direction");
			return distance = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		}
	}
}