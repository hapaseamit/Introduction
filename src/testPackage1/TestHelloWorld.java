package testPackage1;

public class TestHelloWorld {
	
	public static void main(String args[]) {
		
		System.out.println("Hello World!");
		
       System.out.println("**************");		
       
       
       /* Operators: 
         
         
         Assignment Operator: =
       
         Arithmatic Operator: +, -, *, /, % (Modulo)
       
         Relational/Comparison operators: == , != ,  <, >, <=, >=
         
         Logical/Conditional Operators: && (Logical AND) : returns true when both conditions are true
                                        || (Logical OR)  : returns true if any one condition is true
                                        !  (Logical NOT) : returns true when condition is false and vice-versa.
		Ternary Operator: condition ? if true : if false    --> condition is checked first, if it's true then first statement gets executed, if false then second statement after : gets executed. 
		
		 
		*/
       
       
		// Unary operator: Used with single operand or variable.
       // +, -, ++, --, !
		
		
		int a= +1;
		
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		a= -a;
		System.out.println(a);
		
		boolean success= false;
		System.out.println(success);             // prints value as it is.
		System.out.println(!success);            // Inverts boolean value.
		
		
		System.out.println("**************");	
		
		
		// Increment operator: 
		// pre-increment      ++i : Increments first, then uses value.
		// post-increment     i++ : Uses value first, then increments.
		// Similar way decrement operator
		
		int i=3;
		++i;                         // pre-increment
		System.out.println(i);       // prints incremented value.
		
		i++;                         // increment
		System.out.println(i);       // prints incremented value.
		
		System.out.println(++i);     // increments value first as ++ is before variable i, then prints.
		
		System.out.println(i++);     // prints i first as it comes before increment, then increments i and new incremented value can be used for next statement.
		
		System.out.println(i);       // the previously incremented value gets printed.
		
		
	}

}
