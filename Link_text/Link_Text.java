package com.Link_text;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		WebElement full_link = driver.findElement(By.linkText("Verify am I broken?"));
		full_link.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\full-linktext.png");
		FileUtils.copyFile(src, des);
		driver.get("http://www.leafground.com/pages/Link.html");
		WebElement half_link = driver.findElement(By.partialLinkText("supposed to"));
		half_link.click();
		Thread.sleep(3000);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src1 = shot.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\partial-linktext.png");
		FileUtils.copyFile(src1, des1);
		driver.close();
		
	}
}
