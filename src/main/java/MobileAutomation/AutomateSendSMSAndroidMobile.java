package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AutomateSendSMSAndroidMobile {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // appActivity :com.google.android.apps.messaging.ui.ConversationListActivity
        // appPackage : com.google.android.apps.messaging
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setDeviceName("13978139200009S");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setPlatformVersion("14");
        uiAutomator2Options.setAppActivity("com.google.android.apps.messaging.ui.ConversationListActivity");
        uiAutomator2Options.setAppPackage("com.google.android.apps.messaging");
        uiAutomator2Options.setNewCommandTimeout(Duration.ofSeconds(300));

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.messaging:id/continue_as_button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.messaging:id/conversation_list_spam_popup_positive_button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.messaging:id/start_chat_fab"))).click();

        wait.until(ExpectedConditions.visibilityOf(androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"ContactSearchField\"]")))).sendKeys("7795099861");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"+917795099861\"]"))).click();
        System.out.println("clicked on phone number");
        By messageBoxLocator = By.id("com.google.android.apps.messaging:id/compose_message_text");

// Wait for the element to be clickable using the locator
        WebElement messageBox = wait.until(ExpectedConditions.elementToBeClickable(messageBoxLocator));
        messageBox.click();
        Thread.sleep(2000);
        messageBox.sendKeys("Hi..This is Rupesh");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Send SMS\"]"))).click();
        Thread.sleep(5000);
        androidDriver.quit();
    }
}
