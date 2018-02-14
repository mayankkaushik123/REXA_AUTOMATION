package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLocators {
	static WebElement element;
	static WebDriver driver;
	
	public static WebElement emailAddress() throws Exception
	{
		try
		{
		 element = driver.findElement(By.id("cred_userid_inputtext"));
		}
		catch(ElementNotVisibleException ex)
		{
			throw ex;
		}
		return element;
	}
	
	public static WebElement password() throws Exception
	{
		try
		{
		 element = driver.findElement(By.id("cred_password_inputtext"));
		}
	    catch(ElementNotVisibleException ex)
	    {
		    throw ex;
	    }
		return element;
	}
	
	
	public static WebElement login() throws Exception
	{
		try
		{
		 element = driver.findElement(By.id("submit"));
		}
	    catch(ElementNotVisibleException ex)
	    {
		    throw ex;
	    }
		return element;
	}

}
