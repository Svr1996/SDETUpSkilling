package LoginUsingCookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getCookies {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

// Perform UI login
        driver.findElement(By.id("username")).sendKeys("yourUsername");
        driver.findElement(By.id("password")).sendKeys("yourPassword");
        driver.findElement(By.id("loginBtn")).click();

// Wait for login to complete
        Thread.sleep(3000);

// ✅ Get cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + "=" + cookie.getValue());
            // Save these cookies to file or DB
        }

        driver.quit();
    }
}
