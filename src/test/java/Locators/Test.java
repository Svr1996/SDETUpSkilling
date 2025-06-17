package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // CSS Selector By "id"
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Sandeep");;

        // CSS Selector By "Attribute value"
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();

        Thread.sleep( 2000);
        String text = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(text,"You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();







    }
}
