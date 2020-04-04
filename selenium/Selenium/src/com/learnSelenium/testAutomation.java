package com.learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://phptravels.com/");
		
		
		
	}

}
