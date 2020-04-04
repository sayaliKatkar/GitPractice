package main.java.testPackage;

import org.openqa.selenium.WebDriver;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = Initializer.getBrowser(Constants.browser_name);

        driver.get(Constants.WEBSITE_TO_VISIT);


        System.out.println("Title of page =" + driver.getTitle());


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
