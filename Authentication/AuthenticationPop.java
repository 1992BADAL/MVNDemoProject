package Authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPop {

	public static void main(String[] args) {
		// Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
