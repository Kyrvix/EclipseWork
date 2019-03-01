package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage {
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	private WebElement confirm;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	private WebElement checkBox;
	
	public void proceed() {
		checkBox.click();
		confirm.click();
	}
}
