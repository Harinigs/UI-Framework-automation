package com.DragandDrop;
//drag and drop using constructor concept
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
public class DragandDrop {
	
	private static void draganddrop(WebElement animal, WebElement dropbox, WebDriver d) {//method
		Actions a = new Actions(d);
		a.dragAndDrop(animal, dropbox).build().perform();}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		WebElement dog = driver.findElement(By.id("box2"));
		WebElement dropbox = driver.findElement(By.id("dropBox"));
		WebElement cat = driver.findElement(By.id("box1"));//source
		WebElement dropbox1 = driver.findElement(By.id("dropBox"));//dest
		draganddrop(dog,dropbox,driver);
		draganddrop(cat,dropbox1,driver);
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\DragandDrop.png");
		FileUtils.copyFile(src, des);
		driver.close();
	}

}
