package ExamplPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertAndVerify {

	// assert class can be found in testNG and there is no verify in testNG

	public void testMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Rothschild_family");

		String heading = driver.findElement(By.id("firstHeading")).getText();
		// assert will stop the execution if it fails.
		Assert.assertEquals(heading, "Rothschild family");
		driver.close();
	}

}