package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Web Tables:
		 - Data in rows and columns.
		 - We capture the data in table and do some validations.
		 - tagName of Web Tables in html is 'table'.
		 - html structure: 'table' -> 'tbody'-> 'tr' -> 'td' 
		 - 'tr': table rows 
		 - 'th': table header
		 - 'td': table data   
		 - 'th' or 'td' count in one 'tr' represents number of column.  
		 - 1st tr contains table header data. 'th' is present only once in a table.
		 - 2nd tr is where actual data starts. 
		 - Values in table or data in table is always of dataType 'String' initially as values from table are extracted as 'String' mostly using getText(). 
		 
		 * 
		 *
		 Types of Web Tables:
		 1. Static Web Tables
		 2. Dynamic Web Tables
		 3. Table with pagination
		 		 
		 * 
		 * 
		 1. Static Web Tables:
		 - Static Web table has fixed rows and fixed columns on UI.
		 - Data is also static.
		 - Easy to handle
		  
		 * 
		 * 
		 2. Dynamic Web Tables:
		 - The number of rows keeps adding or reducing but columns will be fixed.
		 - The data keeps changing.
		 - The data is dynamic. 
		 - The full table is present on the UI. 
		 
		 * 
		 * 
		 3. Table with pagination
		 - The table is divided in multiple pages on UI. Page numbers are visible on UI for navigation.
		 - e.g. if 100 records are present in table, then 1st page on UI shows only 10 records, 2nd page shows next 10 records and so on..
		 - Pagination table design may change for each application.
		 - Data is dynamic.
		 
		 *
		 *
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// 1) finding total number of rows in a table
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // The xpath is created using tablename, then going till tr i.e table rows.
		                                                                  // size() gives count of total numbers of rows in a table.
		                                            // This xpath is used when multiple tables are present on single webpage.
		System.out.println("Total rows: " + rows);    
		
	//	int rows= driver.findElements(By.tagName("tr")).size();  // Directly 'tr' with tagName can be located and calculated if only one table is present on page.
		
		System.out.println("****************");
		
		// 2) finding total number of columns in a table
	//	driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();  // create xpath using table 'name'-> 'tr' i.e. row 1 which is header row
		                  // then go till 'th' using relative xpath. This will count total number of columns as number of header names means number of columns.
		
		int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // As 'th' is present only once in a table, by counting total 'th' count in 1st 'tr'
		                                                   // we can easily get the total columns in a table.
		System.out.println("Total columns: " + columns);
		
		System.out.println("****************");
		
		// 3) Read data from specific row and column (e.g. row 5, col 1)
		
		String book= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); // To extract particular data, mention row and column number in xpath.
		System.out.println(book);
		
		System.out.println("****************");
		
		// 4) Read data from all rows and columns
		
		System.out.println("BookName" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
		
		for(int r=2; r<= rows; r++)   // 'r' represents rows here. r=1 is header row which we do not mention here as we are printing data only i.e. from row2. 
		{
			for(int c=1; c<=columns; c++) 
			{
				
				String data= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();                     
				// r and c are variables here and we cannot pass variables directly in xpath. 
				// There is a specific syntax we need to follow to pass variables in xpath.
				// Syntax: "+r+" i.e. "+ signs before and after the variable in xpath.
				
				System.out.print(data + "\t");
				
			}
			System.out.println();
		}
		
		System.out.println("****************");
		
		// 5) Print book names whose author is Mukesh
		
		for(int r=2; r<= rows; r++)   // 'r' represents rows here. r=1 is header row which we do not mention here as we are printing data only i.e. from row2. 
		{
			
		   String authors= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText(); // extract all author names first using column td=2
		   
		   if(authors.equals("Mukesh"))  // expected condition
		   {
			   String bookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText(); 
			                       // extracting bookName which is column 1 for rows as per expected condition i.e. Author Mukesh
			   System.out.println(bookName + "\t" + authors);
		   }
		   
		}
		
		System.out.println("****************");
		
		// 6) find total price of all books
		
		int total=0;
		for(int r=2; r<=rows;r++)
		{
		   String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();  //getText() always gives String value. 
		   total= total + Integer.parseInt(price);  // Here 'price' is String value and we are converting it to int to perform arithmatic operation on it.
		}                                           // using Integer.parseInt(String variable) method.
		
		System.out.println("Total price:" + total);
		
		
		
		
		driver.close();

	}

}
