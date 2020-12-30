package com.bdd;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample_stepDefinition 
{
	@Given("^sample feature file is ready1$")
	public void givenStatement(){
		 System.out.println("Given statement executed successfully_1");
	}
	@When("^I run the feature file1$")
    public void whenStatement(){
           System.out.println("When statement execueted successfully_1");
    }
    @Then("^run should be successful1$")
    public void thenStatment(){
           System.out.println("Then statement executed successfully_1");
    }
    
    
	@Given("^sample feature file is ready2$")
	public void givenStatement2(){
		 System.out.println("Given statement executed successfully_2");
	}
	@When("^I run the feature file2$")
    public void whenStatement2(){
           System.out.println("When statement execueted successfully_2");
    }
    @Then("^run should be successful2$")
    public void thenStatment2(){
           System.out.println("Then statement executed successfully_2");
           ChromeDriver driver = new ChromeDriver();
    }
}
