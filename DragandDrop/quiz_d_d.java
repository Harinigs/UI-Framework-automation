package com.DragandDrop;

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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class quiz_d_d {	
	
	private static void clickandhold(WebElement click,WebElement move,WebDriver d) {
		Actions a =new Actions(d);
		a.clickAndHold(click).moveToElement(move).build().perform();}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Actions a = new Actions(driver);
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
		WebElement London = driver.findElement(By.id("node3"));
		WebDriverWait w =new WebDriverWait(driver,50);
		w.until(ExpectedConditions.visibilityOf(London));
		
		WebElement drop = driver.findElement(By.xpath("(//ul[@style='height: 72px;'])[4]"));
		WebDriverWait w1 =new WebDriverWait(driver,50);
		w1.until(ExpectedConditions.visibilityOf(drop));
		clickandhold(London,drop,driver);
		
		WebElement washington = driver.findElement(By.id("node5"));//source
		WebDriverWait w2 =new WebDriverWait(driver,50);
		w2.until(ExpectedConditions.visibilityOf(washington));
		WebElement drop1 = driver.findElement(By.id("box4"));//dest
		WebDriverWait w3 =new WebDriverWait(driver,50);
		w3.until(ExpectedConditions.visibilityOf(drop1));
		clickandhold(washington,drop1,driver);
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\DragandDrop_try.png");
		FileUtils.copyFile(src, des);
		//driver.close();
	}
	

}


