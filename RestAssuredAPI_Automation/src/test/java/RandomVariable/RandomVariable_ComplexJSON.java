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

public class RandomVariable_ComplexJSON 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File F = new File("../RestAssuredAPI_Automation/Complex JSON using Random Variable.json");
		FileReader FR = new FileReader(F);
		JSONTokener JT = new JSONTokener(FR);
		JSONObject JS = new JSONObject(JT);
		
		// id
		Random R = new Random();
		Integer number = R.nextInt();
		String jsondata = JS.toString();
		jsondata = jsondata.replaceAll(Pattern.quote("{{id}}"),number.toString());
		
		// First Name
		System.out.println("Enter the First Name");
		Scanner S1 = new Scanner(System.in);
		String First_Name = S1.next();
		jsondata =jsondata.replaceAll(Pattern.quote("{{First_Name}}"),First_Name);
		
		// Last Name
		System.out.println("Enter the Last Name");
		Scanner S2 = new Scanner(System.in);
		String Last_Name = S2.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Last_Name}}"),Last_Name);
		
		//Designation
		System.out.println("Enter the Designation");
		Scanner S3 = new Scanner(System.in);
		String Designation = S3.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Designation}}"),Designation);
		
		//Address
		//Type
		System.out.println("Enter the Type");
		Scanner S4 = new Scanner(System.in);
		String Type = S4.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Type}}"),Type);
		
		//Block
		System.out.println("Enter the Block");
		Scanner S5 = new Scanner(System.in);
		String Block = S5.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Block}}"),Block);
		
		// House No.
		System.out.println("Enter the House No.");
		Scanner S6 = new Scanner(System.in);
		String House_No = S6.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{House_No}}"),House_No);
		
		// Apartment
		System.out.println("Enter the Apartment");
		Scanner S7 = new Scanner(System.in);
		String Apartment = S7.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Apartment}}"),Apartment);
		
		// Place
		System.out.println("Enter the Place");
		Scanner S8 = new Scanner(System.in);
		String Place = S8.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{Place}}"),Place);
		
		// City
		System.out.println("Enter the City");
		Scanner S9 = new Scanner(System.in);
		String City = S9.next();
		jsondata = jsondata.replaceAll(Pattern.quote("{{City}}"),City);
		
		
		// Response
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(jsondata)
		.when()
		.post("http://localhost:3000/PythonFolks");
		
		//Printing the Status Code and Response Code
		
		System.out.println("The status code of the Request is");
		System.out.println(Res.statusCode());
		
		System.out.println("The Response Code is");
		System.out.println(Res.asString());
		
		
	}

}
