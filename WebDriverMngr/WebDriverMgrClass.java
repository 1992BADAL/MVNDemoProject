package WebDriverMngr.WebDriverMngr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgrClass {

	public static void main(String[] args) {
		// Launch chrome browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
	}

}
