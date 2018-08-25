package TestAPI;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//import org.apache.poi.ss.formula.functions.Sumproduct;
import org.testng.Assert;
import org.testng.annotations.Test;

//import beans.Country;
//import beans.CountryResponse;
import beans.Region;
import beans.RegionReponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postAPI {
	
	/*
	POST SCENARIO:

		given content type is Json
		And Accept type is Json
		When I send POST request to 
		http://34.219.73.53:1000/ords/hr/regions
		with request body :
		{
			"region_id" : 5,
			"region_name" : "murodil's region"
		}
		Then status code should be 201
		And response body should match request body
	*/
	
	
	@Test
	public void postNewRegion() {
		//http://34.219.73.53:1000/ords/hr/regions/
	}
	
	@Test
	public void postUsingPOJO() {
		//String url = "http://34.219.73.53:1000/ords/hr/regions/";

	}
	
	
}
