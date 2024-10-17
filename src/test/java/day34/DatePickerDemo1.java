package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	//select future date
	static void selectFutureDate(WebDriver driver, String month, String year, String date  )
	{
		
				while(true)
				{
				String	currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
				String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   // actual year
				
				if(currentMonth.equals(month) &&currentYear.equals(year) )
				{
					break;
					
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next 
				
			//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous
				
				}
				List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				for(WebElement dt:alldates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
	}
	
	//selecting the past date
	static void selectPasteDate(WebDriver driver, String month, String year, String date  )
	{
		
				while(true)
				{
				String	currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
				String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   // actual year
				
				if(currentMonth.equals(month) &&currentYear.equals(year) )
				{
					break;
					
				}
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next 
				
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous
				
				}
				List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				for(WebElement dt:alldates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
	}
	

	

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		// method1 : using sendKeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/13/2024"); // mm/yy/yyyy
		
		//method2: using data picker
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();   //opens data picker
		
		//expected data
		String year="2022";
		String month="April";
		String date="10";
		
		//selectFutureDate(driver,month,year,date);
		 selectPasteDate(driver,month,year,date);
		
		//1hr
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
