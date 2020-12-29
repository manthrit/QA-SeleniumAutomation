package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Test 
{
	@Test
	public void hardAssert()
	{
		System.out.println("hardAssert - Started ");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}

	@Test
	public void softAssert()
	{
		SoftAssert softAssertion= new SoftAssert();
		
		System.out.println("softAssert - Started ");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
		
		softAssertion.assertAll();
	}
}
