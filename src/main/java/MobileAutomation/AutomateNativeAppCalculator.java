package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomateNativeAppCalculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//        appPackage Name : com.vivo.calculator
//        appActivity Name : com.vivo.calculator.Calulator
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setDeviceName("13978139200009S");
        uiAutomator2Options.setPlatformVersion("14");
        uiAutomator2Options.setAppActivity("com.vivo.calculator.Calculator");
        uiAutomator2Options.setAppPackage("com.vivo.calculator");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
        WebElement four = androidDriver.findElement(By.id("com.vivo.calculator:id/digit_4"));
        System.out.println(four.getText());
        WebElement six = androidDriver.findElement(By.id("com.vivo.calculator:id/digit_6"));
        System.out.println(six.getText());
        WebElement plus = androidDriver.findElement(By.id("com.vivo.calculator:id/op_add"));
        WebElement equalTo = androidDriver.findElement(By.id("com.vivo.calculator:id/eq"));
        four.click();
        Thread.sleep(2000);
        plus.click();
        Thread.sleep(2000);
        six.click();
        Thread.sleep(2000);
        equalTo.click();
        Thread.sleep(2000);
        String result = androidDriver.findElement(By.id("com.vivo.calculator:id/formula")).getText();
        System.out.println(result);

        if(result.equals("10")){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }
        androidDriver.quit();
    }
}
