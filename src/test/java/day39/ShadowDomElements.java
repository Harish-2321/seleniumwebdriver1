package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");  //NoSuchElementException
		
		//handle shadow dom element
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");  //NoSuchElementException
	}

}
