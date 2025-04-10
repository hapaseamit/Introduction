package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Checkboxes:  select/unselect

		 * You can select one or more than one checkboxes in the section at a time.
		 * click() function is used to select/unselect checkbox.
		 * isSelected() function is used to check if the checkbox is selected or not.
		 * size() function is used to check the total number of checkboxes.
		 * The checkboxes are stored in List <WebElement> collection variable to perform further action.
		 * You cannot perform click() action on or select/unselect all checkboxes at once. You need to select checkboxes one-by-one by normal for loop or enhanced for loop.
		 * 
		 * Note: For sequential selection/unselection of checkboxes, we can use normal for loop. 
		         To perform action on all checkboxes one-by-one, we can use normal for loop or enhanced for loop.
		         To perform action on specific checkboxes without any sequence, we need to use either condition or specific xpath.
		 
		 * normal for loop: 
		 - Index is used to extract each checkbox from List collection.
		 - Checkbox is an object of type 'WebElement in List collection' which needs get(i) function to perform action on it one-by-one based on index.      
		    
		         
		 * enhanced for loop:
		 - In enhanced for loop we are directly transferring WebElements from checkboxes to chkbox variable for enhanced for loop one by one without indexing. 
		 - So we do not need to use get() function here. We can directly use click() on each WebElement.
		 
		 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) select particular checkbox
		System.out.println(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());   // before selection
		driver.findElement(By.xpath("//input[@id='sunday']")).click();                            // select checkbox
		System.out.println(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());   // after selection
		
		driver.findElement(By.xpath("//input[@id='sunday']")).click();                            // unselect checkbox
		
		// OR
		
		WebElement checkbx_monday= driver.findElement(By.xpath("//input[@id='monday']"));   // saving checkboxes in WebElement variable
		
		System.out.println("Before selection: " + checkbx_monday.isSelected());        // before selection
		checkbx_monday.click();                                                        // select checkbox
		System.out.println("After selection: " + checkbx_monday.isSelected());         // after selection
		
		checkbx_monday.click();                                                        // unselect checkbox
		
		// 2) capturing all the checkboxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']")); //saving all checkboxes in List WebElement variable
		System.out.println(checkboxes.size());                                 // checking the size of checkboxes or total number of checkboxes
		
		
		// 3) selecting all checkboxes
		
		// using normal for loop for indexing
//		for (int i=0; i<checkboxes.size(); i++)      // index start= 0, end= size of checkboxes-1 
//		{
//			checkboxes.get(i).click();               // get(i) is used to get the checkboxes out to perform action. 
//			                      //Checkbox is an object of type 'WebElement in List collection' which needs get() function to perform action on it one-by-one based on index. 
//		}
		
		// OR
		// using enhanced for loop
		for (WebElement chkbox: checkboxes)  // In enhanced for loop we are directly transferring WebElements from checkboxes to chkbox one by one without indexing. 
		{
			chkbox.click();        // So we do not need to use get() function here. We can directly use click() on each WebElement. 
		}            
		
		// Note: You cannot perform click() action on/select/unselect all checkboxes at once. You need to select checkboxes one-by-one by normal for loop or enhanced for loop.

		
		// 4) select last 3 checkboxes
		// starting index= total number of checkboxes- number of checkboxes to be selected
		// 7-3=4
		
		for (int i=4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		// 5) select first 3 checkboxes
		
		for(int i=0; i<3; i++)         // end index is how many number of checkboxes needs to be selected i.e. i= 0,1,2
		{
			checkboxes.get(i).click();
		}
		
		// 6) select previously unselected checkboxes and unselect previously selected checkboxes
		
		for(WebElement chkbx: checkboxes)   // for each checkbox
		{
			chkbx.click();                  // it will perform click i.e. select unselected and unselect selected  
		}
		
		
		
		
		// 7) selecting specific checkboxes
		
//		for(int i=0; i<checkboxes.size();i++)
//		{
//			if(i==2 || i==3 || i== 6)
//			{
//				checkboxes.get(i).click();
//			}
//		}
		
		// OR
//		for(int i=0; i<checkboxes.size();i++)
//		{
//			if(i%2==0)                           // selected checkboxes with indexes 0, 2, 4 and 6
//			{
//				checkboxes.get(i).click();
//			}
//		}
		
		
		// 8) select checkboxes based on value
		
//		String weekname= "Sunday";
//		
//		switch(weekname)
//		{
//		case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
//		            break;
//		case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
//        			break;
//		case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
//        			break;
//		case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        			break;
//		case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
//        			break;
//		case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
//        			break;
//		case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
//        			break;
//        default: System.out.println("Invalid weekname");
//        	
//	    }
	
		
		driver.close();
		
	
	}

}
