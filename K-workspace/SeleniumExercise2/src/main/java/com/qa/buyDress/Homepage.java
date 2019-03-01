package com.qa.buyDress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement search;
	
	public void searchDress(String searchable) {
		search.sendKeys(searchable);
		search.submit();
	}
}
