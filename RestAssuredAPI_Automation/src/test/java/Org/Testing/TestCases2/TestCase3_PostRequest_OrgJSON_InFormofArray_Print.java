package Org.Testing.TestCases2;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestCase3_PostRequest_OrgJSON_InFormofArray_Print 
{
	// Creating a In form of Array Body Data using org.json
	
	public static void main(String[] args) 
	{
		JSONObject obj1 = new JSONObject();
		obj1.put("Type","Primary Address");
		obj1.put("Block No.","A3/K");
		obj1.put("House No.","126");
		obj1.put("Apartment","Medha");
		obj1.put("Location","Vasundhara Enclave");
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Type","Secondary Address");
		obj2.put("Block No.","K2/K");
		obj2.put("House No.","129");
		obj2.put("Apartment","Sargodha");
		obj2.put("Location","Safdarjung Enclave");
		
		JSONArray array = new JSONArray();
		array.put(0,obj1);
		array.put(1,obj2);
		
		JSONObject outer = new JSONObject();
		outer.put("First Name", "Hitesh");
		outer.put("Last Name","Grover");
		outer.put("id","V-0956");
		outer.put("Designation","Test Lead");
		outer.put("Address",array);
		
		// Printing the Inform of Array Body Data
		System.out.println(outer.toString());
				
	}

}
