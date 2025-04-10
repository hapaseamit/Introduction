package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/* Thread.sleep(time in ms);
	 - Thread is a Class in Java and sleep is a method in class Thread. Thread is related to Java and it does not understand the application.
	 - Irrespective of application visibility, it waits for the time specified so the performance issue is there.
	 - It pauses the execution for that step only.
     - We need to write Thread.sleep() multiple times.
	That is why we use Selenium related wait methods for better performance and efficiency.	 
		 */
		
    
	/* wait Methods: Are used to fix synchronization issue in Automation execution for application loading
	 
	 Exceptions in scripts:
	 - NoSuchElementException --> Element is not present on the page. This exception mostly comes because of the synchronization issue between Automation and Application..
	 - ElementNotFoundException --> Locator is not correct.
	 
	 1. implicit wait:
	 Syntax: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Default time of implicit wait is 0 sec. 
	 Works based on time mentioned.
	 
	 Advantages:
	 - Write only once till the driver is alive.
	 - It will not wait till mazimum time mentioned, if the WebElement is visible.
	 - Single statement is applicable for all elements.
	 - Easy to use.
	 
	 Disadvantage:
	 - If the element not visible within mentioned time, it will throw exception.
	 
	 2. explicit wait:
	 Syntax: declaration --> WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10)); 
	         usage --> WebElement textusername= mywait.until(ExpectedConditions.visibiityOfElementsLocated(By.xpath("")));
	                   textusername.sendKeys("Admin");
	 Works based on condition first and then time.
	 
	 Advantages:
	 - As it is condition based, it is more effective.
	 - Finding Element is inclusive.
	 - It will wait for condition to be true, then it will consider time.
	 
	 Disadvantage:
	 - We need to write explicit wait statements for every element separately.
	 
	 
	 3. fluent wait:
	 Syntax: 
	 
	 
	 4. pageLoadTimeout:
	 Syntax: driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 This is specific to page loading.
	 
	 * 
	 * 
	 * 
	 */
		
		WebDriver driver= new ChromeDriver();
		
		// implicit wait after initializing driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// explicit wait declaration
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));  // WebDriverWait is a special class in Selenium. Create object of the class.
		                          // We need pass 2 parameters in this object (driver, time).
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		// usage of explicit wait
		WebElement textusername= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))); 
		           //'until' returns WebElement mentioned in the locator when the mentioned condition is true. That is why it is stored in WebElement.
		textusername.sendKeys("admin123");
		
		WebElement loginbtn= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginbtn.click();
		
		
		//pageLoadTime
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
