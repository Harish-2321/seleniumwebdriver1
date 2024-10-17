package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		//mini slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default location of the minimum slider :"+ min_slider.getLocation());  //(59, 250)= (x,y)
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 249).perform();
		
		System.out.println("location of the minimum slider after moving:"+ min_slider.getLocation());
		
		// max slider
	WebElement 	max_slider =driver.findElement(By.xpath("//span[2]"));
	System.out.println("Default location of the maximum slider :"+ max_slider.getLocation()); //(544, 250) 
	act.dragAndDropBy(max_slider,-76, 250).perform();
	System.out.println("location of the maximum slider after moving:"+ max_slider.getLocation()); //(466, 250)
		
		//34
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
