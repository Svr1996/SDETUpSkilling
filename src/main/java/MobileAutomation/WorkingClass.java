package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;
import java.net.URL;

public class WorkingClass {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setDeviceName("13978139200009S");
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setPlatformVersion("14");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setApp("D:\\Mobile Automation\\Sample APKS For Testing Purpose\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.sendKeys("Text");
        alert.dismiss();
        alert.getText();



//        For iOS only, you can set capabilities to automatically accept or dismiss alerts:
//
//        options.setCapability("autoAcceptAlerts", true);
//        options.setCapability("autoDismissAlerts", false);
    }
}
