package com.automation.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {
    /**
     * You homework will be to improve this method!
     * This method return webdriver object based on browser type
     * If you want to use chrome browser, just provide chrome as a parameter
     * @param browserName
     * @return webdriver object
     */
    public static WebDriver createADriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")) {
            //to fix [1583364253.062][SEVERE]: Timed out receiving message from renderer: 0.100
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();

        }else if (browserName.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }else if (browserName.equalsIgnoreCase("edge")){
           WebDriverManager.edgedriver().setup();
           return new EdgeDriver();
        } else{
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }
    }
}
