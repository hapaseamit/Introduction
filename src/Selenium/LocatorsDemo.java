package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();           // press Ctrl+Shift+o  to import packages
		
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		// to find first WebElement use findElement().
//		
		System.out.println(driver.findElement(By.className("orangehrm-login-branding")).isDisplayed());  // By className
		
		System.out.println(driver.findElement(By.className("orangehrm-login-logo")).isDisplayed());       // By className
		
		
		/* linkText & partialLinkText
		 <a href="http://www.orangehrm.com" target="_blank">OrangeHRM, Inc</a>       --> 'OrangeHRM, Inc' is inner text here.
		 */
		System.out.println(driver.findElement(By.linkText("OrangeHRM, Inc")).isDisplayed());             // By linkText
		
		System.out.println(driver.findElement(By.partialLinkText("OrangeH")).isDisplayed());            // By partialLinkText

		
//		driver.findElement(By.name("username")).sendKeys("Admin");                             // By name
//		driver.findElement(By.name("password")).sendKeys("admin123");                          // By name
//		driver.findElement(By.className("oxd-button")).click();                                // By className
//		
//		System.out.println(driver.findElement(By.className("oxd-topbar-header-title")).isDisplayed());

		
  /*
   CSS Selector: 
	 ID        : tagName#ID
	 className : tagName.className
	 attribute : tagName[attribute="value"]
	 attribute value classname: tagName.className[attribute="value"]
	 
	 */
		
		System.out.println(driver.findElement(By.cssSelector("button.oxd-button")).isDisplayed());   //By cssSelector className: tagName.className
		System.out.println(driver.findElement(By.cssSelector("input[placeholder='Username']")).isDisplayed());  //By cssSelector attribute: tagName[attribute="value"]
		
		driver.findElement(By.cssSelector("input.oxd-input[placeholder='Username']")).sendKeys("Admin");  //Login
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")).isDisplayed());
		//System.out.println(driver.getCurrentUrl()); //printing current url
		
		String current_url=driver.getCurrentUrl();   //saving current url in String variable directly for further verification 
		System.out.println(current_url.contains("dashboard"));  //checking if login is successful
		//System.out.println(current_url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));  //another way of checking login
		 
		
		System.out.println("***********************");
		
		
		
		
		//For more than one WebElement, use findElements(). tagName and className are used to find group of WebElements.
//		
		List<WebElement> menuLinks=driver.findElements(By.className("oxd-main-menu-item"));         // By className
		System.out.println(menuLinks.size());                                                       //Total number of Menu Links
		
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));    // By tagName  For links, tagName is always 'a' followed by 'href'.
		System.out.println(totalLinks.size());                               // Total number of Links on Dashboard page
		
		List<WebElement> totalImg=driver.findElements(By.tagName("img"));    // By tagName. For Images, tagName is always 'img' followed by 'src'. 
		System.out.println(totalImg.size());                                 // Total number of images on Dashboard page.
		
		driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("***********************");
			
		
		//driver.close();
		
	
//		        driver.get("https://demo.opencart.com/");
//				driver.manage().window().maximize();
//				
				// to find first WebElement use findElement()
			    //System.out.println(driver.findElement(By.id("logo")).isDisplayed()); //By id
				
//				driver.findElement(By.name("search")).sendKeys("MacBook");          // By name
//				
//				driver.findElement(By.linkText("Cameras")).click();                   // By linkText
//				
//				driver.findElement(By.partialLinkText("Soft")).click();              // By partialLinkText
//				
				
//				driver.get("https://demo.nopcommerce.com/");
//				driver.manage().window().maximize();
//				
//				// to find first WebElement use findElement()
//				System.out.println(driver.findElement(By.className("header-logo")).isDisplayed());  //By className
//				
//				driver.findElement(By.id("small-searchterms")).sendKeys("MacBook");     // By id
		
		
		//For more than one WebElement, use findElements(). tagName and className are used to find group of WebElements.
		
//	     List<WebElement> headerLinks=driver.findElements(By.className("header-links"));    // By className
//	     System.out.println(headerLinks.size());                                                 //Total number of Header Links
//	     
//	     
//	    List<WebElement> totalLinks=driver.findElements(By.tagName("a"));     // By tagName  For links, tagName is always 'a' followed by 'href'.
//	    System.out.println(totalLinks.size());                               // Total number of Links on the Home page
//	     
//	     List<WebElement> totalImg=driver.findElements(By.tagName("img"));    // By tagName. For Images, tagName is always 'img' followed by 'src'.     
//	     System.out.println(totalImg.size());                                 // Total number of images on the Home page.
		
 /*
   CSS Selector: 
	 ID        : tagname#ID
	 className : tagname.className
	 attribute : tagname[attribute="value"]
	 attribute value classname: tagname.className[attribute="value"]
			 
	 */
	     
	    //System.out.println(driver.findElement(By.cssSelector("span.d-none")).isDisplayed());	  // CSS selector: tagName.className   
	   // System.out.println(driver.findElement(By.cssSelector("input.form-control[name='Search']")).isDisplayed());
	     
	   // driver.findElement(By.cssSelector("div#logo");     

	     
	     // Locators exercise
	     driver.get("https://www.demoblaze.com/index.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     System.out.println(driver.findElement(By.id("nava")).isDisplayed());
	     
	     List<WebElement> total_links =driver.findElements(By.tagName("a"));       //finiding total links on the page
	     System.out.println(total_links.size());                                   //15
	     
	     List<WebElement> tLinks=driver.findElements(By.tagName("img"));          // finiding total images on the page
	     System.out.println(tLinks.size());                                       // 14
	     
	     System.out.println(driver.findElement(By.partialLinkText("6")).isDisplayed());
	     	     
	     driver.findElement(By.linkText("Nokia lumia 1520")).click();
	     
	     System.out.println(driver.findElement(By.cssSelector("a#nava")).isDisplayed());       //CSS Selector: tagName#ID
	     System.out.println(driver.findElement(By.cssSelector("h2.name")).isDisplayed());      //CSS Selector: tagName.className
	          
	     driver.close();

	     
	}

}
