package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement confirm;
	
	public void proceedCheckout() {
		confirm.click();
	}
}
