package com.qa.assessment.taskOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewProject {
	@FindBy(id = "name")
	private WebElement projName;
	
	@FindBy(xpath = "//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]")
	private WebElement freestyle;
	
	@FindBy(id = "ok-button")
	private WebElement ok;
	
	@FindBy(id = "yui-gen38-button")
	private WebElement save;
	
	public WebElement createProj(String project, WebDriver driver) throws InterruptedException {
		projName.sendKeys(project);
		freestyle.click();
		Thread.sleep(500); //didn't figure out two waits
		ok.click();
		WebElement creation = (new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.id("yui-gen38-button"))));
		return creation;
	}
}
