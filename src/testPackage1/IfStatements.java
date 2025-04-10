package testPackage1;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*1. if statement:
		 * Syntax: if(condition) {    
			statement 1;              //executes when condition is true   
			}  
		 */
		
		
		int x=10; 
		int y=20;
		if (x+y>20) {
			System.out.println("x+y is greater than 20 i.e. " + (x+y));
		}
		
		System.out.println("*********************");
		
		/* 2. if-else statement:
		 * Syntax: if(condition){
		 * statement 1;             // executes when condition is true
		 * }
		 * else {
		 * statement 2;            // executes when condition is false
		 * }
		 */
		
		
		int a=10;
		int b=20;
		if(a+b>10) {
			System.out.println("a+b is greater than 10.");
		
		} 
		else {
			System.out.println("a+b is less than 10.");
		}

		System.out.println("**************");
		
		/* 3. if-else-if ladder:
		 * Syntax: if(condition 1) {    
					statement 1; //executes when condition 1 is true   
					}  
					else if(condition 2) {  
					statement 2; //executes when condition 2 is true   
					}  
					else {  
					statement 2; //executes when all the conditions are false   
					}  
		 */
		
		String city = "Delhi";  
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}
		else if (city == "Noida") {  
		System.out.println("city is noida");  
		}
		else if(city == "Agra") {  
		System.out.println("city is agra");  
		}
		else {  
		System.out.println(city);                 // This statement gets executed.
		}
		
		
		System.out.println("**************");
		
		/* 4. Nested-if statement: if or if-else statement inside another if or if-else statement.
		 * Syntax: if(condition 1) 
		 *         {    
				      statement 1; //executes when condition 1 is true
				         
					   if(condition 2) 
					    {  
					    statement 2; //executes when condition 2 is true   
					      }  
					   else
					     {  
					      statement 2; //executes when condition 2 is false   
					       }  
					}  
		 */
		
		String address = "Delhi, India";    
	    
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[0]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		}
		
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)      //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }
		
		
		
		
		
		
		
		
	}

}
