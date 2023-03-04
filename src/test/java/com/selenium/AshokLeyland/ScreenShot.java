package com.selenium.AshokLeyland;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
         

class ScreenShot {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	      Thread.sleep(2000);
	      
	      allscreenshot("amzonhomepage");
	      
	      driver.get("https://www.google.com/");
	      allscreenshot("googlepage");
       
	      Thread.sleep(2000);
	      driver.close();
	      
	      
	}
	
	public static void allscreenshot(String imagename) throws IOException{
		
		TakesScreenshot src = (TakesScreenshot)driver;
	      File srcfile = src.getScreenshotAs(OutputType.FILE);
	      
	      String path = "C:\\Screenshot\\" + imagename + ".jpg";
	      File descfile = new File(path);
	      
	      FileUtils.copyFile(srcfile, descfile);
		
	}

}
