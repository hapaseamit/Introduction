package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Hidden Dropdown:
		 - Hidden dropdown has its options hidden/not visible in html to locate.
		 - Sometimes these options are dynamic.
		 - If we try to inspect it, it disappears.
		 - The tag in html is div or any other than select.
		 - By using below ways, we can freeze the dropdown options to appear there location in html.
		 - The xpath can be written or detected to perform further action on options. 
		 * 
		 * 
		 * 
		 Ways to locate hidden/dynamic dropdown options:
		 1. Locating options using selectorhub debugger:
		 - Open the expected page.
		 - Click on 'Turn on debugger' in dev tool's SelectorHub.
		 - Click on expected dropdown within 5 seconds to open the options.
		 - Let the screen freeze. The options will be freezed.
		 - Inspect each option with normal inspect arrow. 
		 - Click on Pause the debugger to come out of it.
		 * 
		 * 
		 2. Using Ctrl+ Shift+ P 'Focus' command in dev tool
		 - Open the expected page and dev tool.
		 - Click on 'Ctrl + Shift + P' on Keyboard. This will open command in dev tool.
		 - Type 'Focus' and select 'Emulate a focused page'. 
		 - Select the hidden dropdown and open options.
		 - The options will be freezed. Locate each option using inspect.
		 - Go to 'Ctrl + Shift + P' -> Focus and select 'Do not emulate a focused page'.
		 * 
		 * 
		 3. Using 'Event Listener' -> 'blur' option in dev tool
		 - Open the expected page and dev tool. 
		 - Click on the hidden dropdown.
		 - Go to 'Event Listener' in dev tool. 
		 - Go to 'blur' option and delete everything in it. If 'blur' option is not visible, refresh the screen and click on dropdown again or try inspecting dropdown.
		 - Go to inspect arrow and inspect dropdown. The options will be freezed. Inspect required options.
		 - Refresh the page to come out of it.
		 Note: This option might be visible for Chrome browser only.
		 *
		 *
		 *		 
		 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Selecting PIM 
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		//Locating dropdown 'Job Title'
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		// Locating all options in dropdown
		List<WebElement> options= driver.findElements(By.xpath("//div[@role='listbox']//span")); // use xpath of parent div tag of options together
		System.out.println("Total options are: " + options.size());
		
		
		// printing options
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
		
		//selecting single option 
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
	
		
		// Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
		
		
	}

}
