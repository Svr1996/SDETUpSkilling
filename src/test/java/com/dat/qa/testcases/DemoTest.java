package com.dat.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTest {

    static WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\Sandeep_Learning materials\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

    }
// Title is Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy
    @Test (priority =  1)
    public void validateTitleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Rahul Shetty Academy - Login page");

    }
    @Test (priority =  2)
    public void loginTest(){
        driver.findElement(By.id("inputUsername")).sendKeys("Sandeep");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.signInBtn")).click();
    }

    @Test (priority = 3)
    public void validateUserNameonHomePage(){
        driver.findElement(By.id("inputUsername")).sendKeys("Sandeep");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        String uname = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
        Assert.assertEquals(uname,"Hello Sandeep,");
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
