/* var-arg methods: Variable number of argument  
 * SUN people introduced vararg methods in 1.5 version. According to this, we can declare a method which can take variable number of arguments. Such type of methods are called vararg methods. 
 * We can declare a vararg method as follows.
 * m1(int... x)               --> m1 method name, int datatype, ... 3 dots, x
 * We can call this method by passing any number of int values including 0 number.
 * m1(); m1(10,20); m1(10,20,30,40);
 * 
 * Internally, vararg parameters will be converted into 1D array. Hence, within vararg methods we can differentiate values using index.
 * 
 * Loopholes:
 * Case 1: Three dots should always be together in vararg argument declaration. 
 * Which of the following are valid vararg method declarations?
 * m1(int... x);  --> valid
 * m1(int ...x);  --> valid
 * m1(int...x);   --> valid
 * m1(int. ..x);  --> invalid
 * m1(int .x..);  --> invalid
 * 
 * Case 2: We can mix vararg parameter with normal parameters.
 * e.g. m1(int x, int...y);
 *      m2(String s, double...y);
 *      
 * Case 3: If you mix normal parameter with vararg parameter, vararg parameter should be last parameter.
 * e.g. m1(int x, int... y);   --> valid
 *      m2(int... y, int x);   --> invalid
 *      
 * Case 4: Inside vararg method, we can take only one vararg parameter.
 * e.g. m1(int...x, double... y);  ---> invalid
 * 
 * Case 5: Inside a class, we can't declare vararg method and corresponding 1D Array method simultaneously otherwise we will get compile time error.
 * e.g. class Test{
 * public static void m1(int... x)         --> signature: m1(int[])
 * 	{
 * 		System.out.println("int...");
 * 	}
 * public static void m1(int[] x)          --> signature: m1(int[])
 * 	{
 * 		System.out.println("int[]");
 * 	}                                     --> compile time error: cannot declare both m1(int...) and m1(int[]) in the same class simultaneously.
 * }
 * 
 * Case 6: In general, vararg method will get least priority i.e. if no other method matched, then only vararg method will get the chance. It is exactly same as default case in 'switch'. 
 * e.g. class Test{
 * public static void m1(int... x)         
 * 	{
 * 		System.out.println("vararg method");
 * 	}
 * public static void m1(int x)          
 * 	{
 * 		System.out.println("normal method");
 * 	}                                     
 * 
 * public static void main(String[] args)
 * {
 * 		m1();         --> vararg method
 * 		m1(10,20);    --> vararg method 
 * 		m1(10);      --> General method
 * } 
 * }
 * 
 * 
 * Conclusions:
 * Equivalence between vararg parameter and 1D Array:
 * Case 1: Wherever 1D Array is present, we can replace with vararg parameter.
 * m1(int[] x) => m1(int... x)
 * main(String[] args) => main(String... args)
 * 
 * Case 2: Wherever vararg parameter is present, we cannot replace with 1D Array.
 * m1(int... x) => m1(int[] x)  ---> invalid conversion
 * 
 * Note: 
 * 1. m1(int... x) : We can call this method by passing a group of int values and x will become 1D Array.
 * 2. m1(int[]... x): We can call this method by passing a group of 1D int Arrays and x will become 2D Array.
 * 
 *  
 *Passing group of 1D Array in vararg  : becomes 2D Array
 * class Test {
 * public static void main(String[] main)
 * {
 *   int[] a={10,20,30};
 *   int[] b={40,50,60};
 *   
 *   m1(a, b);
 *   
 * }
 * 
 * public static void m1(int[]... x)
 * {
 *     for (int[] x1: x)
 *     {
 *       System.out.println(x[0]);
 *     }
 *     
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



package JavaIntroduction;

public class varargmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();                 //var-arg methods
		m1(10);               //var-arg methods
		m1(10,20);            //var-arg methods
		m1(10,20,30,40);      //var-arg methods
		
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30,40);

	}
	
	public static void m1(int... x)
	{
		System.out.println("var-arg methods");
		
		System.out.println("The number of arguments are : " + x.length);
		
		
	}
	
	public static void sum(int... x)
	{
		int total=0;
		for (int x1:x)
		{
			total=total+x1;
		}
		System.out.println("The sum is: " + total);
	}

}

// Passing group of 1D Array in vararg  : becomes 2D Array
class Test8 {
	 public static void main(String[] main)
 {
   int[] a={10,20,30};
   int[] b={40,50,60};
   
   m1(a, b);
   
 }
 
 public static void m1(int[]... x)
 {
    for (int[] x1:x)
     {
       System.out.println(x1[0]);
     }
     
 }
}
