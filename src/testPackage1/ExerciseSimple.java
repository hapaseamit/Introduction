package testPackage1;

import java.util.Scanner;

public class ExerciseSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExerciseSimple a= new ExerciseSimple();
		

		
	//	a.swapTwoNumbers();
//		a.findEvenOddNumber();
//		a.findLargestNum();
//		a.SwitchDemo();
//		a.largestnum();
//		a.largestnumtern();
//		a.findSmallestNum();
//		a.showWeekNum();
//		a.breakState();
//		a.continueStatement();
//		a.reversenum();
//		a.palindrome();
//			a.countNum();
	//		a.countEvenOddNum();
		//	a.sumOfDigits();

	}
	
	public void swapTwoNumbers()
	  {
		 //swapping two numbers with third variable
		  		int num1=5, num2=6;
		  
				  System.out.println("Values before swap: num1=" + num1 +" num2=" + num2);
				  int temp=num1;
				  num1=num2;
				  num2=temp;
				  System.out.println("Values before swap: num1=" + num1 +" num2=" + num2);
				  
				  System.out.println("***************************************");
				  
				  
		// Swapping 2 numbers without using third variable: using +, -
				int c=2, d=3;
				
				System.out.println("Values before swap: c=" + c +" d=" + d);
				c= c+d;
				d= c-d;
				c= c-d;
				System.out.println("Values after swap: c=" + c + " d="+ d);
				
				System.out.println("***************************************");
				
		// Swapping 2 numbers without using third variable: using *, / (only if values are not 0)
		  
	            int a=2, b=3;
				
				System.out.println("Values before swap: a=" + a +" b=" + b);
				a=a*b;
				b=a/b;
				a=a/b;
				
				System.out.println("Values after swap: a=" + a +" b=" + b);
				
				System.out.println("***************************************");
				
			// Swapping 2 numbers without using third variable: using bitwise XOR ^ 
				  
	            int g=2, h=3;
				
				System.out.println("Values before swap: g=" + g +" h=" + h);
				g=g^h;      // 0010 
				            // 0011
				         // -->0001   --> this will be g   
				h=g^h;      // 0001
				            // 0011
				         // -->0010   --> this will be h  
				g=g^h;      // 0001
				            // 0010
				         // -->0011   --> this will be g
				
				System.out.println("Values after swap: g=" + g +" h=" + h);
				
				System.out.println("***************************************");	
				
				// Swapping 2 numbers in single line 
				  
	            int i=4, j=5;
				
				System.out.println("Values before swap: i=" + i +" j=" + j);
				j=i+j-(i=j);
				
				System.out.println("Values after swap: i=" + i +" j=" + j);
				
				System.out.println("***************************************");	
				
				
	  }
	  
		  //find Even and odd numbers
		  
		  public void findEvenOddNumber()
		  {
			  int a=10, b=15;
			  
			  if(a%2==0)
			  {
				  System.out.println("The number is even.");
			  }
			  else 
			  {
				  System.out.println("The number is odd.");
			  }
			  
			  System.out.println("***************************************");
			  
			  if(b%2==0)
			  {
				  System.out.println("The number is even.");
			  }
			  else 
			  {
				  System.out.println("The number is odd.");
			  }
			  
			  System.out.println("***************************************");
		  }
	  
		   
	  
		  //find largest number between 3 numbers
		  public void findLargestNum()
		  {
			  int a=15, b=20, c=88;
			  
			  if (a>b && a>c)
			  {
				  System.out.println("The largest number is: " + a);
			  }else if(b>a && b>c)
			  {
				  System.out.println("The largest number is: " + b);
			  }else 
			  {
				  System.out.println("The largest number is: " + c);
			  }
			  System.out.println("***************************************");
		  }
		  
		  //Switch demo
		  public void SwitchDemo()
		  {
			  int weekno=1;
			  
			  switch(weekno)
			  {
			  case 1: System.out.println("Sunday");
			  			break;
			  case 2: System.out.println("Monday");
				       break;
			  case 3: System.out.println("Tuesday");
		       			break;
			  case 4: System.out.println("Wednesday");
			  			break;
			  case 5: System.out.println("Thursday");
		       			break;
			  case 6: System.out.println("Friday");
			  			break;
			  case 7: System.out.println("Saturday");
		       			break;
			  default: System.out.println("Invalid week number");
			  }
			  System.out.println("***************************************");
		  }
		  
		  //largest of 2 numbers (if else, ternary operator)
		  
		  //using if else
		  public void largestnum()
		  {
			  int a=10, b=8;
			  if (a>b)
			  {
				  System.out.println("a is the largest number");
		      } else
		      {
		    	  System.out.println("b is the largest number");
		      }
			  System.out.println("***************************************");
		  }
		  
		  //using ternary operator
		  public void largestnumtern()
		  {
			  int a=8, b=17;
			  int status= (a>b) ? a:b;
			  System.out.println(status + " is the largest number.");
			  
			  System.out.println("***************************************");
		  }
		  
		  
		  //smallest of 3 numbers (if else)
		  
		  public void findSmallestNum()
		  {
			  Scanner sc= new Scanner(System.in);
			  System.out.println("Enter 3 numbers.");
			  int a= sc.nextInt();
			  int b= sc.nextInt();
			  int c= sc.nextInt();
			  
			  if(a<b && a<c) {
				  System.out.println(a+ " is the smallest number.");
			  } 
			  else if (b<c && b<a)
			  {
				  System.out.println(b+ " is the smallest number. ");
			  } else 
			  {
				  System.out.println(c+ " is the smallest number.");
			  }
			  sc.close();
			  System.out.println("***************************************");
			  
		  }
		  
		  //print week number based on week name(switch case)
		  
		  public void showWeekNum()
		  {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter week day");
			  String weekname=sc.nextLine();
			  
			  switch(weekname)
			  {
			  case "Sunday": System.out.println("1");
			  break;
			  case "Monday": System.out.println("2");
			  break;
			  case "Tuesday": System.out.println("3");
			  break;
			  case "Wednesday": System.out.println("4");
			  break;
			  case "Thursday": System.out.println("5");
			  break;
			  case "Friday": System.out.println("6");
			  break;
			  
			  case "Saturday": System.out.println("7");
			  break;
			  default : System.out.println("Invalid weekname");
			  
			  }
			  sc.close();
			  System.out.println("***************************************");
			  
		  }	  
			  
			  public void breakState()
			  {
				  int i=1;
				  for (i=1; i<=10; i++)
				  {
					  if (i==5)
					  {
						  break;
					  }
					  System.out.println(i);
				  }
				  
				  System.out.println("***************************************");
			  }
			  
			  
			  
			  public void continueStatement()
			  {
				  int i=1;
				  for (i=1; i<=10; i++)
				  {
					  if (i==5)
					  {
						  continue;
					  }
					  System.out.println(i);
				  }
				  
				  System.out.println("***************************************");
			  }
			  
			// Reverse a number (  %   / =   operators   )

			  
			  public void reversenum()
			  {
				  int num=1234;
				  int reversenum=0;
				  
				  while(num!=0)
				  {
					  int temp= num % 10;
					  reversenum= reversenum * 10 + temp;
					  num= num/10;
				  }
				  System.out.println(reversenum);
				  System.out.println("***************************************");
			  }
			  
			  
			  //Check if number is Palindrome number ( conditional statements + looping)
			  public void palindrome()
			  {
				  Scanner sc= new Scanner(System.in);
				  int num=sc.nextInt();
				  int newnum=num;
				  
				  int reversenum=0;
				  
				  while(num!=0)
				  {
					  reversenum= reversenum*10 + num%10;
					  num/=10;
					  
				  }
				  if (reversenum==newnum)
				  {
					  System.out.println(reversenum + " is a palindrome number");
				  }
				  else
				  {
					  System.out.println(reversenum+ " is not a palindrom number");
				  }
				  sc.close();
				  System.out.println("***************************************");
			  }
			  
			  
			  public static void countdigit()
			  {
				  int a=123454;
				  int temp=0;
				  
				  while(a!=0)
				  {
					  temp= temp*10 + a%10;
					  a=a/10;
				  }
						  
				  System.out.println("***************************************");

				  
			  }
			  
			  
			  
			  //Count Number of Digits in a Number (looping)
			  
			  public void countNum()
			  {
				  int num=123454;
				  int counter=0;
				  
				 
				  
				  if (num==0)
				  {
					  System.out.println("counter is 1.");
					  return;
					  }
				  
				  if (num<0)
				  {
					  num=-num;
				  }
				  
				  while(num!=0)
				  {
					  num=num/10;
					  counter++;
				  }
				  System.out.println(counter + " is the count.");	
				  
				  System.out.println("***************************************");

	       }		  
			  
			  public void countEvenOddNum()
			  {
				  int num=123454;
				  int countereven=0, counterodd=0, reverse=0;
				  
				  if (num==0)
				  {
					  System.out.println("Count is 1");
					  return;
					  }
				  
				  if (num<0)
				  {
					  num=-num;
				  }
				  
				  while(num!=0)
				  {
					  reverse= num%10;
					  if (reverse%2==0)
					  {
					  countereven++;
					  } else 
					  {
						  counterodd++;
					  }
					  num=num/10;
				  }
				  System.out.println("Even count is: " + countereven + " and Odd count is: "+ counterodd);	
				  
				  System.out.println("***************************************");

	       }		  
			 
			  
			  public void sumOfDigits()
			  {
				  int num=2587696;
				  int sum=0;
				  
				  while(num!=0)
				  {
					  sum= sum+ num%10;
					  num=num/10;
					  
				  }
				  System.out.println("Sum of digits is: "+ sum);
			  }
			  
		
}


