package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 getWindowHandle() --> to get window ID of single window in browser 
		 getWindowHandles() --> to get window IDs of multiple windows in browser
		 
		 Handling Browser Windows:
		 - Save Window IDs with getWindowHandles() command in 'Set' String variable.
		 - Convert windowids 'Set' to 'List' (ArrayList) to perform operations on different windows.
		 
		 1st Approach: Converting 'Set' to 'List'
		 Syntax: Set<String> windowList= new ArrayList<String> (windowids);       //OR
		         Set<String> windowList= new ArrayList<> (windowids);
		         
		         String parentID= windowList.get(0);     // saving each window ID by index in String variable
		         String childID= windowList.get(1);      // parentID and childID are window ID variables here
		         
		 Switching between windows:
		 Syntax: driver.switchTo().window(windowID);    // switch to another window using window ID variable
		 
		         driver.switchTo().window(parentID);    
		         driver.switchTo().window(childID);
		 
		 Note: This approach is recommended only if you have 2-3 windows opened.
		         
		 
		 2nd Approach: using 'enhanced for loop'
		 Syntax: for (String winID= windowids)              // saving each windowid in winID one by one to perform action based on condition
		        {
		           String title= driver.switchTo().window(winID).getTitle();    //saving title for current winID in variable
		           
		           if (title.equals("your title"))                         // title checking condition
		           {
		             System.out.println(driver.getCurrentUrl());          // if condition matches, get current url.
		             //some other actions/validations
		           }
		  
		        }
		 
		 Note: This approach is used when multiple windows are opened.
		 
		 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids= driver.getWindowHandles();
		System.out.println(windowids);
		
		
		
		//1st Approach: converting Set into List                      // Converting windowID 'Set' to 'List' (ArrayList) to perform actions on it
		List<String> windowList= new ArrayList<String>(windowids);    // Or declare as new ArrayList<>(windowids)
		
		String parentID= windowList.get(0);               // saving each window ID by index in new String variable 
		String childID= windowList.get(1);
		
		System.out.println(driver.getTitle());                   // By default the cursor focus is on parent window always.
		
		//switch to child window
		driver.switchTo().window(childID);      //switching between windows
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);    //switching between windows
		System.out.println(driver.getTitle());
		
		
		
		
		
		//2nd Approach: using enhanced for loop
		
		for (String winID: windowids)            // enhanced for loop: for each window ID
		{
			String title= driver.switchTo().window(winID).getTitle();   // save each title one-by-one in 'title' variable
			
			if (title.equals("Human Resources Management Software | OrangeHRM HR Software"))  // check condition
				{
					System.out.println(driver.getCurrentUrl());       // perform some actions on this window
					// perform some actions/validations on window
				}
			
		}
		

		//Assignment: close unwanted windows
		
		for (String winid: windowids)
		{
			String winTitle= driver.switchTo().window(winid).getTitle();
			
			if(winTitle.equals("Human Resources Management Software | OrangeHRM HR Software") || winTitle.equals("any other title"))      //here focus switches to child ID
			{
				driver.close();
			}
		}
		
		
		
		driver.quit();
		
		
		
	
		
		
	}

}
