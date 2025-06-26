package SeleniumExercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.Source;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Assignment2 {

    public static void main(String[] args) {

        //Scenario go to https://rahulshettyacademy.com/angularpractice/
        // we need to fill the name with the text of first course from another website https://rahulshettyacademy.com/


        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");


        driver.switchTo().newWindow(WindowType.TAB); // this will open in new tab within the same window
        //driver.switchTo().newWindow(WindowType.WINDOW); // This will open in new window
        //Even though we switch to new window/tab, still the focus is on parent window
        //Hence, we need to switch to the child window to grab the first course text

        Set<String > handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindow = it.next(); // it will focus on the parent window that means it will move pointer to 0 index
        String childWindow = it.next(); // it will focus on the child window that means it will move pointer to 1 index

        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");

        String courseName = driver.findElements(By.xpath("//a[contains(@href,\"https://courses.rahulshettyacademy.com/p/\")]"))
                .get(1).getText();

        driver.switchTo().window(parentWindow);
        driver.findElement(By.name("name")).sendKeys(courseName);






    }
}
