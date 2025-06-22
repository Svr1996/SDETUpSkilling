package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class AmazonDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
        WebElement menu =  driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav-link-accountList\"]"));

        Actions action = new Actions(driver);
        //This will be menu hover on menu
        action.moveToElement(menu).build().perform();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        //first hover on searchbox, click to type mobiles in Caps and doubleclick on text and hit enter
        action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("mobiles").doubleClick().keyDown(Keys.ENTER)
                .build().perform();

        action.moveToElement(menu).contextClick().build().perform();




    }

}
