package Selenium;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Varibles and Data Types, Arrays for int and string, for loop, enhanced for loop, 
		
		// hello
		
		//Varibles and Data Types
		int abc =5;             
		//kjhdhj
		String website = "Suchitra Hapase";
		char ch = 'r';
		double dec = 5.99;
		boolean value = true;
		
		System.out.println(website+ " is my name.");      //Always use + sign to concannicate variable with sentence. Sentence always comes in "".
		System.out.println(value);                        //Only variable can be printed directly.
		
		
		System.out.println("******");
				
		//Arrays--> Storing multiple values in one variable.
		
		//Way 1--> If arrays is going to take values while running the program from browser or something, then use Way 1 of Declaring and Initializing Arrays.
		
		//Declaring array --> memory allocation
		int[] arr = new int[5];      //5 number of values will be stored in variable arr using memory allocated by new.
		
		//Initializing array--> assigning values in array
		arr[0] = 1;          //[0] is array index which always starts with 0. So 5 memory allocation will have indexes 0 to 4.
		arr[1] = 2;
		arr[2] =3;
		arr[3]=4;
		arr[4]=5;
		
		//printing value in array
		System.out.println(arr[2]);
		
		System.out.println("******");
		
		//for loop --> for iterative or loop values.
		
				//Initializing and running for loop for array and integer.
				for (int i=0; i<arr.length; i++)          //arr.length is 5 here. Length of array i.e. number of values in array.
				{
					System.out.println(arr[i]);          //Print values in array.
				}
		
		
		System.out.println("******");
						
		//Way 2--> If you know array values in advance, then go with Way2.
		
		//Declaring and Initializing in one line
		int[] arr1 = {7,2,3,6,5};      //Array is declared, memory is assigned and values are stored in memory in one line of code. 
		
		//printing value in array
		System.out.println(arr1[0]);  //[0] is array index which always starts with 0. So 5 memory allocation will have indexes 0 to 4.
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);        //Print values in array.
		}
		
		System.out.println("******");
		
		//Enhanced for loop--> Simplified
		for (int j:arr1)   //for loop will run till all values in array arr1 are printed through variable j.
		{
			System.out.println(j);            //Print values in array.
		}
		
		System.out.println("******");
		
		//for loop for string
		
		String[] name = {"Suchitra","Rinku","Hrugved"};   //String[] syntax makes name variable array which is storing 3 values. Indexes will be 0 to 2.
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("******");
		
		//Enhanced for loop--> Simplified
		for(String s:name)  //for loop will run till all values in array name are printed through variable s.
		{
			System.out.println(s);
		}
		
		System.out.println("****************");
		
		//Declaring and printing array of String Data Type.
		String[] s5= {"Hrithik", "Roshan", "Raj", "Rohit"};
		
		for (int i=0; i<s5.length; i++)
		{
			System.out.println(s5[i]);
		}
		
		System.out.println("******");
		
		//Exercise-- Hands on exercise in retrieving values from Array.
		
		// 1. Create an Array-- Create a new array called numbers to store 5 numerical values of your choice (they can be whole numbers or decimals).
				
		int[] numbers= {1,2,3,4,5};
				
		//2. Access and Print--Print the following: The first element of the numbers array. The last element of the numbers array.
			    
		System.out.println(numbers[0] + " is the first element in array.");
		System.out.println(numbers.length-1 + " is the last element in array.");
			    
		//3. Reverse Order--Using a loop, print the elements of the numbers array in reverse order.
		
		System.out.println("The reverse order of array is as below:");
		for (int i=(numbers.length-1); i>=0; i--)
		{
			System.out.println(numbers[i]);	    	
		}
			    
		//4. Bonus: Element Count-- Calculate the total number of elements within the numbers array.
		System.out.println(numbers.length + " is the total number of elements in array.");
		
		
		System.out.println("******");
		
		//2. Transfer values in one array to another in sequence.
		
		int[] arr4= {1,2,3,4,5,6,7,8};
		int[] arr5= new int[arr4.length];
		
		for(int i=0; i<arr4.length; i++)
		{
			arr5[i]=arr4[i]; 
			System.out.println(arr5[i]);
		}
		
		System.out.println("Array 4 is:");
		for (int num3 :arr4)
		{
		   System.out.println(num3);
		}
		
		System.out.println("Array 5 is :");
		for (int num4 :arr5)
		{
			System.out.println(num4);
		}
		
		System.out.println("******");
		
		//3. Transfer values in one array to another in reverse order.
		
				int[] arr6= {1,2,3,4,5,6,7,8};
				int[] arr7= new int[arr6.length];
				
				for (int i=0; i<arr6.length; i++)
				{
					arr7[i]= arr6[arr6.length-1-i];
					System.out.println(arr7[i]);
					
				}
				
				System.out.println("Array 6 is:");     //printing array 6
				for (int num1 : arr6)
				{
					System.out.println(num1);
				}
				
				
				System.out.println("Array 7 is:");      //printing array 7
				for (int num2 : arr7)
				{
					System.out.println(num2);
				}
				
				System.out.println("******");
				
				for (int i=0; i<arr7.length; i++)       //another way of printing array 7
				{
					System.out.println(arr7[i]);
				}
	}
	
	

}
