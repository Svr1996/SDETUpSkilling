package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");



        //Using above method
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());

        //Using below method
        WebElement email = driver.findElement(By.xpath("//label[text()='Email']"));
        Thread.sleep(2000);
        driver.findElement(with(By.tagName("input")).below(email)).sendKeys("test@123456");

        //Using leftOfMethod
        WebElement iceCream = driver.findElement(By.xpath("//label[text()=\"Check me out if you Love IceCreams!\"]"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();

        //Using RighOfMethod
        WebElement rdb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());





    }
}
