package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement element = driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]"));
        element.click();
        // this
        if(element.isSelected()){
            System.out.println("checkbox is selected");
        }

        //count the number of checkboxes
        int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println("Number of checkboxes on UI " +count);




    }
}
