package com.qa.assessment.taskOne;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class TaskOneTest {
	WebDriver driver;
	
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", Constants.driver);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get(Constants.jenkins);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void normJenkins() throws InterruptedException {
		Login login = PageFactory.initElements(driver, Login.class);
		login.signIn(Constants.user, Constants.pass);
		
		Mainpage mainpage = PageFactory.initElements(driver, Mainpage.class);
		mainpage.createNew();
		
		NewProject newProj = PageFactory.initElements(driver, NewProject.class);
		newProj.createProj(Constants.projectName, driver).click(); //Very hit or miss on whether it picks up the "Save" button.
		
		Project project = PageFactory.initElements(driver, Project.class);
		project.backDash();
		
		assertEquals("Project was not found", Constants.projectName, mainpage.findProject());
	}
}
