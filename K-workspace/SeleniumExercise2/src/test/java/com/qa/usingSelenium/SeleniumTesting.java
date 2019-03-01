package com.qa.usingSelenium;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.buyDress.AddressPage;
import com.qa.buyDress.DressPage;
import com.qa.buyDress.FinalConfirmation;
import com.qa.buyDress.Homepage;
import com.qa.buyDress.LoginPage;
import com.qa.buyDress.PaymentPage;
import com.qa.buyDress.SearchPage;
import com.qa.buyDress.ShippingPage;
import com.qa.buyDress.ShoppingCart;

public class SeleniumTesting {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",  "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.searchDress("Dress");
		
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		searchPage.pickDress();
		
		DressPage dressPage = PageFactory.initElements(driver, DressPage.class);
		dressPage.addToCart();
		
		Thread.sleep(3000);
		
		DressPage dressPageConfirm = PageFactory.initElements(driver, DressPage.class);
		dressPageConfirm.confirm();
		
		ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
		shoppingCart.proceedCheckout();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("Bobby.Wilkins@hotmail.com", "thegreatbob");
		
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage.class);
		addressPage.proceed();
		
		ShippingPage shippingPage = PageFactory.initElements(driver, ShippingPage.class);
		shippingPage.proceed();

		PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
		paymentPage.theChoice();
		
		FinalConfirmation finalConfirmation = PageFactory.initElements(driver, FinalConfirmation.class);
		finalConfirmation.proceed();
		
		Thread.sleep(1000);
						
//		assertEquals("Did not succeed", "**Successful Login**", success.getText());
	}
}
//WebElement searchBox = driver.findElement(By.name("q"));
//searchBox.send("qa consulting");


//WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"b_context\"]/li[1]/div/div[1]/h2"));
//   //*[@id="hplogo"]