package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapaturesScreenShots {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(" https://www.opencart.com/");
		 driver.manage().window().maximize();
		
		 /*
		//1) full page screenshot
		 TakesScreenshot ts=(TakesScreenshot)driver;   // upcasting
	File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);  //copy sourcefile to targetfile
		*/ 
		
		 /*
		//2) capataure the screenshot of specific section
	WebElement 	support =driver.findElement(By.xpath("//div[@id='support']//div[@class='row']"));
	File sourcefile=   support.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuresupport.png");
	sourcefile.renameTo(targetfile);  
	*/
		 
		//3) capture the screenshot of webelement
	WebElement logo=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	File sourcefile =logo.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
	sourcefile.renameTo(targetfile);  
	
	driver.quit();
		
		
		 
		
		
	}

}
