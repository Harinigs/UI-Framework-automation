package com.frameandshoppingsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_concept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Frame = driver.findElement(By.xpath("html/frameset/frameset/frame[2]"));
		Frame.sendKeys("Harini GS");
		driver.switchTo().frame(Frame);
		driver.switchTo().frame(0);//there is no index or number so taking 0
		WebElement R_button = driver.findElement(By.xpath("//div[@id='i8']/div[3]/div"));
		WebDriverWait w =new WebDriverWait(driver,50);
		w.until(ExpectedConditions.visibilityOf(R_button));
		R_button.click();
		
		WebElement wd = driver.findElement(By.xpath("//div[@id='i25']/div[2]"));
		WebDriverWait w1 = new WebDriverWait(driver,50);
		w1.until(ExpectedConditions.visibilityOf(wd));
		wd.click();
		
		
		
//		WebElement dropdown = driver.findElement(By.xpath("(//div[@role='listitem'])[6]/div/div/div[2]/div/div/div[2]"));
//		WebDriverWait w2 = new WebDriverWait(driver,30);
//		w2.until(ExpectedConditions.visibilityOf(dropdown));
//		dropdown.click();
		
		//WebElement button = driver.findElement(By.xpath("(//div[@role='option']/span)[2]]"));
		WebDriverWait w3 = new WebDriverWait(driver,20);
		WebElement button = w3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='option']/span)[2]")));
		button.click();
		Thread.sleep(3000);
		driver.close();
	}

}
