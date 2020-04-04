package com.learnSelenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Exit;

public class testSelenium {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);

		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays/india-tour-packages");
		driver.findElement(By.id("holiday_category_d")).clear();
		driver.findElement(By.id("holiday_category_d")).sendKeys("India");

		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("India(India)")));
		driver.findElement(By.linkText("India(India)")).click();
		
		Select select = new Select(driver.findElement(By.id("duration_d")));
		select.selectByValue("6Nights / 7Days");
		
		//select date
		driver.findElement(By.id("dphh1")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class = 'switch']")).click();
		
		String year = null;
		while(year != "2022") 
		{
		year = driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class = 'switch']")).getText();
			if (year.equals("2022"))
			{
			System.out.println("year is 2022");
			driver.findElement(By.xpath("//span[@class='month'][text()='Jul']")).click(); 
			break;
			}
			else
			{
			driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class = 'next']")).click();
			}
		
		}
		
		
		
	}	
		
}


