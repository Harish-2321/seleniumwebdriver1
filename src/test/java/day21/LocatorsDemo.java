package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  //ctrl+shift+O--> imoprting packages

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
//name
		//WebElement searchBox = driver.findElement(By.name("search")); 
		//searchBox.sendKeys("MacBook");
		
		//driver.findElement(By.name("search")).sendKeys("MacBook");   ---single step(without using variable)
		
//id
		//WebElement logo =driver.findElement(By.id("logo"));
		
	    //Boolean status = driver.findElement(By.id("logo")).isDisplayed();	
	    //System.out.println("Disply status:"+ status);
	
		//driver.findElement(By.id("logo")).isDisplayed();
	
//linktest and partiallinktest--> only for links
		
		//driver.findElement(By.linkText("Tablets")).click();  //---->linktext
		
		//driver.findElement(By.linkText("Contact Us")).click();
		
		//driver.findElement(By.partialLinkText("Tab")).click();  // partial linktest
		
	//classname
	 //List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		
      //System.out.println(headerLinks.size());     //  7 links are there in header
      
      
		// Tagname
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//System.out.println(links.size());  //--> 76 links are there in webpage
		
		//List<WebElement> images=driver.findElements(By.tagName("img"));
		//System.out.println(images.size());  //18 images are there in webpage
		
	//WebElement 	ele=driver.findElement(By.id("xyz"));  //NoSuchElementException
	//	List<WebElement>ele=driver.findElements(By.id("xyz"));
		//System.out.println(ele.size());
		
	}

}
