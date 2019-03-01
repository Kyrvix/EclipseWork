package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement confirm;
	
	public void proceed() {
		confirm.click();
	}
}
