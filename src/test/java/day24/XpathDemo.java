package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		
		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		 
		 // Xpath with multiple attributes
		 
		// driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		 
		 // xpath with 'and' 'or' operator
		 //driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("t-shirts");
		// driver.findElement(By.xpath("//input[@name='search' or @placeholder='Xyz']")).sendKeys("T-shirts");
		 // xpath with inner text()
		 
		// driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		/* boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		 System.out.println(displaystatus);
		 
		 
		String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();	
		System.out.println(value);    */
		
		
		//Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirt");
		
		//Xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		 
		 
		 //chained Xpath
	boolean	imgstatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		 
		 System.out.println(imgstatus);
	}

}
