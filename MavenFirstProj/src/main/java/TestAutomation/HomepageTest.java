package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Locators.HomePageLocators;

public class HomepageTest {
	
	WebDriver driver;
	WebElement element;
	String url = "http://localhost:8088/rexaproduct/";
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestLogin() throws Exception
	{
		 HomePageLocators.emailAddress().sendKeys("rexa.admin@renovite.com");
		 HomePageLocators.password().sendKeys("rexa.admin@renovite.com");
		 HomePageLocators.login().click();
	}
	
	
	 @AfterMethod
	 public void afterMethod()
	 {
		 driver.quit();
	 }

}
