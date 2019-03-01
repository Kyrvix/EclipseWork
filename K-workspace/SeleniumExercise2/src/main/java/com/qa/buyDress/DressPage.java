package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage {
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement toCheckout;
	
	public void addToCart() {
		addCart.click();
	}
	
	public void confirm() {
		toCheckout.click();
	}
}
