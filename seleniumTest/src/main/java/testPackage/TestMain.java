package testPackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {

		
		
		  WebDriver driver = Initializer.getBrowser(Constants.browser_name);
		  
		  driver.get(Constants.WEBSITE_TO_VISIT);
		  
		  
		  System.out.println("Title of page ="+driver.getTitle());
		  
		  
		  //to search item
		  itemSearch.womenClothes(driver);
		  
		  //to view product info
		  productInfo.viewDetails(driver);
		  
		  //to view cart summary
		  
		  productInfo.cartSummary(driver);
		 
		  //to fill user registration form
		  Registration.registerForm(driver);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
