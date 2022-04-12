package com.frameandshoppingsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/index.html?page=dragDrop");
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		WebElement Drag_drop = driver.findElement(By.xpath("//a[text( )='Drag and drop']"));
		a.click(Drag_drop).build().perform();
		Thread.sleep(3000);
		WebElement Demo = driver.findElement(By.xpath("(//a[text( )='Demo 1'])"));
		a.click(Demo).build().perform();
		WebElement drag = driver.findElement(By.xpath("(//div[text( )='Washington'])[2]"));
		Thread.sleep(7000);
		WebElement drop = driver.findElement(By.xpath("(//div[text( )='United States'])"));
		Thread.sleep(7000);
		a.dragAndDrop(drag, drop).build().perform();
		a.clickAndHold(drag).moveToElement(drop).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
