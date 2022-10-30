package Org.Testing.TestCases4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestCase2_PostRequest_JSONData_ComplexJSON_Print 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// Establishing the Connection
		File F = new File("../RestAssuredAPI_Automation/src/test/java/Org/Testing/TestCases4/Complex JSON Body Data.json");
		
		// Reading the File Character by Character
		FileReader FR = new FileReader(F);
		
		// Reading the JSON File
		JSONTokener JT = new JSONTokener(FR);
		
		// Calling the JSON Object class
		JSONObject JS = new JSONObject(JT);
		
		// Printing the Complex JSON
		System.out.println(JS.toString());
		
	}

}
