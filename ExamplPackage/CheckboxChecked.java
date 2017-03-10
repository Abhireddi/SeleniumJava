package ExamplPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxChecked {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abhireddi87@gmail.com");
		driver.findElement(By.id("next")).click();
		// steps to find checkbox checked
		boolean ischecked;
		ischecked = driver.findElement(By.id("PersistentCookie")).isSelected();
		System.out.println(" CheckBox checked? : " + ischecked);
		driver.close();
	}

}