package com.datapi.qa.APItests;

import com.datapi.qa.services.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordAPITest {

    AuthService authservice = new AuthService();

    @Test
    public void forgotPassword(){

        Response response = authservice.forgotPassword("SMtest@gmail.com");
        System.out.println(response.asPrettyString());


    }

}
