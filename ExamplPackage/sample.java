package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample {
	public static void main(String[] args) 
	{
		
		// Create the web driver
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");		
		WebDriver f=new FirefoxDriver();
		f.manage().window().maximize();
		
		// open the chrome webdriver
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		
		// open the IE 
		System.setProperty("webdriver.ie.driver", "E:\\Softwares\\Testing\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		WebDriver i=new InternetExplorerDriver();
		i.manage().window().maximize();
		
		
		
		// open urls
		f.get("http://www.google.co.in");
		c.get("http://www.facebook.com");
		i.get("http://www.gmail.com");
		
		
		// naviage ,to ,back, forward
		f.navigate().to("http://www.facebook.com");
		f.navigate().back();
		f.navigate().forward();
		
		
		
		f.findElement(By.id("idname")).click();
		
		f.findElement(By.name("namevalue")).sendKeys("send values");

	}

}
