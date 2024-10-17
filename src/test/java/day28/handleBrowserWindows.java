package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowserWindows {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set <String>	windowIDs=driver.getWindowHandles();
	/*
	// approach 1
	List<String> windolist = new ArrayList (windowIDs);     //converted set to list collections 
String	parentID=windolist.get(0);
String 	childID=windolist.get(1);
  

// switch to child window
driver.switchTo().window(childID);
System.out.println(driver.getTitle());  
	
	// switch to parent window
driver.switchTo().window(parentID);
System.out.println(driver.getTitle()); 
	*/
	
	// approach 2
	for(String winid:windowIDs)
	{
	String 	title= driver.switchTo().window(winid).getTitle();
		if (title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
		}
	}
	
	
	
	
	
	
	
	
	
	}

}
