package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_access {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://passport.amazon.jobs/");
		driver.manage().window().maximize();
		//username
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("zxcv@gmail.com");
		//password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abcd1!2!3!");
		//print the text given
		WebElement text = driver.findElement(By.id("continue-with-social-header"));
		String text2 = text.getText();
		System.out.println(text2);
		//try to login with amazon account
		WebElement signin = driver.findElement(By.id("login-with-amazon-button"));
		signin.click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
