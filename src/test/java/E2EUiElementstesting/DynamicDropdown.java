package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("span.red-arrow-btn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement departure = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dropdownGroup1']/div/ul/li/a[@value='BLR']")));
        departure.click();

        WebElement arrival = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/table/tbody/tr/td[@class='mapbg']/div[@class='search_options_menucontent']/div/div/ul/li/a[@value='MAA']")));
        arrival.click();



    }

}
