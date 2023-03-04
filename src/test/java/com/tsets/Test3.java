package com.tsets;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void nz() {
		
		System.out.println("Newzland cricket team in test case nz");
	}
	
	@Test
	public void ned() {
		
		System.out.println("Netherland cricket team in test case ned");
	}
	
	
	@AfterClass
	public void srh() {
		
		System.out.println("SRH team Before Class");
	}
	
	
	 @BeforeSuite
	    public void ipl() {
	  	  
	  	  System.out.println("Indian primeir league Before Suite");
	}
	 
	 @AfterTest
	 public void mi() {
		 
		 System.out.println("Mumbai Indians team After Test");
	 }
	   
}
