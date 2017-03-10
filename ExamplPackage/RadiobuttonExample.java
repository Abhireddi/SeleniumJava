package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonExample {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// create the web driver object
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		// open url
		Thread.sleep(5000);
		d.get("http://www.newtours.demoaut.com");
		
		// send user name
		Thread.sleep(5000);
		d.findElement(By.name("userName")).sendKeys("abhi");
		
		// send password
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("abhi123");
		
		// click on sign in button
		Thread.sleep(5000);
		d.findElement(By.name("login")).click();
		
		// select one way radio button
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		// select round trip radio button
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		
		
		
		// select business class
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		
		
		// select firstclass
		Thread.sleep(5000);
		d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
				
				
		
		// check the radio button select or not
		boolean value=d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).isSelected();
		
		if(value==true)
		{
			System.out.println("The buisness class select..");
		}
		else			
		{
			System.out.println("The buisness class not select..");
		}
			
		
		
		// close webbrowser
		Thread.sleep(5000);
		d.close();
		

	}

}

