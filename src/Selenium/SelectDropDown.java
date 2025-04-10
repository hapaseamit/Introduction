package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Dropdown Box:
		 1. Select dropdown
		 2. Bootstrap dropdown
		 3. Hidden dropdown
		 
		 
		 1. Select Dropdown:
		 - Select dropdown has 'select' tag in html. If 'select' tag is not there in html, then it is either bootstrap or hidden dropdown.
		 - Dropdown itself is located and stored in WebElement variable first.
		 - Object of 'Select' class is created and used to perform any action on dropdown WebElements. Initially created, Dropdown WebElement variable is passed in this object.
		 - Each value in dropdown is a WebElement and is called 'option'.
		 - Only one option can be selected at a time.
		 - Options in Select dropdown are selected by using below methods.
		 
		 Select Methods to select option in dropdown:
		 selectByVisibleText()    --> VisibleText means the texts/options which are visible in dropdown once it is opened.
		 selectByValue()          --> 'Value' is attribute in html. Based on 'value' attribute, we can select option in dropdown. 
		 selectByIndex()          --> Index can be calculated manually starting from 0 if not given in html.
		 - 
		 * 
		 * 
		 getOptions() method is used to get the total number of options in the dropdown. Store it in List<WebElement> variable.
		 * 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drp_countryEle=driver.findElement(By.xpath("//select[@id='country']"));  // locating and storing dropdown WebElement in WebElement variable
		drp_countryEle.click();                           // to open the dropdown
		
		
		// Select class object
		Select drpCountry= new Select(drp_countryEle);   // passing dropdown WebElement variable 'drp_countryEle' into object of Select class and referencing with i.e. drpCountry.
		
		// Select methods to select option in dropdown
		drpCountry.selectByVisibleText("India");    
		drpCountry.selectByValue("uk");
		drpCountry.selectByIndex(5);
		
		// getOption() method to count the total options in dropdown
		List<WebElement> options= drpCountry.getOptions();	          // getOption() method is used to get the total number of options in dropdown.
		System.out.println("Total number of options are: " + options.size());
		
		
		// printing the options
		// enhanced for loop - commonly used
		for (WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		System.out.println("*****************");
		
		//using normal formal loop with indexing
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.close();
		

	}

}
