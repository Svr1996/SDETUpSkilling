package com.dat.qa.base;

import com.dat.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream("D:\\SDETUpskilling\\FreeCRMTest\\src\\main\\java\\com\\dat\\" +
                "qa\\configs\\config.properties");
        prop.load(ip);
    }

    public static void initialization(){

//        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();

        String browserName = prop.getProperty("Browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtils.IMPLICIT_TIMEOUT));
        driver.get(prop.getProperty("url"));

    }



}
