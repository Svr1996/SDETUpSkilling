package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");



        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

        for(WebElement option : options){
            String optionText = option.getText();
            System.out.println(optionText);
            if(optionText.equals("India")){
                option.click();
                break;
            }


        }

    }
}
