package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	
		
public class productInfo {
	
	static JavascriptExecutor js ;
	
	@Test
	public static void viewDetails(WebDriver driver) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Actions action = new Actions(driver);

		//hover on images
		action.moveToElement(driver.findElement(By.id("thumb_1"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("thumb_2"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("thumb_3"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("thumb_4"))).build().perform();
		
		//add details
		driver.findElement(By.id("group_1")).sendKeys(Constants.item_qty);
		
		Select select = new Select(driver.findElement(By.id("group_1")));
		select.selectByValue("2");
		
		
		driver.findElement(By.xpath("//p[@id='add_to_cart']//button[@type='submit']")).submit();

	}
	
	public static void cartSummary(WebDriver driver) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='step_current  first']")));
		
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		try
		{
			String price = driver.findElement(By.id("total_price")).getText();
			
			System.out.println("Total price of item ="+price);
			
			driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-account_form")));
			
			js.executeScript("window.scrollBy(0,500)");
			
			driver.findElement(By.id("email_create")).sendKeys(Constants.email_id);
			
			driver.findElement(By.id("SubmitCreate")).click();
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	
	

}
