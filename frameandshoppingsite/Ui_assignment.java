package com.frameandshoppingsite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ui_assignment {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frame3 =driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		WebElement txt = driver.findElement(By.name("mytext3"));
		txt.sendKeys("Harini GS");
		driver.switchTo().frame(0);
		WebElement human = driver.findElement(By.xpath("//div[@id='i8']/div[3]/div"));
		human.click();
		WebElement automation = driver.findElement(By.xpath("//div[@id='i25']/div[2]"));
		automation.click();
		WebElement choose = driver.findElement(By.xpath("(//div[@role='listbox']/div/div/div)[1]"));
		choose.click();
		WebElement option1 = driver.findElement(By.xpath("//div[@role='listbox']/div[2]/div[3]"));
		option1.click();
		Thread.sleep(3000);
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\UI frame.png");
		FileUtils.copyFile(src, des);
		WebElement next = driver.findElement(By.xpath("(//div[@role='button'])[2]/span/span"));
		next.click();
		WebElement msg = driver.findElement(By.xpath("(//div[@role='listitem'])[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(msg));
		msg.sendKeys("One life");
		WebElement textarea = driver.findElement(By.xpath("(//div[@role='listitem'])[3]/div/div/div[2]/div/div[1]/div[2]/textarea"));
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(textarea));
		textarea.sendKeys("Live peacefully, Let others live peacefully");
		Thread.sleep(3000);
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srce = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\UI frame 2.png");
		FileUtils.copyFile(srce, dest);
		WebElement submit = driver.findElement(By.xpath("(//div[@role='button'])[2]/span/span"));
		submit.click();
		Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sr = ss.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\UI frame 3.png");
		FileUtils.copyFile(sr, d);
		
		
	}

}
