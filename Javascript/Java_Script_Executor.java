package com.Javascript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;//interface - narrowing
			js.executeScript("window.scroll(0,5000)", "");//scroll up & down
			Thread.sleep(3000);
			//js.executeScript("window.scroll(0,-5000)", "");
			//Thread.sleep(3000);
			WebElement amazon_device = driver.findElement(By.xpath("//a[text( )='Amazon Devices']"));
			js.executeScript("arguments[0].scrollIntoView(true)", amazon_device);
			js.executeScript("arguments[0].click()", amazon_device);
			driver.close();
		}
	}


