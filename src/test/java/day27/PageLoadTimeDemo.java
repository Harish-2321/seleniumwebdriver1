package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
	driver.manage().window().maximize(); 
		
	//	driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
	}

}
//driver.get("http://admin:admin@yoururl.com");

//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login