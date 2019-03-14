package services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.pages.PageObject;

public class RestConfig extends PageObject {
    public RequestSpecification getRequestSpecification(){
        RequestSpecBuilder builder = new RequestSpecBuilder();
        final RequestSpecification build = builder
                .setProxy("192.168.1.1", 80)
                .setRelaxedHTTPSValidation()
                .build();
        return build;
    }
}
