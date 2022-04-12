package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_selected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement drop = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(drop);
		boolean mul = s.isMultiple();
		System.out.println(mul);
		List<WebElement> options = s.getOptions();
		System.out.println("Size: "+options.size());
		for(WebElement i:options) {
			System.out.println("Elements are: "+i.getText());}
		System.out.println("------------------------------------------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First Selected options:"+firstSelectedOption.getText());
		System.out.println("-------------------------------------------------");
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement a : options) {
			System.out.println("All selected options:"+a.getText());
		}
	}
}
