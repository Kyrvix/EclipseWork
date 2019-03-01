package com.qa.DDTTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.DDT.AddUser;
import com.qa.DDT.LogInfo;
import com.qa.DDT.LoginInfo;
import com.qa.DDT.LoginUser;

@RunWith(Parameterized.class)
public class ParaTest {
	WebDriver driver;

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Downloads\\DemoSiteDDT.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Object[][] ob = new Object[sheet.getPhysicalNumberOfRows() - 1][2];

		for (int row = 1; row < sheet.getPhysicalNumberOfRows(); row++) {
			for (int column = 0; column < 2; column++) {
				ob[row - 1][column] = sheet.getRow(row).getCell(column).getStringCellValue();
			}
		}
		return Arrays.asList(ob);
	}

	private String x;
	private String y;

	public ParaTest(String x, String y) {
		this.x = x;
		this.y = y;
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get("http://thedemosite.co.uk/");
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void test() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Downloads\\DemoSiteDDT.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		//		System.out.println(x + " " + y);
		driver.manage().window().maximize();

		AddUser addUser = PageFactory.initElements(driver, AddUser.class);
		addUser.addUserClick();

		LogInfo logInfo = PageFactory.initElements(driver, LogInfo.class);
		logInfo.infoAndClick(x, y);

		LoginUser logUser = PageFactory.initElements(driver, LoginUser.class);
		logUser.loginClick();

		LoginInfo loginInfo = PageFactory.initElements(driver, LoginInfo.class);
		loginInfo.infoAndClick(x, y);
		
		//See ChristophPerrins.github -> Automated exercises for a better version
		
		for (int row = 1; row < sheet.getPhysicalNumberOfRows(); row++) {
			for (int column = 0; column < 4; column++) {
				XSSFRow row2 = sheet.getRow(row);
				XSSFCell cell = row2.getCell(column);
				if(cell == null) {
					cell = row2.createCell(column);
					cell.setCellValue(loginInfo.successLogin());
				}	
			}
		}
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Admin\\Downloads\\DemoSiteDDT.xlsx");

		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		file.close();
	}
}
