package day41;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MakeMyTripHotelBooking {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
       WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void hotelBookingFlow() throws InterruptedException {
        // Login
        driver.findElement(By.id("username")).sendKeys("your-email@example.com");
        driver.findElement(By.id("password")).sendKeys("your-password");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000); // Wait for login to complete

        // Navigate to Hotels section
        driver.findElement(By.xpath("//span[text()='Hotels']")).click();
        Thread.sleep(2000);

        // Enter destination
        WebElement destination = driver.findElement(By.id("city"));
        destination.sendKeys("Bengaluru");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();

        // Select check-in and check-out dates
        driver.findElement(By.id("checkin")).click();
        driver.findElement(By.xpath("//div[@aria-label='Fri Sep 15 2023']")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//div[@aria-label='Sun Sep 17 2023']")).click();

        // Search for hotels
        driver.findElement(By.id("hsw_search_button")).click();
        Thread.sleep(5000); // Wait for search results to load

        // Select a hotel
        driver.findElement(By.xpath("//div[@class='listingRowOuter']")).click();
        Thread.sleep(2000);

        // Switch to the new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Book the hotel
        driver.findElement(By.id("detpg_book_combo_btn")).click();
        Thread.sleep(2000);

        // Proceed to payment (assuming user is already logged in)
        driver.findElement(By.id("proceedToPaymentBtn")).click();
        Thread.sleep(5000); // Wait for payment page to load
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        MakeMyTripHotelBooking test = new MakeMyTripHotelBooking();
        test.setUp();
        try {
            test.hotelBookingFlow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            test.tearDown();
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


