package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Example2InstallAPKInEmulator {
    public static void main(String[] args) throws MalformedURLException {
        // MobileCapabilityType is deprecated from 8.0 version in appium java client
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
//        options.setDeviceName("13978139200009S");
        options.setApp("D:\\Mobile Automation\\Sample APKS For Testing Purpose\\TheApp.apk");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("16");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.quit();

    }
}


//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//
//// ✅ Fix: Use "UiAutomator2"
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11"); // replace with actual version
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        capabilities.setCapability(MobileCapabilityType.APP, "D:\\Mobile Automation\\Sample APKS For Testing Purpose\\TheApp.apk");