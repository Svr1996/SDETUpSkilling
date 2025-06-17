package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewDropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement dropdown =  driver.findElement(By.id("divpaxinfo"));
        System.out.println(dropdown.getText());
        dropdown.click();
        Thread.sleep(2000);
        WebElement addBtn = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
         for(int i=1;i<5;i++){
           addBtn.click();
         }
         driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(dropdown.getText());





    }
}
