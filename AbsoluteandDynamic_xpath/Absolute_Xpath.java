package com.AbsoluteandDynamic_xpath;
//Absolute Xpath in Test leaf
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement java = driver.findElement(By.xpath("(/html/body/div/div/div[3]/section/div/div/input)[1]"));//Absolute Xpath
		java.click();
		
		WebElement c = driver.findElement(By.xpath("(/html/body/div/div/div[3]/section/div/div/input)[4]"));
		c.click();
		
		WebElement selenium = driver.findElement(By.xpath("(//div[@id='wrapper']/div/div[3]/section/div/div)[6]/input"));//Hybrid Xpath
		selenium.click();
		
		WebElement am = driver.findElement(By.xpath("(//div[@id='wrapper']/div/div[3]/section/div/div)[8]/input"));
	    am.click();
	    
	    WebElement option = driver.findElement(By.xpath("(//div[@id='wrapper']/div/div[3]/section/div/div)[10]/input"));
	    option.click();
	}	
}
