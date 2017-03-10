package facebookLoginTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// open browser
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		// open url
		d.get("https://www.facebook.com/");
		
		
		// send the emilid or phone to textbox
		Thread.sleep(5000);
		d.findElement(By.id("email")).sendKeys("abhi@gmail.com");
			
		
		// send the password to password textbox
		Thread.sleep(5000);
		d.findElement(By.id("pass")).sendKeys("@143");
		
		
		// click on login
		Thread.sleep(5000);
		d.findElement(By.id("u_0_m")).click();
				

	}

}