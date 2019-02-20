package main;

public class StringManipulation {

	public int stringSplit(String a) {
		String[] inputString = a.split(" ");
		return inputString.length;
	}

	public void stringVert(String b) {
		String[] inputString = b.split(" ");
		for (int i = 0; i < inputString.length; i++) {
			System.out.println(inputString[i]);
		}
	}

	public void stringInvert(String c) {
		String[] inputString = c.split(" ");
		for (int i = inputString.length; i > 0; i--) {
			System.out.println(inputString[i - 1]);
		}
	}

	public boolean stringFind(String d, String e) {
		String[] inputString = d.split(" ");
		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
}
