package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsGitHubDemo_1 
{

	@Test
	public void parameterizedTest_01(String browserType){
		WebDriver driver;
		switch(browserType)
		{
			case "firefox":
					driver = new FirefoxDriver();
					break;
			case "chrome":
					driver = new ChromeDriver();
					break;
			case "IE":
					driver = new InternetExplorerDriver();
					break;
			default:
					System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
					driver = new ChromeDriver();
		}
	
	}	

}
