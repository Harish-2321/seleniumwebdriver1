package day27;

import java.time.Duration;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		/*    
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		*/
		
		//To rearrange the elements of the array [2, 2, 1, 0, 0, 1, 1, 2, 1, 0] 
		//such that all 0s, 1s, and 2s are sorted together in O(n).
	/*int	num=[2, 2, 1, 0, 0, 1, 1, 2, 1, 0] ;
		int low=0;
		int mid=0;
		int high=num.lengh-1;
		
		while(mid<high)
		{
			switch(num[mid]) {
			
			case 0;
			
			
			
			
			}
		}
		*/
		
		
	//	Given [10,17,15,8,12,13] 
				 
			//	sum = 25
				 
			//	Find the pairs whose sum is 25
				 
		int []arr= {10,17,15,8,12,13};
		
		int targetsum=25;
		
		findPairSwitchSum(arr,targetsum);
	}
		
		public static void findPairSwitchSum(int []arr, int targetsum)
		{
			HashSet<Integer> seen = new HashSet<>();
			
			
			for (int num: arr) {
				int complement =targetsum-num;
				
				if(seen.contains(complement)){
					System.out.println("pairfound:"+(complement +","+ num));
					
				}
				seen.add(num);
			}
		}
} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	