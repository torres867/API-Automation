package Org.Testing.TestCases3;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase1_PostRequest_OrgJson_SimpleJSON 
{
	public static void main(String[] args) 
	{
		JSONObject BVB = new JSONObject();
		BVB.put("First Name","Shashank");
		BVB.put("Last Name","Pandey");
		BVB.put("id","V0930");
		BVB.put("Designation","Test Engineer L1");
		
		Response Res =
		
		given()
		.contentType(ContentType.JSON)
		.body(BVB.toString())
		.post("http://localhost:3000/SeleniumFolks");
		
		System.out.println(" The status code of the POST Request is ");
		System.out.println(Res.statusCode());
		
		System.out.println(" The Resposne is ");
		System.out.println(Res.asString());
		
	}

}
