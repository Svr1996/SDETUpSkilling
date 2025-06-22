package LuanchUsingCookieswithJson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginAndSaveCookies {


    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

// Login steps
        driver.findElement(By.id("username")).sendKeys("yourUser");
        driver.findElement(By.id("password")).sendKeys("yourPass");
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(3000); // wait for login

// Save cookies to file
        CookieUtils.saveCookiesToFile(driver);

        driver.quit();
    }
}
