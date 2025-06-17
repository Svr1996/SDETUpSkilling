package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSSelector {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // CSS Selector By "id"
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Sandeep");;

        // CSS Selector By "Attribute value"
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("sandy@123456");;


        // locator By Classname
        driver.findElement(By.className("signInBtn")).click();

        // CSS Selector By Classname.
        String text = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(text);

        // By LinkText locator
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);
        // By Xpath locator
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sandeep");

        //By Index
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();

        //By Index in CSS selector
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Sandeep");
        //By CSS Selector using tag and attribute
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("sandy@abc.com");

        //By tags using parent to child
        driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("1253303");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sandeep");
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();












    }

}
