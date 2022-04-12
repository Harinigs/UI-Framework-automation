package com.Table_form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("**********Printing all the data************");
		for(WebElement data : all_data) {
			System.out.println(data.getText());
		}
		System.out.println("************************Header************************");
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for(WebElement h : header) {
			System.out.println(h.getText());
		}
		System.out.println("**********************Specific Row*********************");
		List<WebElement> specific_row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for(WebElement row :specific_row) {
			System.out.println(row.getText());
		}
		System.out.println("*******************Specific Column***************************");
		List<WebElement> specific_column = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for(WebElement column : specific_column) {
			System.out.println(column.getText());
		}
		System.out.println("************************Row size*****************************");
		List<WebElement> row_size = driver.findElements(By.tagName("tr"));
		int r_size = row_size.size();
		System.out.println("Row size :" +r_size);
		System.out.println("*****************Column Size************************");
		List<WebElement> col_size = driver.findElements(By.tagName("th"));
		int c_size = col_size.size();
		System.out.println("Column size :"+c_size);
		System.out.println("************Following term***************");
		WebElement d = driver.findElement(By.xpath("//td[normalize-space( )='Actions class']//following::td[6]"));
		System.out.println("Following data:" +d.getText());
		driver.close();
	}
}
