package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		             
	 	WebDriver driver =new ChromeDriver();
	 driver.get(" https://www.opencart.com/");
	 driver.manage().window().maximize();
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	 //1)scroll down the page by pixel number
	 //js.executeScript("window.scrollBy(0,1500)", "");
	//	System.out.println(js.executeScript("return window.pageYOffset;"));  //1500
		
		
		//scroll the page till the element is visible
	/* WebElement ele=driver.findElement(By.xpath("//img[@title='OpenCart']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));  //4994
*/
		 
		//scroll page till end of the page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //4994
		
		Thread.sleep(5000);
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		

	}

}
