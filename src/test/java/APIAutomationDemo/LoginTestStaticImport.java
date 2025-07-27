package APIAutomationDemo;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestStaticImport {


    @Test(description = "Verify API Login Test")
    public void loginTest(){

          RequestSpecification request = given().baseUri("http://64.227.160.186:8080").header("Content-Type","application/json").body("""
                {
                  "username": "SMTest",
                  "password": "Test@1234"
                }""");
        Response response = request.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
