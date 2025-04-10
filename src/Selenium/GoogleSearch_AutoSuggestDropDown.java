package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Google Search Auto Suggest Dropdown:
		 - Google search box where results are shown dynamically after typing anything in search input box.
		 * 
		 * 
		 * 
		 */
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");           // locating search text field and entering text 'Selenium' in it
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@role='option']")); // The options opened and store those options in List 'options' variable
		                       // the xpath should be written till the options. Create your own xpath taking parent node 'class' attribute till the required child node
		System.out.println(list.size());             // total options visible on UI at the time
		
		
		// selecting specific search text from options
		for(int i=0; i<list.size(); i++)
		{
			String res= list.get(i).getText();          // store each option in a String variable to perform further option
			if(res.equalsIgnoreCase("Selenium webdriver"))
			{
		//		System.out.println(list.get(i).getText());  // OR
				System.out.println(res);       // print statement must be written before clicking on the option otherwise it won't print
				list.get(i).click();
				break;                                   // if you find the required option, break from the code. No need to verify the further options.
			}
		}
		
		
		driver.close();

	}

}
