package Selenium;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseStaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		
		// 1) Select departure city, destination city and find flights. 
		WebElement city_drp= driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select city_dropdn= new Select(city_drp);
		city_dropdn.selectByValue("Boston");             // selected departure city Boston
		
		
		WebElement desti_drp= driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select desti_dropdn= new Select(desti_drp);
		desti_dropdn.selectByVisibleText("London");   // selected destination city London
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
		// 2) Check table and count rows and columns
		int rows= driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();      // find total rows in table
		System.out.println("Total rows: " + rows);                                                                 // rows 5
		
		int col= driver.findElements(By.xpath("//table[@class='table']//th")).size();      // find total columns in table
		System.out.println("Total columns: "+ col);                                                           // columns 6
		
		
		// 3) store each price value in Array- It will be String Array as values in table are extracted as 'String' initially.
		String[] arr_price = new String[rows];   //Declare an String Array to store values in Price column. Array index 0-4.
		
		for(int r=1; r<=rows; r++)       // row starts with 1 for data, rows=5
		{
			String price= driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();  // use getText() method on last column to get all prices
			//System.out.println(price);
			
			arr_price[r-1]= price;           // Array index should be 0 so r-1=0. No need to define one more for loop.
		}
		
		// 4) printing values in Array
		for(String a: arr_price)
		{
		    System.out.println(a + " ");
		}
		
		
		// 5) sorting the prices in an Array and then find lowest price
		Arrays.sort(arr_price);                     // Arrays.sort(array_name) will sort String price Array in ascending order.
		String lowest_price= arr_price[0];          // At 0 index, lowest price will be there after sorting. Store it in String variable for further action.
		System.out.println("Lowest price: " + lowest_price);
		
		
		// 6) Click on 'Choose the flight' button having lowest price in the table
		for(int r=1; r<=rows; r++)       // row starts with 1 for data, rows=5
		{
			String price= driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();  // use getText() method on last column to get all prices
			if(price.equals(lowest_price))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]//input")).click(); // Relative xpath is written till //input as button 'Choose the flight' is located there to click.
			    break;
			}
		}
		
		// 7) Fill the details and purchase flight
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ajay Verma");
		driver.findElement(By.id("address")).sendKeys("123 Main st");
		driver.findElement(By.id("city")).sendKeys("Boston");
		driver.findElement(By.id("state")).sendKeys("Minnopolis");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		
		WebElement card= driver.findElement(By.xpath("//select[@id='cardType']"));
		
		Select card_type= new Select(card);
		card_type.selectByValue("visa");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234565478915698");
		driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		driver.findElement(By.id("creditCardYear")).sendKeys("2024");
		driver.findElement(By.id("nameOnCard")).sendKeys("Ajay Verma");
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		
		// 8) Validation message
		
		String msg= driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText();
		
		if(msg.equals("Thank you for your purchase today!"))
		{
			System.out.println("Success: Test case is Passed");
		} else
		{
			System.out.println("Failed");
		
		}
		
		
		driver.quit();
		
		
		
		
		
	}

}
