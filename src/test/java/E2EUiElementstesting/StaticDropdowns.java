package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class StaticDropdowns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

       WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       Select select = new Select(dropdown);

       // By Index
       select.selectByIndex(3);
       System.out.println(select.getFirstSelectedOption().getText());

       // By Visibility of text
        select.selectByVisibleText("AED");
        System.out.println(select.getFirstSelectedOption().getText());

        //By value attribute
        select.selectByValue("INR");
        System.out.println(select.getFirstSelectedOption().getText());
//        ArrayList<WebElement> list = new ArrayList<>(select.getOptions());
        ;

        //count the number of options available in the Select dropdown

        int count = select.getOptions().size();
        System.out.println("number of options available in the doprdown " +count);

        //How to get all the options available in the dropdown
        List<WebElement> list = select.getOptions();

        //another way to print the count
        System.out.println(list.size());


        for(WebElement options : list){
            System.out.println(options.getText());

            if(options.getText().equalsIgnoreCase("USD")){
                options.click();
                break;
            }


        }



    }
}
