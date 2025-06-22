package LuanchUsingCookieswithJson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SkipUiLoginUsingCookies {


    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Required before adding cookies

        CookieUtils.loadCookiesFromFile(driver);
        driver.navigate().refresh();  // Apply cookies

// Now you're logged in!
        driver.get("https://example.com/dashboard");
        System.out.println(driver.getTitle());
    }
}
