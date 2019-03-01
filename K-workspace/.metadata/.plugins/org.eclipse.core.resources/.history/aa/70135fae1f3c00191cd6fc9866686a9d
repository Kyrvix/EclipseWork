package com.qa.assessment.taskOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[1]/a[2]")
	private WebElement newItem;
	
	@FindBy(xpath = "//*[@id=\"job_AutomatedTest\"]/td[3]")
	private WebElement findProj;
	
	public void createNew() {
		newItem.click();
	}
	
	public String findProject() {
		return findProj.getText();
	}
}
