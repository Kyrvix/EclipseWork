package main;

public abstract class Scrolls extends Treasure {
	public boolean wearable() {
		return false;
	}

	public abstract int value();

	public abstract String type();
}
