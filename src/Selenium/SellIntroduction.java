package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//Safari - SafariDriver -> Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		//Selenium Manager
		
		//Firefox Launch
		//geckoDriver
		//WebDriber.gecko.driver
		//System.setProperty("WebDriver.gecko.Driver", "C:\\Program Files\\geckodriver-v0.35.0-win-aarch64.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		
		//Microsoft Edge Launch
		//WebDriver.edge.Driver
		//System.setProperty("WebDriver.edge.Driver", "C:\\Program Files\\edgedriver_win64.exe");
		//WebDriver driver = new EdgeDriver();
		
		//Chrome Launch
		//System.setProperty("WebDriver.Chrome.Driver", "C:\Program Files\chromedriver-win64\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.linkedin.com/in/suchitra-hapse-83979310b/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
		
		/*
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		*/
		
		//rahulshettyacademy
		

	}

}
