package main;

public abstract class Weapons extends Treasure {
	public boolean wearable() {
		return true;
	}

	public abstract int value();
}
