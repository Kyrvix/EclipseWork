package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement paymentChoice;
	
	public void theChoice() {
		paymentChoice.click();
	}
}
