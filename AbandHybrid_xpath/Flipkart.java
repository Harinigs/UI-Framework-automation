package com.AbandHybrid_xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		//driver.get("https://www.flipkart.com/search?q=iphone%2012&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		//WebElement iphone = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div/div[1]/div/img"));
		//iphone.click();
		driver.get("https://www.flipkart.com/");
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
	
		
		WebElement mobile = driver.findElement(By.xpath("(//div[@id='container']/div/div/div)[3]/div/div[3]/a/div/div/img"));
		mobile.click();
		
		WebElement inp = driver.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div[2]/form/div/div/input"));
		inp.sendKeys("iphone 12");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='container']/div/div/div/div[2]/div[2]/form/div/button")));
		search.click();
		Thread.sleep(3000);
		
		
		WebElement max = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div/div/div/img"));
		max.click();
		
	}
}

