package testPackage1;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		sortStrngArray();
//		trim();
//		printchar();
//		checksubstrng();
//		compareStr();
//		repSubstrng();
//		extractsubstrg();
//		convertStr();
//		divideStrng();
//		reverseStrng();
//		bufferStrng();
//		builderStrng();
//      compareStrng();
//		convert();
//		
		// String class objects- immutable
		String s1= "Welcome";               // String is immutable i.e. value cannot be changed even after performing operations
		s1.concat(" to Java.");            // Only if value is not saved in a variable new or same, then it is immutable otherwise mutable
		System.out.println(s1);            // s1 value remains same.
		
		String s2= "Welcome";               // String is immutable i.e. value cannot be changed even after performing operations
		s2=s2.concat(" to Selenium.");            // Only if value is not saved in a variable new or same, then it is immutable otherwise mutable
		System.out.println(s2);             // s2 value changes here.
		
		//StringBuffer class object  - mutable
		StringBuffer s3= new StringBuffer("API");  
		s3.append(" Testing");
		System.out.println(s3);         // value of object gets changed after any operation
		
		//StringBuilder class object- mutable
		StringBuilder s4= new StringBuilder("Postman");
		s4.append(" for API.");
		System.out.println(s4);         // value of object gets changed after any operation
		
		
	}
	
	
	
	
	//sorting String Array
	   public static void sortStrngArray()
	   {
		   String[] s= {"Java", "Selenium", "API", "Cucumber"};
		   
		   System.out.println("Before sorting Array: " + Arrays.toString(s));
		   Arrays.sort(s);
		   System.out.println("After sorting Array: " + Arrays.toString(s));
		   
		   System.out.println("*************************************");
	   }
	
	//String length() and trim() function- removes blank spaces from left and right side. Length always starts from 1.
	public static void trim()
	{
		String s= "   Welcome    ";
		
		System.out.println(s.length());
		System.out.println("Before trim: " +s);
		s.trim();
		System.out.println("After trim: " +s.trim());
		System.out.println((s.trim()).length());
		
		System.out.println("*************************************");
		
	}

	
	//charAt() - returns a character based on index. index always starts from 0.
	
	public static void printchar()
	{
		String s= "Welcome to the World!";
		
		s.charAt(8);
		System.out.println("Character at index 8: "+ s.charAt(8));   // t
		System.out.println("Character at index 7: "+ s.charAt(7));   // blank space
		
		System.out.println("*************************************");
	}
	
	
	//contains()- returns boolean value. Checks if substring is a part of main string.
	public static void checksubstrng()
	{
		String s= "Welcome to the World!";
		
		System.out.println(s.contains("Wel"));    //true
		System.out.println(s.contains("ome "));   //true
		System.out.println(s.contains("world"));  //false
		
		System.out.println("*************************************");
	}
	
	
	//equals() or equalsIgnoreCase() - compare 2 entire Strings
	public static void compareStr()
	{
		String s1= "Welcome";
		String s2= "welcome";
		
		System.out.println(s1.equals(s2));            // false
		System.out.println(s1.equalsIgnoreCase(s2));  // true
		System.out.println(s1.equals("Hi"));          // false
		System.out.println(s1.equals("Wel"));         // false
		
		System.out.println("*************************************");
	}
	
	//replace() - replace character or sequence of character(String) in a String
	
	public static void repSubstrng()
	{
		String s= "Welcome to the World!";
		
		System.out.println((s.replace("Wel", "Hi ")));
		System.out.println(s.replace('e', 'x'));
		System.out.println("*************************************");	
		
		
		String s1= "$15,20,20";
		System.out.println(s1.replace("$","").replace(",", ""));     // 152020
		
	}
	
	//substring() - returns substring from a String
	// syntax: s.substring(starting index, end index)  --> substring is printed with starting index till (end index-1)
	public static void extractsubstrg()
	{
		String s= "Welcome";
		
		System.out.println(s.substring(0, 3));
		System.out.println(s.substring(1, 7));     // here end index can be till the length() of the string i.e. 7
		
		System.out.println("*************************************");	
	}
	
	//toUpperCase   toLowerCase  - converting String to Uppercase or Lowercase
	public static void convertStr()
	{
		String s= "Welcome to the World!";
		
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 System.out.println("*************************************");
		
		
	}
	
	
	//spilt() - split/divide the string into multiple parts based on delimiter
	
	public static void divideStrng()
	{
		String s= "abd@gmail.com";
		
		String[] a=s.split("@");                  // abd gmail.com in array form
		System.out.println(a[0]);                 // abd     in 
		System.out.println(a[1]);                 // gmail.com 
		
		
		String s1="abc,123@xyz";
		
		String[] s2=s1.split(",");                       // abc 123@xyz   in array form
		String[] s3=s2[1].split("@");                    // 123 xyz  in array form
		
		
		System.out.println(s2[0].concat(s3[0]).concat(s3[1]));    // abc123xyz
		System.out.println(s2[0]+ " "+ s3[0] + " " + s3[1]);      // abc 123 xyz
		
		 
		String s4= "abc 123 xyz";
		
		String[] s5=s4.split(" ");                         // abc 123 xyz in array form
		System.out.println(Arrays.toString(s5));           // [abc,123,xyz]
		
		 System.out.println("*************************************");
		
	}
	
	public static void reverseStrng()
	{
		String s= "Selenium";
		String rev="";
		
		System.out.println("Original String is: "+ s);
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev + s.charAt(i);
		}
		System.out.println("Reversed String is: " + rev);
		System.out.println("*************************************");
	}
	
	
	// Reverse a string using StringBuffer class	
	public static void bufferStrng()
	{
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println(s.reverse());
		
		 System.out.println("*************************************");
	}
	
	// Reverse a string using StringBuilder class	
		public static void builderStrng()
		{
			StringBuilder s=new StringBuilder("Welcome");
			System.out.println(s.reverse());
			
			 System.out.println("*************************************");
		}
	
	//compare 2 Strings
		
		public static void compareStrng()
		{
			String s1= "Welcome";              // String literal 
			String s2= "Welcome";              // String literal    both will point to same value in String pool
			
			System.out.println(s1==s2);           // true
			System.out.println(s1.equals(s2));   // true
			
			System.out.println("*************************************");
			
			String s3= new String("Selenium");   // new object created with value Selenium
			String s4=new String("Selenium");    // new object created with value Selenium     -- both objects are different , created in heap memory.
			
			System.out.println(s3==s4);         //false      == is used to compare objects
			System.out.println(s3.equals(s4));  //true       equals() is used to compared values inside
			
			System.out.println("*************************************");
			
			String s5= "Welcome";
			String s6= new String("Welcome");
			String s7=s6;
			
			System.out.println(s5==s6);            //false
			System.out.println(s5.equals(s6));     //true
			
			System.out.println(s6==s7);           // true
			System.out.println(s6.equals(s7));    //true
			
			System.out.println("*************************************");
			
		}
	
	
	public static void convert()
	{
		String[] s= {"Welcome", "to", "Java", "Programming"};
		
		for (String x: s)
		{
			System.out.println(x);
		}
			
			
	}
	
	
}
