package com.selenium.AshokLeyland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		
		//driver.switchTo().frame("singleframe");
		WebElement frame1 = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		text.sendKeys("Swapnil");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
