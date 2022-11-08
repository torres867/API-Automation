package RandomVariable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RandomVariable_SimpleJSON 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File F = new File("../RestAssuredAPI_Automation/Random Variable in JSON File.json");
		FileReader FR = new FileReader(F);
		JSONTokener JT = new JSONTokener(FR);
		JSONObject JS = new JSONObject(JT);
		
		
		// Now use Random Class to get some Random Number for Id
		
		Random R = new Random();
		Integer number = R.nextInt();
		String jsondata = JS.toString();
	    jsondata = jsondata.replaceAll(Pattern.quote("{{id}}"),number.toString());
	    
	    // Using Scanner Class to enter some input value
	    // First Name
	    System.out.println("Enter the First Name");
	    Scanner S1 =new Scanner(System.in);
	    String First_Name = S1.next();
	    jsondata = jsondata.replaceAll(Pattern.quote("{{First_Name}}"),First_Name);
	    
	    // Last Name
	    System.out.println("Enter the Last Name");
	    Scanner S2 = new Scanner(System.in);
	    String Last_Name = S2.next();
	    jsondata = jsondata.replaceAll(Pattern.quote("{{Last_Name}}"),Last_Name);
	    
	    // Designation
	    System.out.println("Enter the Designation");
	    Scanner S3 = new Scanner(System.in);
	    String Designation = S3.next();
	    jsondata = jsondata.replaceAll(Pattern.quote("{{Designation}}"),Designation);
	    
	    // Location
	    System.out.println("Enter the Location");
	    Scanner S4 =new Scanner(System.in);
	    String Location = S4.next();
	    jsondata = jsondata.replaceAll(Pattern.quote("{{Location}}"),Location);
	    
	    //Response
	    Response Res =
	    given()
	    .contentType(ContentType.JSON)
	    .body(jsondata)
	    .post("http://localhost:3000/JavascriptFolks");
	    
	    // Printing the Status Code and Response Code
	    System.out.println("The status Code of the Request is");
	    System.out.println(Res.statusCode());
	    
	    System.out.println("Response Code is");
	    System.out.println(Res.asString());
	   }
}
