package iamX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IamXLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://development.iamx.shop/");
		
		Thread.sleep(10);
		WebElement email=driver.findElement(By.xpath("//input[@id=':r0:']"));
		email.sendKeys("harishsreddy23@gmail.com");
		WebElement	login = driver.findElement(By.xpath("//button[@id=':r1:']"));
		login.click();
		
		
		
		 WebElement otpField = driver.findElement(By.xpath("//input[contains(@aria-label,'Digit')]"));
		//938421
		
		String otp = "123456"; // Replace with your method to retrieve the OTP
        otpField.sendKeys(otp);
        
        ////input[contains(@aria-label,'Digit')]
		
		
		
		

	}

}
