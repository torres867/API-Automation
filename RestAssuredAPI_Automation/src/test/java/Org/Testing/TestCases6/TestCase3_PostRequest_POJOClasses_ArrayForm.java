package Org.Testing.TestCases6;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase3_PostRequest_POJOClasses_ArrayForm 
{
	public static void main(String[] args) 
	{
		AddressInformation_ArrayForm[] address = new AddressInformation_ArrayForm[2];
		address[0] = new AddressInformation_ArrayForm();
		address[0].setBlockNumber("A2/K");
		address[0].setHouseNumber("789");
		address[0].setApartment("Sargodha");
		address[0].setLocation("Pamposh Enclave");
		address[0].setCity("Delhi");
		address[0].setType("Primary Address");

		address[1] = new AddressInformation_ArrayForm();
		address[1].setBlockNumber("K2/I");
		address[1].setHouseNumber("369");
		address[1].setApartment("34A");
		address[1].setLocation("Vasant Kunj");
		address[1].setCity("Delhi");
		address[1].setType("Secondary Address");
		
		BasicInformation_ArrayForm basic = new BasicInformation_ArrayForm();
		basic.setFirstName("Arnav");
		basic.setLastName("Pandey");
		basic.setId("V-8570");
		basic.setDesignation("Full Stack Engineer");
		basic.setAddress(address);
		
		Response Res =
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/CypressFolks");
		
		System.out.println("The Status of the POST Request is");
		System.out.println(Res.statusCode());
		
		System.out.println("Response Code is");
		System.out.println(Res.asString());
	}
}
