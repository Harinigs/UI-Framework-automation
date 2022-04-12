package com.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_acc {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(3000);
		WebElement f_name = driver.findElement(By.xpath("//input[@data-type='text']"));
		Thread.sleep(3000);
		f_name.sendKeys("Harini");
		WebElement l_name = driver.findElement(By.name("lastname"));
		Thread.sleep(3000);
		l_name.sendKeys("Ganesh");
		WebElement email = driver.findElement(By.name("reg_email__"));
		Thread.sleep(3000);
		email.sendKeys("gsh@gmail.com");
		WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(3000);
		reenter.sendKeys("gsh@gmail.com");
		WebElement password = driver.findElement(By.id("password_step_input"));
		Thread.sleep(3000);
		password.sendKeys("123456!");
		WebElement month = driver.findElement(By.id("month"));
		Select s= new Select(month);
		Thread.sleep(3000);
		s.selectByValue("7");
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		Thread.sleep(3000);
		s1.selectByValue("19");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("1998");
		WebElement gender = driver.findElement(By.name("sex"));
		Thread.sleep(3000);
		gender.click();
		WebElement signup = driver.findElement(By.name("websubmit"));
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\Facebook.png");
		FileUtils.copyFile(src, dest);
		signup.click();
		Thread.sleep(3000);
		driver.close();
	}
}
