package com.dropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select s = new Select(dropdown);
		//Single Dropdown
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		s.selectByValue("1");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		
		//Multipe Dropdown
		WebElement dropdown6 = driver.findElement(By.xpath(" (//select)[6]"));
		Select sel =new Select(dropdown6);
		
		boolean ret = sel.isMultiple();
		System.out.println("Is it Multiple dropdown : "+ret);
		
		if(ret==true) {
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		System.out.println("Size of dropdown:"+size);
		for(WebElement i : options) {
			System.out.println(i.getText());}}
		
		sel.selectByValue("1");;
		Thread.sleep(2000);
		
		sel.selectByIndex(4);
		Thread.sleep(2000);
		
		sel.selectByVisibleText("UFT/QTP");
		Thread.sleep(5000);
		//Taking Screenshot of multiple dropdown
		TakesScreenshot shot =(TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\Snapshots\\dropdown.png");	
		FileUtils.copyFile(source, dest);
		driver.close();
	
	}
}
