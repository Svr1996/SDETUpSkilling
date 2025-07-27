package com.datapi.qa.APItests;

import com.datapi.models.request.LoginRequest;
import com.datapi.models.response.LoginResponse;
import com.datapi.models.response.UserProfileResponse;
import com.datapi.qa.services.AuthService;
import com.datapi.qa.services.UserProfilesmanagement;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileAPITest {

    UserProfilesmanagement userprfile = new UserProfilesmanagement();
    AuthService auth = new AuthService();
    LoginRequest loginrequest = new LoginRequest("SMTest","Test@1234");

    @Test(description = "verify user is able to get the profile info")
    public void getProfileTest(){

        Response response = auth.login(loginrequest);
        LoginResponse loginresponse = response.as(LoginResponse.class);
        System.out.println(loginresponse.getToken());
        Response response1 = userprfile.getUserProfile(loginresponse.getToken());
        UserProfileResponse userprofileresponse = response1.as(UserProfileResponse.class);
        Assert.assertEquals(userprofileresponse.getId(),2215);
        Assert.assertEquals(userprofileresponse.getUsername(),"SMTest");
        Assert.assertEquals(userprofileresponse.getMobileNumber(),1234567890);



    }
}
