package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	
	static WebElement element;
	static WebDriver driver;
	
	public  static WebElement emailAddress() throws Exception 
	{
		try
		{
			element = driver.findElement(By.id("cred_userid_inputtext"));
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return element;
	}
	
	public  static WebElement password() throws Exception 
	{
		try
		{
			element = driver.findElement(By.id("cred_password_inputtext"));
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return element;
	}
	
	public  static WebElement login() throws Exception 
	{
		try
		{
			element = driver.findElement(By.id("submit"));
		}
		catch(Exception ex)
		{
			throw ex;
		}
		return element;
	}
	
	

}
