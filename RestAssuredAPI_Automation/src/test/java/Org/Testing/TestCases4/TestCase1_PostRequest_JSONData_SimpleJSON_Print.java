package Org.Testing.TestCases4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestCase1_PostRequest_JSONData_SimpleJSON_Print 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// Using File Class to establish the Connection
		File BVB = new File("../RestAssuredAPI_Automation/src/test/java/Org/Testing/TestCases4/Simple JSON Body Data.json");
		
		// Using object of the File Reader class, to read the file character by character
		FileReader FCB = new FileReader(BVB);
		
		// Using object of the JSON Tokener, to read the JSON File
		JSONTokener RM = new JSONTokener(FCB);
		
		// Our body data in JSON File start with Object Notation, so JSON Object class will use
		JSONObject JS = new JSONObject(RM);
		
		
		// Now Printing the Simple JSON
		System.out.println(JS.toString());
		
		
	}

}
