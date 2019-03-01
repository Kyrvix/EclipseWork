package com.qa.bingMaintainable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BingTesting {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.bing.com");
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.searchFor("Chickens");
	}
	
	@Test
	public void test2() {
		driver.get("https://www.bing.com");
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.searchFor("Dogs");
	}
	
	@Test
	public void test3() {
		driver.get("https://www.bing.com");
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.searchFor("Kittens");
	}
}
