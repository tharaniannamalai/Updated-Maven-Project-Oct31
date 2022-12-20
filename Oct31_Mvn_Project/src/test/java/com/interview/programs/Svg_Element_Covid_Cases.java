package com.interview.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilityFiles.Utility_Files;

public class Svg_Element_Covid_Cases extends Utility_Files{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	  driver = browser_Config("Chrome");
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.co.in/search?q=covid+cases+&sxsrf=ALiCzsaHLZm0xy8NGyR33Kda4Xwr8nEtyw%3A1669958020162&ei=hImJY7KkCcupgQaH0InADQ&ved=0ahUKEwiy9tK0ltr7AhXLVMAKHQdoAtgQ4dUDCA8&uact=5&oq=covid+cases+&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIECCMQJzIKCAAQgAQQhwIQFDIFCAAQgAQyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgoIABBHENYEELADSgQIQRgASgQIRhgAUJUDWPcIYKIMaAFwAXgAgAGgA4gBvgqSAQcyLTQuMC4xmAEAoAEByAEIwAEB&sclient=gws-wiz-serp");
	  
	  List<WebElement> all_Data = driver.findElements(By.xpath("//*[name()='svg' and @class='uch-psvg']/*[name()='g']/*[name()='rect']"));
	  
	  for (WebElement data : all_Data) {
		
		  actions(data, "movetoelement");
		  
		  WebElement data_Box = driver.findElement(By.xpath("//div[@class='c274Wb']"));
		  
		  String data_Box_Text = data_Box.getText();
		  
		  if(data_Box_Text.contains("17 Jan 2022"))
		  {
			  
			 System.out.println("Data: " + data_Box_Text );
			 
			 WebElement new_Cases = driver.findElement(By.xpath("//span[@jsname='dtM3A']"));
			 
			 String new_Cases_Count = new_Cases.getText();
			 
			 System.out.println("New Cases Count: " +new_Cases_Count);
			 
			 break;
		  }
		  
	  }
	  
	}

}
