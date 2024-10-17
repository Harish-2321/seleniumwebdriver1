package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


/*
 Test Cases
 1)lanuch brower
2) open url https://demo.opencart.com/
 3)validate title should be "your store"
 4)close browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
/*	// 1) lanuch the browser
		//ChromeDriver driver =new ChromeDriver();
WebDriver driver=new ChromeDriver();
// WebDriver driver=new EdgeDriver();
 //WebDriver driver=new FirefoxDriver();
 
//2) open url https://demo.opencart.com/
driver.get("https://demo.opencart.com/");

//3)validate title should be "your store"
String act_title =driver.getTitle();
if(act_title.equals("Your Store"))
		{
	System.out.println("test passed");
		}
else {
	System.out.println("test failed");
}

//4)close browser
//driver.close();
//driver.quit();
 
 */
		
	//Assignment
		//-----
		// 1) launch brower
		//2) open url https://demo.nopcommerce.com/
		//3)validate title should be "nopcommerce demo store"
		//4) close page
		
		// 1) launch brower
		WebDriver driver=new ChromeDriver();
		
		//2) open url https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		//3)validate title should be "nopcommerce demo store"
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		
		//4) close page
		driver.close();
		
		
		
		
		
		
	} 

}
