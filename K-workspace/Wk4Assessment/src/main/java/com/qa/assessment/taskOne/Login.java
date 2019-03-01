package com.qa.assessment.taskOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(id = "j_username")
	private WebElement username;
	
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement password;
	
	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement login;
	
	public void signIn(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
}
