package testCases;

import baseTest.TestBase;
import builders.CreateLocationBuilder;
import entities.request.CreateLocationRequest;
import entities.response.CreateLocationResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.RequestHelper;
import utilities.ResourceHelper;
import utilities.ResponseHelper;
import java.io.IOException;

public class CreateLocationTest extends TestBase {


    @Test(description = "Create location")
    public void createLocation() throws IOException {
        CreateLocationRequest createLocationRequest = new CreateLocationBuilder()
                .withId("DOE7D6ORER20")
                .withClientId("regression")
                .withCode("null")
                .withname("null")
                .withtype("null")
                .build();
        configReader = new ConfigReader();
        String url = configReader.getCreateRequestUrl();

        String json = RequestHelper.getJSONString(createLocationRequest);

        Response response = ResourceHelper.create(url, json);
//        Response response = ResourceHelper.get("https://locus-api.com/v1/client/regression/location/DOE7D6ORER18");
//        System.out.println(response.prettyPrint());
//        System.out.println(response.getStatusCode());

        CreateLocationResponse createLocationResponse = (CreateLocationResponse)
                ResponseHelper.getResponseAsObject(response.asString(), CreateLocationResponse.class);

        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(createLocationRequest.getId(), createLocationResponse.getId());
        Assert.assertEquals(createLocationRequest.getClientId(), createLocationResponse.getClientId());
    }
}
