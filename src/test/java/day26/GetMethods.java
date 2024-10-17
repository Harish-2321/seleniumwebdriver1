package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	//get(url) - opens the url on the browser
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(5000);
     
     
     
     //getTitle() - returns title of the page
     System.out.println(driver.getTitle());
     
     //getCurrentUrl() - retuns URL of the page
    System.out.println( driver.getCurrentUrl());
    
    //getPageSource()- returns source code of the page
  // System.out.println(driver.getPageSource());
   
   //getWindowHandle() - returns ID of the single Browser window
 //String windowid= driver.getWindowHandle();
    // System.out.println("window id:"+windowid);  //E06CB19D837D1E495B28344636711D3B
                                                 //42F59A9DB19674A04A3AE03532FB5102

     //getWindowHandles() - retuns ID's of the multiple browser windows
     
     driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // this will open new browser window
     Set<String>windowids=driver.getWindowHandles();
     
     System.out.println("window Ids:"+windowids);  //[F325FB2EB1031B44ACF6C405819E1063, BDCA020D5668AC4A22B5DE5C8CFB04CB]

	}

}
