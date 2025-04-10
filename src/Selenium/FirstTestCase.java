package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch browser (chrome)
		
		//ChromeDriver driver=new ChromeDriver();        // You can create object of same class ChromeDriver. 
		
		WebDriver driver=new ChromeDriver();             // Or you can create object of Parent Class/Interface WebDriver using child class. Child class storing in Parent class.
		
       //2. Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");       // to open the URL in already launched browser above.
		
		//3. Validate the title should be "Your Store".
		
		String act_title=driver.getTitle();             //  to get the actual title of the URL
		
		if (act_title.equals("Your Store"))             // checking with expected
				{
			       System.out.println("Test case passed");
				}
		else {
			System.out.println("Test case failed.");
		}
		
		//4. Close the browser
         driver.close();		
		
         edgeLaunch();
		
		
	}
	
	
	// Launching, verifying and closing the e-commerce site.
	public static void edgeLaunch()
	{
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		String cur_url=driver.getCurrentUrl();             // getting current URL
		System.out.println(cur_url);
		
		String current_title=driver.getTitle();           // getting current Title of the webpage
		System.out.println(current_title);
		
		if (current_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test case is passed.");
		}else
		{
			System.out.println("Test case is failed");
		}
		
		driver.close();
		
	}

}
