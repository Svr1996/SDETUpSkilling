package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class ControlsDarkThemeDemo {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = DriverClass.getAndroidDriverForEmulator();

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Views\"))")).click();

        // Scroll to "Controls"
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Controls\"))")).click();

        // Click on "2. Dark Theme"
        driver.findElement(AppiumBy.accessibilityId("2. Dark Theme")).click();

        // Send text to the input field
        WebElement textField = driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
        textField.sendKeys("Hello Appium");

        // Click on the first Radio Button
        WebElement radioBtn = driver.findElement(AppiumBy.id("io.appium.android.apis:id/radio1"));
        radioBtn.click();

        // Click on the first Checkbox
        WebElement checkbox = driver.findElement(AppiumBy.id("io.appium.android.apis:id/check1"));
        checkbox.click();

        System.out.println("Actions completed successfully!");

        // Optional: Close app
        driver.quit();


    }
}
