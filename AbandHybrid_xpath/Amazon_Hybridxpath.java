package com.AbandHybrid_xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Hybridxpath {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement tag_line = driver.findElement(By.xpath("//div[@id='pageContent']/div[2]/div/span"));
		System.out.println(tag_line.getText());
		WebElement donate = driver.findElement(By.xpath("//div[@id='pageContent']/div[2]/div/a"));
		donate.click();
		WebElement child_relief = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div/div[5]/div[2]/div/div/a/img"));
		child_relief.click();
		Thread.sleep(3000);
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\Amazon-funds-Ukraine.png");
		FileUtils.copyFile(src, des);
		WebElement msg = driver.findElement(By.xpath("(//div[@id='campaignContentDiv']/p)[1]"));
		System.out.println("***********Message by Amazon for Campaign************");
		System.out.println(msg.getText());
		Thread.sleep(2000);
		WebElement msg2 = driver.findElement(By.xpath("(//div[@id='campaignContentDiv']/p)[2]"));
		System.out.println(msg2.getText());
	}
}
