package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalConfirmation {
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement finalConfirm;
	
	public void proceed() {
		finalConfirm.click();
	}
}
