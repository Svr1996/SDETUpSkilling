package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProgram {

    public static void main(String[] args) {

        //Invoke browser
        //Chrome--> ChromeDriver-->Methods --> close
        //Edge--> EdgeDriver-->Methods  --close
        //Safari--> SafariDriver-->Methods-->get
        //WebDriver Methods+Class Methods

        //Chromedriver.exe
        //SeleniumManager

        // to invoke the Safari browser
        //System.setProperty("webdriver.gecko.driver", "D:\\Sandeep_Learning materials\\Selenium\\Installers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();

        // to invoke the chrome browser
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(" Title is " +driver.getTitle());
        System.out.println("My URL is : " +driver.getCurrentUrl());
        driver.close();


    }



}
