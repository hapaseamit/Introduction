/* Operators and Assignments:

 * 1. Increment and Decrement Operators
 * 2. Arithmatic Operators
 * 3. String concatenation Operator
 * 4. Relational Operators
 * 5. equality operators
 * 6. instanceof operator
 * 7. bitwise operators
 * 8. short circuit operators
 * 9. type cast operator
 * 10. assignment operators
 * 11. conditional operator
 * 12. new operator
 * 13. [] operator
 * 14. operator precedence
 * 15. Evaluation  order of operands
 * 16. new vs newInstance()
 * 17. instanceof vs isInstance()
 * 18. ClassNotFoundException Vs NoClassDefFoundError
 * 
 * 
 * 1. Increment and Decrement Operators:
 * Increment: 
 * Pre-increment: ++x        Post-increment: x++
 * 
 * Decrement:
 * Pre-decrement: --x        Post-decrement: x--
 * 
 * Expression     initial value of x      Value of Y      Final value of x
 * y=++x;               10                    11                11      
 * y=x++;               10                    10                11
 * y=--x;				10					   9                 9	
 * y=x--;				10                    10                 9   
 * 
 * Loopholes:
 * 1. We can apply increment and decrement operators only for variables but not for constant values. If we are trying to apply for constant values, we will get compile time error.
 * e.g. int x=10;
 *      int y=++x;                      --> cannot write int y=++10;
 *      System.out.println(y);          --> Output: 11
 *      
 * 2. Listing of increment and decrement of operators is not allowed.
 * e.g. int x=10;
 *      int y= ++(++x);     --> invalid argument as (++x) will be constant here i.e. 11 and increment/decrement not allowed on constants
 *      
 * 3. For final variable, we can't apply increment or decrement operators.
 * e.g. final int x=10;
 *      x++;    OR  x=11;               --> cannot reassign value to final variable x.
 *      System.out.println(x);
 * 
 * 4. We can apply increment and decrement operators to all primitive datatypes except boolean.
 * e.g. byte, short, int, char, float, double
+ * 
 * 
 * Difference between 'b=b+1' and 'b++':
 * 5. If we apply any arithmatic operator between 2 variables a and b, the result type is always Max(int, type of a, type of b).
 * e.g. byte a=10, byte b=20;
 *      byte c= a+b;                --> datatype should be int here.    max(int, byte, byte)
 *      System.out.println(c);      --> compile time error
 * This error can be handled by type casting like below.
 *      byte c= (byte)(a+b);
 *      System.out.println(c);      --> Output: 30
 * 
 * e.g. byte b=10; 
 *      b=b+1;                  --> required int      max(int, byte, int)
 *      System.out.println(b);  --> compile time error
 *     
 * 6. In case of increment and decrement operators, internal type casting will be performed automatically.
 * e.g. byte b=10;
 *      b++;                       --> automatic type casting b= (byte)(b+1)   i.e. b= (type of b)(b+1)
 *      System.out.println(b);     --> Output: 11
 * 
 * 
 * 
 * 2. Arithmatic Operators: (+, -, *, /, %)
 * If we apply any arithmatic operator between two variables a and b, the result type is always max(int, type of a, type of b).
 * byte + byte =int
 * byte + short =int
 * short + short = int
 * byte + long = long
 * long + double =double
 * float + long =float
 * char + char = int            e.g. System.out.println('a'+'b');  --> 97+98= 195;     
 * char + double =double        e.g. System.out.println('a'+ 0.89); --> 97+ 0.89= 97.89;
 * 
 * 
 * 
 * 
 * Infinity:
 * In Integral arithmatic (byte, short, int, long), there is no way to represent infinity. Hence, if infinity is the result, we will get arithmatic exception in integral arithmatic.
 * e.g. System.out.println(10/0);    --> Runtime exception, Arithmatic exception
 * 
 * But in floating point arithmatic, there is a way to represent infinity. 
 * For these Float and Double classes contain the following 2 constants. POSITIVE_INFINITY , NEGATIVE_INFINITY.
 * Hence, even though result is infinity, we won't get any arithmatic exception in floating point arithmatic.
 * e.g. System.out.println(10/0.0);       --> Output: Infinity
 *      System.out.println(-10.0/0);      --> Output: -Infinity
 * 
 * 
 * NaN: (Not a Number)
 * In Integral arithmatic (byte, short, int, long), there is no way to represent undefined results. Hence, if the result is undefined, we will get runtime exception saying arithmatic exception.
 * e.g. System.out.println(0/0);      --> Runtime exception, Arithmatic exception
 * 
 * But in floating point arithmatic (float and double), there is a way to represent undefined results. 
 * For these Float and Double classes contain NaN constant.
 * Hence, if the result is undefined we won't get any arithmatic exception in floating point arithmatic.
 * e.g. System.out.println(0.0/0);     -->Output: NaN
 *      System.out.println(-0/0.0);    -->Output: NaN
 * 
 * Note: 
 * For any x value including NaN, the following expressions return false.
 *      System.out.println(10<Float.NaN);
		System.out.println(10<=Float.NaN);
		System.out.println(10>Float.NaN);
		System.out.println(10>=Float.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(Float.NaN==Float.NaN);

 * For any x value including NaN, the following expressions return true.
 * System.out.println(10!=Float.NaN);
 * System.out.println(Float.NaN!=Float.NaN);
 * 
 * 
 * Arithmatic Exception:
 * 1. Arithmatic exception is runtime exception but not compile time error.
 * 2. It is possible only in Integral arithmatic but not in flaoting-point arithmatic.
 * 3. The only operators which cause this exception are '/' and '%'.
 * 
 * 
 * 
 * 3. String Concatenation Operators:
 * The only overloaded operator in Java is '+' operator.
 * Sometimes it acts as arithmatic addition operator and sometimes as String concatenation operator.
 * If at least one argument is String type, + operator acts as concatenation operator and if both arguments are number type, + operator acts as arithmatic addition operator.
 * e.g. String a= "durga";
 *     int b=10, c=20, d=30;
 *     System.out.println(a+b+c+d);    --> Output: durga102030  --> a+b= "durga10" String + c= durga1020 + d= durga102030
 *     System.out.println(b+c+d+a);    --> Output: 60durga
 *     System.out.println(b+c+a+d);    --> Output: 30durga30
 *     System.out.println(b+a+c+d);    --> Output: 10durga2030
 *     
 * Consider the following declarations.
 * e.g. String a= "durga";
 *     int b=10, c=20, d=30;
 * Which of the following expressions are valid?
 *     a= b+c+d;  --> invalid 
 *     a=a+b+c;   --> valid   durga1020
 *     b=a+c+d;   --> invalid
 *     b=b+c+d;   --> valid    60
 *     
 *     
 * 4. Relational Operators: <, <=, >, >=
 * We can apply relational operators for every primitive type except boolean.
 * e.g. System.out.println(10<20);        true
 *      System.out.println('a'<20);       false
 *      System.out.println(true<false);   compile time error
 * 
 * We can't apply relational operators for object types.
 * e.g. System.out.println("durga123" > "durga"); --> compile time error
 * 
 * Nesting of relational operators is now allowed otherwise we will get compile time error.
 * e.g. System.out.println(10<20<30);    -- compile time error because 10<20--> true < 30 --> invalid
 * 
 * 
 * 5. Equality Operators: ==, !=
 * We can apply equality operators for every primitive type including boolean type also.
 * e.g. System.out.println(10 == 20);        false
 *      System.out.println('a'== 'b');       false
 *      System.out.println('a'== 97.0);      true
 *      System.out.println(false==false);    true
 *     
 * We can apply equality operators for object type also.
 * For object references r1, r2
 * r1==r2 returns true if and only if both references are pointing to the same object (reference comparison or address comparison).     
 * 
 * e.g. Thread t1= new Thread();      //new object 
 *      Thread t2=new Thread();       // new object
 *      Thread t3= t1;                // t3 referring to same object to which t1 is referring
 *      
 *      System.out.println(t1==t2);   // false
 *      System.out.println(t1==t3);   // true
 *     
 * If we apply equality operators for object types, compulsory there should be some relation between argument types (either child to parent or parent to child or same type),
 * otherwise we will get compile time error saying 'incomparable types'.
 * e.g. Thread t= new Thread();      //new object 
 *      Object o=new Object();       // new object
 *      String s= new String();
 *      
 *      System.out.println(t==o);   //false
 *      System.out.println(o==s);   //false
 *      System.out.println(s==t);   // compile time error
 *  
 * Difference between == operator and .equals() method: 
 * In general, we can use == for reference comparison (address comparison) and .equals() method for content comparison.
 * e.g. String s1= new String("durga");
	    String s2= new String("durga");
		  
		System.out.println(s1==s2);         //false as memory address is different
		System.out.println(s1.equals(s2));  // true as though 2 different objects are there but the content in both objects is same
		
 * Note: For any object reference r, 
 *       r==null is always false.    
 *    But null==null is always true.
 *    
 *e.g.   String s3= new String("durga");
		  System.out.println(s3==null);       //false
		  
		  String s4= null;
		  System.out.println(s4==null);      //true as s4 is not a reference object, its value is null. 
		  
		  System.out.println(null==null);   //true  
 *    
 *    
 * 6. instanceof Operator:
 * We can use instanceof operator to check whether the given object is of particular type or not.
 * Syntax: r instanceof x       --> r is object reference , X is class name or Interface
 * e.g. Object 0= l.get(o);
 * if (o instanceof Student)
 * {
 *    Student s=(Student)o;
 *    //perform Student specific functionality
 *    
 *  }
 *  else if(o instanceof Customer)
 *  {
 *   Customer c= (Customer) o;
 *   //perform Customer specific functionality
 *  }
 *  
 * To use instanceof operator, compulsory there should be some relation between argument types(either child to parent or parent to child). Otherwise, we will get compile time error saying inconvertible types.
 * e.g. Thread t= new Thread();
 * System.out.println(t instanceof String);       // compile time error
 *  
 * Note: For any class or interface X, null instance of X is always false.
 * 
 *  
 *  
 * 7. Bitwise Operators: &, |, ^
 * &: returns true iff both arguments are true.
 * |: returns true if at least one argument is true
 * ^: returns true iff only one argument is true and not both. Both arguments should be different.
 * 
 * System.out.println(true & false);     // false
 * System.out.println(true | false);     // true
 * System.out.println(true ^ false);     // true
 * 
 * We can apply these operators for integral type also.
 * e.g.   System.out.println(4 & 5);     // 4       4--> 100 
 *                                               &  5--> 101 
 *                                                 __________
 *                                                       100
		  System.out.println(4 | 5);     // 5      4--> 100 
 *                                               | 5--> 101 
 *                                                 __________
 *                                                      101
		  System.out.println(4 ^ 5);     // 1      4--> 100 
 *                                               ^ 5--> 101 
 *                                                 __________
 *                                                      001 
 *   
 *  Bitwise complement operator: ~
 *  We can apply this operator only for integral types but not for boolean type. If we are trying to apply for boolean type, we will get compile time error.
 *  e.g. System.out.println(~4);   // Output: -5
 *       4 is int type i.e. 4-byte i.e. 32-bits   --> 000000....0100
 *                            1st 0 is sign bit i.e. +ve    
 *                                           ~4  -->  111111....1011     (inverted)     
 *                                1st bit is 1 i.e. -ve  
 *                       Do 1's complement first -->  100000....0100     (inverted)
 *                       Do 2's complement       -->              +1
 *                                                  _________________
 *                                                    100000....0101    --> -5
 * Instead of this, for ~4, change the sign of number and add 1 in its bitwise form. The number you will get will be the output of ~4. 
 *  
 * Note: 
 * The most significant bit acts as sign bit. 0 means +ve number, 1 means -ve number.
 * +ve numbers will be represented directly in a memory whereas -ve numbers will be represented indirectly in a memory in 2's complement form.
 * 
 * Boolean complement operator: !
 * We can apply this operator only for boolean types but not for integral types.
 * e.g. System.out.println(!true);   // false
 * 
 * Conclusion of Bitwise operator:
 * &, |, ^: applicable for integral as well as boolean type operators
 * ~: applicable for only integral type operators 
 * !: applicable for only boolean type operators  
 *  
 *  
 * 8. short circuit operators: &&, ||
 * These are exactly same as bitwise operators (&, |) except the following differences.
 *                 &, |                                           && , ||
 * - Both arguments should be evaluated always. | - 2nd argument evaluation is optional.
 * - Relatively performance is low.				| - Relatively performance is high.
 * - Applicable for both boolean and integral   | - Applicable only for boolean but not for integral types. 
 *   types.
 *  
 *  Note: x && y --> y will be evaluated iff x is true.
 *        x || y --> y will be evaluated iff x is false.
 *  
 * e.g int x3=10;
		  if (++x < 10 && (x/0 > 10))
		  {
			  System.out.println("Hello");
			  
		  }else
		  {
			  System.out.println("Hi");               // Output: Hi
		  }
 * 
 * If we replace && with &, we will get runtime exception saying Arithmatic exception.
 * 
 * 
 * 
 * 9. Type-cast Operator:
 * 
 *  
 *  
 *  
 *  
 */
                                


package JavaIntroduction;

public class operatorsAndAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=++x;
		System.out.println(y);
		
		 System.out.println("***************************");
	   
		
		// increment and decrement operators are applicable to all primitive datatypes except boolean.
		x++;
		System.out.println(x);
		
		char ch='a';
		ch++;
		System.out.println(ch);
		
		
		double d=10.5;
		d++;
		System.out.println(d);
		
		 System.out.println("***************************");
	   
		//Infinity:
		//System.out.println(0/0);          // Arithmatic exception 
		
		//System.out.println(10/0);         // Arithmatic exception 
		
		System.out.println(10/0.0);       // Output: Infinity
		
		 System.out.println("***************************");
		
		//NaN: (Not a Number)
		System.out.println(10<Float.NaN);
		System.out.println(10<=Float.NaN);
		System.out.println(10>Float.NaN);
		System.out.println(10>=Float.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(Float.NaN==Float.NaN);
		
		System.out.println(10!=Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		
		 System.out.println("***************************");
		
	//String concatenation operator
		 String a= "durga";
		 int b=10, c=20, e=30;
		 System.out.println(a+b+c+e);    // Output: durga102030  --> a+b= "durga10" String + c= durga1020 + e= durga102030
		 System.out.println(b+c+e+a);    // Output: 60durga
		 System.out.println(b+c+a+e);    // Output: 30durga30
		 System.out.println(b+a+c+e);    // Output: 10durga2030
		 
		 System.out.println("***************************");
		 
    //Relational Operators
		 System.out.println(10<20);        //true
		 System.out.println('a'<20);       //false
		 System.out.println('a'<97.6);     //true
		 System.out.println('a'< 'A');      // false a=97, A=65
		// System.out.println(true<false);   //compile time 

		 System.out.println("***************************");
		 
	//Equality Operators on primitives
		 System.out.println(10 == 20);        //false
		 System.out.println('a'== 'b');       //false
		 System.out.println('a'== 97.0);      //true
		 System.out.println(false==false);    //true
		 
		 System.out.println("***************************");
		
    //Equality Operators in object references		 
		 Thread t1= new Thread();      //new object 
		 Thread t2= new Thread();       // new object
		 Thread t3= t1;                // t3 referring to same object to which t1 is referring
		       
		  System.out.println(t1==t2);   // false
		  System.out.println(t1==t3);   // true
		  
		  System.out.println("***************************");
		  
		  Thread t= new Thread();      //new object 
		  Object o=new Object();       // new object
		  String s= new String();
		        
		  System.out.println(t==o);   //false
		  System.out.println(o==s);   //false
		  //System.out.println(s==t);   // compile time error
		      
		  System.out.println("***************************");
		  
		  String s1= new String("durga");
		  String s2= new String("durga");
		  
		  System.out.println(s1==s2);         //false as memory address is different
		  System.out.println(s1.equals(s2));  // true as though 2 different objects are there but the content in both objects is same
		  
		  
		  System.out.println("***************************");
		  
		  String s3= new String("durga");
		  System.out.println(s3==null);       //false
		  
		  String s4=null;
		  System.out.println(s4==null);      //true as s4 is not a reference object, its value is null. 
		  
		  System.out.println(null==null);   //true
		  
		  System.out.println("***************************");
		  
	// instanceof operator
		  
		  Thread t4= new Thread();                       // Thread is child class of Object, THread implements Runnable Interface
		  
		  System.out.println(t4 instanceof Thread);
		  System.out.println(t4 instanceof Object);
		  System.out.println(t4 instanceof Runnable);
		  
		  System.out.println("***************************");
		  
	//Bitwise operator  : &, |, ^
		  System.out.println(true & false);     // false
		  System.out.println(true | false);     // true
		  System.out.println(true ^ false);     // true
		  
		  
		  System.out.println("***************************");
		  
		  System.out.println(4 & 5);     // 4
		  System.out.println(4 | 5);     // 5
		  System.out.println(4 ^ 5);     // 1
		  
		  // ~
		  System.out.println(~4);   //-5
		  System.out.println(~3);   //-4
		  
		  // !
		  System.out.println(!true);   // false
		  
		  System.out.println("***************************");
		  
		  
	//short circuit operators: &&, ||
		  
		  int m=10, n=15;
		  if (++m < 10 & ++n > 15)
		  {
			  m++;
			                                       //            m       n
		  }                                        //    &       11      17
		  else {                                   //   &&       11      16
			  n++;                                 //    |       12      16 
		  }                                        //    ||      12      16 
		  System.out.println(m + " "+n);
		  System.out.println("***************************");
		  
		  int m1=10, n1=15;
		  if (++m1 < 10 && ++n1 > 15)
		  {
			  m1++;
			  
		  }
		  else {
			  n1++;
		  }
		  System.out.println(m1 + " "+n1);
		  System.out.println("***************************");
		  
		  int m2=10, n2=15;
		  if (++m2 < 10 | ++n2 > 15)
		  {
			  m2++;
			  
		  }
		  else {
			  n2++;
		  }
		  System.out.println(m2 + " "+n2);
		  System.out.println("***************************");
		  
		  int m3=10, n3=15;
		  if (++m3 < 10 || ++n3 > 15)
		  {
			  m3++;
			  
		  }
		  else {
			  n3++;
		  }
		  System.out.println(m3 + " "+n3);
		  System.out.println("***************************");
		  
		  
		  int x3=10;
		  if (++x3 < 10 && (x3/0 > 10))
		  {
			  System.out.println("Hello");
			  
		  }else
		  {
			  System.out.println("Hi");
		  }
		  
		  
		  
		  
		  
	}

}
