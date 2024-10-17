package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  // multiple table
		
		//int rows=driver.findElements(By.tagName("tr")).size();   // single table
		
		System.out.println("number of rows:"+rows);
		
		// find total number of columns in a table
	int colm=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();  // multiple table
		
		//int colm=driver.findElements(By.tagName("th")).size();   // single table
		System.out.println("number of columns:"+colm);
		
		// 3) read data from specific row and column  (Ex - 5th row and 6th column) 
	//String	bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookname);  //Master In Selenium
		
	//	4) read from all the rows and columns
	/*	System.out.println("BookName"+"\t"+"Author"+"\t"+"subject"+"\t"+"Price");
		 for (int r=2;r<=rows;r++)
		 {
			 for (int c=1;c<=colm;c++)
			 {
				 String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.println(value+"\t");
			 }
			 System.out.println();
		 }*/
		 
		
		//5) print book name
		/*for(int r=2; r<=rows;r++)
		{
			String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(authorname); 
			
			if (authorname.equals("Mukesh"))
			{
		String 	bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		System.out.println(bookname+"\t"+authorname);
			}
			
		}
		*/
		//6) find total price of all the books
		int total =0;
		for(int r=2; r<=rows;r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			System.out.println(price); 
			
		total= total+Integer.parseInt(price);
			
		}
	
		 System.out.println("total price of the books:"+total);  //7100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
