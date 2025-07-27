package com.datapi.qa.services;

import com.datapi.models.request.LoginRequest;
import com.datapi.models.request.SignUpRequest;
import com.datapi.qa.base.BaseService;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {

    public static final String BASE_PATH = "/api/auth/";


    public Response login(LoginRequest payload){
       return postRequest(payload,BASE_PATH+"login");
    }

    public Response signup(SignUpRequest payload){
        return postRequest(payload,BASE_PATH+"signup");
    }


    public Response forgotPassword(String emailAddress){

        HashMap<String, String> payload = new HashMap<>();
        payload.put("email", emailAddress);
        return postRequest(payload,BASE_PATH+"forgot-password");


    }

}
