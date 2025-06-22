package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class ByPassSSLCertificate {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");

        //Using ChromeOptions we can bypass SSL certificate
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        //For EdgeBrowser
        EdgeOptions option1 = new EdgeOptions();
        option1.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());




    }
}
