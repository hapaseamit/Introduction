package Selenium;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Locators--> The Locators are used to identify an HTML web element on a web page and perform action on them (e.g. click, type).
		//Selenium WebDriver uses below Locators to identify web elements. Right click on web element-> Inspect. Developer tool will open with HTML (Document Object Model).
				
		//Id
		//name
		//Link text
		//Partial Link text
		//Tag Name
		//Class Name
		//CSS Selector
		//XPath
		
		
		//Inspect each element, Identify and capture unique locator to perform action on that element in Selenium test case.
		//HTML text for finding Locators:
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		//input--> tag name
		//type, placeholder, id, value--> attributes
		//"  "--> attribute associated value
		
		
		//Xpath and CSS Selector Locators can be created manually using existing Locators. 
		
		// CSS Selector syntax: Cascading Style Sheet Selector
		// ID --> tagName#id
		// Class Name--> tagName.className
		// If no locator is present, use generic syntax of CSS Selector i.e. tagName[attribute='value']. Use unique attribute for CSS Selector.
		// e.g. <input type="text" placeholder="Username" value=""> ---> The CSS Selector will be input[placeholder='Username'].
		
		// Uniqueness of CSS Selector can be identified in SelectorsHub in dev tool. Add extension of SelectorsHub XPath Plugin in browser.
		//In Console in dev tool, check CSS Selector with $('tagname.classname').
		//e.g. <p class="error">* Incorrect username or password </p> ----> $('p.error')
		
		

		//System.setProperty("WebDriver.Chrome.Driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64.exe"); //To invoke Chrome Browser.
		
		//Selenium Test cases
		
		//1. Incorrect Password
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //Implicit wait- Applicable to each step if needed.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("suchitra");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click(); //Web element can have multiple classes seperated by white space. Use any one classname 
		                                                         // to perform action. e.g. "submit signInBtn"
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  //Prints the error message which is shown on page here.
		//driver.close(); 
		
		System.out.println("*********************");
		
		
		//Xpath Locator: If no other Locator is present, Xpath Locator can be created using existing HTML info.
		// Syntax of Xpath: //tagName[@attribute='value']
		// e.g.             //input[@placeholder='Name']
		
		//In Console in Dev tool, check Xpath Locator as $x('//tagName[@attribute="value"]'). Note: 2 single quotes cannot be present together, so value is in "".
		
		
		//2. Forgot your password. Retrieve Password message.
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");	
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Suchitra");
		driver.findElement(By.name("inputPassword")).sendKeys("hapase");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();     //LinkText: By.LinkText("Text of the link")
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suchitra");   
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		//driver.close();*/
		
		System.out.println("*********************");
		
		//3. Positive Flow- Correct Username and Password. Login & Logout Successful.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("suchitra");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
		driver.findElement(By.cssSelector("button.logout-btn")).click();     //CSS Selector:Tagname.classname
		driver.close(); 
		
		
		
		
	}

}
