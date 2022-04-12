package com.Xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_program {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("gstexas2021@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@onkeypress='checkCaps(event)'])[1]"));
		password.sendKeys("1254!@");
		WebElement login = driver.findElement(By.xpath("//input[contains(@class,'button r4 wide primary')]"));
		login.click();
		Thread.sleep(5000);
		TakesScreenshot shot =(TakesScreenshot) driver;//driver object to TakeScreenshot
		File s =shot.getScreenshotAs(OutputType.FILE);
		File d =new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\login error.png");
		FileUtils.copyFile(s, d);
		driver.close();
		
		
		
	}

}
