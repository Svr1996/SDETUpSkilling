package com.datapi.qa.base;

import com.datapi.models.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    private static final String BASE_URI = "http://64.227.160.186:8080";
    private static RequestSpecification requestspec;

    public BaseService(){
       requestspec = RestAssured.given().baseUri(BASE_URI);

    }

    protected void setAuthToken(String token){
        requestspec.header("Authorization", "Bearer "+token);

    }

    protected Response postRequest(Object payload, String endpoint){
       return requestspec.contentType(ContentType.JSON).body(payload).post(endpoint);

    }

    protected Response getRequest(String endpoint){

       return requestspec.get(endpoint);

    }


}
