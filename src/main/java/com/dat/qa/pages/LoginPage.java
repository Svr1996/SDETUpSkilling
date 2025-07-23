package com.dat.qa.pages;

import com.dat.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase {

    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    //Page Factory
    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//div[@class='input-group-btn']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[contains(@alt,\"Free CRM Software\")]")
    WebElement logo;

    //Actions

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateLoginPageLogo(){
        return logo.isDisplayed();
    }

    public HomePage validateLogin(String un, String pwd) throws IOException {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }



}
