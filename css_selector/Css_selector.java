package com.css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input#email"));//using symbol
		email.sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		email.clear();
		WebElement email1 = driver.findElement(By.cssSelector("input.inputtext"));
		email1.sendKeys("gsh@gmail.com");
		Thread.sleep(3000);
		email1.clear();
		Thread.sleep(3000);
		WebElement email2 = driver.findElement(By.cssSelector("input[name='email'][id='email']"));
		email2.sendKeys("jkl@gmail.com");
		Thread.sleep(3000);
		WebElement pwrd = driver.findElement(By.cssSelector("input[id='pass']"));//using attribute name
		pwrd.sendKeys("123456!!");
		Thread.sleep(3000);
		pwrd.clear();
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.cssSelector("[type$='rd']"));
		pass.sendKeys("Abcd**123");
		Thread.sleep(3000);
		pass.clear();
		Thread.sleep(3000);
		WebElement pass_1 = driver.findElement(By.cssSelector("[type*='password']"));
		pass_1.sendKeys("Abd@12");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.cssSelector("[type^='su']"));//using prefix
		submit.click();
	}

}
