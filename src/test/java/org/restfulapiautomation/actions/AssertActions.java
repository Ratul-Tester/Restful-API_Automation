package org.restfulapiautomation.actions;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {

    public void verifyResponseBody(String actual, String expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCodeInvalidResponse(Response response) {
        assertEquals(response.getStatusCode(), 404);
    }
}
