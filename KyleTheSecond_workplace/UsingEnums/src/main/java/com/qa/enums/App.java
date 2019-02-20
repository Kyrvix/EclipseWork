package com.qa.enums;

public class App {

	public static void main(String[] args) {
		Day day = Day.FRIDAY;

		// switch(day) { Can be done like this
		// case MONDAY:
		// case TUESDAY:
		// case WEDNESDAY:
		// case THURSDAY:
		// case FRIDAY:
		// System.out.println("Work");
		// break;
		// case SATURDAY:
		// System.out.println("Party!");
		// break;
		// case SUNDAY:
		// System.out.println("Sleep");
		// break;
		// }

		System.out.println(day.getFeeling());

		for (Day day1 : Day.values()) {
			System.out.println(day1.getFeeling());
		}
	}
}