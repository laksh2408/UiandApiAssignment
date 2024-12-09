package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiBaseMethods {
	
	public static String BASE_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";
	
	public Response sendGetRequest() {
        return RestAssured.given().log().all()
                          .when()
                          .get(BASE_URL)
                          .then().log().all()
                          .extract()
                          .response();
    }

}
