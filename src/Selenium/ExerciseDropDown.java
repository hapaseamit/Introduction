package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Assignment
		---------------
		1) Handle country dropdown with/without  using Select class:
		       https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
					a) count total number of options
					b) print all the options 
				       c) select one option

		2) Hidden dropdown
		Login to OrangeHRM--> pim--> employee status


		3) https://testautomationpractice.blogspot.com/
			colors multi select box

		4) Google search box 
		  - find number of options search
		 - select one option.
				 * 
				 * 
				 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.id("country-list"));
		//country.click();
		
		Select country_name= new Select(country);
		
		// count total number of options
		List<WebElement> options= country_name.getOptions();
		System.out.println("Total number of options: " + options.size());
		
		// print all the options 
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
		// select one option
		country_name.selectByVisibleText("France");
		country_name.selectByValue("4");
		country_name.selectByIndex(2);
		
		//select state
		WebElement state= driver.findElement(By.id("state-list"));
		
		Select state_name= new Select(state);
		
		state_name.selectByVisibleText("Hebei");
		state_name.selectByValue("10");
		
		driver.close();
		
		
	}

}
