package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdimLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Launches FireFox Browser with blank url
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println("Login Successful -Passed"); 
		}
		else
		{
		System.out.println("Login Unsuccessful -Failed");  
		}
		driver.close(); //Closes the Browser
		}
		}