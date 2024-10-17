package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	// 1) select check box
	
	 // for button,checkbox,link,radiobutton---> we have click() method
	// click method is used for un selecting also
	
	WebElement checkbox =driver.findElement(By.xpath("//input[@id='sunday']"));
	
	//System.out.println("before selection of check box:?"+checkbox.isSelected());
	
	//driver.findElement(By.xpath("//input[@id='sunday']")).click(); // select checkbox
	//System.out.println("after selection: "+checkbox.isSelected());
	
	//2) capturing all the checkboxes
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	System.out.println("number of checkboxes:"+checkboxes.size());  //7
	
	// 3)selecting all the checkboxes 
	/*for(int i=0; i < checkboxes.size();i++)
	{
		checkboxes.get(i).click();
		}*/
	// or 
	
	/* for(WebElement chkbox:checkboxes)
	{
		chkbox.click();
		} 
	
	// 4)select last 3 checkboxes
	// total number of check boxes-how many check boxes do you want to select = starting index 
	//ex 7-3=4
	
	for(int i=4; i<checkboxes.size(); i++)
	{
		checkboxes.get(i).click(); 
	}
	
	
	//5) selecting first 3 checkboxes
	for (int i=0; i<3; i++)
	{
		checkboxes.get(i).click(); 
	}
	
	Thread.sleep(5000);
	
	// 6)select/unselect checkboxes
	for(WebElement chkbox:checkboxes)
	{
		if(chkbox.isSelected()) 
		{
		chkbox.click();  // select
		} 
	else 
	{
		chkbox.click();
	}
	}
	*/
	/*
	Thread.sleep(5000);
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected()) 
			{
			chkbox.click();  // unselected
			} 
		else 
		{
			chkbox.click();
		}
	}
*/
	// selecting specific checkboxes randomly
	/*for (int i=0;i<checkboxes.size();i++)
	{
		if (i==1 || i==3 || i==6)
		{
			checkboxes.get(i);
		}
	}
	*/
	
	// select checkboxes based on the value
	String weekname="Saturday";
switch (weekname)
{
case "sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
break;

case "Monday": driver.findElement(By.xpath("//input[@id='monday']")).click();
break;

case "Tuesday": driver.findElement(By.xpath("//input[@id='tuesday']")).click();
break;

case "Wednesday": driver.findElement(By.xpath("//input[@id='wednesday']")).click();
break;

case "Thrusday": driver.findElement(By.xpath("//input[@id='thrusday']")).click();
break;

case "Friday": driver.findElement(By.xpath("//input[@id='friday']")).click();
break;

case "Saturday": driver.findElement(By.xpath("//input[@id='saturday']")).click();
break;

 default :System.out.println("invalid week name");

























}

	
	
	
	
	
	}
}
