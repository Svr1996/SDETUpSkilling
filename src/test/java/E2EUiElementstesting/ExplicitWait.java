package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExplicitWait {

    public static void main(String[] args) throws InterruptedException {

        String[] items = {"Brocolli","Tomato","Beans"};

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        WebElement dropdowm = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select select = new Select(dropdowm);
        select.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));

        for(int i=0;i<products.size();i++){
            String productName = products.get(i).getText();
            System.out.println(productName);
            driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

        }






    }



}
