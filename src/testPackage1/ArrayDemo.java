package testPackage1;

import java.util.Arrays;
import java.util.Scanner;  


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking the size of Array and values in Array as User Input.
		
		ArrayDemo a=new ArrayDemo();        // object of class created to call functions
		
//		a.userip();
//		a.maxnumber();
//		a.findSecondmaxNum();
		a.readData();
//		a.read2DArray();
//		a.sumArray();
		//a.printEvenOddNum();
		//a.countEvenOdd();
		//a.printEvenOddTogether();
		//a.searchElementinArray();
		//a.findDuplicates();
		//a.duplicateNumber();
		//a.findEvenOdd();
		//a.finEvenOddNumber();
		//a.findEvenOddEnhanced();
		//a.countArray();
		//a.countOfArray();
		//a.printArray();
		//sortArray();
		//reverseAnArray();
		//reverseArrayInNew();
		//readDataA();
		//checkLengt();
		//checkLengt1();
		
	}
		
	public void userip() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size");
		int num= sc.nextInt();
		//int value=0;
		
		int[] arr= new int[num];
		
		System.out.println("Enter elements of Array");
		
		for (int i=0; i<num; i++)
		{
			arr[i]= sc.nextInt();
					
		}
		
		for (int i=0; i<num; i++)
		{
			//value= arr[i];
		System.out.println(arr[i]);
		}
		sc.close();
		System.out.println("********************");
	}

	//Search maximum number in Array
	
	public void maxnumber() {
		
		int[] arr = {10, 20, 15, 30};
		int max=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if (max < arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value in Array is: " +max);
		
		System.out.println("********************");
		
	}
	
	//Find second maximum number in Array
	
	
public void findSecondmaxNum() {
		
		int[] arr = {15, 12, 18, 10};
		int temp;
		
		for (int i=0; i<arr.length-1;i++)
		{
			
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
		}
			
		System.out.println(arr[(arr.length)-2]);
		System.out.println("********************");
	}
	

   //reading data from 2D Array using for loop
   public void readData()
   {
	   int[][] a= {{10,20}, {30,40,50}, {60,70,80,90}};
	   
	   
	   
	   for (int i=0; i<a.length; i++) 
	   {
		   int counter=0;
		   for(int j=0; j<a[i].length;j++)
		   {
			   System.out.print(a[i][j]+ " ");
			   counter++;
			   
		   }
		   System.out.println();
		   System.out.println("Column length for row " + i + " is "+ counter);
		   
	   }
	   System.out.println("********************");
   }

  //reading data in 2D Array using enhanced loop
   public void read2DArray()
   {
	   int[][] a= {{100,200}, {587,694,300}, {78,50,96}};
	   
	   for (int arr[]: a)
	   {
		   for (int x: arr)
		   {
			   System.out.print(x + " ");
		   }
		   System.out.println();
	   }
	   System.out.println("********************");
   }
   
   //Find Sum of Elements in Array
   
   public void sumArray()
   {
	   int[] a= {1,2,3,4,5};
	   int sum=0;
	   
	   for (int i=0;i<a.length;i++)
	   {
		   sum=sum+a[i];
	   }
	   System.out.println("Sum of Array values is: "+ sum);
	   
	   System.out.println("********************");
   }
   
   //Print Even and Odd numbers from array
   
   public void printEvenOddNum()
   {
	   int[] a={1,2,3,4,5,6};
	   
	   for (int i=0;i<a.length; i++)
	   {
		   
		   if(a[i]%2==0)
		   {
			   System.out.println("The even numbers are: " + a[i]);
		   }else
		   {
			   System.out.println("The odd numbers are: " + a[i]);
		   }
	   }
	   System.out.println("********************");
   }
   
 //Print Even and Odd numbers together in a line from array
   public void printEvenOddTogether() {
	    int[] a = {1, 2, 3, 4, 5, 6};

	    System.out.print("Even Numbers:");
	    for (int i = 0; i < a.length; i++) 
	    {
	        if (a[i] % 2 == 0) 
	        {
	            System.out.print(a[i] + " "); // Print all evens first
	        }
	    }
        
	    System.out.print("\nOdd Numbers:");
	    for (int i = 0; i < a.length; i++) 
	    {
	        if (a[i] % 2 != 0) 
	        {
	            System.out.print(a[i] + " "); // Print all odds after evens
	        }
	    }
	    
	    System.out.println("\n********************");
   }
   
   
   //count even and odd numbers from array
   public void countEvenOdd()
   {
	   int[] a={1,2,3,9,5,6};
	   
	   int even=0, odd=0;
	   
	   for (int x: a)
	   {
		   if (x%2==0)
		   {
			   even++;
		   }
		   else
		   {
			   odd++;
		   }
	   }
	   System.out.println("The even numbers are: " + even);
	   System.out.println("The odd numbers are: " + odd);
	   System.out.println("********************");
   }
   
   
   //Search Element in Array
   public void searchElementinArray()
   {
	   int[] a={10,20,30,40,50};
	   
	   int search_num=30;
	   boolean status=false;
	   
	   for(int i=0;i<a.length;i++)
	   {
		 if (search_num==a[i])
		 {
			 System.out.println("Number is found");
			 status=true;
			 break;
		 } 

	   }
	   
	   if(status==false)
		 {
			 System.out.println("Number not found");
		 }
	   System.out.println("********************");
   }
   
   
   //find duplicate numbers in Array
   public void findDuplicates()
   {
	   int[] arr= {10,20,30,20,40,20};
	   int counter=0, dupnum=0;
	   
	   
	   boolean status=false;
	   
	   for (int i=0;i<arr.length;i++)
	   {
		   for (int j=i+1; j<arr.length;j++) 
		   {	   
		     if (arr[i]==arr[j])
		     {
			   
		       dupnum= arr[i];
			   counter++;
			   status=true;
		     }
		   }
	   }
	   System.out.println("Duplicate number is: " + dupnum);
	   System.out.println("The number is repeated " + counter + " times.");
	   
	   if(status==false)
	   {
		   System.out.println("No duplicate numbers are present in Array");
	   }
	   System.out.println("********************");
   }
   
   
   //find duplicate numbers in Array using enhanced for loop
   public void duplicateNumber()
   {
	   int[] arr= {10,20,30,20,40,20};
	   int counter=0, num=20;
	   
	   for (int value:arr)                  
	   {
		   if (value==num)
		   {
			   counter++;
			   
		   }
	   }
	   System.out.println("The number of times repeated is: " + counter);	
	   System.out.println("********************");
   }
   
   //find even and odds in an array
   
   public void findEvenOdd()
   {
	   int[] arr= {1,5,6,9,7,3,4,19,13};
	   int countereven=0, counterodd=0;
	   
	   System.out.println("Even numbers are:");
	   for (int i=0;i<arr.length;i++)
	   {
		   if (arr[i]%2==0)
		   {
			   System.out.println("The even number is: " +arr[i] );
			   countereven++;
		   }
		   else
		    System.out.println("The odd number is: "+ arr[i]);
		    counterodd++;
	   }
	   System.out.println("The total even numbers are: " + countereven);
	   System.out.println("The total odd numbers are: " + counterodd);
	   System.out.println("********************");
   }
   
   //find even and odds in an array- Another way
   public void finEvenOddNumber()
   {
	   int[] arr= {1,5,6,9,7,3,4,19,13};
	   int evencount=0, oddcount=0;
	   
	   System.out.print("The even numbers are:");
	   for (int i=0; i< arr.length; i++)
	   {
		   if (arr[i]%2==0)
		   {
			   System.out.print(arr[i]+ " ");
			   evencount++;
		   }
	   }
	   
	   System.out.print("\nThe odd numbers are:");
	   for (int i=0;i<arr.length;i++)
	   {
		   if(arr[i]%2!=0)
		   {
			   System.out.print(arr[i]+ " ");
			   oddcount++;
		   }
	   }
	   System.out.print("\nTotal even numbers are: " + evencount);
	   System.out.println("\nTotal odd numbers are: " + oddcount);
	   System.out.println("********************");
   }
   
   
   //find even and odds in an array- Another way using enhanced for loop
   public void findEvenOddEnhanced()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   int even=0, odd=0;
	   
	   for (int x: arr)
	   {
		   if(x%2==0)
		   {
			   even++;
		   }
		   else
		   {
			   odd++;
		   }
	   }
	   System.out.println("Total even numbers are: " + even);
	   System.out.println("Total odd numbers are: " + odd);
	   System.out.println("********************");
   }
   
   //count the numbers in array
   public void countArray()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   
	   int count=0; int num=-1;
	   
	   for (int i=0; i< arr.length;i++)
	   {
		   if (num<arr[i])
		   {
			   count++;
		   }
	   }
	   System.out.println("Total numbers in array are: " + count);
   }
   
   //count the numbers in array- another way using enhanced loop
   public void countOfArray()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   
	   int count=0; 
	   
	   for (int x:arr)
	   {
			   count++;
	   }
	   System.out.println("Total numbers in array are: " + count);
   }
   
   //printing of an Array
   public void printArray()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   
	   System.out.println(Arrays.toString(arr));
   }
   
   
   //sorting a number array
   public static void sortArray()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   
	   System.out.println("Before sorting Array: " + Arrays.toString(arr));
	   Arrays.sort(arr);
	   System.out.println("After sorting Array: " + Arrays.toString(arr));   

   }
   
   
   
   
   //reverse an array
   
   public static void reverseAnArray()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   int left=0, right=arr.length-1;
	   
	   System.out.println("Original Array: " + Arrays.toString(arr)); 
	   
	   for(int i=0; i< arr.length;i++)
	   {
	   if(left<right)
	   {
		   int temp=arr[left];
		   arr[left]= arr[right];
		   arr[right]= temp;
		   
		   left++;
		   right--;
	   }
	   
	   }
	   System.out.println("Reversed Array: " + Arrays.toString(arr));
	   
	   System.out.println("********************");
   }
   
 //reverse an array using new array
   
   public static void reverseArrayInNew()
   {
	   int[] arr= {1,5,6,9,7,2,4,19,13};
	   int[] reversed= new int[arr.length];
	   int j=0;
	   
	   System.out.println("Original Array is: " + Arrays.toString(arr));
	   for (int i=arr.length-1; i>=0; i--)
	   {
		   reversed[j++]=arr[i];
	   }
	   
	   System.out.println("Reversed Array is+ "+ Arrays.toString(reversed));
   }
   
   
   //reading data in 2D Array
   
   public static void readDataA()
   {
	   int[][] arr= {{10,20}, {50,84,69}, {45,87,69,34,84,65,}, {12}};
	   
	   System.out.println(arr.length);   // rows of an array
	   System.out.println(arr[0].length);  //column length of particular row
	   
   }
   
   //check length of each column for each row
   
   public static void checkLengt()
   {
	   int[][] arr= {{10,20}, {50,84,69}, {45,87,69,34,84,65,}, {12}};
	   
	   
	   for (int i=0; i<arr.length; i++)
	   {
		   
		   System.out.println("Row " + i+ "has" + arr[i].length + "columns.");
		   
	   }
   }
	   
  //check length of each column for each row using enhanced loop
	   public static void checkLengt1()
	   {
		   int[][] arr= {{10,20}, {50,84,69}, {45,87,69,34,84,65,}, {12}};
		   int column=0;
		   
	   for (int[] x: arr)
	   {
		   for (int y: x )
		   {
			   column= x.length;
			   
		   }
		  System.out.println(column);
	   }
	   
   }
   
   
   
   
   /*
    * Assingments
-----------
1) Sorting elements  using  for loop
a={50,20,40,10,100}
after sorting 10 20 40 50 100

Ref Links: 
https://www.youtube.com/watch?v=cJ2eMUiCFy4
https://www.youtube.com/watch?v=3PLtvTUOCpM

2) Find Missing in Number in array

a={1,4,5,3}     
* numbers should be in range
* should not have duplicates
* no need of sorting order

logic:  1+2+4+5=12 (sum1)
        1+2+3+4+5=15 (sum2)
        sum2-sum1 = missing number

Reference: https://youtu.be/Uywn0YzX8OQ

3) Find largest & lowest number in array
https://www.youtube.com/watch?v=Jrr0bNcPFgo

    */
   
   
   
   
   
   
   }
   
   
   
   
	  

