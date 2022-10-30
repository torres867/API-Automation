package Org.Testing.TestCases5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestCase3_PostRequest_JSONFile_InFormofArray 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File F = new File("../RestAssuredAPI_Automation/In Form of Array Body Data.json");
		FileReader FR = new FileReader(F);
		JSONTokener JT = new JSONTokener(FR);
		JSONObject JS = new JSONObject(JT);
		
	    Response Res =
	    given()
	    .contentType(ContentType.JSON)
	    .body(JS.toString())
	    .when()
	    .post("http://localhost:3000/JavaFolks");
	    
	    System.out.println("The Status Code of the Post Request is");
	    System.out.println(Res.statusCode());
	    
	    System.out.println("Response Code is");
	    System.out.println(Res.asString());
	}

}
