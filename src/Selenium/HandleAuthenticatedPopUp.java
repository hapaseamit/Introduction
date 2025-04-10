package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Authenticated Pop-ups:
		 - The pop-ups with Username and password input fields are called Authenticated pop-ups.
		 - We need to bypass these pop-ups to proceed further.
		 - While entering URL, we provide username and password and the pop-up gets handled automatically.
		 
		 Syntax: http://username:password@the-internet.herokuapp.com/basic_auth
		 Provide necessary username and password in URL opening itself.
		 
		 * Note: To handle authenticated pop-ups, this is the only approach we can use.
		 */
		
		
		
		WebDriver driver = new ChromeDriver();
		
		// driver.get("http://the-internet.herokuapp.com/basic_auth");      // actual URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");      // add username and password in the URL
		
		driver.manage().window().maximize();
		
		driver.close();

	}

}
