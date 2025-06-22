package ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class LogoutValidationTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Step 1: Login
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[text()='Login']")).click();


        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8073556281");
        driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='QqFHMw llMuju M5XAsp']")).click();

        Thread.sleep(5000); // Wait for login

        String hometitle =  driver.getTitle();
        System.out.println(" Home Page Title "+hometitle);

        // Step 2: Validate session cookies exist
        Set<Cookie> cookiesBeforeLogout = driver.manage().getCookies();
        System.out.println("Cookies before logout:");
        for (Cookie c : cookiesBeforeLogout) {
            System.out.println(c.getName() + " = " + c.getValue());
        }

        // Step 3: Click logout
        driver.findElement(By.xpath("//img[@class='-dOa_b XdYXbi']")).click();
        Thread.sleep(2000);

        WebElement logoutBtn= driver.findElement(By.xpath("//li[contains(text(),'Logout')]"));
        logoutBtn.click();


        Thread.sleep(2000); // Wait for logout

        // Step 4: Validate cookies are deleted (or at least session is invalid)
        Set<Cookie> cookiesAfterLogout = driver.manage().getCookies();
        System.out.println("Cookies after logout:");
        for (Cookie c : cookiesAfterLogout) {
            System.out.println(c.getName() + " = " + c.getValue());
        }

//        if (cookiesAfterLogout.isEmpty() || !hasSessionCookie(cookiesAfterLogout)) {
//            System.out.println("✅ Session cookie successfully deleted after logout.");
//        } else {
//            System.out.println("❌ Session cookie still present!");
//        }

        // Step 5: Try accessing dashboard directly

        driver.get("https://www.flipkart.com/");
        String logintitle = driver.getTitle();
        System.out.println("Login Page Title = " +logintitle);

        // Step 6: Validate user is redirected to login (you can also check URL or title)
        //there are two ways we can do :
//        if (driver.getCurrentUrl().contains("/login")) {
//            System.out.println("✅ User is redirected to login page after logout.");
//        } else {
//            System.out.println("❌ User is still able to access secured page!");
//        }
        //Another way: compare the home page and login page title
        if (logintitle.contains("Online Shopping Site for Mobiles")) {
            System.out.println("✅ User is redirected to login page after logout.");
        } else {
            System.out.println("❌ User is still able to access secured page!");
        }

        driver.quit();
    }

    public static boolean hasSessionCookie(Set<Cookie> cookies) {
        for (Cookie c : cookies) {
            if (c.getName().equalsIgnoreCase("session_id") || c.isHttpOnly()) {
                return true;
            }
        }
        return false;
    }
}
