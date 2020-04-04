package main.java.testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    public static void testCases(){

        WebDriver driver = Initializer.getBrowser(Constants.browser_name);

        driver.get(Constants.WEBSITE_TO_VISIT);

        System.out.println("Title of page ="+driver.getTitle());


    }


}
