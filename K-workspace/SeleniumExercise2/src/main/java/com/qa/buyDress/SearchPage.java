package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	@FindBy(xpath = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a")
	private WebElement dress;
	
	public void pickDress() {
		dress.click();
	}
}
