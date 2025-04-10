/* Types of Variables :
 * Division 1: 
 * Based on type of value represented by a variable, all variables are divided into 2 types.
 * 1. Primitive Variables: Can be used to represent Primitive values.
 * e.g. int x= 10;
 * 2. Reference Variables: Can be used to refer objects.
 * e.g. Student s= new Student();
 * 
 * Division 2:
 * Based on position of declaration and behaviour, all variables are divided into 3 types.
 * 1. Instance Variables
 * 2. Static Variables 
 * 3. Local Variables
 * 
 * 1. Instance Variables: 
 * If the value of a variable is varied from object to object, such type of variables are called Instance Variables.
 * For every object, a separate copy of instance variables will be created.
 * Instance variables should be declared within the class directly and outside of any method or block or constructor.
 * Instance variable will be created at the time of object creation and destroyed at the time of object destruction. Hence, the scope of instance variable is same as the scope of object.
 * Instance variables will be stored in the heap memory as a part of object. 
 * We can't access instance variables directly from static area but we can access by using object reference.
 * We can access instance variables directly from instance area.
 * For instance variables, JVM will always provide default values. We are not required to perform initialization explicitly.
 * e.g. class Test{                     
		
		int x;                             // all are instance variables in class Test.
		double d;
		boolean b;
		String s;
		
public static void main(String[] args) {       // This main() method is static method.
		
		Test t1= new Test();                  // To run another class in a program, right click on Test class here, select Run as Java Application, Run the class Test.
		
		System.out.println(t1.x);              // default value: 0
		System.out.println(t1.d);              // default value: 0.0
		System.out.println(t1.b);              // default value: false
		System.out.println(t1.s);              // default value: null
		}
	}
 * 
 * Instance variables are also known as Object-level variables or attributes.
 * 
 * 
 * 2. Static variables:
 * If the value of a variable is not varied from object to object, we have to declare such type of variables at class level by using 'static' modifier.
 * In case of static variable, a single copy is created at class level and shared between all objects of the class.
 * Static variables should be declared within the class directly and outside the method or block or constructor.
 * Static variables will be created at the time of class loading and destroyed at the time of class unloading. Hence, scope of static variable is exactly same as scope of .class file. 
 * Static variables are stored in heap memory.
 * 
 *  What happens when Java Test is called? or How any class runs in Java?
 *  1. Start JVM.
 *  2. Create and start main Thread.
 *  3. Locate Test.class file.
 *  4. Load Test.class.
 *  5. Execute main() method.
 *  6. Unload Test.class.
 *  7. Terminate main Thread.
 *  8. Shutdown JVM.
 *  
 * We can access static variables either by object reference or by class name but recommended to use class name. 
 * Within the same class, it is not required to use class name, we can access static variable directly.
 * e.g. 
 * class Test1{
	
	static int x=10;                            // static variable
	public static void main(String[] args) {    // static method
		
		Test1 t1= new Test1();                 // creating object of a class Test1
		System.out.println(t1.x);              // calling static variable using object
		System.out.println(Test1.x);           // calling static variable using class ---> recommended
		System.out.println(x);                 // calling static variable directly as it is within same class 
		}
	}
 *  
 * We can access static variables directly from both instance and static areas.
 * For static variables JVM will provide default values. We are not required to perform initialization explicitly.
 * e.g. class Test{                     
		
		static int x;                             // all are static variables in class Test.
		static double d;
		static String s;
		
       public static void main(String[] args) {       // This main() method is static method.

		System.out.println(x);              // default value: 0
		System.out.println(d);              // default value: 0.0
		System.out.println(s);              // default value: null
		}
	}
 * 
 * Static variables are also known as class-level variables or fields.
 * 
 * 
 * Value of static variable gets updated everywhere if its value is changed in the program as only one copy is available for static variable.
 * Value of instance variable gets updated only specific to that object and not anywhere else as each object has its own copy of instance variable.
 * e.g. 
 * class Test2 {
	
	static int x=10;                        // static variable
	int y=20;                               // instance variable
	
	public static void main(String[] args) {      // static method
		 
		Test2 t1= new Test2();                  // object of class Test2
		t1.x= 888;                              // static variable value changed to 888 everywhere as it is static.
		t1.y= 999;                              // instance variable value changed to 999 for object t1.
		
		Test2 t2= new Test2();                  // another object of class Test2
		System.out.println(t2.x+ " "+ t2.y );   // Output: 888 20 
		}
	}
 *  
 * 
 * 3. Local Variable:
 * Sometimes, to meet temporary requirements of the programmer we can declare variables inside a method or block or constructor. 
 * Such type of variables are called Local Variables or Temporary variables or automatic variables. 
 * Local variables will be stored inside stack memory.
 * Local variables will be created while executing the block in which it is declared. Once block execution completes, automatically local variable will be destroyed.
 * Hence, the scope of local variable is the block in which we declared it.
 * 
 *e.g. 
 *class Test {
 *public static b=void main (String[] args) {
 *
 *int i=0;
 *for (int j=0; j<3; j++)
 *{
 *  i= i+ j;
 *}
 *System.out.println (i + " " +j);          // not valid as j is a local variable of for loop, should stay in for loop. Compile time error.
 *}
 *}
 * 
 * e.g.
 * class Test {
 * public static void main(String[] args){
 * try 
 * {
 *   int j= Integer.parseInt("ten");
 *   
 * }
 * catch (NumberformatException e)
 * {
 *   j=10;                                           // compile time error as j is local variable in try block.
 * }
 *   System.out.println(j);                          // compile time error as j is local variable in try block. 
 * 
 * }
 * 
 * }
 * 
 * For Local variables JVM won't provide default values. We should initialize local variable explicitly before using the variable. If we are not using it, initialization is not required.
 * It is not recommended to perform initialization for local variables inside logical blocks because there is no guarantee for the execution of these blocks always at runtime.
 * It is highly recommended to perform initialization for local variables at the time of declaration at least with the default values.
 * The only applicable modifier for local variables is final. By mistake, if we are trying to apply any other modifier like public/private/default/protected, we will get compile time error.
 * 
 * 
 * Summary/ Conclusions:
 * 1. If we are not declaring variable with any modifier, by default it is a default. 
 *    But this rule is applicable only for instance and static variable but not for local variables.
 * 2. For instance and static variables, JVM will provide default values and we are not required perform initialization explicitly. 
 *    But for local variables JVM won't provide default values. We need to compulsory perform initialization explicitly before using that variable.
 * 3. Instance and static variables can be accessed by multiple threads simultaneously. Hence, these are not thread safe.
 *    But in case of local variables for every thread, a separate copy will be created. Hence, local variables are thread safe.
 * 4. Every variable in Java should be either instance or static or local.
 * 5. Every variable in Java should be either primitive or reference.
 * 6. Hence various possible combinations of variables in Java are-
 *    Instance primitive, Instance reference
 *    Static primitive, static reference
 *    local primitive, local reference
 * e.g.
 * class Test{ 
 * int x=10;                        //Instance- primitive variable
 * static String s= "durga";        // static-reference variable
 * 
 * public static void main(String[] args){
 * 
 *            int[] y= new int[];     // local-reference variable
 *         }
 *   }
 * 
 * 
 * Uninitialized Arrays:
 * e.g class Test{
 * int[] x;                         // Unitialized Array
 * 
 * public staic void main(String[] args){
 *  Test t=new Test();
 *  System.out.println(t.x);         // null
 *  System.out.println(t.x[0]);      // nullpointerexception
 * }
 * }
 * 
 * e.g.
 * class Test{
 * int[] x= new int[3];                         // initialized Array
 * 
 * public staic void main(String[] args){
 *  Test t=new Test();
 *  System.out.println(t.x);         // [I@e837e6
 *  System.out.println(t.x[0]);      // 0
 * }
 * }
 * 
 * Note: Once we create an array every array element by default initialized with default values irrespective of whether it is instance or static or local array. 

 * 
 */

package JavaIntroduction;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class VariableTypes {
	
	int x=10;                                              // instance variable

	public static void main(String[] args) {                // As main() method is static, instance variable cannot be called directly. 
		// TODO Auto-generated method stub
		
		// calling instance variable in static area
		VariableTypes t= new VariableTypes();              // We have to create object of Class first, then call the instance variable inside static variable.
		System.out.println(t.x);                           // This new object t will be reference object to instance variable. Call using (object name. variable name).
        
		// calling instance variable inside instance method main1().
		t.main1();                                     // This is another way. You can call instance variable directly in non-static method. 
		
		                                                   // 100// Just call the non-static method using class object.
		
		t.main2();
		System.out.println(t.x);
		
		
		
		
	}
	
	
	// calling instance variable in instance method main1().
	public void main1() {                    // This is another way. You can call instance variable directly in non-static method.
		
		
		System.out.println(x);
		
		
	}
	
	public void main2()
	{
		x=100;
		System.out.println(x);
		
	}
	
	
	
 }


// calling instance variables without assigning any values to it.

class Test{                     
		
		int x;                             // all are instance variables in class Test.
		double d;
		boolean b;
		String s;
		
public static void main(String[] args) {       // This main() method is static method.
		
		Test t1= new Test();                       // To run another class in a program, right click on Test class here, select Run as Java Application, Run the class Test.
		
		System.out.println(t1.x);              // default value: 0
		System.out.println(t1.d);              // default value: 0.0
		System.out.println(t1.b);              // default value: false
		System.out.println(t1.s);              // default value: null
		
		
       }
	}


// calling static variable different ways
class Test1{
	
	static int x=10;                               // static variable
	
	static int y;
	static double d;
	static String s;
	
	public static void main(String[] args) {    // static method
		
		Test1 t1= new Test1();                 // creating object of a class Test1
		System.out.println(t1.x);              // calling static variable using object
		System.out.println(Test1.x);           // calling static variable using class  --> recommended
		System.out.println(x);                 // calling static variable directly as it is within same class 
		
		
		// printing default values of static variables
		System.out.println(y);              // default value: 0
		System.out.println(d);              // default value: 0.0
		System.out.println(s);              // default value: null
		
	}
	
	
}

class Test2 {
	
	static int x=10;                        // static variable
	int y=20;                               // instance variable
	
	public static void main(String[] args) {      // static method
		 
		Test2 t1= new Test2();                  // object of class Test2
		t1.x= 888;                              // static variable value changed to 888 everywhere as it is static.
		t1.y= 999;                              // instance variable value changed to 999 for object t1.
		
		Test2 t2= new Test2();                  // another object of class Test2
		System.out.println(t2.x+ " "+ t2.y );   // Output: 888 20 
		
		
	}
	
	
}
	
class Test3 {
	
	public static void main(String[] args) {
		
		int x;                                        // local variable x is not initialized here and not used.
		System.out.println("Hello World");
		}
	
}

class Test4{
	
	public static void main(String[] args) {
		
		int x;
		//System.out.println(x);                    // compilation error : The local variable x may not have been initialized
	}
}

class Test5{
	
	public static void main(String[] args) {
		int x;
		if (args.length>0)                     // we are not passing any argument here.
		{   
			x=10;                               
		}
        //System.out.println(x);	                // compilation error : The local variable x may not have been initialized
	}
	
}

class Test6{
	public static void main(String[] args) {
		int x;
		if (args.length>0)
		{
			x=10;                             // if argument is passed, then this value will be printed. 
		}
		else
		{
			x=20;                            // if no argument is passed, 20 is printed.
		}
	    System.out.println(x);
	}
}





