package com.automation.tests.day5;

import com.automation.tests.utilities.BrowserUtils;
import com.automation.tests.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        BrowserUtils.wait(4);


        // #TASK
        // verify that 1st checkbox is not selected and 2nd is selected

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        if ( !checkBoxes.get(0).isSelected() && checkBoxes.get(1).isSelected() ){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
        BrowserUtils.wait(2);

        // let's click on the first checkbox and verify it's clicked
        // checkBoxes.get(0).click(); // asagidaki 2 line ile ayni isi yapiyor
        WebElement checkbox1 = checkBoxes.get(0); //to get 1st checkbox
        checkbox1.click();//click on it


        BrowserUtils.wait(2);
        if(checkbox1.isSelected()){
            System.out.println("TEST PASSED");
            System.out.println("checkbox #1 is selected");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("checkbox #1 is not selected!");
        }







driver.quit();
    }
}
