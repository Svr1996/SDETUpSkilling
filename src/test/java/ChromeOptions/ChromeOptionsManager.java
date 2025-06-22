package ChromeOptions;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ChromeOptionsManager {

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // ✅ Headless mode (if needed)
        // options.addArguments("--headless");

        // ✅ Disable browser notifications
        options.addArguments("--disable-notifications");

        // ✅ Allow insecure certificates (for self-signed SSL)
        options.setAcceptInsecureCerts(true);

        // ✅ Start browser maximized
        options.addArguments("--start-maximized");

        // ✅ Disable infobars
        options.addArguments("disable-infobars");

        // ✅ Disable popup blocking
        options.addArguments("--disable-popup-blocking");

        // ✅ Run in incognito mode
        options.addArguments("--incognito");

        // ✅ Add custom user-agent (optional)
        // options.addArguments("user-agent=custom-agent");

        // ✅ Set custom proxy if needed
        // Uncomment to use proxy
        /*
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:8080");  // Replace with your proxy host and port
        options.setCapability(CapabilityType.PROXY, proxy);
        */

        Map<String, Object> prefs = new HashMap<>();

        // Set the default download directory
        Object downloadDirPath = null;
        prefs.put("download.default_directory", downloadDirPath);

        // Disable download prompt
        prefs.put("download.prompt_for_download", false);

        // Allow multiple automatic downloads
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);

        // Enable safe browsing (optional)
        prefs.put("safebrowsing.enabled", true);

        // ✅ Apply preferences to Chrome
        options.setExperimentalOption("prefs", prefs);

        // Optional browser options
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);


        //Ways to Add Chrome Extensions
        options.addExtensions(new File("path/to/extension.crx"));
        //This is useful if you have the extension’s source folder (unzipped).
        options.addArguments("load-extension=" + "path/to/unpacked/extensionFolder");

        return options;
    }
}
