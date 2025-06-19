package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = DriverClass.getAndroidDriverForRealDevice();
        // ✅ Corrected way to find elements using AppiumBy
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement target = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragAndDrop = new Sequence(finger, 1);

        int startX = source.getLocation().getX() + (source.getSize().getWidth() / 2);
        int startY = source.getLocation().getY() + (source.getSize().getHeight()/2);
        int endX = target.getLocation().getX() +(target.getSize().getWidth()/2);
        int endY = target.getLocation().getY() + (target.getSize().getHeight()/2);

        dragAndDrop.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),startX,startY));
        dragAndDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragAndDrop.addAction(finger.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), endX, endY));
        dragAndDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

//        driver.perform(Arrays.asList(dragAndDrop));
        driver.perform(List.of(dragAndDrop));
        System.out.println(driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText());

        driver.quit();
    }
}
