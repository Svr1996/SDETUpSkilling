package com.dat.qa.Assertions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {



    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testcase1(){

        System.out.println("open browser");
        Assert.assertEquals(true, true);

        System.out.println("login to PME");
        Assert.assertEquals(true, true);

        System.out.println("Validate home page");
        softAssert.assertEquals(true, false);

        System.out.println("click on draft deals");
        softAssert.assertEquals(true, false);

        System.out.println("click on live deals");

        softAssert.assertAll();


    }




}
