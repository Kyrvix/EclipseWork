package com.qa.usingSelenium;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",  "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a"));
		searchBar.sendKeys("London");
		Thread.sleep(5000);
//		searchBar.submit();
//		
//		WebElement theDress = driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a"));
//		theDress.click();
//
//		WebElement addCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
//		addCart.click();
//		
//		WebElement procCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
//		Thread.sleep(2000);
//		procCheckout.click();
//		
//		
//		WebElement checkout = driver.findElementByXPath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
//		checkout.click();
//		
//		WebElement email = driver.findElementByXPath("//*[@id=\"email\"]");
//		email.sendKeys("Bobby.Wilkins@hotmail.com");
//
//		WebElement password = driver.findElementByXPath("//*[@id=\"passwd\"]");
//		password.sendKeys("thegreatbob");
//		
//		WebElement loginButton = driver.findElementByXPath("//*[@id=\"SubmitLogin\"]/span");
//		loginButton.click();
//		
//		WebElement checkoutAgain = driver.findElementByXPath("//*[@id=\"center_column\"]/form/p/button/span");
//		checkoutAgain.click();
//		
//		WebElement checkBox = driver.findElementByXPath("//*[@id=\"cgv\"]");
//		checkBox.click();
//		
//		WebElement checkoutThird = driver.findElementByXPath("//*[@id=\"form\"]/p/button/span");
//		checkoutThird.click();
//
//		WebElement payment = driver.findElementByXPath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
//		payment.click();
//		
//		
//		WebElement confirm = driver.findElementByXPath("//*[@id=\"cart_navigation\"]/button/span");
//		confirm.click();
//
//		Thread.sleep(1000);
						
//		assertEquals("Did not succeed", "**Successful Login**", success.getText());
	}
}
//WebElement searchBox = driver.findElement(By.name("q"));
//searchBox.send("qa consulting");


//WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"b_context\"]/li[1]/div/div[1]/h2"));
//   //*[@id="hplogo"]