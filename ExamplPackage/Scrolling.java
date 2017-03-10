package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String setProperty = System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dtelepathy.com/blog/inspiration/long-page-scrolling-designs");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("html/body/div[4]/div[4]/a")));
		action.perform();

	}
}
