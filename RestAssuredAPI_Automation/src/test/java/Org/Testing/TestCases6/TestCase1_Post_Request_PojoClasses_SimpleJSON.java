package Org.Testing.TestCases6;

import Org.Testing.TestCases6.BasicInformation_1;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase1_Post_Request_PojoClasses_SimpleJSON 
{
	public static void main(String[] args) 
	{
		// Creating the Object of the Basic Information Class using Has a Relationship
		
		BasicInformation_1 basic = new BasicInformation_1();
		
		// Using the Setter Method, we can assign the Value
		
		basic.setFirst_Name("Ignor");
		basic.setLast_Name("Pestrokovis");
		basic.setDesignation("Product Owner");
		basic.setId("V-3598");
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		 // The object of the basic class is calling the getter method internally
		.body(basic)       
		.post("http://localhost:3000/CypressFolks");
		
		System.out.println("The status code of the POST Request is");
		System.out.println(Res.statusCode());
		
		System.out.println("Response Code is");
		System.out.println(Res.asString());
	}

}
