package com.AbsoluteandDynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement company = driver.findElement(By.xpath("//table/tbody/tr[5]/td"));
		System.out.println(company.getText());
		WebElement stock = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]"));
		System.out.println(stock.getText());
		driver.close();
	}
}
