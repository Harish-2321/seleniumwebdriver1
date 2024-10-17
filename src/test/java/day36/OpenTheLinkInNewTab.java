package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/ ");
		driver.manage().window().maximize();
		
		WebElement reglink= driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act= new Actions(driver);
		
		//control+reglink
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		List<String> ids=new ArrayList (driver.getWindowHandles());
		
		// registration page
		driver.switchTo().window(ids.get(1));  // switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Harish");
		
		
		//Home page
		driver.switchTo().window(ids.get(0)); 
		driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("T-shrits");
		
		
		
		
		
		
		
		
		
		
		
	}

}
