package com.datapi.qa.APItests;

import com.datapi.models.request.SignUpRequest;
import com.datapi.qa.services.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpAPITest {

    AuthService auth = new AuthService();


    @Test
    public void createanAccount(){

        SignUpRequest signuprequest = new SignUpRequest.Builder()
                .userName("Swathi")
                .email("Swathi@test.com")
                .firstName("Swathi")
                .lastName("M")
                .mobileNumber(1234567890)
                .password("Swathi1234")
                .build();

        Response response = auth.signup(signuprequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(), "User Registered Successfully!");
        System.out.println(response.getStatusCode());

    }



}
