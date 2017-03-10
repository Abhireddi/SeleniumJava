package facebookLoginTestPack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingHyperLinks {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
		driver.findElement(By.linkText("Gmail")).click();

	}

}
