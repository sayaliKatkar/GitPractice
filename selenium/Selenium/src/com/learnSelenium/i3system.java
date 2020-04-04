package com.learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i3system {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://132.145.162.169/");
		
		driver.findElement(By.id("usernmae")).sendKeys("Admin_QA");
		driver.findElement(By.id("password")).sendKeys("i3systems");
		
		WebElement uploadDoc = driver.findElement(By.id("upload_id"));
		
		uploadDoc.sendKeys("c:\\myFile.pdf");
		
		driver.findElement(By.id("upload_button")).click();
		
		driver.close();
	}

}
