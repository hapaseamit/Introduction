package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if, if...else, if...break
		
		//Print values which are multiplied by 2 from arr2.
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,11,22,55,98,101,122};
		
		//if condition--> When if condition is met, it executes code inside till for loop is completed and inside code is executed for all true conditions of if. 
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
			}
		}
		
		System.out.println("******");
		
		//if else condition--> When if condition is met, it executes code inside if condition otherwise it goes to execute else condition.  
		
		for (int i=0; i<arr2.length; i++)
		{
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i] + "is multiplied by 2.");
			}
			else
			{
				System.out.println(arr2[i] + "is not multiplied by 2." );
				
			}
		}
		
		System.out.println("******");
		
		//Break --> Stops the execution when if condition is met, then it doesn't execute further loop. It breaks out of for loop.
		           //It is usually used when for loop and if conditions are used together.
		//Check if array arr3 has multiple of 2.
		
		int[] arr3 = {1,3,5,7,4,5,8,10};
		for (int i=0; i<arr3.length; i++)
		{
			if(arr3[i]%2 == 0)
			{
				System.out.println(arr3[i]);
				break;
			}
			
		}

		System.out.println("******");
		
		//ArrayList--> Dynamic Array. Memory allocation and values in array can be defined at the run time.
		
		//Declaration of ArrayList Class.
		ArrayList a1 = new ArrayList();        //Memory allocated here but the size of the memory is not decided or fixed.
		
		ArrayList<String> a = new ArrayList<String>();    //String Array
		a.add("Suchitra");                     //add() is used to add values in ArrayList.
		a.add("Rinku");
		a.add("Selenium");
		a.add("Automation");
		a.add("Tools");
		System.out.println(a.get(2));          //get() is used to extract the value from ArrayList.
		
		a.remove(2);                           //remove() is used to remove any value from ArrayList.
		System.out.println(a.get(2));
		
		System.out.println("******");
		
		//Print all values in ArrayList.
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("******");
		
		//Enhanced for loop
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println("******");
		
		//Exercise:
		//1. Check if any particular value is present in ArrayList.
		
		System.out.println(a.contains("Automation"));
		
		
		System.out.println("******");
		
		//2. Convert any normal array to ArrayList or List.
		
		String[] s1 = {"Suchitra","Rinku","Automation","Tools"};  //normal array s1.
		List<String> s2= Arrays.asList(s1);         //conversion to ArrayList or List using Arrays.asList(normal array name); Arrays & List are different classes here.
		System.out.println(s2.contains("Tools"));   //New converted array is s2. Now use all methods of ArrayList on s2.
		
		
		
		}
		
		
		
	}

