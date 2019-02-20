package main;

public class Magazine extends Item {
	private String demographic;

	public Magazine(String demographic, int id) {
		super(id);
		this.demographic = demographic;
	}

	public String getDemographic() {
		return demographic;
	}

	public void setDemographic(String demographic) {
		this.demographic = demographic;
	}
	
	@Override
	public String toString() {
		return "[" + demographic + ", " + super.getId() + "]";
	}
}
