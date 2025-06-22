package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();


        //this shouldn't have returned true and IsEnabled method doesn't work sometimes

        // System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        //If Isenabled method didn't work, then try below way
        String text = driver.findElement(By.id("Div1")).getDomAttribute("style");
        if(text.contains("1")){
            System.out.println("Calender is enabled");

        }else {
            System.out.println("Calender is disabled");
        }





    }
}
