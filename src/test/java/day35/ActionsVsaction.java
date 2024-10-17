package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsaction {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act =new Actions(driver);
		
	Action	myaction=act.contextClick(button).build();  //building/creating an action and storing into a variable
	myaction.perform();  // we are performing/ completing actions

	}

}
