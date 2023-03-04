package com.tsets;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
     
	@Test
	public void wi() {
		
		System.out.println("West indias team in test case wi");
		//int div = 23/0;
		//System.out.println(div);
	}
     
      @Test
     public void afg() {
    	 
    	 System.out.println("Afganistan cricket team in test case agf");
     }
     
      @BeforeTest
     public void rcb() {
    	 
    	 System.out.println("RCB team Before Test");
     }
   
      
      @AfterSuite
      public void eng() {
    	  
    	  System.out.println("England cricket team After Suite");
      }

}
