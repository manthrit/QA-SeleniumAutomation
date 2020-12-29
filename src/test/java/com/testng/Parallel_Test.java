package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Test 
{
	@Test
	public void getFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "D://Software//BrowserDrivers//geckodriver.exe");
		System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	
	@Test
	public void getChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D://Software//BrowserDrivers//chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	
	@Test
	public void getEdge()
	{
		System.setProperty("webdriver.edge.driver", "D://Software//BrowserDrivers//msedgedriver.exe");
		System.out.println("GetEdge Method is running on Thread : " + Thread.currentThread().getId());
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

	
}
