package com.automation.tests.warmup;

import com.automation.tests.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class March4 {
    static WebDriver driver;


    public static void main(String[] args) {

        //        ebayTest();
        //        amazonTest();
      //   wikiTest();

        /**
         * Go to ebay --->          driver.get("http://ebay.com");
         * enter search term        input.sendKeys("java book");
         * click on search button   searchButton.click();
         * print number of results
         */


        WebDriverManager.chromedriver().setup();

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResults = driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split(" ")[0]);
        driver.quit();










    }
}
