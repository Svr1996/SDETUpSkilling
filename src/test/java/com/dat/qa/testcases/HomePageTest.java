package com.dat.qa.testcases;

import com.dat.qa.Analyzer.RetryAnalyzer;
import com.dat.qa.base.TestBase;
import com.dat.qa.pages.ContactsPage;
import com.dat.qa.pages.HomePage;
import com.dat.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HomePageTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ContactsPage contactspage;

    public HomePageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setup() throws IOException, InterruptedException {
        initialization();
        Thread.sleep(4000);
        loginpage = new LoginPage();
        contactspage = new ContactsPage();
        homepage = loginpage.validateLogin(prop.getProperty("Username"), prop.getProperty("Password"));;
        Thread.sleep(4000);
    }

    @Test(priority = 1, enabled = false)
    public void verifyHomePageTitleTest() {
        String title = homepage.verifyHomePageTitle();
        Assert.assertEquals(title, "CRMPRO", "Invalid page title returned");
    }

//    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    @Test (priority = 2)
    public void verifyUsernameTest() {
        homepage.verifyUsername();
    }

    @Test (priority =3, enabled = false)
    public void VerifyConatatsClickTest() {
        contactspage = homepage.clickonContactslink();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
