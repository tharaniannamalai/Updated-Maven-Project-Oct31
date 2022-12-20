package com.interview.programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Image_Program {

	public static WebDriver driver = WebDriverManager.chromedriver().create();
	
	 public static void Checking_All_Images() throws MalformedURLException, IOException
	 {
		 driver.get("https://the-internet.herokuapp.com/broken_images");
		 
		 List<WebElement> images = driver.findElements(By.tagName("img"));
		 
		 int size = images.size();
		 System.out.println("Image Count: " +size);
		 
		 for (WebElement image : images) {
			
			 String imageLink = image.getAttribute("src");
			 
			 if(imageLink.isEmpty() || imageLink == null )
			 {
				 continue;
			 }
			 
			 URL u = new URL(imageLink);
			 URLConnection uc = u.openConnection();
			 HttpURLConnection http = (HttpURLConnection)uc;
			 http.connect();
			 
			 int respcode = http.getResponseCode();
			 String respmsg = http.getResponseMessage();
			 
			 if(respcode>=400)
				{
					System.out.println("Link: "+imageLink+"   Code: " +respcode+" msg: " +respmsg);
				} 
		}
	 }
	 
	 public static void main(String[] args) throws MalformedURLException, IOException {
		
		 Checking_All_Images();
	}
}
