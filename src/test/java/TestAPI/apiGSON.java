package TestAPI;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class apiGSON {
	
	//GSON - is a json parser that is used to convert from java object to json and from json to java object.
	// DESERIALIZATION: convert from JSON - java object
	//SERIALIZATION: CONVERT FROM JAVA TO JSON
	
	
	@Test
	public void testWithJsonToHashMap() {
		//http://34.219.73.53:1000/ords/hr/employees/120
	}
	
	@Test
	public void convertJsonToListOfMaps() {
		//http://34.219.73.53:1000/ords/hr/employees
	}
	
	
}
