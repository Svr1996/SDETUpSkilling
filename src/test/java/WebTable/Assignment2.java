package WebTable;

import JavaScirptExecutor.JavaScriptUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment2 {

    //Problem: find the number of rows and cols available in the WebTable and print the data which is present in 2nd row

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavaScriptUtil js = new JavaScriptUtil(driver);
        js.scrollToElement(driver.findElement(By.xpath("//*[text()='Web Table Example']")));
        int rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td")).size();
        System.out.println("Number of rows in a table: " +rows+ " Number of columns in a table " +cols);


        List<WebElement> secondrow = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
        for(int i=0;i<secondrow.size();i++){
            System.out.println(secondrow.get(i).getText());
        }
    }
}
