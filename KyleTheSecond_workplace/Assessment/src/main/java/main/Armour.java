package main;

public abstract class Armour extends Treasure {
	public boolean wearable() {
		return true;
	}

	public abstract int value();
}