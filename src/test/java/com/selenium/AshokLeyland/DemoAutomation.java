package com.selenium.AshokLeyland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.automationtesting.in/Register.html");
     Thread.sleep(2000);
     WebElement first_name =driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
     first_name.sendKeys("Swapnil");
     
     WebElement last_name = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
     last_name.sendKeys("Naik");
     
     WebElement address =driver.findElement(By.xpath("//textarea[@rows=\"3\"]"));
     address.sendKeys("A/P Basarge BK, Tal-Gadhinglaj Dist-Kolhapur, Pin-416506");
     
     WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
     email.sendKeys("swapnilnaik199@gmail.com");
     
     WebElement phone =driver.findElement(By.xpath("//input[@type=\"tel\"]"));
     phone.sendKeys("9923758240");
     
     driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
     

     driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
     
     Thread.sleep(2000);
     driver.close();
     
	}

}
