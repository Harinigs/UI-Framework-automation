package com.frameandshoppingsite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping_site_automation {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement dress = driver.findElement(By.xpath("//a[text( )='Women']"));
		dress.click();
		Thread.sleep(3000);
		WebElement category = driver.findElement(By.xpath("(//span[@class='grower CLOSE'])[2]"));
		category.click();
		Thread.sleep(3000);
		WebElement eve_dress = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=10&controller=category'])[3]"));
		eve_dress.click();
		Thread.sleep(3000);
		WebElement quick_view = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[4]"));
		quick_view.click();
		Thread.sleep(3000);
		WebElement add_more = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		add_more.click();
		Thread.sleep(3000);
		WebElement size = driver.findElement(By.name("group_1"));
		Select s =new Select(size);
		s.selectByVisibleText("L");
		Thread.sleep(3000);
		WebElement colour = driver.findElement(By.name("Pink"));
		colour.click();
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.name("Submit"));
		add.click();
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		checkout.click();
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("harinigs98@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("123456");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		signin.click();
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.name("processAddress"));
		address.click();
		Thread.sleep(3000);
		WebElement check_box = driver.findElement(By.id("cgv"));
		check_box.click();
		Thread.sleep(3000);
		WebElement carrier = driver.findElement(By.name("processCarrier"));
		carrier.click();
		Thread.sleep(3000);
		WebElement pay = driver.findElement(By.xpath("(//a[@title='Pay by bank wire'])[1]"));
		pay.click();
		Thread.sleep(3000);
		WebElement final_step = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		final_step.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Harin\\eclipse-workspace\\Selenium\\Snapshots\\dress shopping.png");
		FileUtils.copyFile(src, des);
		driver.close();
		
	}

}
