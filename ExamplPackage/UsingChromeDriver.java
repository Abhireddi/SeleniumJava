package ExamplPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingChromeDriver {
	//install chrome driver from http://www.seleniumhq.org/download/
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//change the path below 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		//doesn't work with new chrome version 55.0.2883.87
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
	}

}