package com.window_handling;
//window handling using kohls url
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling { 
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/");
		
		Actions a = new Actions(driver);
		WebElement category = driver.findElement(By.xpath("(//span[@class='middle-menu-title'])[1]"));
		category.click();
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("(//a[@class='navigation-item-link'])[2]"));
		a.contextClick(women).build().perform();//Right click
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("(//a[@class='navigation-item-link'])[5]"));
		a.contextClick(men).build().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement shoes = driver.findElement(By.xpath("(//a[@class='navigation-item-link'])[7]"));
		a.contextClick(shoes).build().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement beauty = driver.findElement(By.xpath("(//a[@class='navigation-item-link'])[14]"));
		a.contextClick(beauty).build().perform();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String parentID = driver.getWindowHandle();//parentID
		System.out.println("Parent ID :"+parentID);
		Thread.sleep(3000);
		
		int size = driver.getWindowHandles().size(); //size
		System.out.println("Size :"+size);
		Thread.sleep(3000);
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String i : allwindow) {
			String title = driver.switchTo().window(i).getTitle();
			System.out.println("Title :"+title);
			Thread.sleep(3000);}
		for(String closewindow : allwindow) {
			if(!closewindow.equals(parentID)) {
				driver.switchTo().window(closewindow).close();}
		}
	}

}
