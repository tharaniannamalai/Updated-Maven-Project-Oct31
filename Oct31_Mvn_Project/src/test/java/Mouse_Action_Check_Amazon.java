

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_Check_Amazon {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tharani\\eclipse-workspace\\Selenium_27_9_2022\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		WebElement todaysDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(todaysDeal).build().perform();
		a.click().build().perform();
	}
}
