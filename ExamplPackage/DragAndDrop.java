package ExamplPackage;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.interactions.Actions;
 
public class DragAndDrop {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
 
		 driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		 Actions action = new Actions(driver);
		 action.dragAndDrop(driver.findElement(By.id("dragdiv")), driver.findElement(By.id("dropdiv")));
		 action.perform();
 
	}
 
}
