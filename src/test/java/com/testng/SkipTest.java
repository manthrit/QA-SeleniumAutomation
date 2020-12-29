package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	

	   @Test
	   public void aSkipTest() {
		   String a="Skip Test";
		   if(a.equals("Skip Test"))
		   {	throw new SkipException("In Test Case 3- aSkipTest");
		   }
	   	else
	   		{	System.out.println("I am in else condition");	
			}
			System.out.println("I am out of the if else condition");
	      
	   }

}
