package com.qa.enums;

public enum Day {
	MONDAY("Crap"), TUESDAY("Slightly better"), WEDNESDAY("Despairing"), THURSDAY("Hopeful"), FRIDAY("Dead"), SATURDAY(
			"Recovering"), SUNDAY("Church");

	private String feeling;

	public String getFeeling() {
		return this.feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	Day(String feeling) {
		this.feeling = feeling;
	}
}
