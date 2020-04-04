package com.learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class facebookLogin {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.findElement(By.name("firstname")).sendKeys("Sayali");
		driver.findElement(By.name("lastname")).sendKeys("Katkar");
		driver.findElement(By.name("reg_email__")).sendKeys("sayali.katkar@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sayali.katkar@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test");
		
		Select birth_day = new Select(driver.findElement(By.name("birthday_day")));
		birth_day.selectByValue("15");
		Select birth_month = new Select(driver.findElement(By.id("month")));
		birth_month.selectByValue("7");
		
		
		
		
		
		
		
		
		
		

	}

}
