package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class IframesDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jqueryui.com/droppable/");

        //switching iframe using index
        //driver.switchTo().frame(0);

        //switching iframe using name or id
        //driver.switchTo().frame("Name/ID");

        //Number of iframes on the webpage
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //switching iframe using WebElement
        WebElement iframe1 =driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(iframe1);

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(src,dest).build().perform();

        //This will switch back to default content
//       driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.cssSelector(".entry-title")).getText());




    }
}
