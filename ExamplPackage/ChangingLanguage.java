package ExamplPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChangingLanguage {
	// ******this doesn't work for internet explorer
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		// for Firefox

		FirefoxProfile fireFoxProfile = new FirefoxProfile();
		// setting language to Hindi using firefoz profile
		fireFoxProfile.setPreference("intl.accept_languages", "Hi");
		WebDriver driver = new FirefoxDriver(fireFoxProfile);
		driver.get("https://www.facebook.com/");

	}
}