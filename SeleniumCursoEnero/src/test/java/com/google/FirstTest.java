package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;

public class FirstTest {

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void googleTest() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe"); // Para
																												// Windows
																												// se
																												// utiliza
																												// .exe

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Assert.assertEquals(driver.getTitle(), "Google");

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src, 'googlelogo')]")));

		System.out.println("PASO LA PRUEBA");

		// Validation - Hard Assertion
		Assert.assertEquals(driver.getTitle(), "Google");

		// Validation - Soft Assertion
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Google");

		System.out.println("Checkpoint");

		softAssert.assertAll();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
