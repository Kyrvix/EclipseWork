package com.qa.DDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUser {
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement addLoginButton;
	
	public void loginClick() {
		addLoginButton.click();
	}
	
}
