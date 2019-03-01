package com.qa.cucumberFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	@FindBy(id = "sb_form_q")
	private WebElement searchBar;
	
	public void searchAndClick(String input) {
		searchBar.sendKeys(input);
		searchBar.submit();
	}
}
