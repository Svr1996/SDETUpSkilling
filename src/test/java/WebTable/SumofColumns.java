package WebTable;

import JavaScirptExecutor.JavaScriptUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SumofColumns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavaScriptUtil js = new JavaScriptUtil(driver);
        js.scrollToElement(driver.findElement(By.xpath("//*[text()='Web Table Fixed header']")));

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']/tbody/tr/td[4]"));
        int sum=0;
        for(int i=0;i< list.size();i++){

            int values = Integer.parseInt(list.get(i).getText());
            sum= sum+values;

        }

        System.out.println(sum);
        //fetch the total sum from UI and seperate the text : Total Amount Collected: 296
        String n = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
        Assert.assertEquals(sum,Integer.parseInt(n));

    }
}
