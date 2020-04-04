import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Helper.MyHelper;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://testing.salestantra.com/login");
		
		
		WebElement username = MyHelper.findElement(driver, "name", "email" );
		username.sendKeys("consultant@edgecrm.app");
		
		
		
		WebElement password = MyHelper.findElement(driver, "name","password" );
		password.sendKeys("Confidential@TG");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
