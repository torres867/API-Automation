package Org.Testing.TestCases6;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase2_PostRequest_POJOClasses_ComplexJSON 
{
	public static void main(String[] args)
	{
		AddressInformation_ComplexJSON address = new AddressInformation_ComplexJSON();
		address.setBlockNumber("A7/I");
		address.setHouseNumber("456");
		address.setApartment("Royal Palace");
		address.setHouseLocation("Safdarjung Enclave");
		address.setType("Primary Address");
		
		BasicInformation_ComplexJSON basic = new BasicInformation_ComplexJSON();
		basic.setFirst_Name("Riddhi");
		basic.setLast_Name("Dutta");
		basic.setId("V-9756");
		basic.setDesignation("Software Development Engineer in Test 2");
		basic.setAddress(address);
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/CypressFolks");
		
		System.out.println("The status code of the POST Request is");
		System.out.println(Res.statusCode());
		
		System.out.println("Response Code is");
		System.out.println(Res.asString());
		
	}

}
