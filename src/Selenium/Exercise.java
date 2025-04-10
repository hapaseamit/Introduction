package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*https://testautomationpractice.blogspot.com/

		1) provide some string search for it
		2) count number of links
		3) click on each link using for loop
		4) get window ID's for every browser window
		5) close specific browser window

		*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) provide some string search for it
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
				
		
		// 2) count number of links under it
		List<WebElement> totalLinks= driver.findElements(By.partialLinkText("Seleni"));   //first count links with word 'Seleni'. Links are always stored as 'List'. 
		//System.out.println(totalLinks.size());
		
		List<WebElement> totalLink= driver.findElements(By.partialLinkText("More"));     // then count links with 'More' Text
		//System.out.println(totalLink.size());
		
		totalLinks.addAll(totalLink);      // adding another WebElement in first webElement
		
		System.out.println("Total Links: " + totalLinks.size());   // print total links by adding above two results
		
		// 3) click on each link using for loop
		for(WebElement link: totalLinks)
		{
			System.out.println(link.getText());
			link.click();			
			
		}
		
		// 4) get window ID's for every browser window
		Set<String> windowids= driver.getWindowHandles();                   // windowids are always stored in 'Set'.
		System.out.println(windowids);                     
		
		// 5) close specific browser window
		for (String winid: windowids )
		{
			String title= driver.switchTo().window(winid).getTitle();         // getting title of each window
			System.out.println(title);                                        // printing title of each window page 
			
			if(title.contains("disulfide") || title.contains("biology"))
			{
				driver.close();                                               // closing specific windows based on condition
			}
		}
		
		driver.quit();
		
		
		
		
		
	}

}
