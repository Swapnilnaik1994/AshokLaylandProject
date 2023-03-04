package com.selenium.AshokLeyland;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		String alert_text = al.getText();
		System.out.println(alert_text);
		
		 al.sendKeys("Swapnil");
		Thread.sleep(5000);
		al.accept();
		
		//WebDriverManager.chromedriver().setup();
		
		//al.dismiss();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
