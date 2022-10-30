package Org.Testing.TestCases3;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase3_PostRequest_OrgJson_InFormofArray 
{
	public static void main(String[] args) 
	{
		JSONObject obj1 = new JSONObject();
		obj1.put("Type","Primary Address");
		obj1.put("Block No.","A7/J");
		obj1.put("House No.","269");
		obj1.put("Apartment","Samachar");
		obj1.put("Location","Jungpura");
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Type","Secondary Address");
		obj2.put("Block No.","A9/T");
		obj2.put("House No.","456");
		obj2.put("Apartment","Manav");
		obj2.put("Location","Noida");
		
		JSONObject obj3 = new JSONObject();
		obj3.put("Job Location","Gurgaon");
		obj3.put("Company Name","IHG");
		obj3.put("Designation","Test Engineer");
		
		JSONObject obj4 = new JSONObject();
		obj4.put("Domain","E-Commerce");
		obj4.put("Project","Amazon");
		obj4.put("Module","Home Page,Checkout Page");
		
		JSONArray array1 = new JSONArray();
		array1.put(0,obj1);
		array1.put(1,obj2);
		
		JSONArray array2 = new JSONArray();
		array2.put(0,obj3);
		array2.put(1,obj4);
		
		JSONObject outer = new JSONObject();
		outer.put("First Name","Karan");
		outer.put("Last Name", "Vaid");
		outer.put("id","V-0856");
		outer.put("Address",array1);
		outer.put("Designation",array2);
		
	    Response Res =
	    given()
	    .contentType(ContentType.JSON)
	    .body(outer.toString())
	    .when()
	    .post("http://localhost:3000/DevopsFolks");
	    
	    System.out.println(" The Status Code is ");
	    System.out.println(Res.statusCode());
	    
	    System.out.println("The Response Data is");
	    System.out.println(Res.asString());
	    
		
	}

}
