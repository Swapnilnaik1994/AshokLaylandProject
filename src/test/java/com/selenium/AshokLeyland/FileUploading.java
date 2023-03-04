package com.selenium.AshokLeyland;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.ilovepdf.com/pdf_to_word");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//span[text()=\"Select PDF file\"]")).click();
		
		StringSelection strsel = new StringSelection("file:///C:/Swapnil%20N/AkshayResume.pdf");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel, null);
	      Thread.sleep(2000);
	      
	      Robot r = new Robot();
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	     // r.keyRelease(KeyEvent.VK_CONTROL);
	      Thread.sleep(2000);
	      
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(5000);
	      
	      //driver.close();
	}
}
