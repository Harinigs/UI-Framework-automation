package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.kohls.com/");//fully loads the page
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : "+currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println("Pagesource : " +pageSource);
		
		driver.navigate().to("https://www.hotstar.com/us");//just navigate and return
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Thread.sleep(3000);//disturbing the flow of a program
		driver.close();
		
	}

}