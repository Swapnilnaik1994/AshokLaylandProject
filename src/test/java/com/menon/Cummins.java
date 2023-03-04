package com.menon;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Cummins {

	@Test
	public void production() {
		
		System.out.println("Production department in test case ");
	}
	
	@Test 
	public void quality() {
		
		System.out.println("Quality department in test case");
	}
	
	@BeforeSuite
	public void md () {
		
		System.out.println("Manangement cabin Before suite");
	}
	
	@AfterMethod
	public void engineering() {
		
		System.out.println("Engineering department After method");
	}
	
	@BeforeClass
	public void thrustwasher() {
		
		System.out.println("Thrust washer production Before class");
	}
}
