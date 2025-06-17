package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // By "id" locator
        WebElement username = driver.findElement(By.id("inputUsername"));
        username.sendKeys("Sandeep");

        // By "name" locator
        WebElement password = driver.findElement(By.name("inputPassword"));
        password.sendKeys("sandy@123456");

        // By Classname locator
        driver.findElement(By.className("signInBtn")).click();


    }

}
