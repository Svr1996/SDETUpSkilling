package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomateDialANumberAndroidMobile {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //        appPackage Name : com.google.android.dialer
//        appActivity Name : com.google.android.play.core.common.PlayCoreDialogWrapperActivity
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setDeviceName("13978139200009S");
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setPlatformVersion("14");
        uiAutomator2Options.setAppPackage("com.google.android.dialer");
        uiAutomator2Options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
        Thread.sleep(2000);
        androidDriver.findElement(By.id("com.google.android.dialer:id/dialpad_fab")).click();
        //7795099861

        androidDriver.findElement(By.id("com.google.android.dialer:id/seven")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/seven")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/five")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/zero")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/eight")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/six")).click();
        androidDriver.findElement(By.id("com.google.android.dialer:id/one")).click();

        Thread.sleep(3000);
        androidDriver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button")).click(); //Click on dialer
        Thread.sleep(5000);

        androidDriver.quit();
        System.out.println("Test execution completed");
    }
}
