package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Calendertest {


    public static void main(String[] args) {

        String month = "7";
        String date = "26";
        String year = "2027";
        String[] expectedList = {month,date,year};

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //The below logic works when we have an input box on the calender to pass the final date
//        StringBuilder finalDate = new StringBuilder();
//        finalDate = finalDate.append(month).append(date).append(year);
//        System.out.println(finalDate);


        driver.findElement(By.cssSelector("button.react-date-picker__calendar-button")).click();
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

        //Integer.parseInt will convert string into an integer
        driver.findElements(By.tagName("abbr")).get(Integer.parseInt(month)-1).click();

        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

        //The above will enter the date. However, we need to verify selected date is matching the expected result
        //
        List<WebElement> actDate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i=0;i<actDate.size();i++){
            System.out.println(actDate.get(i).getAttribute("value"));
            Assert.assertEquals(actDate.get(i).getAttribute("value"), expectedList[i]);

        }




    }
}
