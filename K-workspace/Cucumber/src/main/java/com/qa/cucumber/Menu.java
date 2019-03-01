package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement menu;
	
	public boolean browseMenu() {
		return menu.isDisplayed();
	}
}
