package com.incognito;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.jobs/en/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		TakesScreenshot shot = (TakesScreenshot) driver; 
		File src =shot.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\Incognito.png");
		FileUtils.copyFile(src, des);
		driver.close();
	}
}
