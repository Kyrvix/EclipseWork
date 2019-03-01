package com.qa.assessment.taskTwo;

import static org.junit.Assert.*;

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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

@RunWith(Parameterized.class)
public class TaskTwoTest {
	WebDriver driver;

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		FileInputStream newUsers = new FileInputStream(Constants.fileLoc);
		XSSFWorkbook workbook = new XSSFWorkbook(newUsers);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Object[][] users = new Object[sheet.getPhysicalNumberOfRows() - 1][6];

		for (int rowNum = 1; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			users[rowNum - 1][0] = sheet.getRow(rowNum).getCell(0).getStringCellValue();
			users[rowNum - 1][1] = sheet.getRow(rowNum).getCell(1).getStringCellValue();
			users[rowNum - 1][2] = sheet.getRow(rowNum).getCell(2).getStringCellValue();
			users[rowNum - 1][3] = sheet.getRow(rowNum).getCell(3).getStringCellValue();
			users[rowNum - 1][4] = sheet.getRow(rowNum).getCell(4).getStringCellValue();
			users[rowNum - 1][5] = rowNum;
		}
		workbook.close();
		return Arrays.asList(users);

	}

	private String username;
	private String fullName;
	private String password;
	private String confirmPass;
	private String email;
	private int rowNum;
	
	public TaskTwoTest(String username, String fullName, String password, String confirmPass, String email, int rowNum) {
		this.username = username;
		this.fullName = fullName;
		this.password = password;
		this.confirmPass = confirmPass;
		this.email = email;
		this.rowNum = rowNum;
	}

	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", Constants.driver);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get(Constants.jenkins);
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void newUsers() throws IOException, InterruptedException {
		Login login = PageFactory.initElements(driver, Login.class);
		login.signIn(Constants.user, Constants.pass);
		
		Mainpage main = PageFactory.initElements(driver, Mainpage.class);
		main.createNew();
		
		Users user = PageFactory.initElements(driver, Users.class);
		user.createNew(username, password, confirmPass, fullName, email);
		
		assertEquals("The person was not found", user.checkThePeoples().contains(fullName), user.checkThePeoples().contains(fullName));
		
		FileInputStream users = new FileInputStream(Constants.fileLoc);
		XSSFWorkbook workbook = new XSSFWorkbook(users);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell;
		cell = row.getCell(5);
		if (cell == null) {
			cell = row.createCell(5);
		}
		
		try {
			assertEquals("The person was not found", user.checkThePeoples().contains(fullName), user.checkThePeoples().contains(fullName));
			cell.setCellValue("True");
		} catch (AssertionError e) {
			cell.setCellValue("False");
			Assert.fail();
		} finally {

			FileOutputStream fileOut = new FileOutputStream(Constants.fileLoc);

			workbook.write(fileOut);
			fileOut.flush();
			fileOut.close();

			workbook.close();
			users.close();
		}
	}
}
