package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class ResourceHelper {

    protected ConfigReader configReader = new ConfigReader();

    public ResourceHelper() throws IOException {
    }

    public static Response get(String url) {
        RequestSpecification rs = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic cmVncmVzc2lvbi9wZXJzb25uZWwvY2FuZGlkYXRlOjFlNmEtNGVhZA==");
                return rs.when().get(url);
    }

    public static Response create(String url, String Json) {
        return given()
//                .auth()
//                .basic("regression/personnel/candidate", "1e6a-4ead")
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic cmVncmVzc2lvbi9wZXJzb25uZWwvY2FuZGlkYXRlOjFlNmEtNGVhZA==")
                .header("Accept", "application/json")
                .when()
                .body(Json)
                .post(url);
    }
}