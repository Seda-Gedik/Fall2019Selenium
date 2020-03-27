package officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class VyTrackOH {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        Thread.sleep(2);

        WebElement contacts_link = driver.findElement(By.xpath("//span[.='Contacts']/following-sibling::a"));
        Thread.sleep(5000);
        contacts_link.click();
        Thread.sleep(4000);

        WebElement createContact = driver.findElement(By.linkText("Create Contact"));
        createContact.click();

        Thread.sleep(3000);
        String currentTitle = driver.getTitle();
        if (currentTitle.equalsIgnoreCase("Create Contact - Contacts - Customers")){
            System.out.println("Title is expected");

        }else{
            System.out.println("Title is Not expexted");
        }


        HashMap <String, String> contact1 = new HashMap<>();
        contact1.put("First Name", "Jhon");
        contact1.put("Last Name" , "Smith");
        contact1.put("Phone","571-236-44545");
        contact1.put("Street" , "400 Main Street");
        contact1.put("City", "Tysons");
        contact1.put("State","VA");
        contact1.put("Zip Code", "22102");
        contact1.put("Group" , "true");
        contact1.put("Country", "United States");

        System.out.println("contact1 : " + contact1 );




    }
}
