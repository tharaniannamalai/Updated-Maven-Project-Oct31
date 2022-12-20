package com.baseWithRunnerSta;

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

public class Runner_With_BaseClass_Sta_AutomPractice extends Utility_Files {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = browser_Config("chrome");

		window_Commands("maximize");

		get_Url("http://automationpractice.com/index.php");

		implicit_Wait("seconds", 900);

		// Home Page
		WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']")); // SignIn Button in Home Page
		click_On_Element(signInBtn);

		// SignIn Page
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email']")); // Email
		send_Keys(emailId, "tharanimsse5@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']")); // Password
		send_Keys(pass, "Abcd1234");

		WebElement signIn = driver.findElement(By.xpath("//button[@id='SubmitLogin']")); // SignIn Button
		click_On_Element(signIn);

		// --------------------------Dresses - Casual Dresses------------------------------------------------------------

		WebElement dresses1 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")); // Dresses
		actions(dresses1, "movetoelement");

		WebElement casualDress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")); // Casual Dress

		actions(casualDress, "movetoelement");
		actions(casualDress, "click");

		// Casual Dresses
		WebElement cqckView = driver.findElement(By.xpath("//a[@class='quick-view-mobile']")); // QuickView Link -Icon

		javascript_Executor_Scroll_Or_Click("scroll", cqckView);
		javascript_Executor_Scroll_Or_Click("click", cqckView);

		// sleep(4000);

		// Changing Quantity & Size
		WebElement cqty = driver.findElement(By.xpath("//i[@class='icon-plus']")); // Quantity
		click_On_Element(cqty);

		WebElement casDressSize = driver.findElement(By.xpath("//select[@id='group_1']")); // Size
		select_By_Visibletext(casDressSize, "M");

		WebElement addCart = driver.findElement(By.xpath("//button[@name='Submit']")); // Add to cart
		click_On_Element(addCart);

		WebElement cckOut1 = driver.findElement(By.xpath("//a[contains(@title,'Proceed to check')]")); // 1st Checkout
		click_On_Element(cckOut1);

		WebElement cckOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")); // 2nd Checkout
		click_On_Element(cckOut2);

		WebElement cckOut3 = driver.findElement(By.xpath("//button[@name='processAddress']")); // 3rd Checkout
		click_On_Element(cckOut3);

		WebElement tsBtn1 = driver.findElement(By.xpath("//input[@id='cgv']")); // Terms of Service Button
		click_On_Element(tsBtn1);

		WebElement cckOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']")); // 4th checkout
		click_On_Element(cckOut4);

		// Payment by Bank Wire
		WebElement bwPayment = driver.findElement(By.xpath("//a[@class='bankwire']")); // Bank Wire
		click_On_Element(bwPayment);

		// Confirming Order
		WebElement conformOrd = driver.findElement(By.xpath("//button[starts-with(@class,'button btn')]")); // ConfirmOrder
		click_On_Element(conformOrd);

		// Scrolling Down the Page
		WebElement loctBoxOrder1 = driver.findElement(By.xpath("//div[@id='center_column']"));
		javascript_Executor_Scroll_Or_Click("scroll", loctBoxOrder1);

		// Confirming Order Screenshot
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressConfirm.png");

		// Back to Order - History
		WebElement history1 = driver.findElement(By.xpath("//a[@title='Back to orders']")); // Back to Order Link
		click_On_Element(history1);

		// WebTable - Print Order Id ALone
		WebElement orderId1 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
		System.out.println("Latest Shopping - Casual Dress - Order Id: " + get_Text(orderId1));

		// Scrolling Down the Page
		WebElement orderRef1 = driver.findElement(By.xpath("//th[.='Order reference']"));
		javascript_Executor_Scroll_Or_Click("scroll", orderRef1);

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressOrderHistory.png");

		// ---------------------------------------Dresses -> EveningDress----------------------------------------------------

		WebElement dresses2 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")); // Dresses again
		actions(dresses2, "movetoelement");

		WebElement evenDress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));// Choose Evening Dress

		actions(evenDress, "movetoelement");
		actions(evenDress, "click");

		// Click on Quick View
		WebElement eqckView = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));

		javascript_Executor_Scroll_Or_Click("scroll", eqckView);
		javascript_Executor_Scroll_Or_Click("click", eqckView);

		sleep(4000);

		// Change Quantity,Size and Colour
		WebElement eqty = driver.findElement(By.xpath("//i[@class='icon-plus']")); // Quantity - 3
		click_On_Element(eqty);
		click_On_Element(eqty);
		click_On_Element(eqty);

		WebElement eveDressSize = driver.findElement(By.xpath("//select[@id='group_1']")); // Size - M
		select_By_Visibletext(eveDressSize, "M");

		WebElement dressColour = driver.findElement(By.xpath("//a[@name='Pink']")); // Changed Colour to Pink
		click_On_Element(dressColour);

		WebElement addCartBtn = driver.findElement(By.xpath("//button[@name='Submit']")); // Add to cart Button
		click_On_Element(addCartBtn);

		WebElement eckOut1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']")); // 1st Checkout
		click_On_Element(eckOut1);

		WebElement eckOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")); // 2nd Checkout
		click_On_Element(eckOut2);

		WebElement eckOut3 = driver.findElement(By.xpath("//button[@name='processAddress']")); // 3rd Checkout
		click_On_Element(eckOut3);

		WebElement tsBtn2 = driver.findElement(By.xpath("//input[@name='cgv']"));//terms&conditions
		click_On_Element(tsBtn2);

		WebElement eckOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']")); // 4th Checkout
		click_On_Element(eckOut4);

		WebElement chckPayment = driver.findElement(By.xpath("//a[@title='Pay by check.']")); // Payment by Check
		click_On_Element(chckPayment);

		// Confirming Order
		WebElement econformOrd = driver.findElement(By.xpath("(//button[@type='submit'])[2]")); // Confirm Button
		click_On_Element(econformOrd);

		// Scrolling Down the Page
		WebElement loctBoxOrder2 = driver.findElement(By.xpath("//div[@id='center_column']"));
		javascript_Executor_Scroll_Or_Click("scroll", loctBoxOrder2);

		// Screenshot of Evening Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderConfirm.png");

		// Back to Order - History
		WebElement history2 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click_On_Element(history2);

		// WebTable - Print Order Id ALone
		WebElement orderId2 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
		System.out.println("Latest Shopping - Evening Dress - Order Id:  " + get_Text(orderId2));

		// Scrolling Down the Page
		WebElement orderRef2 = driver.findElement(By.xpath("//th[.='Order reference']"));
		javascript_Executor_Scroll_Or_Click("scroll", orderRef2);

		// ScreenShot of Evening Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderHistory.png");

		// -------------------------Dresses -> Summer Dress------------------------------------------------

		WebElement dresses3 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")); // Dresses again
		actions(dresses3, "movetoelement");

		WebElement summerDress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]")); // Summer Dress
		actions(summerDress, "movetoelement");
		actions(summerDress, "click");

		// Click on Quick View
		WebElement sqckView = driver.findElement(By.xpath("(//a[@class='quick-view-mobile'])[1]"));

		javascript_Executor_Scroll_Or_Click("scroll", sqckView);
		javascript_Executor_Scroll_Or_Click("click", sqckView);

		sleep(4000);

		WebElement sqty = driver.findElement(By.xpath("//i[@class='icon-plus']")); // Quantity
		click_On_Element(sqty);
		click_On_Element(sqty);

		WebElement sumerDressSize = driver.findElement(By.xpath("//select[@id='group_1']")); // Dress Size
		select_By_Visibletext(sumerDressSize, "L");

		WebElement sdressColour = driver.findElement(By.xpath("//a[@title='Orange']")); // Dress Colour
		click_On_Element(sdressColour);

		WebElement addToCart = driver.findElement(By.xpath("//button[@name='Submit']")); // Add to Cart
		click_On_Element(addToCart);

		WebElement sckOut1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']")); // 1st Checkout
		click_On_Element(sckOut1);

		WebElement sckOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")); // 2nd Checkout
		click_On_Element(sckOut2);

		WebElement sckOut3 = driver.findElement(By.xpath("//button[@name='processAddress']")); // 3rd Checkout
		click_On_Element(sckOut3);

		WebElement tsBtn3 = driver.findElement(By.xpath("//input[@id='cgv']")); // Terms of Service Button
		click_On_Element(tsBtn3);

		WebElement sckOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']")); // 4th Checkout
		click_On_Element(sckOut4);

		// Payment by Bank Wire
		WebElement bnkWrePayment = driver.findElement(By.xpath("//a[@class='bankwire']")); // Bank Wire
		click_On_Element(bnkWrePayment);

		// Confirming Order
		WebElement conformingOrd = driver.findElement(By.xpath("//button[starts-with(@class,'button btn')]")); //orderConfirm 
		click_On_Element(conformingOrd);

		// Scrolling Down the Page
		WebElement loctBoxOrdr3 = driver.findElement(By.xpath("//div[@id='center_column']"));
		javascript_Executor_Scroll_Or_Click("scroll", loctBoxOrdr3);

		// Screenshot of Summer Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrdrConfirm.png");

		// Back to Order - History
		WebElement history3 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click_On_Element(history3);

		// WebTable - Print Order Id ALone
		WebElement orderId3 = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]"));
		System.out.println("Latest Shopping - Summer Dress - OrderId:  " + get_Text(orderId3));

		// Scrolling Down the Page
		WebElement orderRef3 = driver.findElement(By.xpath("//th[.='Order reference']"));
		javascript_Executor_Scroll_Or_Click("scroll", orderRef3);

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrderHistory.png");

		sleep(2000);

		// Logout
		WebElement logOut = driver.findElement(By.xpath("//a[@class='logout']"));
		click_On_Element(logOut);
	}
}
