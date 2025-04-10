package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*XPath
		----
		XPath is an address of the element.

		DOM - Document Object Model xml

		2 types of xpath
		-----------
		1) Absolute xpath(full xpath)
			Ex: 	/html/body/header/div/div/div[2]/div/input

		2) Relative xpath(partial xpath)
			Ex: //*[@name="search"]

		Which xpath will be preferred?
		Relative xpath.


		Difference between Absolute & Relative xpaths?
		------------------
		1) Absolute xpath starts with  /     ---> represents root node
		  Relative xpath starts with  //  

		2) Absolute xpath do not use attributes.
		  Relative xpath works with attribute.

		3) Absolute xpath traverse through each node till it finds element so performance time is more.
		   Relative xpath directly jumps and finds the element by using attribute, hence performance time is less.
		   
		4) Any node can change in Absolute xpath and it might not be able to locate element after change.
		   Relative xpath directly jumps to expected element so node change does not affect relative xpath locator. 
		    */
		
		
		WebDriver driver=new ChromeDriver();   // press Ctrl+Shift+o  to import packages
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*Xpath with single attribute
		Syntax: //tagName[@attribute='value']
		*/
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");    // single attribute
		
		
		
		/*Xpath with multiple attribute
		 Syntax: //tagName[@attribute='value'][@attribute='value']
		 */
		
		driver.findElement(By.xpath("//input[@name='password'][@placeholder='Password']")).sendKeys("admin123");   // multiple attribute
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
		
		/*Xpath with 'and'/ 'or' attribute
		 Syntax: //tagName[@attribute='value' and @attribute='value']   --> and operator
		         //tagName[@attribute='value' or @attribute='value']    --> or operator
		 */
		
//		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");    //and operator
//		driver.findElement(By.xpath("//input[@name='xyz' or @placeholder='Password']")).sendKeys("admin123");       //or operator
		
		
		
		
		/*Xpath with text() = 'inner text'
		 Syntax: //tagName[text()='inner text']   
		         
		 //<span data-v-7b563373="" data-v-6475d26d="" class="oxd-text oxd-text--span oxd-main-menu-item--name">Admin</span>        
		 */
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		
		
		/*Xpath with contains()
		 Syntax: //tagName[contains(@attribute, 'partial value')]        
		        
		 */
		
		driver.findElement(By.xpath("//input[contains(@placeholder, 'hints')]")).sendKeys("aniket");  //actual string 'Type of hints...'
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		
		
		/*Xpath with starts-with()
		 Syntax: //tagName[starts-with(@attribute, 'start letters')]   
		                 
		 */
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Type')]")).sendKeys("cha");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		/* Handling Dynamic Elements:
		 -- same WebElement changes its state during runtime i.e. button value changes from 'start' to 'stop'
		 Use below xpath locators for dynamic WebElements
		 //*[@id='start' or @id='stop']
		 //*[contains(@id, 'st')]
		 //*[starts-with(@id, 'st')]
		  
		 name=xyz001   xyz002   xyz003   xyz 001    xyz 002
		 //*[contains(@name, 'xyz')]
		 //*[contains(@name, '00')]
		 //*[starts-with(@name, 'xyz')]
		  
		 name=1xyz   2xyz    3xyz
		 //*[contains(@name, 'xyz')]
		  
		  
		 */
		   
		
		/* Chained path: When there are no attributes and inner text present for any WebElement
		 Syntax: //tagName[@attribute='value']/node/node of element   --> here tagName and attribute are of parent nodes,then /node/node till WebElement node
		   e.g.: //div[@id='logo']/a/img
		  
		 */
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='oxd-brand-logo']/img")).isDisplayed());
		  
		
		// Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
		
		
		
	}

}
