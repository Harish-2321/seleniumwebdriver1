package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//1) normal alert  with ok button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click(); // opens alert box
		Thread.sleep(5000);
//	Alert	myalert=driver.switchTo().alert();
	//myalert.accept();		
		
	// single statement
	driver.switchTo().alert().accept();
		*/
		//2) confirmation alert- ok and cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();  // opens alert 
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();   // close alert window using ok button
		//driver.switchTo().alert().dismiss();   // close alert window using cancel button
		
		//3)prompt alert - input box
		
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();  // opens alert		
		Thread.sleep(5000);
		
		Alert myalert= driver.switchTo().alert();
		
		System.out.println( "text message on alert:"+ myalert.getText());  // i am a JS script
		
		myalert.sendKeys("John");
		myalert.accept();
	String 	res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
if(res.contains("John"))
{
	System.out.println("test passed");
	
}
else
{
	System.out.println("Test failed");
}
*/









	}

}
