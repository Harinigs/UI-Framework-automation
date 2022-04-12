package com.alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement simple_alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple_alert.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		TakesScreenshot shot =(TakesScreenshot)driver;
		File s =shot.getScreenshotAs(OutputType.FILE);
		File d =new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\simple alert.png");
		FileUtils.copyFile(s, d);
		WebElement confirm = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		confirm.click();
		Thread.sleep(2000);
		WebElement confirm2 = driver.findElement(By.xpath("//button[text( )='click the button to display a confirm box ']"));
		confirm2.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(3000);
		TakesScreenshot shot1 =(TakesScreenshot)driver;
		File s1 =shot1.getScreenshotAs(OutputType.FILE);
		File d1 =new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\confirm alert.png");
		FileUtils.copyFile(s1, d1);
		WebElement c_txt = driver.findElement(By.xpath("//p[text( )='You Pressed Cancel']"));
		System.out.println("Message:"+c_txt.getText());
		Thread.sleep(2000);
		WebElement prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		prompt.click();
		Thread.sleep(2000);
		WebElement prompt_2 = driver.findElement(By.xpath("//button[text( )='click the button to demonstrate the prompt box ']"));
		prompt_2.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("HARINI GANESH");
		alert3.accept();
		Thread.sleep(2000);
		TakesScreenshot shot2 =(TakesScreenshot)driver;
		File s2 =shot2.getScreenshotAs(OutputType.FILE);
		File d2 =new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\prompt alert.png");
		FileUtils.copyFile(s2, d2);
		WebElement msg = driver.findElement(By.id("demo1"));
		System.out.println("Prompt message :"+msg.getText());
		Thread.sleep(2000);
		driver.close();
		
		
	
	}

}
