package facebookLoginTestPack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class string {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		d.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("abhi");
		d.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("reddy");
		d.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("4086603727");
		d.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("4086603727");
		d.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("abhi12345");
		Select sel1=new Select(d.findElement(By.xpath(".//*[@id='month']"))); 
		sel1.deselectByIndex(3);
		Select sel2=new Select(d.findElement(By.xpath(".//*[@id='day']")));
		sel2.deselectByIndex(14);
		Select sel3=new Select(d.findElement(By.xpath(".//*[@id='day']")));
		sel3.deselectByIndex(26);
		d.findElement(By.xpath(".//*[@id='u_0_i']")).clear();
		d.findElement(By.xpath(".//*[@id='u_0_e']")).clear();
		//d.quit();
		
	}

}
