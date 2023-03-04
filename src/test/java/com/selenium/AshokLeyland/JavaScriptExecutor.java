package com.selenium.AshokLeyland;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(2000);
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     
	     WebElement ele = driver.findElement(By.id("searchDropdownBox"));
	     js.executeScript("arguments[0].click();", ele);
	     Thread.sleep(5000);
	     
	     js.executeScript("window.scrollBy(0,2000)");
	     Thread.sleep(2000);
	     
	    // js.executeScript("location.reload()");
	     //Thread.sleep(5000);
	     
	     js.executeScript("window.open('https://www.cricbuzz.com/', '_blank');");
	     
	     Thread.sleep(5000);
	    driver.quit();

	}

}
