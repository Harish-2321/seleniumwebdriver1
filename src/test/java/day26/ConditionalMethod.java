package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 
driver.get("https://demo.nopcommerce.com/register");
driver.manage().window().maximize();
// isDisplayed

// WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 //System.out.println("display status of log:"+logo.isDisplayed());
 
// we can also write like this below
//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//System.out.println("display status:"+status);  // true

// isEnabled
//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();

//System.out.println("Enable staus:"+status);   // true

//isSelected
WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("Before selection..");
System.out.println(male_rd.isSelected());// false
System.out.println(female_rd.isSelected());// false

System.out.println("after Selecting male..");
male_rd.click();  // select male radio button

System.out.println(male_rd.isSelected());// true
System.out.println(female_rd.isSelected()); // false

System.out.println("after Selecting female..");
female_rd.click();  // select female radio button

System.out.println(male_rd.isSelected());// false
System.out.println(female_rd.isSelected()); // true 
	}

}
