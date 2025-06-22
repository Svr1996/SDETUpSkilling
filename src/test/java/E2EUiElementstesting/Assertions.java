package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Assertions {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//
//
//        WebElement element = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]"));
//        Assert.assertFalse(element.isSelected());
//
//        element.click();
//        Assert.assertTrue(element.isSelected());
//
//        //compare two values and returns true if matching else false
//        Assert.assertEquals(driver.getTitle(),"QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(count);
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());
        checkbox.click();
        Assert.assertFalse(checkbox.isSelected());








    }
}
