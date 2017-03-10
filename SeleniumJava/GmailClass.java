package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailClass {
	{
		// open browser
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		// type url

		d.get("http://www.google.co.in");

		// click on sign in button

		d.findElement(By.id("gb_70")).click();

		// enter email id in textbox

		d.findElement(By.name("Email")).sendKeys("abhireddi87@gmail.com");

		// click on next button

		d.findElement(By.xpath(".//*[@id='next']")).click();

		// enter the password in textbox

		d.findElement(By.id("Passwd")).sendKeys("6692209751");

		// click on sign in button

		d.findElement(By.id("signIn")).click();

		// click on gmail link

		d.findElement(By.linkText("Gmail")).click();

	}

}