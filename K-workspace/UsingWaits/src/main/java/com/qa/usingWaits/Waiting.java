package com.qa.usingWaits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Waiting {
	@FindBy(tagName = "h2")
	private WebElement theHate;
	
	public void findTheHate() {
		theHate.click();
	}
}
