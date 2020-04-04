package main.java.testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class Registration {
  

	static JavascriptExecutor js ;
	
	
  public static void registerForm(WebDriver driver) throws InterruptedException 
  {
	  js = (JavascriptExecutor) driver;
	  
	  System.out.println("in registration");
	  
	  Thread.sleep(5000);
		
	  
	  if((main.java.testPackage.Constants.Gender).equalsIgnoreCase("female"))
	  {
		  driver.findElement(By.id("id_gender2")).click();
		  
	  }
	  
	  else if ((main.java.testPackage.Constants.Gender).equalsIgnoreCase("male"))
	  {
		  driver.findElement(By.id("id_gender1")).click();
		  
	  }
	  
	  //To fill all form elements
	  driver.findElement(By.id("customer_firstname")).sendKeys(main.java.testPackage.Constants.firstName);
	  driver.findElement(By.id("customer_lastname")).sendKeys(main.java.testPackage.Constants.lastName);
	  driver.findElement(By.id("passwd")).sendKeys("pass123");
	  driver.findElement(By.id("firstname")).sendKeys("address1");
	  driver.findElement(By.id("lastname")).sendKeys("address2");
	  driver.findElement(By.id("address1")).sendKeys("test123");
	  driver.findElement(By.id("city")).sendKeys("Mumbai");
	  
	  Select select = new Select(driver.findElement(By.id("id_state")));
	  select.selectByVisibleText("California");
	  
	  driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
	  driver.findElement(By.id("alias")).clear();
	  driver.findElement(By.id("alias")).sendKeys("alias");
	  driver.findElement(By.id("submitAccount")).submit();
	  System.out.println("Registraion form filled");
	  
	  
  }
}
