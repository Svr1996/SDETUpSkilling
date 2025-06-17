package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchWithEdgeBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "D:\\Sandeep_Learning materials\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(" Title is " +driver.getTitle());
        System.out.println("My URL is : " +driver.getCurrentUrl());
        driver.close();

    }


}
