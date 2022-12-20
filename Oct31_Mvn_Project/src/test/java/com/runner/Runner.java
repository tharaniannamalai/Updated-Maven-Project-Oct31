package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilityFiles.Utility_Files;

public class Runner extends Utility_Files{

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement email1 = driver.findElement(By.xpath("//input[@id='username']"));
		send_Keys(email1,"TharaniA");
		
		WebElement password1 = driver.findElement(By.xpath("//input[@id='password']"));
		send_Keys(password1,"Abc1234");
		
		WebElement login1 = driver.findElement(By.xpath("//input[@id='login']"));
		click_On_Element(login1);
	}
	
}
