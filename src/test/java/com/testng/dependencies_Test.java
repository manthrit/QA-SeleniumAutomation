package com.testng;

import org.testng.annotations.Test;

public class dependencies_Test {
	
	// Test Case 1
	   @Test(groups={"smoke"})
	   public void testCase1() {
	      System.out.println("in Test Case 1");
	   }

	   // Test Case 2
	   @Test(groups="smoke")
	   public void testCase2() {
	      System.out.println("in Test Case 2");
	   }
	   
	   // Test Case 3
	   @Test(groups="smoke")
	   public void testCase3() {
	      System.out.println("in Test Case 3");
	   }
	   
	   // Test Case 5
	   @Test(groups="functionalTest")
	   public void testCase5() {
	      System.out.println("in Test Case 5");
	   }
}
