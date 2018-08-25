package TestAPI;

import static org.testng.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.filefilter.AndFileFilter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigurationReader;
import utilities.DBType;
import utilities.DBUtility;
import utilities.ExcelUtility;
import utilities.StaticExcelUtil;

import static io.restassured.RestAssured.*;

public class WeatherInfoTests{
	
	
	

}
