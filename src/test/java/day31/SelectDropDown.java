package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryEle =driver.findElement(By.xpath("//select[@id='country']"));
		
         Select dropCountry =new Select(drpcountryEle);  // select object 
         // special classdropCountry select for only for selecting the dropdown
         
         // selct option from dropdown
        // dropCountry.selectByVisibleText("France");
       //  dropCountry.selectByValue("japan");
         //dropCountry.selectByIndex(2);
         
         // capture the options from dropdown
     List<WebElement>   options= dropCountry.getOptions();
     System.out.println("number of options from dropdown:"+options.size());   //10
     
     //printing the options 
    /* for(int i=0; i<options.size();i++)
     {
    	 System.out.println(options.get(i).getText());
     }*/
     for(WebElement op:options)
     {
    	 System.out.println(op.getText()); 
     }
         
         
         
          
		
		
		
		
		

	}

}
