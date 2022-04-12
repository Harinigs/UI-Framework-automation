package com.AbsoluteandDynamic_xpath;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Absolute_xpath_Idroosbro {

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();

			
			WebElement flipkart = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
			flipkart.click();;

			WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
			mobile.click();;

			WebElement iphone = driver.findElement(By.xpath("//input[@type='text']"));
			iphone.sendKeys("iphone 12");

			
			WebElement search_button = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			search_button.click();

			
			WebElement img_clk = driver.findElement(
						By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div/div/div"));

			WebDriverWait wait =new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(img_clk));
			img_clk.click();;

		}

	}



