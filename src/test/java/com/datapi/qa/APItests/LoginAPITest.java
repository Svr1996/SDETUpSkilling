package com.datapi.qa.APItests;

import com.datapi.models.request.LoginRequest;
import com.datapi.models.response.LoginResponse;
import com.datapi.qa.services.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {

    AuthService authservice = new AuthService();
    LoginRequest loginrequest = new LoginRequest("SMTest", "Test@1234");

    @Test()
    public void loginTest(){
        Response response = authservice.login(loginrequest);
        LoginResponse loginresponse = response.as(LoginResponse.class);
//        System.out.println(response.asPrettyString());
        Assert.assertTrue(loginresponse.getToken() != null);
        Assert.assertEquals(loginresponse.getUsername(), "SMTest");
        Assert.assertEquals(loginresponse.getEmail(), "SMtest@gmail.com");

        Assert.assertEquals(response.getStatusCode(),200);



    }


}
