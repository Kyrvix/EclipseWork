package com.qa.BlackJackTesting;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		runner.allTests();

	}

	public void allTests() {
		Result result = JUnitCore.runClasses(DealerMiscSuite.class, DealerResultTest.class);
		System.out.println("Would you like to run the tests?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		if (input.toLowerCase().equals("yes")) {

			System.out.println("All Results passed: " + result.wasSuccessful());

			if (!result.wasSuccessful()) {
				System.out.println("Failed Tests:");
				for (Failure failure : result.getFailures()) {
					System.out.println(failure.getMessage());
				}
			}
		} else {
			System.out.println("OK, enjoy your day.");
		}
	}

}
