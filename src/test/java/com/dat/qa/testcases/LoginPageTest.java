package com.dat.qa.testcases;

import com.dat.qa.base.TestBase;
import com.dat.qa.pages.HomePage;
import com.dat.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {

    LoginPage loginpage;
    HomePage homePage;



    public LoginPageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setup() throws IOException {
        initialization();
        loginpage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginpage.validateLoginPageTitle();
        Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
    }
    //This is first test
    @Test(priority = 2)
    public void loginPageLogoTest(){
        boolean flag = loginpage.validateLoginPageLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest() throws IOException {
        homePage = loginpage.validateLogin(prop.getProperty("Username"),prop.getProperty("Password"));

    }


    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }


}
