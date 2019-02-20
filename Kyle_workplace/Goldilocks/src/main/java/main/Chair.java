package main;

public class Chair {
	
	private int maxWeight;
	
	public Chair(int maxWeight) {
		
		this.setMaxWeight(maxWeight);
	}

	@Override
	public String toString() {
		return "Weight=" + getMaxWeight() + "";
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	

}
