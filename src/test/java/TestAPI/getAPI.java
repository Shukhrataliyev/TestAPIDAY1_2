package TestAPI;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getAPI {

	// When I send a GET request to REST Url
	// http://34.219.73.53:1000/ords/hr/employees
	// Then response status should be 200
	
	@Test
	public void testGet1() {
		
//		when()
//		.get("http://34.219.73.53:1000/ords/hr/employees")
//		.then().assertThat().statusCode(200);
		
		Response response = when()
		.get("http://34.219.73.53:1000/ords/hr/employees")
		;
		
		System.out.println(response);
		assertEquals(response.statusCode(), 200);
		
		
		
	}

	// When I send a GET request to REST Url
	// http://34.219.73.53:1000/ords/hr/countries
	// Then I should see JSON Response

	@Test
	public void testGet2() {
		Response response = when()
		.get("http://34.219.73.53:1000/ords/hr/employees")
		;
		
		System.out.println(response.asString());
		//assertEquals(response.statusCode(), 200);
		
		
	}
	
	// Given Accept type is JSON
	// When I send a GET request to REST URL:
	// http://34.219.73.53:1000/ords/hr/employees/100
	// Then status code is 200
	// And Response content should be json
	// And first name should be "Steven"
	// And employee id is 100
	
	@Test
	public void testGet3() {
		
		given().accept(ContentType.JSON)
		.when().get("http://34.219.73.53:1000/ords/hr/employees/100")
		.then().assertThat().statusCode(200)
		.and().contentType(ContentType.JSON)
		.and().assertThat().body("first_name", Matchers.equalTo("Steven"));
	}
	

	/*
	 * Given Accept type is Json
	 * And Params are limit=100
	 * When I send get request to 
	 * http://34.223.219.142:1212/ords/hr/employee 
	 * Then status code is 200 
	 * And Response content should be json 
	 * all employee ids should be returned
	 */
	
	@Test
	public void testGet4() {
		
	}
	
}
