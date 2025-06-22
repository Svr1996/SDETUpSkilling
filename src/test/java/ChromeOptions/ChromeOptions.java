package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptions {
    public static void main(String[] args) {


        ChromeOptionsManager chromeOptionsManager = new ChromeOptionsManager();
        WebDriver driver = new ChromeDriver(chromeOptionsManager.getChromeOptions());

        driver.get("https://example.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();



    }
}
