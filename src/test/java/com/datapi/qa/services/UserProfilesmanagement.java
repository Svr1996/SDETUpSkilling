package com.datapi.qa.services;

import com.datapi.qa.base.BaseService;
import io.restassured.response.Response;

public class UserProfilesmanagement extends BaseService {


    public static final String BASE_URI = "/api/users/";

    public Response getUserProfile(String token){
        setAuthToken(token);
       return getRequest(BASE_URI+"profile");

    }



}
