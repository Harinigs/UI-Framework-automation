package com.frameandshoppingsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surya_bro_frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		WebElement name1 = driver.findElement(By.name("mytext1"));
		name1.sendKeys("Suresh");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		WebElement name2 = driver.findElement(By.name("mytext2"));
		name2.sendKeys("Ramesh");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		WebElement name3 = driver.findElement(By.name("mytext3"));
		name3.sendKeys("Bala Surya");
		driver.switchTo().frame(0);
		WebElement human = driver.findElement(By.xpath("//div[@id='i8']"));
		human.click();
		WebElement web_testing = driver.findElement(By.xpath("//div[@id='i25']"));
		web_testing.click();
		WebElement choose = driver.findElement(By.xpath("(//div[@role='listbox']/div/div/div)[1]"));
		choose.click();
		WebElement option = driver.findElement(By.xpath("//div[@role='listbox']/div[2]/div[3]"));
		option.click();
		Thread.sleep(3000);
	}

}
