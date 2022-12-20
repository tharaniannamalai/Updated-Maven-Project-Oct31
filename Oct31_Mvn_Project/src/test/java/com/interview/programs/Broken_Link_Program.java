package com.interview.programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link_Program {

public static WebDriver driver = WebDriverManager.chromedriver().create();

public static void Checking_All_Links() throws MalformedURLException, IOException
{
	driver.get("http://www.deadlinkcity.com/");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int size = links.size();
	System.out.println("Count of all links: " +size);
	
	for (WebElement all_Links : links) {
		
		String link = all_Links.getAttribute("href");
		
		if(link.isEmpty() || link == null)
		{
			continue;
		}
			
		URL u = new URL(link);
		URLConnection uc = u.openConnection();
		HttpURLConnection http = (HttpURLConnection)uc; 
		http.connect();
		
		int respcode = http.getResponseCode();
		String respmsg = http.getResponseMessage();
		
		if(respcode>=400)
		{
			System.out.println("Link: "+link+"   Code: " +respcode+" msg: " +respmsg);
		}
	}
 }

	
public static void main(String[] args) throws MalformedURLException, IOException {
	
	Checking_All_Links();
}

}
