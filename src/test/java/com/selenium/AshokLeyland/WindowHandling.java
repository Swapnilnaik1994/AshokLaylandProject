package com.selenium.AshokLeyland;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		 WebElement first_click = driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]"));
		 first_click.click();
		 
		 String parent_title= driver.getTitle();
		 System.out.println("Parent Title is: " + parent_title);
		 
		String p_id = driver.getWindowHandle();
		System.out.println("Parent ID : " + p_id);
		 
		 WebElement second_click =driver.findElement(By.xpath("//button[text()=\"click\"]"));
		 second_click.click();
		
		 Set<String> all_id =driver.getWindowHandles();
		
		 String child_id="";
		 for(String id : all_id) {
			 
			 if(id.equals(p_id)) {
				 
			 }else {
				 
				 child_id=id;
			 }
		
			}
		 System.out.println("Child Id is: "+child_id);
		 
		 driver.switchTo().window(child_id);
		 String child_title= driver.getTitle();
		 System.out.println("Child Title is: " + child_title);
		 String id=driver.getWindowHandle();
		 System.out.println("Is is" + id);
		 
		 Thread.sleep(2000);
		driver.quit();
		
	}

}
