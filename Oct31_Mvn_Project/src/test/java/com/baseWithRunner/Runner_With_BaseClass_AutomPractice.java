package com.baseWithRunner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utilityFiles.Utility_Files;

public class Runner_With_BaseClass_AutomPractice extends Utility_Files {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(900));
		
		//Sign In 
		WebElement sign_In = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a")); //SignIn Button
		click_On_Element(sign_In);
		
		//UserName,Password -> Login 
		WebElement email_Address = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='email']")); //Email Address
		send_Keys(email_Address,"emailautopractice@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@id='passwd']")); //Password
		send_Keys(password, "abcd1234");
		
		WebElement sign_In_Btn = driver.findElement(By.xpath("//p[@class='submit']//child::button[@id='SubmitLogin']"));
		click_On_Element(sign_In_Btn);
		
		//--------------------------Dresses-> Casual Dress------------------------------------------------------------------------
		
		WebElement dresses1 = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']")); //Dresses
		
		Actions a = new Actions(driver);
		
		a.moveToElement(dresses1).build().perform();
		
		WebElement casual_Dresses = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Casual Dresses']")); //Casual Dress
		a.moveToElement(casual_Dresses).build().perform();
		a.click().build().perform();
		
		//Add to cart Page
		WebElement cquick_Vw = driver.findElement(By.xpath("//div[@class='product-container']//child::i[@class='icon-eye-open']")); //QuickView
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", cquick_Vw);
		//Thread.sleep(3000);
		js.executeScript("arguments[0].click()",cquick_Vw);
		
		Thread.sleep(3000);
		
		WebElement cquantity = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//following::i[@class='icon-plus']")); //Casual Dress Quantity
		click_On_Element(cquantity);
		click_On_Element(cquantity);
		
		WebElement casSize = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='group_1']")); // Casual Dress Size
		
		Select casDressSize = new Select(casSize);	
		casDressSize.selectByVisibleText("M");
		
		WebElement addToCart = driver.findElement(By.xpath("//p[@id='add_to_cart']//child::button[@name='Submit']")); //Add to cart Button
		click_On_Element(addToCart);
		
		WebElement chckout1 = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		click_On_Element(chckout1);
		
		WebElement chckout2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		click_On_Element(chckout2);
		
		WebElement chckout3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@type='submit']"));
		click_On_Element(chckout3);
		
		WebElement tsBtn1 = driver.findElement(By.xpath("//div[@class='order_carrier_content box']//following::input[@id='cgv']")); // Terms and service
		click_On_Element(tsBtn1);
		
		WebElement chckout4 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		click_On_Element(chckout4);
		
		WebElement bcPayment1 = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']")); //Pay By Check
		click_On_Element(bcPayment1);
		
		WebElement conformOrd1 = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']")); //Confirm the order
		click_On_Element(conformOrd1);

		//Scrolling Down the Page
		WebElement cloctboxOrder = driver.findElement(By.xpath("//div[@id='columns']//following::div[@id='center_column']")); 
		js.executeScript("arguments[0].scrollIntoView()", cloctboxOrder);
		
		//Screenshot of Casual Dress Order Confirmation
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File f1 = ts1.getScreenshotAs(OutputType.FILE);
		File desc1 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseCasualDressOrderConfirm.png");
		FileUtils.copyFile(f1, desc1);
		
		//Back to Order - History 
		WebElement ordHistory1 = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		click_On_Element(ordHistory1);
		
		//WebTable - Print Order Id ALone
		WebElement orderId1 = driver.findElement(By.xpath("//tr[@class='first_item ']//child::td[1]"));
		System.out.println("Latest Shopping - Casual Dress - OrderId:  " + get_Text(orderId1));
		//System.out.println("Latest Shopping - Casual Dress - OrderId:  " + orderId1.getText());
		
		//Scrolling down the order history page
		WebElement ordReference1 = driver.findElement(By.xpath("//table[@id='order-list']//following::th[text()='Order reference']"));
		js.executeScript("arguments[0].scrollIntoView()", ordReference1);
		
		//ScreenShot of Casual Dress Shopping History
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File f2 = ts2.getScreenshotAs(OutputType.FILE);
		File desc2 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseCasualDressOrderHistory.png");
		FileUtils.copyFile(f2, desc2);
		
		//-------------------------------Dresses-> Evening Dresses---------------------------------------------------------------------------------------------
		
		
		WebElement dresses2 = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']")); //Dresses
		
		a.moveToElement(dresses2).build().perform();
		
		WebElement evening_Dresses = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Evening Dresses']")); //Casual Dress
		a.moveToElement(evening_Dresses).build().perform();
		a.click().build().perform();
		
		//Click on Quick View
		WebElement equick_Vw = driver.findElement(By.xpath("//a[@class='quick-view-mobile']//child::i[@class='icon-eye-open']"));
		
		js.executeScript("arguments[0].scrollIntoView()", equick_Vw);
		//Thread.sleep(3000);
		js.executeScript("arguments[0].click()",equick_Vw);
		
		Thread.sleep(3000);
		
		//Change Quantity,Size and Colour
		WebElement equantity = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//following::i[@class='icon-plus']")); //Evening Dress Quantity
		click_On_Element(equantity);
		click_On_Element(equantity);
		click_On_Element(equantity);
		
		
		WebElement evenDressSize = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='group_1']")); //Evening Dress Size
		
		Select sevenDressSize = new Select(evenDressSize);
		sevenDressSize.selectByVisibleText("L");
		
		WebElement evenDressColour = driver.findElement(By.xpath("//li//child::a[@title='Pink']")); // Evening Dress Colour
		click_On_Element(evenDressColour);
		
		WebElement addToCart2 = driver.findElement(By.xpath("//p[@id='add_to_cart']//child::button[@type='submit']")); // Add to cart button
		click_On_Element(addToCart2);
		
		WebElement echckout1 = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']")); // 1st Proceed to checkout 
		click_On_Element(echckout1);
		
		WebElement echckout2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']")); // 2nd Proceed to checkout
		click_On_Element(echckout2);
		
		WebElement echckout3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@type='submit']")); //3rd Proceed to checkout
		click_On_Element(echckout3);
		
		WebElement tsBtn2 = driver.findElement(By.xpath("//div[@class='order_carrier_content box']//following::input[@id='cgv']")); // Terms and service
		click_On_Element(tsBtn2);
		
		WebElement echckout4 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		click_On_Element(echckout4);
		
		WebElement bwPayment = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='bankwire']")); // Payment by bank wire
		click_On_Element(bwPayment);
		
		WebElement conformOrd2 = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']")); //Confirm the order
		click_On_Element(conformOrd2);
		
		//Scrolling Down the Page
		WebElement eloctboxOrder = driver.findElement(By.xpath("//div[@class='row']//following::div[@id='center_column']")); 
		js.executeScript("arguments[0].scrollIntoView()", eloctboxOrder);
		
		Thread.sleep(2000);

		//Screenshot of Evening Dress Order Confirmation
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File f3 = ts3.getScreenshotAs(OutputType.FILE);
		File desc3 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseEvenDressOrderConfirm.png");
		FileUtils.copyFile(f3, desc3);
		
		//Back to Order - History 
		WebElement ordHistory2 = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		click_On_Element(ordHistory2);

		//WebTable - Print Order Id ALone
		WebElement orderId2 = driver.findElement(By.xpath("//tr[@class='first_item ']//child::td[1]"));
		System.out.println("Latest Shopping - Evening Dress - OrderId:  " + get_Text(orderId2));
		//System.out.println("Latest Shopping - Evening Dress - OrderId:  " + orderId2.getText());

		
		//Scrolling down the order history page
		WebElement ordReference2 = driver.findElement(By.xpath("//table[@id='order-list']//following::th[text()='Order reference']"));
		js.executeScript("arguments[0].scrollIntoView()", ordReference2);
		
		//ScreenShot of Evening Dress Shopping History
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File f4 = ts4.getScreenshotAs(OutputType.FILE);
		File desc4 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseEvenDressOrderHistory.png");
		FileUtils.copyFile(f4, desc4);
		
		//----------------------------Dresses -> Summer Dresses------------------------------------------------------------------------------------------------
		
		
		WebElement dresses3 = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']")); //Dresses
		
		a.moveToElement(dresses3).build().perform();
		
		WebElement summer_Dresses = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Summer Dresses']")); //Summer Dress
		a.moveToElement(summer_Dresses).build().perform();
		a.click().build().perform();
		
		//Click on Quick View
		//WebElement squick_Vw = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']//following::i[@class='icon-eye-open']")); // Summer Dress 3rd one Quick view
		WebElement squick_Vw = driver.findElement(By.xpath("//a[@class='quick-view-mobile']//child::i[@class='icon-eye-open']")); // Summer Dress Quick view
		
		
		js.executeScript("arguments[0].scrollIntoView()", squick_Vw);
		//Thread.sleep(3000);
		js.executeScript("arguments[0].click()",squick_Vw);
		
		Thread.sleep(3000);
		
		WebElement squantity = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//following::i[@class='icon-plus']")); //Summer Dress Quantity
		click_On_Element(squantity);
		
		WebElement sumrDressSize = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='group_1']")); //Summer Dress Size
		
		Select summerDressSize = new Select(sumrDressSize );	
		summerDressSize.selectByVisibleText("M");
		
		WebElement sumrDressColour = driver.findElement(By.xpath("//li//child::a[@title='Yellow']")); // Summer Dress Colour
		click_On_Element(sumrDressColour);
		
		WebElement addToCart3 = driver.findElement(By.xpath("//p[@id='add_to_cart']//child::button[@type='submit']")); // Add to cart button
		click_On_Element(addToCart3);
		
		WebElement schckout1 = driver.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']")); //1st Proceed to checkout
		click_On_Element(schckout1);
		
		WebElement schckout2 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']")); //2nd Proceed to checkout
		click_On_Element(schckout2);
		
		WebElement schckout3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@type='submit']")); //3rd Proceed to checkout
		click_On_Element(schckout3);
		
		WebElement tsBtn3 = driver.findElement(By.xpath("//div[@class='order_carrier_content box']//following::input[@id='cgv']")); // Terms and service
		click_On_Element(tsBtn3);
		
		WebElement schckout4 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		click_On_Element(schckout4);
		
		WebElement bcPayment2 = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']")); //Pay By Check
		click_On_Element(bcPayment2);
		
		WebElement conformOrd3 = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']")); //Confirm the order
		click_On_Element(conformOrd3);
		
		//Scrolling Down the Page
		WebElement sloctboxOrder = driver.findElement(By.xpath("//div[@id='columns']//following::div[@id='center_column']")); 
		js.executeScript("arguments[0].scrollIntoView()", sloctboxOrder);
		
		Thread.sleep(2000);
		
		//Screenshot of Summer Dress Order Confirmation
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File f5 = ts5.getScreenshotAs(OutputType.FILE);
		File desc5 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseSummerDressOrderConfirm.png");
		FileUtils.copyFile(f5, desc5);

		//Back to Order - History 
		WebElement ordHistory3 = driver.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));
		click_On_Element(ordHistory3);
		
		//WebTable - Print Order Id ALone
		WebElement orderId3 = driver.findElement(By.xpath("//tr[@class='first_item ']//child::td[1]"));
		System.out.println("Latest Shopping - Summer Dress - OrderId:  " + get_Text(orderId3));
		
		//Scrolling down the order history page
		WebElement ordReference3 = driver.findElement(By.xpath("//table[@id='order-list']//following::th[text()='Order reference']"));
		js.executeScript("arguments[0].scrollIntoView()", ordReference3);
		
		//ScreenShot of Summer Dress Shopping History
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File f6 = ts6.getScreenshotAs(OutputType.FILE);
		File desc6 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\DynBaseSummerDressOrderHistory.png");
		FileUtils.copyFile(f6, desc6);
		
		Thread.sleep(2000);
		
		//Logout
		WebElement logOut = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a[@class='logout']"));
		click_On_Element(logOut);
	}

}
