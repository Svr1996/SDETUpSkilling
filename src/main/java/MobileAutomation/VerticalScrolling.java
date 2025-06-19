package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import javax.swing.*;
import java.net.MalformedURLException;
import java.util.List;


public class VerticalScrolling {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = DriverClass.getAndroidDriverForEmulator();

        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        System.out.println("Clicked on Views");
        // Scroll till "Switches" is visible

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Switches\"))"));
        WebElement switchEle = driver.findElement(By.xpath("//android.widget.TextView[@text='Switches']"));
        System.out.println(switchEle.getLocation());
        switchEle.click();
        driver.quit();


    }
}
