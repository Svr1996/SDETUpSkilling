package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverClass {

    public static AndroidDriver getAndroidDriverForRealDevice() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("13978139200009S");
        options.setApp("D:\\Mobile Automation\\Sample APKS For Testing Purpose\\ApiDemos-debug.apk");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("14");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        return driver;
    }

    public static AndroidDriver getAndroidDriverForEmulator() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setApp("D:\\Mobile Automation\\Sample APKS For Testing Purpose\\ApiDemos-debug.apk");
        options.setAutomationName("UiAutomator2");
        options.setPlatformVersion("16");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        return driver;
    }


}
