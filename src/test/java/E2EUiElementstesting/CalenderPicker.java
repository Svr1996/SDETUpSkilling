package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CalenderPicker {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']/following-sibling::button[@class='ui-datepicker-trigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();

    }
}
