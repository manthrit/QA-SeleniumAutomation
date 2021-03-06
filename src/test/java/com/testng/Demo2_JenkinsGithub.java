package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2_JenkinsGithub 
{

	@Test
	public void parameterizedTest_01(){
		WebDriver driver;
		String browserType = System.getProperty("browserType");
		System.out.println(" =============== Select browserType================ : " + browserType);
		switch(browserType)
		{
			case "firefox":
					System.out.println(" ===============Inside Switch case================ : " + browserType);
					System.setProperty("webdriver.gecko.driver", "D://Software//BrowserDrivers//geckodriver.exe");
					try {
						driver = new FirefoxDriver();
						Thread.sleep(8000);
						driver.get("https://www.wellsfargo.com/");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
			case "chrome":
					System.out.println(" ===============Inside Switch case================ : " + browserType);
					System.setProperty("webdriver.chrome.driver", "D://Software//BrowserDrivers//chromedriver.exe");
					try {
						driver = new ChromeDriver();
						Thread.sleep(8000);
						driver.get("https://www.wellsfargo.com/");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
			case "IE":
					driver = new InternetExplorerDriver();
					break;
			case "edge":
					System.setProperty("webdriver.edge.driver", "D://Software//BrowserDrivers//msedgedriver.exe");
					driver=new EdgeDriver();
					driver.get("https://www.google.com/");
					break;

		}
	
	}	

}
