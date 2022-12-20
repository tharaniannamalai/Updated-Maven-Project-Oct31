package com.utility_Files.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.restassured.RestAssured;

public class Utility_Files_Api {
	
	public static WebDriver driver; //--> null
	
	public static String value; // Cell Data Value
	
	public static Object[][] data; //read all data - dataprovider
	
	public static WebDriver browser_Config(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver(); 
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	//WebElement Methods
	public static void click_On_Element(WebElement element)
	{
		element.click();
	}
	
	public static void send_Keys(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static void clear_Element(WebElement element)
	{
		element.clear();
	}
	
	public static boolean element_Enabled(WebElement element)
	{
		boolean enabled = element.isEnabled();
		return enabled;
	}	
	
	public static boolean element_Displayed(WebElement element)
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public static boolean element_Selected(WebElement element)
	{
		boolean selected = element.isSelected();
		return selected;
	}
	public static String get_Text(WebElement element)
	{
		String text = element.getText();
		return text;
	}
	
	public static String get_Attribute(WebElement element, String attributeName)
	{
		String attribute_Value = element.getAttribute(attributeName);
		return attribute_Value;
	}
	
	public static String get_Css_Value(WebElement element, String cssAttributeName)
	{
		 String cssValue = element.getCssValue(cssAttributeName);
		 return cssValue;
	}
	
	public static Point get_Loaction(WebElement element)
	{
		Point location = element.getLocation();
		return location;
	}
	
	public static Dimension get_Size(WebElement element)
	{
		Dimension size = element.getSize();
		return size;
	}
	
	//Thread
	public static void sleep(long milliseconds) throws InterruptedException
	{
		Thread.sleep(milliseconds);
	}
	//Wait
	public static void implicit_Wait(String timeType, long timeAmount ) 
	{
		if(timeType.equalsIgnoreCase("seconds"))
		{
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeAmount));
		}
		
		else if(timeType.equalsIgnoreCase("minutes"))
		{
		  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(timeAmount));
		}
		
		else if(timeType.equalsIgnoreCase("hours"))
		{
		  driver.manage().timeouts().implicitlyWait(Duration.ofHours(timeAmount));
		}
		
		else if(timeType.equalsIgnoreCase("days"))
		{
		  driver.manage().timeouts().implicitlyWait(Duration.ofDays(timeAmount));
		}
		
		else if(timeType.equalsIgnoreCase("nanos"))
		{
		  driver.manage().timeouts().implicitlyWait(Duration.ofNanos(timeAmount));
		}
	}
	
	//Select Methods
	public static void select_By_Index(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void select_By_Value(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void select_By_Visibletext(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static List<WebElement> get_Options(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public static List<WebElement> get_All_Selected_Options(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	
	public static void get_First_Selected_Option(WebElement element)
	{
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
	}
	
	public static void deselect_By_Index(WebElement element, int index)
	{
		Select s = new Select(element);
		s.deselectByIndex(index);
	}
	
	public static void deselect_By_Value(WebElement element, String value)
	{
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	
	public static void deselect_By_Visibletext(WebElement element, String text)
	{
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselect_All(WebElement element)
	{
		Select s = new Select(element);
		s.deselectAll();
	}
	
	//WebDriver Methods
	
	public static void close()
	{
		driver.close();
	}
	
	public static void quit()
	{
		driver.quit();
	}
	
	public static void get_Url(String url)
	{
		driver.get(url);
	}
	
	public static String get_Title()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static String get_Current_Url()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String get_Page_Source()
	{
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	
	//Navigation Commands
	
	public static void navigate_To(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigate_Commands(String commands)
	{
		if(commands.equalsIgnoreCase("forward"))
		{
			driver.navigate().forward();
		}
		
		else if(commands.equalsIgnoreCase("refresh"))
		{
			driver.navigate().refresh();
		}
		
		else if(commands.equalsIgnoreCase("back"))
		{
			driver.navigate().back();
		}
	}
	
	//Window Commands
	public static void window_Commands(String window_Commands)
	{
		if(window_Commands.equalsIgnoreCase("minimize"))
		{
		driver.manage().window().minimize();
		}
		
		else if(window_Commands.equalsIgnoreCase("maximize"))
		{
			driver.manage().window().maximize();
		}
		
		else if(window_Commands.equalsIgnoreCase("fullscreen"))
		{
			driver.manage().window().fullscreen();
		}
	}
	
	//Window Handle
	public static String get_Window_Handle()
	{
		String windowHandleId = driver.getWindowHandle();
		return windowHandleId;
	}
	
	//Window Handles

	public static Set<String> get_Window_Handles()
	{
		Set<String> windowHandlesIds = driver.getWindowHandles();
		return windowHandlesIds;
	}
	
	//Takes Screenshot
	public static void takes_Screenshot(String picLocation) throws IOException
	{
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File f1 = ts1.getScreenshotAs(OutputType.FILE);
		File desc1 = new File(picLocation);
		FileUtils.copyFile(f1, desc1);
	}
	
	//Actions Methods
	public static void actions(WebElement element, String actionType)
	{
		Actions a = new Actions(driver);
		if(actionType.equalsIgnoreCase("movetoelement"))
		{
			a.moveToElement(element).build().perform(); 
		}
		
		else if(actionType.equalsIgnoreCase("click"))
		{
			a.click().build().perform(); 
		}
	}

	//Javascript Executor
	public static void javascript_Executor_Scroll_Or_Click(String jsType, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		if(jsType.equalsIgnoreCase("scroll"))
		{
			js.executeScript("arguments[0].scrollIntoView()", element);
		}
		
		else if(jsType.equalsIgnoreCase("click"))
		{
			js.executeScript("arguments[0].click()", element);
		}
	}
	
	public static void javascript_Executor_Send_Keys(WebElement element, String text)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value = text", element);
	}
	
	public static void javascript_Executor_Highlight_Element(WebElement element, String elementType, String attributeName, String attributeValue)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute(elementType, attributeName:attributeValue)", element);
	}
	
	// To read particular Cell data from Excel
	
	public static String read_Particular_Cell_Data(String filePath, int sheetIndex, int rowIndex,int cellIndex) throws IOException
	{
		File f = new File(filePath);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(sheetIndex);
		
		Row r = s.getRow(rowIndex);
		
		Cell c = r.getCell(cellIndex);
			
		CellType cType = c.getCellType();
			
			if(cType.equals(CellType.STRING))
			{
				value = c.getStringCellValue();
			}
			
			else if(cType.equals(CellType.NUMERIC))
			{
				double d = c.getNumericCellValue();
				
				int a = (int) d;
				
				value = String.valueOf(a);
			}
			
		wb.close();
		
		return value;
	}
	
	//Read All Data
	public static Object[][] read_All_Data(String filePath, int sheetIndex) throws IOException
	{
		File f = new File(filePath);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(sheetIndex);
		
		Row r = s.getRow(0);
		
		int lastcolumnNo = r.getLastCellNum();
		
		int lastrowNo = s.getLastRowNum();
		//int rowNo = s.getPhysicalNumberOfRows();
		
		data= new Object[lastrowNo][lastcolumnNo];
		
		for(int i=1; i<=lastrowNo; i++)
		{
			Row r1 = s.getRow(i);
			
			//int noOfCells = r.getPhysicalNumberOfCells();
			
			for(int j=0; j<lastcolumnNo; j++)
			{
				Cell c = r1.getCell(j);
				
				CellType cType = c.getCellType();
				
				if(cType.equals(CellType.STRING))
				{
		     		value = c.getStringCellValue();
		     		data[i-1][j] =value;
				}
				
				else if(cType.equals(CellType.NUMERIC))
				{
					double d = c.getNumericCellValue();
					
					int a = (int) d;
					
					value = String.valueOf(a);
					
					data[i-1][j] =value;
				}	
				
			}
		}
		
		wb.close();
		return data;
	}

	//Retrieve Response Body form API - Postman - Automatic 
	public static String retrieve_Response_Body(String uri, String parameter)
	{
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2"); // Connect with operator - get
		
		String response_Body = response.asPrettyString();
		
		return response_Body;
	}
	
	//Retrieve Response Code form API - Postman - Automatic
	public static int retrieve_Response_Code(String uri, String parameter, int expectedcode)
	{
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2");
		
		int response_Code = response.getStatusCode();
		
		Assert.assertEquals(expectedcode, response_Code);
		
		return response_Code;
	}
	
	//Retrieve Response Line form API - Postman - Automatic
	public static String retrieve_Response_Line(String uri, String parameter)
	{
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2");
		
		String response_Line = response.getStatusLine();
		
		return response_Line;
	}
	

	//Retrieve Response Session ID form API - Postman - Automatic
	public static String retrieve_Response_Session_Id(String uri, String parameter)
	{
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2");
		
		String response_Session_Id = response.getSessionId();
		
		return response_Session_Id;
	}
	
	//Retrieve Response Content Type form API - Postman - Automatic
	public static String retrieve_Response_Content_Type(String uri, String parameter)
	{
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2");
		
		String response_Content_Type = response.contentType();
	
		return response_Content_Type;
	}
	
	//Validate Payload - json - api
	public static String Validate_Payload(String jsonPath, String key, String expectedValue) throws IOException, ParseException
	{
		File f = new File(jsonPath);
		
		FileReader reader = new FileReader(f);
		
		JSONParser json = new JSONParser();
		
		Object parse = json.parse(reader);
		
		JSONObject jsonObj = (JSONObject)parse;
		
		Object Obj = jsonObj.get(key);
		
		String Value = Obj.toString();
		
		Assert.assertEquals(expectedValue, Value);
		
		return Value;
		
	}
}

