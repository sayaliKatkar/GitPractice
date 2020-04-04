package main.java.testPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class itemSearch {
	@Test
	public static void womenClothes(WebDriver driver) {
		driver.findElement(By.linkText("Women")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		// to click on image

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='right-block']//a[@title='Faded Short Sleeve T-shirts']")));
		element.click();

	}

}
