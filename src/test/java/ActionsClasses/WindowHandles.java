package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;
import java.util.Set;

public class WindowHandles {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.automationtesting.in/Windows.html");

        //multiple ways to switch to the window

        //1st one is as follows: using the ID's and this code works only when we have one parent and child window
        //This one will return the parent window ID
        String ParentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        Set<String> handles = driver.getWindowHandles();
//        for(String windows : handles){
//            if(!windows.equals(ParentWindow)){
//                driver.switchTo().window(windows);
//                System.out.println(driver.getTitle());
//            }
//
//        }
//        driver.switchTo().window(ParentWindow);
//        System.out.println(driver.getTitle());

        //2nd one as follows: using the title of the page
        for(String handle :handles){
           String titles = driver.switchTo().window(handle).getTitle();
            if(titles.equals("Selenium")){
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
            }

        }




    }
}
