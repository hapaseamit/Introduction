package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Radio buttons:
		 * You can select only one Radio button at a time.
		 * click() function is used to select/unselect the radio button.
		 * isSelected() function is used to check the status of the radio button.
		 * Looping statements do not work on Radio buttons as we cannot select more than one radio button.
		 * 
		 * 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male_rd= driver.findElement(By.xpath("//input[@id='male']"));      //saving male radio button in WebElement variable
		WebElement female_rd= driver.findElement(By.xpath("//input[@id='female']"));  //saving female radio button in WebElement variable
		
		System.out.println("Before selection...");
		System.out.println("Male radio button: " + male_rd.isSelected());
		System.out.println("Female radio button: " + female_rd.isSelected());
		
		System.out.println("After male radio button selection...");
		male_rd.click();                                                            // selected male radio button
		System.out.println("Male radio button: " + male_rd.isSelected());
		System.out.println("Female radio button: " + female_rd.isSelected());
		
		System.out.println("After female radio button selection...");
		female_rd.click();                                                          // selected female radio button
		System.out.println("Male radio button: " + male_rd.isSelected());
		System.out.println("Female radio button: " + female_rd.isSelected());
		
		
		// Assignments
		// Radio button: https://practice.expandtesting.com/radio-buttons
		// Checkboxes: https://practice.expandtesting.com/checkboxes
		

	}

}
