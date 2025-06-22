package TakeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.Source;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokeLinks {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List <WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        //count number of links available in the string
        System.out.println(links.size());
        for(WebElement i : links){
            //Href contains URL
           String link = i.getAttribute("href");
           //The below one is depricated in Java 20 and we can   URL url = URI.create(link).toURL();
           URL url = new URL(link);
           //this will enable the network connection
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           int responseCode = conn.getResponseCode();
           if(responseCode>400){
               System.out.println("This is a broken link " +url);
           }else {
               System.out.println("This is not a broken link " +url);
           }


        }

    }
}
