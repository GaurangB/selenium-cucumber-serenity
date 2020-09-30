package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static net.serenitybdd.rest.RestRequests.given;

public class RestService extends RestConfig {
    String baseUri = "http://dummy.restapiexample.com/api/v1";
    String postPath = "create";

    public void verifyGetCallForAnEmployee() {
        int expectedStatusCode = 200;
        given().log().method().log().uri()
                .contentType(ContentType.JSON)
                .baseUri(baseUri)
                .basePath("employee/8040")
                .when()
                .get()
                .then()
                .assertThat().statusCode(200);
    }

    public void postCallWithEmployeeDetails() {
        Map<String, String> body = new HashMap<>();
        body.put("name", UUID.randomUUID().toString());
        body.put("salary", "57600");
        body.put("age", "17");
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(baseUri)
                .basePath(postPath)
                .with()
                .body(body)
                .when()
                .post();

        System.out.println(response.body().prettyPrint());
        response.then().statusCode(200);
//                .assertThat().contentType(ContentType.JSON);
//                .and().body("html/body/",contains(body.get("name")));

    }
}
