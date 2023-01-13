package AssertionInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAssertion {
	
	@Test
	public void verifyPageTitle() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.skyvill.in/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle= "Home - SkyVill";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}

}
