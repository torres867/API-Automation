package Org.Testing.TestCases2;

import org.json.JSONObject;

public class TestCase2_PostRequest_orgJSON_ComplexJSON_Print 
{
	public static void main(String[] args) 
	{
		// Creating the object of the JSONObject Class
		JSONObject inner = new JSONObject();
		inner.put("House No.","56G");
		inner.put("Block","A8/A");
		inner.put("Place","Safadarjung");
		
		JSONObject outer = new JSONObject();
		outer.put("First Name","Tushar");
		outer.put("Last Name","Mittal");
		outer.put("ID","V0952");
		outer.put("Designation","Test Engineer L2");
		outer.put("Address",inner);
		
		// Printing the Complex JSON
		System.out.println(outer);
		
	}

}
