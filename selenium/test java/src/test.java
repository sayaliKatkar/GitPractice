import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;




public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/international-holidays");
		
		
		// click on register
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Customer Login"))).build().perform();
		driver.findElement(By.linkText("Register")).click();
		System.out.println("registration page");
		
		//Thread.sleep(1000);
		
		//Registration
		
		try {
		driver.findElement(By.id("acc_first_name")).sendKeys("Sayali");
		driver.findElement(By.id("acc_last_name")).sendKeys("Katkar");
		driver.findElement(By.id("acc_user_email")).sendKeys("sayali.katkar@gmail.com");
		driver.findElement(By.id("acc_user_password")).sendKeys("Pass@123");
		driver.findElement(By.id("acc_user_passconf")).sendKeys("Pass@123");
		driver.findElement(By.id("acc_mobile_no")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class = 'btn btn-lg btn-primary modal-btn ajax-submit'][text()='Register']")).click();
		
		}
		catch(Exception e)
		{
			System.out.println("error in registration "+e);
		}*/
		

		//foreign exchange
		
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='font14'][text()='Foreign Exchange']"));
		System.out.println(li);
		li.get(0).click();
		
		
		
	}
}
		

	


