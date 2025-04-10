package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/* WebDriver Methods:
		 1. get methods
		 2. conditional methods
		 3. browser methods
		 4. navigational methods
		 5. wait methods
		 
		 */
		
		/* get methods: We can access these methods through WebDriver instance or browsers only
		 get("url") --> to launch/open the url in the browser
		 getTitle() --> returns title of the page
		 getCurrentUrl() --> returns URL of the page
		 getPageSource() --> returns source code of the page
		 getWindowHandle()  --> returns ID of the single browser window
		 getWindowHandles() --> returns ID of the multiple browser windows
		 
		 
		 * conditional methods: We can access these methods through WebElement
         returns boolean value (true/false)
         
         isDisplayed()  --> the WebElement is displayed or not e.g. img, text, logo, almost for all webelements etc
         isEnabled()  --> the WebElement is enabled or not e.g. input boxes, dropdowns, checkboxes, radio buttons etc
         isSelected() --> the WebElement is selected or not e.g. checkboxes, radio buttons etc
         
         
         * browser methods
         close() --> close single browser
         quit()  --> quits all browsers
         
         	 
		 */
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");    //get(url) --> to launch/open the url in the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());  // getTitle() --> returns title of the page
		
        System.out.println(driver.getCurrentUrl());  // getCurrentUrl --> returns url of the page
        
        //System.out.println(driver.getPageSource());  //getPageSource --> returns source code of the page
        
        String windowid= driver.getWindowHandle();    //getWindowHandle()  --> returns ID of single browser window
        System.out.println("Window ID: " + windowid);  // The window ID changes every time.
        
//        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//        
//        Set<String> windowids= driver.getWindowHandles();   //getWindoeHandles()  --> returns IDs of the multiple browser windows
//        System.out.println("Window IDs: "+ windowids);      // The window IDs changes every time.
        
       // driver.quit();
        
        
        /* conditional methods: We can access these methods through WebElement
         returns boolean value (true/false)
         
         isDisplayed()  --> the WebElement is displayed or not e.g. img, text, logo, almost for all webelements etc
         isEnabled()  --> the WebElement is enabled or not e.g. input boxes, dropdowns, checkboxes, radio buttons etc
         isSelected() --> the WebElement is selected or not e.g. checkboxes, radio buttons etc
          
      
         */
        
        
        
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //isDisplayed(): To check visibility
        //one way
        WebElement logo=driver.findElement(By.xpath("//div[@class='overlay-panel overlay-right']//h1[contains(text(),'Rahul Shetty Academy')]"));
        System.out.println("logo is displayed: "+ logo.isDisplayed());
        
        //another way
        boolean status=driver.findElement(By.xpath("//div[@class='overlay-panel overlay-right']//h1[contains(text(),'Rahul Shetty Academy')]")).isDisplayed();
        System.out.println("logo is visible: "+ status);
        
        //easy way
        System.out.println(driver.findElement(By.xpath("//div[@class='overlay-panel overlay-right']//h1[contains(text(),'Rahul Shetty Academy')]")).isDisplayed());
        
        
       
        //isEnabled(): To check enabled or not 
        System.out.println(driver.findElement(By.xpath("//input[@id='inputUsername']")).isEnabled());
        
        
		
        //isSelected(): To check if WebElement is selected or not
        System.out.println("Before selecting: "+ driver.findElement(By.id("chkboxOne")).isSelected());
        
        driver.findElement(By.id("chkboxOne")).click();
        
        System.out.println("After selecting: "+ driver.findElement(By.id("chkboxOne")).isSelected());
        
        
        /* browser methods
         close() --> close single browser
         quit()  --> quits all browsers
         
         */
        
       // driver.close();
        
//        driver.findElement(By.id("visitUsTwo")).click();
//        System.out.println("Test case passed");               // just to check if its clicking in 'Visit us' button.
//        
//        driver.quit();
        
        
        //Exercise: https://testautomationpractice.blogspot.com/
        
        //get methods
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        
//        driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
//        System.out.println(driver.getWindowHandles());
        
        //conditional methods
        System.out.println(driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed());
        
        System.out.println(driver.findElement(By.id("name")).isEnabled());
        
        System.out.println(driver.findElement(By.id("male")).isSelected());  
        
        driver.findElement(By.id("male")).click();
        
        System.out.println(driver.findElement(By.id("male")).isSelected());
        
        
        driver.close();
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
