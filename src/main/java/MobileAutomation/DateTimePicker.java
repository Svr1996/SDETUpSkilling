package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

public class DateTimePicker {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = DriverClass.getAndroidDriverForEmulator();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate: Views ➝ Date Widgets ➝ 1. Dialog
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Dialog")).click();

        // Tap "change the time (Spinner)"
        driver.findElement(By.id("io.appium.android.apis:id/pickTimeSpinner")).click();
        Thread.sleep(10000);

        List<WebElement> list = driver.findElements(By.xpath("//android.widget.EditText"));

        for (WebElement ele : list) {
            System.out.println(ele.getText());
        }

        list.get(0).clear();
        list.get(0).sendKeys("9");

        list.get(1).clear();
        list.get(1).sendKeys("45");

        list.get(2).clear();
        list.get(2).sendKeys("PM");

//
//        // Select hour
//        driver.findElement(By.xpath("//android.widget.NumberPicker[1]//android.widget.EditText")).clear();
//        driver.findElement(By.xpath("//android.widget.NumberPicker[1]//android.widget.EditText")).sendKeys("9");

//        // Select minute
//        driver.findElement(By.xpath("//android.widget.NumberPicker[2]//android.widget.EditText")).clear();
//        driver.findElement(By.xpath("//android.widget.NumberPicker[2]//android.widget.EditText")).sendKeys("45");

        // If AM/PM picker exists (for 12-hour format)
//        try {
//            driver.findElement(By.xpath("//android.widget.NumberPicker[3]//android.widget.EditText")).sendKeys("PM");
//        } catch (Exception e) {
//            // 24-hour format, ignore
//        }

        // Click OK
        driver.findElement(By.id("android:id/button1")).click();

        driver.quit();
    }
}
