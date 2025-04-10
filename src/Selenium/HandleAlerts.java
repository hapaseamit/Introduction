package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/* Alert:
		 * Alert winodows are not WebElements. We cannot inspect the buttons on Alert window. 
		 * We need to handle alerts for uninterrupted execution. 
		 * There are different ways to handle different Alerts.
		 Methods to handle alerts:
		 driver.switchTo().alert().accept();    --> closing alert box using OK button
		 driver.switchTo().alert().dismiss();   --> closing alert box using Cancel button
		 driver.switchTo().alert().getText();   --> capture text value of alert box
		 driver.switchTo().alert().sendKeys();  --> enter the text into input box of alert box 
		 
		 1. Normal alert with OK button:
		 * When a button is clicked on existing Webpage, the alert window opens.
		 * The button internally calls the JavaScript alert to open the alert box. 
		 * This alert has only one button on it 'OK'.
		 * To handle this alert, first we need to switch the focus to that alert box and then we use accept() method to close the alert box.  
		 * 
		 */
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// 1) Normal alert with 'OK' button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();      // This button opens alert box.
		
//        Alert js_alert=driver.switchTo().alert();        // switchTo() alert box, then store alert box in a variable of Interface Alert.
//        js_alert.accept();                               // To close alert box use accept() method.
        
        //OR
        Thread.sleep(5000);                        // This is written here just to check the alert box. No need to write in actual script.
        
        driver.switchTo().alert().accept();            // accept the alert without storing it in a variable.
        
        
        // 2) Confirmation Alert: 'OK' and 'Cancel' Buttons
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();     // This button opens alert box.
        
        Thread.sleep(5000);                       // This is written here just to check the alert box. No need to write in actual script.
        
//        driver.switchTo().alert().accept();       // clicks on 'OK' button OR Accepts the alert box. It actual does not click 'OK' button, it is internal Java method.
        driver.switchTo().alert().dismiss();      // clicks on 'Cancel' button OR dismisses the alert box 
        
        
        // 3) Prompt Alert: Input Box
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();  // This button opens alert box.
        Thread.sleep(5000);
        
        Alert prompt_alert= driver.switchTo().alert();  // Prompt Alert box is stored in Alert class variable/object to perform further action.
        
        System.out.println(prompt_alert.getText());         // printing the text of alert box
        System.out.println(prompt_alert.getText().equalsIgnoreCase("I am a JS prompt"));   // comparing the text of alert box with expected value
        
        prompt_alert.sendKeys("Welcome");      // entering text in alert input box. This text is not visible in input box on UI as it happens internally and not on Alert page.
        prompt_alert.accept();                 // accepts the alert box.
        
        
        // verifying successful message on UI
        String msg=driver.findElement(By.xpath("//p[@id='result']")).getText();  // storing message on WebPage in a variable for further validation.
        System.out.println(msg);            // msg text is 'You entered: Welcome'
        
        if(msg.contains("Welcome"))        // check Webpage msg with expected text
        {
        	System.out.println("Test case is passed.");    // if matches
        }
        else
        {
        	System.out.println("Test case failed.");       // if does not match
        }
        
        
        driver.close();
        
	}

}
