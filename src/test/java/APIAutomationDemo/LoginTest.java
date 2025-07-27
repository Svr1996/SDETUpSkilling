package APIAutomationDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {


    @Test(description = "Verify API Login Test")
    public void loginTest(){

        RestAssured.baseURI = "http://64.227.160.186:8080"; //this is my baseURI
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body("""
                {
                  "username": "SMTest",
                  "password": "Test@1234"
                }""");
        Response response = request.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
