package com.qa.assessment.taskTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[4]/a[1]/img")
	private WebElement manage;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[16]/a/dl/dt")
	private WebElement newUser;
	
	public void createNew() {
		manage.click();
		newUser.click();
	}
}
