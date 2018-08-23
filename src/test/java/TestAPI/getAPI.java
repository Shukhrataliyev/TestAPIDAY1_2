package TestAPI;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getAPI {

	// When I send a GET request to REST Url
	// http://34.219.73.53:1000/ords/hr/employees
	// Then response status should be 200
	
	@Test
	public void testGet1() {
		when().get("http://34.219.73.53:1000/ords/hr/employees")
		.then().statusCode(200);
		
	}

	// When I send a GET request to REST Url
	// http://34.219.73.53:1000/ords/hr/countries
	// Then I should see JSON Response

	@Test
	public void testGet2() {
		
	}
	
	// Given Accept type is JSON
	// When I send a GET request to REST URL:
	// http://34.219.73.53:1000/ords/hr/employees/100
	// Then status code is 200
	// And Response content should be json
	// And first name should be "Steven
	// And employee id is 100
	
	@Test
	public void testGet3() {
//		given()
//		.accept(ContentType.JSON)
//		.when().get("http://34.219.73.53:1000/ords/hr/employees/100")
//		.then().assertThat().statusCode(200)
//		.and().contentType(ContentType.JSON)
//		.and().assertThat().body("first_name", Matchers.equalTo("Steven"));
		
		Response response = given()
		.accept(ContentType.JSON)
		.when().get("http://34.219.73.53:1000/ords/hr/employees/100");
		
		JsonPath json = response.jsonPath();
		System.out.println(json.getInt("employee_id"));
		
		
	}
	
//	given content type is Json
//	And Accept type is Json
//	When I send POST request to 
//	http://34.219.73.53:1000/ords/hr/regions
//	with request body :
//	{
//		"region_id" : 5,
//		"region_name" : "Antarctica"
//	}
//	Then status code should be 201
//	And response body should match request body
	
	

}
