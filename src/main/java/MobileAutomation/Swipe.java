package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Swipe {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
     AndroidDriver driver = DriverClass.getAndroidDriverForEmulator();
        // Navigate to Views -> Gallery -> 1. Photos
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();


        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 859,363));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), 221,363));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(swipe));

        Thread.sleep(2000);
        driver.quit();
    }

//    static Map<String, Integer> xyvalues(AndroidDriver driver) {
//        Dimension size = driver.manage().window().getSize();
//        int screenWidth = size.getWidth();    // e.g., 1080
//        int screenHeight = size.getHeight();  // e.g., 1920
//
//// Swipe from right to left horizontally in the middle of the screen
//        int startX = (int) (screenWidth * 0.9);   // near right edge
//        int endX = (int) (screenWidth * 0.1);     // near left edge
//        int startY = screenHeight / 2;            // middle Y
//
//        int endY = startY; // same Y for horizontal swipe
//
//        Map<String, Integer> xyCoordinates = new HashMap<>();
//        xyCoordinates.put("startX", startX);
//        xyCoordinates.put("endX", endX);
//        xyCoordinates.put("startY", startY);
//        xyCoordinates.put("endY", endY);
//        return xyCoordinates;
//    }
}
