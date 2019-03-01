package com.qa.assessment.taskTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement createUser;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement confirmPass;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	private WebElement full;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	private WebElement email;
	
	@FindBy(id = "yui-gen1-button")
	private WebElement create;
	
	@FindBy(id = "people")
	private WebElement peoples;
	
	public void createNew(String usrname, String passwd, String conPass, String fullName, String theEmail) throws InterruptedException {
		createUser.click();
		username.sendKeys(usrname);
		password.sendKeys(passwd);
		confirmPass.sendKeys(conPass);
		full.sendKeys(fullName);
		email.sendKeys(theEmail);
		create.click();
	}
	
	public String checkThePeoples() {
		return peoples.getText();
	}
}
