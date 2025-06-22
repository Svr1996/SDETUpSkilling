package SeleniumExercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //click the checkbox2 and get the text of the particular textbox and select the same text from Select dropdown
        //Pass the same text on input box and click on alert and alert will contain whatever the text has inputted
        //verify if alert window contains same inputtext
        WebElement checkBox = driver.findElement(By.id("checkBoxOption2"));
        checkBox.click();
        String checkBoxvalue = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
        System.out.println(checkBoxvalue);
        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(checkBoxvalue);
        driver.findElement(By.name("enter-name")).sendKeys(checkBoxvalue);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(5000);
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if(alertText.contains(checkBoxvalue)){
            System.out.println("test case is passed");
        }else{
            System.out.println("test case is failed");
        }




    }
}
