package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //The below is used to scroll the page using pixels
        js.executeScript("window.scrollBy(0,900);");
        Thread.sleep(5000);

        //The below is used to scroll the page using a webelement
        WebElement element = driver.findElement(By.xpath("//*[text()='iFrame Example']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);

        //Scroll back to webtable
        WebElement element2 = driver.findElement(By.xpath("//*[text()='Web Table Fixed header']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(5000);
        //Scroll in WebTable
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        //Scroll till last
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");



    }
}
