package com.datapi.qa.services;

import com.datapi.models.request.UpdateProfileRequest;
import com.datapi.qa.base.BaseService;
import io.restassured.response.Response;

public class UserProfilesmanagement extends BaseService {


    public static final String BASE_PATH = "/api/users/";

    public Response getUserProfile(String token){
        setAuthToken(token);
       return getRequest(BASE_PATH+"profile");

    }

    public Response updateProfile(String token, UpdateProfileRequest payload){
        setAuthToken(token);
        return putRequest(payload, BASE_PATH+"profile");

    }




}
