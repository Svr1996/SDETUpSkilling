package TakeScreenShot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotWithTimestamp {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        // Create timestamp
        //WHy MM and HH are in upper. because
        //✅ **MM** = Month (e.g., June = 06)
        //
        //✅ **mm** = Minutes (e.g., 45 minutes)
        //
        //✅ **HH** = Hour in 24-hour format (e.g., 18 for 6PM)
        //
        //✅ **hh** = Hour in 12-hour format (e.g., 06 for 6PM
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Take screenshot and store it as a file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Set destination path with timestamp
        File dest = new File("D:\\Selenium\\screenshots_" + timestamp + ".png");

//        // Create directory if it doesn't exist
//        dest.getParentFile().mkdirs();

        // Copy file
        FileHandler.copy(src, dest);

        System.out.println("Screenshot saved at: " + dest.getAbsolutePath());

        driver.quit();
    }
}
