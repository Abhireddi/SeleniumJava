package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCloseQuit {
public static void usingClose() {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.xpath(".//*[@id='social_block']/ul/li[2]/a")).click();
	//doesn't close child pages
	driver.close();
 }
public static void usingQuit(){
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.xpath(".//*[@id='social_block']/ul/li[2]/a")).click();
	// closes all the pages
	driver.quit();
}

public static void main(String[] args) {
	usingClose();
	usingQuit();
}
}