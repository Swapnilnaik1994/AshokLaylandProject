package com.tsets;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void ind() {
		
		
		System.out.println("India cricket team in teast case ind");
	}
	
	@Test
	public void aus() {
		
		System.out.println("Austrlia cricket team in test case aus");
	}
	
	@BeforeMethod
	public void sri() {
		
		System.out.println("Shrilanka crikcet team Before Method");
	}
	
	@AfterMethod
	public void pak() {
		
		System.out.println("Pakistan cricket team After Method");
	}
	
	@BeforeClass
	public void csk() {
		
		System.out.println("CSK team in Before Class");
	}
}
