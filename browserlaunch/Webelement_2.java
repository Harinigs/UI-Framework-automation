package com.browserlaunch;
//Salesforce launch page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gstexas2021@student.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Keepgoing@7");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebElement signup = driver.findElement(By.id("footer"));
		String text = signup.getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	}
}
