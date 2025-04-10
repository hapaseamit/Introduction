package Selenium;

import java.net.MalformedURLException;
//import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		/*Navigational Commands:
		 navigate().to(url)
		 navigate().back()
		 navigate().forward()
		 navigate().refresh()
		 
		 
		 navigate().to(url):
		 It is used to open the url in the browser same as driver.get(url) command. 
		 The only difference is get() command takes only String as a parameter but navigate().to() takes url String as well as url object as a parameter.
		 navigate().to() method internally calls get() method only.
		 
		 Syntax: driver.navigate().to("url");
		 
		 
		 navigate().back():
		 This navigates to the back page in the browser.
		 
		 navigate().forward():
		 This navigates to the forward page in the browser.
		 
		 navigate().refresh():
		 This refreshes the page.
		 
		 
		 */

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// navigate().to(url): passing url as String
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		
		//navigate().to(url): passing url as an object
//		URL myurl= new URL("https://opensource-demo.orangehrmlive.com/");
//		driver.navigate().to(myurl);
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());    // https://opensource-demo.orangehrmlive.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());    // https://rahulshettyacademy.com/locatorspractice/
		
		driver.navigate().refresh();    
		
		driver.close();
		
		
	}

}
