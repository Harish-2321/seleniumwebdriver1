package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// input DOB
		//expected data
				String requiredyear="2022";
				String requiredmonth="April";
				String requireddate="10";
				
				driver.switchTo().frame("frame-one796456169");
				driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		//select year
				WebElement YearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectyear = new Select(YearDropDown);
				selectyear.selectByVisibleText(requiredyear);
		
		// select month
				String displaymonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//compare month
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
