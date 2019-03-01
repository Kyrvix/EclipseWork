package com.qa.assessment.taskOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[1]/a[2]")
	private WebElement goBack;
	
	public void backDash() {
		goBack.click();
	}
}
