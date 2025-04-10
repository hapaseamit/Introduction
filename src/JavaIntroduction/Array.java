/* Arrays:
 * Array Introduction:
 * An Array is an indexed collection of fixed number of homogeneous data elements.
 * The main advantage of Array is - we can represent huge number of values using single variable so that readability of the code will be improved.
 * But the main disadvantage of Arrays is fixed size i.e. once we create an array, there is no chance of increasing or decreasing the size of array as per requirement. 
 * Hence to use Arrays concept, we should know the size in advance which may not always possible.
 * 
 * Array declaration:
 * 1. One-dimensional Array declaration:
 * e.g. int[] x;  --> recommended because variable name is clearly separated from datatype.
 *      int []x;
 *      int x[];
 * At the time of declaration, we cannot specify the size of the array otherwise we will get compile time error.
 * e.g. int[6] x; ---> invalid
 * 
 * 2. Two-dimensional Array declaration:
 * e.g. int[][] x;
 *      int [][]x;
 *      int x[][];
 *      int[] []x;
 *      int[] x[];
 *      int []x[];    ---> All valid
 *      
 *      
 * Which of the following are valid?
 * int[] a,b;     --> valid     a-1 dimensional, b-1
 * int[] a[],b;   -->valid      a-2 dimensional, b-1
 * int[] a[],b[]; --> valid     a-2, b-2
 * int[] []a,b;   --> valid     a-2,b-2
 * int[] []a,b[]; --> valid     a-2, b-3 
 * int[] []a,[]b; --> Invalid   --> If we want to specify []before variable, it should be for first variable only e.g. []a is correct but not []b.
 * 
 * 3. Three-dimensional Array declaration:
 * e.g. int[][][] a;
 *      int [][][]a;
 *      int a[][][];
 *      int[] [][]a;
 *      int[] []a[];
 *      int[] a[][];
 *      int[][] []a;
 *      int[][] a[];
 *      int [][]a[];
 *      int []a[][];     ---> All are valid
 *      
 * Array Creation:
 * Every Array in Java is an object only. Hence, we can create Arrays by using 'new' operator.
 * e.g. int[] a=new int[3]; ----> 3 is the size of the array.
 * Objects can be created of classes only using 'new' operator. For every Array type, corresponding classes are available and these classes are part of Java language and not available to the programmer level.
 * Array Type         corresponding class name
 * int[]               [I
 * int[][]             [[I
 * double[]            [D
 * byte[]              [B
 * boolean[]           [Z
 * 
 * Datatypes conversion for Arrays:
 * byte--> short --> int --> long --> float --> double
 * char--> int
 *
 * 
 * Loopholes in Array creation:
 * 1. At the time of Array creation, compulsory we should specify the size of an array otherwise we will get compile time error.
 * e.g. int[] x= new int[6];
 * 
 * 2. It is legal to have an Array with size 0 in Java.
 * e.g. 1. int[] x= new int[0]; 
 *      2. main (String[] args) {                  --> args is array name here with 0 length.
 *            System.out.println(args.legth);
 *         }
 *         
 * 3. If we are trying to specify Array size with -ve int value, we will get runtime exception saying 'NegativeArraySizeException'.
 * e.g. int[] x= new int[-6];
 * 
 * 4. To specify Array size, allowed datatypes are byte, short, char, int. If we try to specify any other type, we will get compile time error.
 * e.g. int[] x= new int[10];
 *      int[] x= new int['a'];
 *      byte b=20;  int[] x= new int[b];
 *      short s=30; int[] x= new int[s];
 *      int[] x= new int[10L];-------> Invalid
 *      
 * 5. In Java, Arrays are indexed by only int.
 * Note: The maximum allowed Array size in Java is 2147483647 which is a max. value of int datatype.
 * e.g. int[] x= new int[2147483647];  --> Here we may get runtime exception if sufficient heap memory not available.
 * 
 * 
 * Two-dimensional Array Creation:
 * In Java, 2-dimensional array not implemented by using matrix style representation. SUN people followed Array of Arrays approach for multi-dimensional array creation. 
 * The main advantage of this approach is memory utilization is improved.
 * e.g. int[][] x= new int[2][];   --> Base level Array. Base size should be specified at least i.e. [2] here.
 *      x[0]= new int[4];    --> 2nd level Array 
 *      x[1]= new int[3];    --> 2nd level Array
 *      
 * Three-dimensional Array Creation:
 * e.g. int[][][] x= new int[2][][];  --> Base Array
 *      x[0]= new int[3][];           --> 2nd level Array 
 *      x[1]= new int[2][2];          --> 2nd level Array
 *      x[0][0]= new int[1];          --> 3rd level Array
 *      x[0][1]= new int[2];          --> 3rd level Array
 *      x[0][2]= new int[3];          --> 3rd level Array
 *      x[1][1]= new int[2];          --> 3rd level Array
 *      x[1][2]= new int[2];          --> 3rd level Array
 *      
 * Which of the following are valid Array Creation?
 * int[] a= new int[];            --> invalid
 * int[] a= new int[3];           --> valid
 * int[][] a= new int[][];        --> invalid
 * int[][] a= new int[3][];       --> valid
 * int[][] a= new int[][4];       --> invalid
 * int[][] a= new int[3][4];      --> valid
 * int[][][] a= new int[3][4][5]; --> valid
 * int[][][] a= new int[3][4][];  --> valid
 * int[][][] a= new int[3][][5];  --> invalid as to specify 3rd level array size, we should know 2nd level array size.
 * int[][][] a= new int[][4][5];  --> invalid     
 *      
 *      
 * Array Initialization:
 * Once we create an Array, every element by default initialized with default value i.e. 0.
 * Examples:
 * 1D Array
 * int[] c= new int[3];
 * System.out.println(c);         --> Base of 1D Array-->  Output: [I@379619aa  --> classname [I @ #code in hexadecimal
 * System.out.println(c[0]);      --> Output: 0
		
 * Note: Whenever we are trying to print any reference variable, internally 2-Strings method will be called which is implemented by default to return the string in the following form.
 * [class name @ #code in Hexa-decimal form e.g. [I@379619aa
 * 
 * 2D Array:
 * int[][] d= new int[2][3];  
 * System.out.println(d);     // variable of 2D Array --> Base for 2D Array              Output: [[I@cac736f
 * System.out.println(d[0]);  // variable of 1D Array--> base for 2nd Level Array        Output: [I@5e265ba4
 * System.out.println(d[0][0]); // 2nd level Array where actual values are stored.       Output: 0
 * 
 * NullPointerException:
	int[][] e= new int[2][];  
	System.out.println(e);     // variable of 2D Array --> Base for 2D Array         Output: [[I@156643d4
	System.out.println(e[0]);                                                        Output: null
	System.out.println(e[0][0]);                                                     RE: NullPointerException
 * Note: If we are trying to perform any operation in Null then we will get runtime exception saying 'NullPointerException'.
 * 
 * 
 * We can override default values i.e. 0 in Array with customized values.
 * e.g. int[] x= new int[6];
 * x[0]=10;
 * x[1]=20;
 * x[2]=30;
 * x[3]=40;
 * x[4]=50;
 * x[5]=60;
 * 
 * Array Declaration, Creation & Initialization in a single line:
 * We can declare, create and initialize an Array in a single line.
 * e.g. int[] x= {10,20,30};
 *      char ch= {'a', 'e', 'i', 'o','u'};
 *      String s= {"A", "AA", "AAA"};
 *      
 * We can use this way for multi-dimensional Arrays also.
 * e.g. int[][] x= {{10,20}, {30,40,50}};       --> The values are from 2nd Level Array. 1st level array is just reference.
 * 
 * int[][][] x= {{{10, 20,30},{40,50,60}}, {{70,80},{90,100,110}}};  ---> 3D Array values
 * int[][][] x= new int[2][][];
 * x[0]= new int[2][];
 * x[1]= new int[2][];
 * x[0][0]= new int[3];
 * x[0][1]= new int [3];
 * x[1][0]= new int[2];
 * x[1][1]= new int[3];
 * 
 * To declare Array in single line, we should declare, create and initialize Array in single line itself.
 * int[] x={10,20,30};  -----> valid
 *
 * int[] x;
 * x={10,20,30};         ---> invalid. Illegal start of expression.
 * 
 * length vs. length():
 * length: 
 * length is a final variable applicable for Arrays e.g. int, String Array etc.
 * length variable represents the size of the Array.
 * e.g. int[] x= new int[6];
 *      System.out.println(x.length);        --> output: 6
 *      
 *            
 * length() method is a final method applicable for String objects.
 * length() method returns number of characters present in the string.
 *      String s="durga";
 *      system.out.println(s.length());      --> output: 5
 * lenght() method is present in String class which is final class so child cannot be created for length() method. 
 * Note: Any method present in final class is always a final method.
 * 
 * 
 * String s={"A", "AA","AAA"}
 * System.out.println(s.length);      --> valid as s is an Array even if it's an Array of String that's ok.
 * System.out.println(s.length());    --> invalid as length() method is applicable to String not Array.
 * System.out.println(s[0].length);   --> invalid s[0].length returns String value for which length variable is not applicable.
 * System.out.println(s[0].length()); --> valid as s[0].length returns String value for which length() method is applicable.
 *    
 * In multi-dimensional Arrays, length variable represents only base size but not total size.
 * int[][] x= new int[6][3];
 * System.out.println(s.length);     ---> 6
 * System.out.println(s[0].length);  ---> 3
 * There is no direct way to find total length of multi-dimensional Array but indirectly we can find as follows.
 * x[0].length + x[1].length + x[2].length + ...
 * 
 * 
 * 
 * Anonymous Arrays:
 * Sometimes, we can declare an Array without name. Such type of nameless Arrays are called Anonymous Arrays.
 * The main purpose of Anonymous Arrays is just for instant use (one-time usage).
 * We can create Anonymous Array as follows:
 * e.g. new int[]{10,20,30,40} 
 * 
 * While creating Anonymous Arrays we cannot specify the size, otherwise we will get compile time error.
 * e.g. new int[3]{10,20,30}   --> Invalid 
 * 
 * We can create multi-dimensional Anonymous Arrays also. 
 * new int[][]{{10,20}, {30,40,50}}
 * 
 * Based in our requirement, we can give the name for Anonymous Array, then it is no longer Anonymous.
 * int[] x= new int[]{10,20,30}
 * 
 * 
 * class Test{
 * public static void main(String[] args) {
 *    sum(new int[]{10,20,30,40})
 * }
 * 
 * public static void sum(int[] x){
 *  int total=0;
 *  for (int x1: x)
 *  {
 *  total= total+x1;
 *    }
 *    System.out.println("The sum is: " + total);
 * }
 * 
 * }
 * 
 * In the above example, just to call 'sum' method we required an Array but after completing 'sum' method call, we are not using that Array anymore. 
 * Hence, for this one-time requirement, anonymous Array is the best choice.
 * 
 * 
 * 
 * Array Element Assignments:
 * Case 1: In case of Primitive type Arrays, as Array elements we can provide any type which can be implicitly promoted to declared type.
 * e.g. int[] x= new int[5];
 *      x[0]=10;
 *      x[1]='a';
 *      byte b=20;
 *      x[2]=b;
 *      short s=30;
 *      x[3]=s;
 *      x[4]= 10L;   ----> Not allowed as long can't be converted implicitly to int.
 *      
 * e.g. In case of float type Arrays, allowed datatypes are byte, short, int, char, long, float.
 * 
 * Case 2: In case of Object type Arrays, as Array elements we can provide either declared type objects or its child class objects.
 * e.g. Object[] a= new object[10];       --> Object Array
 *      a[0]= new object();               --> valid   object of Object Array
 *      a[1]= new String("durga");        --> valid   child of Object Array 
 *      a[2]= new integer (10);           --> valid   child of Object Array
 * 
 * e.g. Number[] n= new Nuber[10];        --> Number Array - Abstract class type Array       valid inputs are byte, short, int, long, float, double
 *      n[0]= new Integer(10);            --> valid 
 *      n[1]= new Double(10.5);           --> valid
 *      n[0]= new String("durga");        --> Invalid as String is non-primitive
 *      
 * Case 3: For Interface type Arrays, as Array elements its implementation class objects are allowed.
 * e.g. Runnable[] r= new Runnable[10];     --> Runnable is an Interface in Java.
 *      r[0]= new Thread();                 --> valid, implementation class of 'Interface' is 'Thread'
 *      r[1]= new String("durga");          --> invalid as 'String' is not implementation class of 'Interface'
 *      
 *            
 *     Array Type                             Allowed Element Types
 *    
 *   Primitive Arrays                Any type which can be implicitly promoted to declared type   
 *   
 *   Object Type Arrays              Either declared type or its child class objects
 *   
 *   Abstract Class Type Arrays      Its child class objects
 *   
 *   Interface Type Arrays		     Its implementation class type objects 
 *   
 *   
 *   
 * Array Variable Assignments:
 * Case 1: Element level promotions are not applicable at Array Level.
 * e.g. 'char' element can be promoted to 'int' type where 'char' Array cannot be promoted to 'int' Array.
 *    int[] x={10,20,30,40};
 *    char[] ch= {'a', 'b', 'c', 'd'};
 *    int[] b= x;      --> valid    int Array to int Array element level promotion are acceptable.
 *    int[] c= ch;     --> invalid  char Array to int Array element level promotions are not acceptable as char Array is of [C class and int Array is [I class.
 *                     --> There is no relation between [C and [I classes.
 *    int[] d= {'e', 'f', 'g', 'h'};  --> This is allowed as char elements can be implicitly promoted to int. Output will be printed as unicode values of these characters.
 *                     --> but not 'char' Array to 'int' Array promotion or variable Assignment.
 *                     
 * Which of the following promotions will be performed automatically?
 * 1. chat --> int         --> valid
 * 2. char[] ---> int[]    --> invalid
 * 3. int --> double       --> valid 
 * 4. int[] --> double[]   --> invalid     --> Java does not support implicit conversion between arrays of different primitive types.  
 * 5. int[] --> Number[]   --> valid       --> Number[] Array type is parent Array. int[] is child type Array.
 * 6. double[] --> Number[]  --> valid     --> Number[] Array type is parent Array. double[] is child type Array of Number[] type Array.
 * 7. float --> int        --> invalid
 * 8. float[] --> int[]    --> invalid
 * 9. String --> object    --> valid
 * 10. String [] --> Object []  --> valid     child class type array can be promoted to Object type Array
 * 
 * e.g. String[] s={"A", "B", "C"};     --> String Array
 *      Object[] o= s;                  --> String is child class type of Object array here (Parent type Array). So valid
 *      
 * 
 * Case 2: Whenever we are assigning one Array to another array, internal elements won't be copied, just reference variables will be re-assigned.
 * e.g. int[] a={10,20,30,40,50,60};
 *      int[] b={70,80};
 *      a=b;        --> valid
 *      b=a;        --> valid
 *      
 * Case 3: Whenever we are assigning one array to another array, the dimensions must be matched.
 * e.g. In the place of 1D int[], we should provide 1D array only. If we are trying to provide any other dimension like 2D or 3D, we will get compile time error.
 * int[][] a= new int[3][];
 * a[0]= new int[4][3];        --> compile time error as expected array is 1D, here provided 2D array for 2nd level
 * a[0]=10;                    --> compile time error as expected is 1D array but provided value.
 * a[0]= new int[2];           --> valid
 * 
 * Note: Whenever we are assigning one array to another array, both dimensions and datatypes of Array must be matched but sizes are not required to match.
 * 
 * 
 * 
 * Example 1:
 * Class test 	{
 * 
 * public static void main(String[] args){
 * 
 * for (i=0;i<=args.length; i++)
 * {
 *   System.out.println(args[i]);                // a[0], a[1], a[2], a[3] 
 * } 
 * }
 * }
 * 
 * if we pass Class, Test , A, B, C--> output: A, B, C then error
 * if we pass class, test , A, B ---> Output: A, B, error
 * if we pass class, test  ---> Output: error
 * 
 * 
 * Example 2:
 * Class test 	{
 * 
 * public static void main(String[] args){
 *  String[] argh= {"X", "Y", "Z"};
 *  args=argh;                          // array args is pointing to array argh now.
 * for (String s: args)
 * {
 *   System.out.println(s);                // X, Y, Z
 * } 
 * }
 * }
 * 
 * if we pass Class, Test , A, B, C--> output: X, Y, Z
 * if we pass class, test , A, B ---> Output: X, Y, Z
 * if we pass class, test  ---> Output: X, Y, Z
 * 
 * 
 * 
 */

package JavaIntroduction;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Checking the Array built-in class in Java library	
		int[] a=new int[3];
		System.out.println(a.getClass().getName());
		
		int[][] b=new int[3][2];
		System.out.println(b.getClass().getName());
		
		byte[] x=new byte[3];
		System.out.println(x.getClass().getName());
		
		boolean[] y=new boolean[3];
		System.out.println(y.getClass().getName());
		
		
		// If no values are provided in Array, then it takes default values as 0.
		//One-dimensional Array:
		int[] c= new int[3];
		System.out.println(c);
		System.out.println(c[0]);
		
		//Two-dimensional Array:
				int[][] d= new int[2][3];  
				
				System.out.println(d);     // variable of 2D Array --> Base for 2D Array
				System.out.println(d[0]);  // variable of 1D Array--> base for 2nd Level Array
				System.out.println(d[0][0]); // 2nd level Array where actual values are stored.
		
				
				//NullPointerException:
				int[][] e= new int[2][];  
				
				System.out.println(e);     // variable of 2D Array --> Base for 2D Array
				//System.out.println(e[0]);  
				//System.out.println(e[0][0]); 
				
				System.out.println("*************");
				
				
				// Printing int Array having character elemements. 
                int[] r= {'e', 'f', 'g', 'h'};
                
                for (int r1: r)                        // for each loop
                {
                	System.out.print(r1 + " ");      // Its unicode/ascii code values will be printed
                }                                    // only 'print' prints values in same line so use (variable + " "); syntax i.e. concatinate with space in " ".
				
				
				
				System.out.println("*************");
				
				
				int[] t= {10, 20, 30, 40};
				for (int t1: t)
				{
					System.out.println(t1);
				}
				
				
				System.out.println("*************");
				
				
				int[] u= new int[3];                            // no values provided in Array so default values printed are 0,0,0.
				for (int u1: u) {
					System.out.println(u1+ " ");
				}
				
				System.out.println("*************");
				
				
				sum(new int[]{10,20,30,40});             //--> Anonymous Array 
				
				
				
			
				
				
	}
				
				public static void sum(int[] g){
			    int total=0;
				for (int g1: g)
				  {
				  total= total+g1;
				    }
				    System.out.println("The sum is: " + total);
				   
				 }
				
				
		
	

}
