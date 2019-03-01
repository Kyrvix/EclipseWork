package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement signIn;
	
	public void login(String user, String pass) {
		email.sendKeys(user);
		password.sendKeys(pass);
		signIn.click();
	}
}
