package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssLocators {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");  
driver.manage().window().maximize();    // maximize the brower window


//tag and id combination
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

//without tag
//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shrits");

//tag class    tag.classname


//tag and classname combination
//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("T-shirts");

// without tag
//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("T-shirts");


// tag attribute        tag[attribute='value']
//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");

// tag class attribute

//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirt");

///html/body/header/div/div/div[2]/div/input

////*[@id="search"]/input 

//    / html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/input[1]
//       //input[@placeholder='Search'] 
	}

}
