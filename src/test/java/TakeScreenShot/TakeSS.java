package TakeScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeSS {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Step 1: Login
        driver.get("https://www.flipkart.com/");

       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       FileHandler.copy(src,new File("D:\\screenshot.png"));







    }
}
