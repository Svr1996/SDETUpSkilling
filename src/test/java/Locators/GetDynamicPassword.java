package Locators;


import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetDynamicPassword {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        Thread.sleep(1000);

        // this will split the password into two strings and stored in an array
        // "Please use temporary password 'rahulshettyacademy' to Login."
        String[] passtext = text.split("'");
        String password = passtext[1].split("'")[0];

        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Sandeep");;
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();




    }



}
