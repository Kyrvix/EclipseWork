package main;

import java.util.Random;

public class Compass {

	private double disty = 7;
	private double distx = 4;
	private double distance;
	private String direction;

	public double newDist(String direction) {
		Random r = new Random();
		if (direction.equals("North") || direction.equals("north") || direction.equals("N") || direction.equals("n")) {
			disty -= r.doubles(0.5, 2.0).findFirst().getAsDouble();
			return distance = Math.sqrt(((distx * distx) + (disty * disty)));
		} else if (direction.equals("East") || direction.equals("east") || direction.equals("E") || direction.equals("e")) {
			distx -= r.doubles(0.25, 1.0).findFirst().getAsDouble();
			return distance = Math.sqrt(((distx * distx) + (disty * disty)));
		} else if (direction.equals("South") || direction.equals("south") || direction.equals("S") || direction.equals("s")) {
			disty += r.doubles(0.5, 2.0).findFirst().getAsDouble();
			return distance = Math.sqrt(((distx * distx) + (disty * disty)));
		} else if (direction.equals("West") || direction.equals("west") || direction.equals("W") || direction.equals("w")) {
			distx += r.doubles(0.25, 1.0).findFirst().getAsDouble();
			return distance = Math.sqrt(((distx * distx) + (disty * disty)));
		} else {
			System.out.println("That is not a valid direction");
			return distance = Math.sqrt(((distx * distx) + (disty * disty)));
		}
	}
}
