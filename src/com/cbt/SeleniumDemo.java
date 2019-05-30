package com.cbt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/darin/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techtorialacademy.com/");
	WebElement name=driver.findElement(By.id("//h1[@itemprop='name']"));
	System.out.println(name.getText());
		
	}

}
