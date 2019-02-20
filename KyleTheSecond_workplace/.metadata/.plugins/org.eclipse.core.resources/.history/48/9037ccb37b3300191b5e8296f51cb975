package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Game {

	private double dist = 8.06;
	private String input;
	private String distance;

	public void beginAdventure() {

		DecimalFormat df = new DecimalFormat("0.###");
		Compass comp = new Compass();
		Scanner sc = new Scanner(System.in);

		System.out.println("You wake up in a mysterious place. All you see is a grey swamp surrounding you.\n"
				+ "Fog floats off the many bogs of water making vision poor.\n"
				+ "A cacophony of caws can be heard in the distance.\n"
				+ "You notice a watch-like object in your left hand that only seems to contain a distance.\n"
				+ "The initial reading on the watch shows " + dist + "m.\n"
				+ "Try \"North\", \"East\", \"South\", or \"West\" to continue on your adventure. Good luck.");

		for (int i = 1; i > 0; i++) {
			input = sc.nextLine();
			dist = comp.newDist(input);
			distance = "" + dist;
			distance = df.format(dist);
			System.out.println("Your watch reads: " + distance + "m");
			if (dist > 5) {
				System.out.println("You mindlessly wander through the putrid, wet and uncomfortable bog");
			} else if (dist >= 4.5 && dist < 5.0) {
				System.out.println(
						"You pass by a large gnarled tree. A vulture sits on one of the branches ominously staring at you.");
			} else if (dist >= 3.0 && dist < 4.5) {
				System.out.println("All you can see is grey plain. Does it ever end?");
			} else if (dist >= 1.5 && dist < 3.0) {
				System.out.println("You see an object in the distance. Is it real or part of your imagination?");
			} else if (dist >= 0.75 && dist < 1.5) {
				System.out.println("The object appears to be a chest. Success, so clearly in view, or is it merely a trick of the light?");
			} else {
				i = -1;
				System.out.println(
						"You reach the chest. Inside, you find treasure and a map to escape inside. Congratulations, you win!... For now.");
			}
		}
	}
}
