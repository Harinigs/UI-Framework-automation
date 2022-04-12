package com.Duplicate_value;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate_element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Testleaf/testleaf.html");
		
		WebElement create = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(create);
		boolean dropdown = s.isMultiple();
		System.out.println(dropdown);
		List<WebElement> options = s.getOptions();
		System.out.println("No. of elements in the dropdown: " +options.size());
		Set<String> set = new HashSet();
		for(WebElement element : options) {
			set.equals(element);
			System.out.println(element.getText());
		}
		System.out.println("After removing duplicates: "+set.size());
	}

}
