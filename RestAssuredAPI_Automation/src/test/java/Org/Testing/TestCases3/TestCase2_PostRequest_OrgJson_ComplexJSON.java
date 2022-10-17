package Org.Testing.TestCases3;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase2_PostRequest_OrgJson_ComplexJSON 
{
	public static void main(String[] args) 
	{
		JSONObject inner = new JSONObject();
		inner.put("House No.","225");
		inner.put("Block","H3");
		inner.put("Place","Lajpat Nagar");
		
		JSONObject outer = new JSONObject();
		outer.put("First Name","Prateek");
		outer.put("Last Name","Kapoor");
		outer.put("id","V0965");
		outer.put("Designation","Full Stack Automation Engineer");
		outer.put("Address",inner);
		
		Response Res = 
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(outer.toString())
		.post("http://localhost:3000/APIFolks");
		
		System.out.println(" The Status Code of the POST Request is ");
		System.out.println(Res.statusCode());
		
		System.out.println(" The Response is ");
		System.out.println(Res.asString());
		
	}

}
