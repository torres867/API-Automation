package Org.Testing.TestCases2;

import org.json.JSONObject;

public class TestCase1_PostRequest_orgJSON_SimpleJSON_Print 
{
	public static void main(String[] args) 
	{
		// For object notation org.json library has given class name called "JSON Object"
		// Created a Object of the JSONObject Class
		JSONObject JS = new JSONObject();
		JS.put("First Name","Shashank");
		JS.put("Last Name","Pandey");
		JS.put("ID","V0919");
		JS.put("Designation","Test Engineer L1");
		
		// Printing the Simple JSON
		System.out.println(JS);
	}

}
  