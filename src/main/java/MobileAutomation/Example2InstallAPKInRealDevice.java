package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class Example2InstallAPKInRealDevice {
    public static void main(String[] args) throws MalformedURLException {
        // MobileCapabilityType is deprecated from 8.0 version in appium java client
        AndroidDriver driver = DriverClass.getAndroidDriverForRealDevice();
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