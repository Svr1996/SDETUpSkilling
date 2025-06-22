package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.transform.Source;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LinksText {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //count the number of links available on the webpage and print the text and links of it

//        System.out.println("------All the links available on WebPage-------");
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Number of links available on webpage " +links.size());
//
//        for(WebElement i: links){
//            System.out.println("Links text = " +i.getText() + " " +i.getAttribute("href"));
//
//        }

        //count the number of links available on the footer of webpage and print the text and links of it

        // Locate the footer section
//        System.out.println("------All the links available on footer-------");
//        WebElement footer = driver.findElement(By.id("gf-BIG"));
//        // Get all <a> elements inside the footer
//        List <WebElement> footerLinks = footer.findElements(By.tagName("a"));
//        System.out.println("Number of links available on footer " +footerLinks.size());
//
//        for(WebElement i: footerLinks){
//            System.out.println("Links text = " +i.getText() +" " + i.getAttribute("href"));
//        }


        //I want to click on all the links available in the Disocunt Coupons

        WebElement sectionfooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        List <WebElement> sectionlinks = sectionfooter.findElements(By.tagName("a"));
        for(int i=1;i<sectionlinks.size();i++){
            //StaleElementExceptionFound. Because if we just use sectionlinks.get(i).click(); will click on the link and opens it in same window
            //Hence, the driver focus on the child window and other links available on the parentWindow can't be clickable

           String clickonLinks =  Keys.chord(Keys.CONTROL,Keys.ENTER);
           sectionlinks.get(i).sendKeys(clickonLinks);
           Thread.sleep(5000);
       }

        //Navigate to each window and get the title of it
        Set<String> windows = driver.getWindowHandles();

        //This is using for loop
//        for(String i : windows){
//            System.out.println(driver.switchTo().window(i).getTitle());
//        }

        //Using while loop
       Iterator<String> it = windows.iterator();

       //it.hasNext() actually tells that it has next index or not
       while(it.hasNext()){

           //it.next() this will actually move to next index
           System.out.println(driver.switchTo().window(it.next()).getTitle());
       }




    }
}
