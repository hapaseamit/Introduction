package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Bootstrap dropdown:
		 - The dropdown containing checkboxes and text values together.
		 - You can select more than one option in the dropdown at a time. It is a multiselect dropdown.
		 - Bootstrap does not have any built-in methods so we need to create xpath for every element.
		 - The tag in html is div, button or any other than select.
		 * 
		 * 
		 * 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();	// locating dropdown by creating own xpath
		
		// 1) select single option 
		driver.findElement(By.xpath("//input[@value='Angular']")).click();
		
		
		// 2) capture all the options and find out the size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]//label"));  // storing options in List WebElement variable
		System.out.println("Number of options: " + options.size());
		
		// 3) printing options from the dropdown
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
		// 4) select multiple options
		for(WebElement ops: options)
		{
			if (ops.getText().equals("jQuery") || ops.getText().equals("CSS") || ops.getText().equals("Databases"))
				{
					ops.click();
					}

		}
		
		
		driver.close();
		
		

	}

}
