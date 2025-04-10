package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Handling Frames in Page:
		 - Frames contains different WebElements like text field, radio button, checkbox etc.
         - inner frame/ nested frame: A frame inside another frame is called inner frame or nested frame. i.e. normal frame/iframe
		 - iframe: A frame contains external Webpage embedded in it which has WebElements of its own is called iframe.
		 
		 Methods to handle frames and iframe:
		 
		 Handling frames:
		 - driver.switchTo().frame(name);
		 - driver.switchTo().frame(id);
		 - driver.switchTo().frame(WebElement);
		 - driver.switchTo().frame(index);
		 
		 Switching to Page: driver.switchTo().defaultContent();
		 
		 Handling iframe:
		 - driver.switchTo().frame(name);
		 - driver.switchTo().frame(id);
		 - driver.switchTo().frame(index);     // This is most commonly used to switchTo() iframe inside a frame.
		 Note: You can open iframe link separately in browser and inspect WebElements for it. 
		 
		 Handling Independent frames on a page:
		 - To switch from frame1 to frame2, you need to come out of frame1 first, then switch to outer page and then switch to frame2.
		 - Direct frame1 to frame2 switching not possible.
		 Syntax: driver.switchTo().defaultContent();       --> This moves cursor to default page.
		 
		 Handling inner frame/nested frame:
		 - Let's say frame2 is inside frame1. Now we can switch to frame1 from page using switchTo.frame() methods.
		 - For nested frame, we can directly switch to frame2 from frame1. No need to go to main page.
		 - But switching from frame2 to frame1 is not possible. You need to come out of frame2 and go to defaultContent() and then switchTo() frame1.
		 
		 
		 Note: You can also switch to inner frame using explicitWait with condition of WebElement presence of that inner frame/page and then perform further action.
		 
		 */
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));  //store frame in WebElement variable for further actions
		driver.switchTo().frame(frame1);                                                  // switching to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");   
		
		driver.switchTo().defaultContent();            // coming out of frame1 and switching to main page
		
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));  //store frame in WebElement variable for further actions
		driver.switchTo().frame(frame2);                                                 // switching to frame2
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automtion");
		
		driver.switchTo().defaultContent();          // coming out of frame1 and switching to main page
		
		
		//Frame 3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("programming");
		
		driver.switchTo().frame(0);       // As there is only one inner frame iframe, we can use index here to switch to this frame.
		
		driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();  // WebElement radio button of inner frame
		driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();  // WebElement checkbox of inner frame
		
		
		driver.switchTo().defaultContent();
		
		// frame 5
		WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		// Switching and Locating inner frame by applying explicitWait with condition of WebElement presence of that inner frame/page 
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));      // declaration of explicitWait
		
		WebElement logo= mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']"))); // checking presence of logo on that inner page
																												// switching to inner frame happened here
		System.out.println(logo.isDisplayed());                                 // printing if logo is displayed
		driver.findElement(By.xpath("//span[normalize-space()='1. Get Ui.Vision (free)']")).click();     // performing further action on inner page
		driver.findElement(By.linkText("Desktop Automation")).click();
		
			
		
		driver.close();
		

	}

}
