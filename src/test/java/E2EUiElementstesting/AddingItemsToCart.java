package E2EUiElementstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingItemsToCart {

    ////what if you want to add multiple items at the same time
    public static void addItemsToCart(WebDriver driver, String[] items){

        int count=0;

        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

        for(int i=0;i<products.size();i++){
            // the below line returns the full name as per webpage but I want a text as per items.
            // Hence I need to do some string manipulations here
            //Ex: productNames = Cucumber - 1 Kg and in this I should get only Cucumber
            //String productNames = products.get(i).getText();

            //Split function will split the name Cucumber - 1 Kg into Cucumber in 0th Index and 1 Kg in 1st index
            //Hence we just need 0th Index, However we have space after Cucumber and we need to trim white space
            String[] productNames = products.get(i).getText().split("-");
            String actprodName = productNames[0].trim();

            // we need to convert String Array into ArrayList
            List prodList = Arrays.asList(items);


            if(prodList.contains(actprodName)){
                count++;
                driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
                if(count == items.length){
                    System.out.println(count);
                    break;
                }
            }
        }



    }



    public static void main(String[] args) {

        String[] items = {"Brocolli","Tomato","Beans"};

        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        addItemsToCart(driver,items);
        driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        String text = driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();
        Assert.assertEquals(text, "Code applied ..!");















        //This code is only for adding the one item to the cart

//        String name = "Cucumber";
//        for(int i=0;i<products.size();i++){
//           String productNames = products.get(i).getText();
//            System.out.println(productNames);
//
//            if(productNames.contains(name)){
//                driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
//                break;
//            }
//        }








    }


}
