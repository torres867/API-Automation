package Org.Testing.TestCases1;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCase4_GetRequest_MultipleParameters 
{
	public static void main(String[] args) 
	{
		Response Res =
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/PostmanAPIFolks?lastname=Toppo&id=Jaiwant123");
		
		System.out.println(" The Status Code of the GET Request is ");
		System.out.println(Res.statusCode());
		
		System.out.println(" The Response is ");
		System.out.println(Res.asString());
	}

}
