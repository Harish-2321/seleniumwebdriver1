package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseHoverAction {

	public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get(" https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act= new Actions(driver);
	
	// mouse hover action
	//act.moveToElement(desktops).moveToElement(mac).click().build().perform();
	
	act.moveToElement(desktops).moveToElement(mac).perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
