package com.qa.bingMaintainable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(id = "sb_form_q")
	private WebElement searchBox;

	public void searchFor(String searchText) {
		searchBox.sendKeys(searchText);
		searchBox.submit();
	}
}
