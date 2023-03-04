package com.menon;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allison {

	@Test
	public void purchase() {
		
		System.out.println("Purchase department in test case ");
	}
	
	@Test 
	public void material() {
		
		System.out.println("Material department in test case");
	}
	
	@AfterSuite
	public void marketing () {
		
		System.out.println("Marketing department After suite");
	}
	
	@BeforeTest
	public void bushing() {
		
		System.out.println("Bush plant Before test");
	}
	
	@BeforeMethod
	public void bearing() {
		
		System.out.println("Bearing production Before method");
	}
}
