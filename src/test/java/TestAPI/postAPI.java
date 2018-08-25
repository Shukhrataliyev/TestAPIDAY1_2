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
import beans.RegionResponse;
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

		Map requestMap = new HashMap<>();
		requestMap.put("region_id", 8);
		requestMap.put("region_name", "Australia3");
		
		
		Response response = given().accept(ContentType.JSON)
		.and().contentType(ContentType.JSON)
		.and().body(requestMap)
		.and().post("http://34.219.73.53:1000/ords/hr/regions/");
		
		assertEquals(response.statusCode(), 201);
		
		Map responseMap = response.body().as(Map.class);
		System.out.println(responseMap);

		assertEquals(requestMap, responseMap);

//		assertEquals(requestMap.get("region_id"), responseMap.get("region_id"));
//		assertEquals(requestMap.get("region_name"), responseMap.get("region_name"));
		
		
		
		
		
		
		
		
		
	}
	
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
	public void postUsingPOJO() {
		String url = "http://34.219.73.53:1000/ords/hr/regions/";
		
		Region region = new Region();
		region.setRegion_id(10);
		region.setRegion_name("South America");
		
		Response response = given().accept(ContentType.JSON)
				.and().contentType(ContentType.JSON)
				.and().body(region)
				.and().post("http://34.219.73.53:1000/ords/hr/regions/");
		
		RegionResponse responseRegion = response.body().as(RegionResponse.class);
		
		assertEquals(responseRegion.getRegion_id(), region.getRegion_id());
		assertEquals(responseRegion.getRegion_name(), region.getRegion_name());
		
		
		
		

	}
	
	
}
