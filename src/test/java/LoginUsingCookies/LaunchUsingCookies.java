package LoginUsingCookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUsingCookies {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Required to set domain

        driver.manage().addCookie(new Cookie("session_id", "xyz123456"));
        driver.manage().addCookie(new Cookie("auth_token", "yourTokenHere"));

// Now simulate that you're logged in
        driver.navigate().refresh();

// Validate login
        System.out.println(driver.getTitle());
    }
}
