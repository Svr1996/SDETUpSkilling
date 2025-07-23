package com.dat.qa.pages;

import com.dat.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends TestBase {


    @FindBy(xpath = "//td[contains(text(),'User:')]") WebElement userNameDisplay;
    @FindBy(xpath = "//a[normalize-space()='Contacts']") WebElement contacts;
    @FindBy(xpath = "//span[contains(text(),'Tasks')]") WebElement tasks;
    @FindBy(xpath ="//span[contains(text(),'Deals')]") WebElement deals;


    public HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }
    public void verifyUsername() {
        if (userNameDisplay.isDisplayed()) {
            System.out.println("Name of the user is " +userNameDisplay.getText());
        }else {
            System.out.println("Invalid user");
        }
    }
    public ContactsPage clickonContactslink() {
        contacts.click();
        return new ContactsPage();
    }
    public TasksPage clickonTaskslink() {
        tasks.click();
        return new TasksPage();
    }
    public DealsPage clickonDealslink() {
        deals.click();
        return new DealsPage();
    }
}
