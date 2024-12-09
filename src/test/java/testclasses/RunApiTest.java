package testclasses;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiAutomation.ApiBaseMethods;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RunApiTest {
	
	ApiBaseMethods apiBaseMethods = new ApiBaseMethods();

    @Test
    public void testGetRequest() {
    	
    	Response response = null;
    	String gbpDescription = null;
		response = apiBaseMethods.sendGetRequest();
		String responseBody = response.asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		
		boolean containsUSD = jsonPath.get("bpi.USD")!= null;
        boolean containsGBP = jsonPath.get("bpi.GBP")!= null;
        boolean containsEUR = jsonPath.get("bpi.EUR")!= null;
		
        Assert.assertTrue(containsUSD, "USD is not present inside bpi");
        Assert.assertTrue(containsGBP, "GBP is not present inside bpi");
        Assert.assertTrue(containsEUR, "EUR is not present inside bpi");
          
        gbpDescription = jsonPath.getString("bpi.GBP.description");
        Assert.assertEquals(gbpDescription, "British Pound Sterling", "GBP description does not match");
        
        System.out.println("Test Passed,Expected Keys are present in Bpi & GBP description is matched with expected values");
        
    }
}
