package ExamplPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class Screenshort {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		// taking screen shot using TakesScreenshot interface
		// import org.openqa.selenium.TakesScreenshot;
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// saving the screenshot
		File path = new File("C:\\selenium\\screenshot.jpg");
		try {
			FileUtils.copyFile(screenshot, path);
		} catch (Exception e) {
			System.out.println("File did not save: " + e.getMessage());

		}
		driver.close();

	}

}
