package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Abhi.xyz.com");
	driver.findElement(By.id("pass")).sendKeys("Password");
	driver.findElement(By.id("u_0_n")).click();
	
}
}