package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	
	@Test(dataProvider="getData")
	public void DataProviderTest(String uname, String password)
	{	System.out.println("User Name: " +uname);
		System.out.println("Password: " +password);
	}

	@DataProvider(name="getData")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0] = "Madhuri";
		data[0][1] = "Tulasidas";
		data[1][0] = "Sahana";
		data[1][1] = "Sameeksha";
		
		return data;
	}
	
}
