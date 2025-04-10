package Selenium;


public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//String
		
		//String is an object in Java which represents sequence of characters.
		
		//Declaring String with String literal ----> commonly used method
		String s1= "Suchitra Subhash Hapase";   //s1 is object. Memory is allocated to value in s1.
		String s2= "Suchitra Subhash Hapase";   //s2 is object with same value. But it will not create new object. If value in String s2 is same, Java will check it
		System.out.println(s2);                 // & point to the first object created i.e. s1. Only firstly created memory will be used here. No new memory allocation.
		
		//Declaring String with new ------> Always creates new object and new memory allocation.
		String s3= new String("Suchitra Subhash Hapase");  //Even if String values are same, with this declaration 2 new objects will be created and new memory is 
		String s4= new String("Suchitra Subhash Hapase");  // allocated every time.
		System.out.println(s3);
		
		System.out.println("******");
		
		//Splitting String by white space
		String s= "Suchitra Rinku Automation";
		String[] splittedString=s.split(" ");      //String s is splitted by white space "  ". It becomes Array now and stored in splittedString object.
		System.out.println(splittedString[0]);     //printing array values.
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		System.out.println("******");
		
		for (int i=0; i<splittedString.length; i++) //Printing String in the form of Array.
		{
			System.out.println(splittedString[i]);
		}
		
		System.out.println("******88888888");
		
		//Enhanced for loop
		for (String s5: splittedString)          //Printing String in the form of Array.
		{
			System.out.println(s5);
		}
		
		System.out.println("******");
		
		//Splitting String by Rinku
		String[] splittedString1= s.split("Rinku");
		System.out.println(splittedString1[0]);     //printing array values.
		System.out.println(splittedString1[1]);
		
		System.out.println(splittedString1[1].trim());  //trim method trims white spaces on either sides of String.
		
		System.out.println("******");
		
		
		//Exercise on String.
		
		// 1. Printing each character in String in sequence.
		
		String s6="Learning Selenium Automation";
		
		for(int i=0; i<s6.length(); i++)           //s6.length() is used to get the size of the String.
		{
			System.out.println(s6.charAt(i));      //.charAt(index) is used to get the each character from the String.
		}
		
		
		System.out.println("******");
		
		// 2. Printing each character in String in reverse order.
		
		String s7="Basic Java Tutorial";
		for (int i=s7.length()-1; i>=0; i--)       // .length() is used to get the size of the String.
		{
			System.out.println(s7.charAt(i));      //.charAt(index) is used to get the each character from the String.
		}
		
		
		
		
	}

}
