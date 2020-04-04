package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyHelper {

	
	public static WebElement findElement(WebDriver driver, String locator, String locValue)
	{
		
		switch(locator)
		{
		case "id":
			WebElement id = driver.findElement(By.id(locValue));
			return id;
			
		case "name":
			WebElement name = driver.findElement(By.name(locValue));
			return name;

		case "xpath":
			WebElement xpath = driver.findElement(By.id(locValue));
			return xpath ;

	
		}
		return null;
		
		
	}
	
}
