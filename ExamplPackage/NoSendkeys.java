package ExamplPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoSendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=contact");
		JavascriptExecutor javaex = (JavascriptExecutor) driver;
		javaex.executeScript("document.getElementById('email').value='lavanya';");

	}

}
