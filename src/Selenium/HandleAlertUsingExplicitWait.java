package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Handling Alert using Explicit Wait:
		 - Here without using switchTo() command to alerts, you can handle alerts using explicit wait.
		 - Use 'ExpectedCondition' as 'alertIsPresent()' for explicitly waiting for alert to be present. 
		 * 
		 */
		
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));     // declaration of explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();   // opens alert box
		
		Alert myalert= mywait.until(ExpectedConditions.alertIsPresent());   // This condition checks if alert is present and saves it in a Alert variable for further use.
		
		myalert.accept();     // closing the alert
		
		driver.close();
		
		
		
		
		

	}

}
