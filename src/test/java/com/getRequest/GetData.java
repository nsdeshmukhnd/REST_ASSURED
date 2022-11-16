package com.getRequest;

import static io.restassured.RestAssured.get;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {
	String api="https://www.google.com";
	@Test
	public void testResponceCode() {
		int code =get(api).getStatusCode();
		System.out.println("Code:"+code);
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testBody() {
		Long time=get(api).getTime();
		System.out.println("Responce Time:"+time);
	}
}
