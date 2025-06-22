package JavaScirptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement el = driver.findElement(By.name("enter-name"));
        el.sendKeys("Sandeep");
        Thread.sleep(2000);


        JavaScriptUtil js = new JavaScriptUtil(driver);
        System.out.println(js.getValueByJS(el));

        js.clickElement(driver.findElement(By.id("checkBoxOption1")));
        Thread.sleep(5000);
        js.scrollToElement(driver.findElement(By.xpath("//*[text()='iFrame Example']")));
        Thread.sleep(5000);
        js.scrollToBottom();
        Thread.sleep(5000);
        System.out.println(js.getPageTitleByJS());
        Thread.sleep(5000);
        js.refreshBrowserByJS();
        Thread.sleep(5000);

        js.scrollToTop();
        Thread.sleep(5000);
        js.highlightElement(driver.findElement(By.id("dropdown-class-example")));
        Thread.sleep(5000);
        js.setInputValue(driver.findElement(By.name("enter-name")),"Sandeep");
        Thread.sleep(5000);
        js.generateAlert("Hi How are you!");
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        js.openURLInNewTab("https:amazon.com/");





    }
}
