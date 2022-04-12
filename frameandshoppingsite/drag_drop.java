package com.frameandshoppingsite;
//Drag and drop using wait concept
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag_drop {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://dhtmlgoodies.com/scripts/arrange-table-rows/demo.html");
    driver.manage().window().maximize();
    Actions a= new Actions(driver);
    
    WebElement drag = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[1]"));
    WebDriverWait w = new WebDriverWait(driver,50);
    w.until(ExpectedConditions.visibilityOf(drag));
    
    WebElement drop = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[7]"));
    WebDriverWait w1 = new WebDriverWait(driver,50);
    w1.until(ExpectedConditions.visibilityOf(drop));
    
    WebElement drag1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[3]"));
    WebDriverWait w2 = new WebDriverWait(driver,50);
    w2.until(ExpectedConditions.visibilityOf(drag1));
    
    WebElement drop1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[10]"));
    WebDriverWait w3 = new WebDriverWait(driver,50);
    w3.until(ExpectedConditions.visibilityOf(drop1));
    
    a.dragAndDrop(drag, drop).build().perform();
    Thread.sleep(2000);
    a.dragAndDrop(drag1, drop1).build().perform();
    Thread.sleep(3000);
    
    TakesScreenshot ts =(TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File des = new File ("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\Drag and Drop_wait.png");
    FileUtils.copyFile(src, des);
    driver.close();
	}
}
