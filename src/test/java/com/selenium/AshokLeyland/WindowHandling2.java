package com.selenium.AshokLeyland;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		
		String first_tabTitle = driver.getTitle();
		System.out.println("First Tab Title:  "+ first_tabTitle);
		
		 WebElement first_click = driver.findElement(By.xpath("//button[text()=\"    click   \"]"));
		 first_click.click();
		 
		 String firsttab_id = driver.getWindowHandle();
		 System.out.println("First Tab id : "+ firsttab_id);
		  
		 String secondtab_id = "";
		 Set<String> all_id =driver.getWindowHandles();
		 for(String id:all_id) {
			
			 if(id.equals(firsttab_id)) {
				 
				 
			 }else {
				 
				 secondtab_id = id;
				 System.out.println("Second Tab id : "+ secondtab_id );
				}
			 
	       }
		
		 driver.switchTo().window(secondtab_id);
		 String secondtab_title=driver.getTitle();
		System.out.println("Seocnd Tab Title:  "+ secondtab_title);
		
		 
		 Thread.sleep(2000);
		driver.quit();
		
	}

}
