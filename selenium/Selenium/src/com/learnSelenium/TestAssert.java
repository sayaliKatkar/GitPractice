package com.learnSelenium;
import org.testng.Assert;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestAssert {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);

		WebDriver driver = new FirefoxDriver();
		
		
		
	}

}
