package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsGitHubDemo_1 
{

	@Test
	//@Parameters("browserType")
	public void parameterizedTest_01(){
		WebDriver driver;
		String browserType = System.getProperty("browserType");
		switch(browserType)
		{
			case "firefox":
					System.setProperty("webdriver.gecko.driver", "D://Software//BrowserDrivers//geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get("https://www.google.com/");
					break;
			case "chrome":
					System.setProperty("webdriver.chrome.driver", "D://Software//BrowserDrivers//chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("https://www.google.com/");
					break;
			case "IE":
					driver = new InternetExplorerDriver();
					break;
			case "edge":
					System.setProperty("webdriver.edge.driver", "D://Software//BrowserDrivers//msedgedriver.exe");
					driver=new EdgeDriver();
					driver.get("https://www.google.com/");
			default:
					System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
					driver = new ChromeDriver();
		}
	
	}	

}
